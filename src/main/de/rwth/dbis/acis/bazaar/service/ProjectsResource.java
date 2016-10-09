package de.rwth.dbis.acis.bazaar.service;

import com.google.gson.Gson;
import de.rwth.dbis.acis.bazaar.service.dal.DALFacade;
import de.rwth.dbis.acis.bazaar.service.dal.entities.*;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.PageInfo;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.PaginationResult;
import de.rwth.dbis.acis.bazaar.service.exception.BazaarException;
import de.rwth.dbis.acis.bazaar.service.exception.ErrorCode;
import de.rwth.dbis.acis.bazaar.service.exception.ExceptionHandler;
import de.rwth.dbis.acis.bazaar.service.exception.ExceptionLocation;
import de.rwth.dbis.acis.bazaar.service.internalization.Localization;
import de.rwth.dbis.acis.bazaar.service.security.AuthorizationManager;
import i5.las2peer.api.Service;
import i5.las2peer.logging.L2pLogger;
import i5.las2peer.logging.NodeObserver;
import i5.las2peer.restMapper.HttpResponse;
import i5.las2peer.restMapper.MediaType;
import i5.las2peer.restMapper.RESTMapper;
import i5.las2peer.restMapper.annotations.ContentParam;
import i5.las2peer.security.Context;
import i5.las2peer.security.UserAgent;
import io.swagger.annotations.*;
import jodd.vtor.Vtor;

import javax.ws.rs.*;
import java.net.HttpURLConnection;
import java.util.*;

@Path("/bazaar/projects")
@Api(value = "/projects", description = "Projects resource")
public class ProjectsResource extends Service {

    private BazaarService bazaarService;

    /**
     * This method is needed for every RESTful application in LAS2peer.
     *
     * @return the mapping to the REST interface.
     */
    public String getRESTMapping() {
        String result = "";
        try {
            result = RESTMapper.getMethodsAsXML(this.getClass());
        } catch (Exception e) {

            e.printStackTrace();
        }
        return result;
    }

    public ProjectsResource() throws Exception {
        bazaarService = new BazaarService();
    }

    /**
     * This method returns the list of projects on the server.
     *
     * @param page    page number
     * @param perPage number of projects by page
     * @return Response with list of all projects
     */
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "This method returns the list of projects on the server.")
    @ApiResponses(value = {
            @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "List of projects"),
            @ApiResponse(code = HttpURLConnection.HTTP_UNAUTHORIZED, message = "Unauthorized"),
            @ApiResponse(code = HttpURLConnection.HTTP_INTERNAL_ERROR, message = "Internal server problems")
    })
    public HttpResponse getProjects(
            @ApiParam(value = "Page number", required = false) @DefaultValue("0") @QueryParam("page") int page,
            @ApiParam(value = "Elements of project by page", required = false) @DefaultValue("10") @QueryParam("per_page") int perPage) {
        DALFacade dalFacade = null;
        try {
            String registratorErrors = bazaarService.notifyRegistrators(EnumSet.of(BazaarFunction.VALIDATION, BazaarFunction.USER_FIRST_LOGIN_HANDLING));
            if (registratorErrors != null) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, registratorErrors);
            }
            UserAgent agent = (UserAgent) getActiveAgent();
            Gson gson = new Gson();
            PageInfo pageInfo = new PageInfo(page, perPage, "");
            Vtor vtor = bazaarService.getValidators();
            vtor.validate(pageInfo);
            if (vtor.hasViolations()) {
                ExceptionHandler.getInstance().handleViolations(vtor.getViolations());
            }
            dalFacade = bazaarService.getDBConnection();
            PaginationResult<Project> projectsResult;
            if (agent.getLoginName().equals("anonymous")) {
                // return only public projects
                projectsResult = dalFacade.listPublicProjects(pageInfo);
            } else {
                // return public projects and the ones the user belongs to
                long userId = agent.getId();
                projectsResult = dalFacade.listPublicAndAuthorizedProjects(pageInfo, userId);
            }

            HttpResponse response = new HttpResponse(gson.toJson(projectsResult.getElements()), HttpURLConnection.HTTP_OK);
            Map<String, String> parameter = new HashMap<>();
            parameter.put("page", String.valueOf(page));
            parameter.put("per_page", String.valueOf(perPage));
            response = bazaarService.addPaginationToHtppResponse(projectsResult, "projects", parameter, response);

            return response;
        } catch (BazaarException bex) {
            return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_INTERNAL_ERROR);
        } catch (Exception ex) {
            BazaarException bazaarException = ExceptionHandler.getInstance().convert(ex, ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, "");
            return new HttpResponse(ExceptionHandler.getInstance().toJSON(bazaarException), HttpURLConnection.HTTP_INTERNAL_ERROR);
        } finally {
            bazaarService.closeDBConnection(dalFacade);
        }
    }

    /**
     * This method allows to retrieve a certain project.
     *
     * @param projectId id of the project to retrieve
     * @return Response with a project as a JSON object.
     */
    @GET
    @Path("/{projectId}")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "This method allows to retrieve a certain project.")
    @ApiResponses(value = {
            @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Returns a certain project"),
            @ApiResponse(code = HttpURLConnection.HTTP_UNAUTHORIZED, message = "Unauthorized"),
            @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Not found"),
            @ApiResponse(code = HttpURLConnection.HTTP_INTERNAL_ERROR, message = "Internal server problems")
    })
    public HttpResponse getProject(@PathParam("projectId") int projectId) {
        DALFacade dalFacade = null;
        try {
            String registratorErrors = bazaarService.notifyRegistrators(EnumSet.of(BazaarFunction.VALIDATION, BazaarFunction.USER_FIRST_LOGIN_HANDLING));
            if (registratorErrors != null) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, registratorErrors);
            }
            long userId = ((UserAgent) getActiveAgent()).getId();
            dalFacade = bazaarService.getDBConnection();
            Integer internalUserId = dalFacade.getUserIdByLAS2PeerId(userId);
            if (dalFacade.isProjectPublic(projectId)) {
                boolean authorized = new AuthorizationManager().isAuthorized(internalUserId, PrivilegeEnum.Read_PUBLIC_PROJECT, String.valueOf(projectId), dalFacade);
                if (!authorized) {
                    ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.AUTHORIZATION, Localization.getInstance().getResourceBundle().getString("error.authorization.anonymous"));
                }
            } else {
                boolean authorized = new AuthorizationManager().isAuthorized(internalUserId, PrivilegeEnum.Read_PROJECT, String.valueOf(projectId), dalFacade);
                if (!authorized) {
                    ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.AUTHORIZATION, Localization.getInstance().getResourceBundle().getString("error.authorization.component.read"));
                }
            }
            Project projectToReturn = dalFacade.getProjectById(projectId);
            L2pLogger.logEvent(NodeObserver.Event.SERVICE_CUSTOM_MESSAGE_1, Context.getCurrent().getMainAgent(), "fetched project with id " + projectId);
            Gson gson = new Gson();
            return new HttpResponse(gson.toJson(projectToReturn), HttpURLConnection.HTTP_OK);
        } catch (BazaarException bex) {
            if (bex.getErrorCode() == ErrorCode.AUTHORIZATION) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_UNAUTHORIZED);
            } else if (bex.getErrorCode() == ErrorCode.NOT_FOUND) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_NOT_FOUND);
            } else {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_INTERNAL_ERROR);
            }
        } catch (Exception ex) {
            BazaarException bazaarException = ExceptionHandler.getInstance().convert(ex, ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, "");
            return new HttpResponse(ExceptionHandler.getInstance().toJSON(bazaarException), HttpURLConnection.HTTP_INTERNAL_ERROR);
        } finally {
            bazaarService.closeDBConnection(dalFacade);
        }
    }

    /**
     * This method allows to create a new project.
     *
     * @param project project as a JSON object
     * @return Response with the created project as a JSON object.
     */
    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "This method allows to create a new project")
    @ApiResponses(value = {
            @ApiResponse(code = HttpURLConnection.HTTP_CREATED, message = "Returns the created project"),
            @ApiResponse(code = HttpURLConnection.HTTP_UNAUTHORIZED, message = "Unauthorized"),
            @ApiResponse(code = HttpURLConnection.HTTP_INTERNAL_ERROR, message = "Internal server problems")
    })
    public HttpResponse createProject(@ApiParam(value = "Project entity as JSON", required = true) @ContentParam String project) {
        DALFacade dalFacade = null;
        try {
            String registratorErrors = bazaarService.notifyRegistrators(EnumSet.of(BazaarFunction.VALIDATION, BazaarFunction.USER_FIRST_LOGIN_HANDLING));
            if (registratorErrors != null) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, registratorErrors);
            }
            long userId = ((UserAgent) getActiveAgent()).getId();
            Gson gson = new Gson();
            Project projectToCreate = gson.fromJson(project, Project.class);
            Vtor vtor = bazaarService.getValidators();
            vtor.validate(projectToCreate);
            if (vtor.hasViolations()) ExceptionHandler.getInstance().handleViolations(vtor.getViolations());
            dalFacade = bazaarService.getDBConnection();
            Integer internalUserId = dalFacade.getUserIdByLAS2PeerId(userId);
            boolean authorized = new AuthorizationManager().isAuthorized(internalUserId, PrivilegeEnum.Create_PROJECT, dalFacade);
            if (!authorized) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.AUTHORIZATION, Localization.getInstance().getResourceBundle().getString("error.authorization.project.create"));
            }
            projectToCreate.setLeaderId(internalUserId);
            Project createdProject = dalFacade.createProject(projectToCreate);
            bazaarService.getNotificationDispatcher().dispatchNotification(this, createdProject.getCreation_time(), Activity.ActivityAction.CREATE, createdProject.getId(),
                    Activity.DataType.PROJECT, 0, null, internalUserId);
            return new HttpResponse(gson.toJson(createdProject), HttpURLConnection.HTTP_CREATED);
        } catch (BazaarException bex) {
            if (bex.getErrorCode() == ErrorCode.AUTHORIZATION) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_UNAUTHORIZED);
            } else {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_INTERNAL_ERROR);
            }
        } catch (Exception ex) {
            BazaarException bazaarException = ExceptionHandler.getInstance().convert(ex, ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, "");
            return new HttpResponse(ExceptionHandler.getInstance().toJSON(bazaarException), HttpURLConnection.HTTP_INTERNAL_ERROR);
        } finally {
            bazaarService.closeDBConnection(dalFacade);
        }
    }

    /**
     * Allows to update a certain project.
     *
     * @param projectId id of the project to update
     * @param project   updated project as a JSON object
     * @return Response with the updated project as a JSON object.
     */
    @PUT
    @Path("/{projectId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "This method allows to update a certain project.")
    @ApiResponses(value = {
            @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Returns the updated project"),
            @ApiResponse(code = HttpURLConnection.HTTP_UNAUTHORIZED, message = "Unauthorized"),
            @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Not found"),
            @ApiResponse(code = HttpURLConnection.HTTP_INTERNAL_ERROR, message = "Internal server problems")
    })
    public HttpResponse updateProject(@PathParam("projectId") int projectId,
                                      @ApiParam(value = "Project entity as JSON", required = true) @ContentParam String project) {
        DALFacade dalFacade = null;
        try {
            String registratorErrors = bazaarService.notifyRegistrators(EnumSet.of(BazaarFunction.VALIDATION, BazaarFunction.USER_FIRST_LOGIN_HANDLING));
            if (registratorErrors != null) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, registratorErrors);
            }
            long userId = ((UserAgent) getActiveAgent()).getId();
            Gson gson = new Gson();
            Project projectToUpdate = gson.fromJson(project, Project.class);
            Vtor vtor = bazaarService.getValidators();
            vtor.validate(projectToUpdate);
            if (vtor.hasViolations()) {
                ExceptionHandler.getInstance().handleViolations(vtor.getViolations());
            }
            dalFacade = bazaarService.getDBConnection();
            Integer internalUserId = dalFacade.getUserIdByLAS2PeerId(userId);
            boolean authorized = new AuthorizationManager().isAuthorized(internalUserId, PrivilegeEnum.Modify_PROJECT, dalFacade);
            if (!authorized) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.AUTHORIZATION, Localization.getInstance().getResourceBundle().getString("error.authorization.project.modify"));
            }
            if (projectToUpdate.getId() != 0 && projectId != projectToUpdate.getId()) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, "Id does not match");
            }
            Project updatedProject = dalFacade.modifyProject(projectToUpdate);
            bazaarService.getNotificationDispatcher().dispatchNotification(this, updatedProject.getLastupdated_time(), Activity.ActivityAction.UPDATE, updatedProject.getId(),
                    Activity.DataType.PROJECT, 0, null, internalUserId);
            return new HttpResponse(gson.toJson(updatedProject), HttpURLConnection.HTTP_OK);
        } catch (BazaarException bex) {
            if (bex.getErrorCode() == ErrorCode.AUTHORIZATION) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_UNAUTHORIZED);
            } else if (bex.getErrorCode() == ErrorCode.NOT_FOUND) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_NOT_FOUND);
            } else {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_INTERNAL_ERROR);
            }
        } catch (Exception ex) {
            BazaarException bazaarException = ExceptionHandler.getInstance().convert(ex, ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, "");
            return new HttpResponse(ExceptionHandler.getInstance().toJSON(bazaarException), HttpURLConnection.HTTP_INTERNAL_ERROR);
        } finally {
            bazaarService.closeDBConnection(dalFacade);
        }
    }

    /**
     * This method add the current user to the followers list of a given project.
     *
     * @param projectId id of the project
     * @return Response with project as a JSON object.
     */
    @POST
    @Path("/{projectId}/followers")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "This method add the current user to the followers list of a given project.")
    @ApiResponses(value = {
            @ApiResponse(code = HttpURLConnection.HTTP_CREATED, message = "Returns the project"),
            @ApiResponse(code = HttpURLConnection.HTTP_UNAUTHORIZED, message = "Unauthorized"),
            @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Not found"),
            @ApiResponse(code = HttpURLConnection.HTTP_INTERNAL_ERROR, message = "Internal server problems")
    })
    public HttpResponse addUserToFollowers(@PathParam("projectId") int projectId) {
        DALFacade dalFacade = null;
        try {
            long userId = ((UserAgent) getActiveAgent()).getId();
            String registratorErrors = bazaarService.notifyRegistrators(EnumSet.of(BazaarFunction.VALIDATION, BazaarFunction.USER_FIRST_LOGIN_HANDLING));
            if (registratorErrors != null) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, registratorErrors);
            }
            dalFacade = bazaarService.getDBConnection();
            Integer internalUserId = dalFacade.getUserIdByLAS2PeerId(userId);
            boolean authorized = new AuthorizationManager().isAuthorized(internalUserId, PrivilegeEnum.Create_FOLLOW, dalFacade);
            if (!authorized) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.AUTHORIZATION, Localization.getInstance().getResourceBundle().getString("error.authorization.follow.create"));
            }
            dalFacade.followProject(internalUserId, projectId);
            Project project = dalFacade.getProjectById(projectId);
            Gson gson = new Gson();
            bazaarService.getNotificationDispatcher().dispatchNotification(this, new Date(), Activity.ActivityAction.FOLLOW, project.getId(),
                    Activity.DataType.PROJECT, 0, null, internalUserId);
            return new HttpResponse(gson.toJson(project), HttpURLConnection.HTTP_CREATED);
        } catch (BazaarException bex) {
            if (bex.getErrorCode() == ErrorCode.AUTHORIZATION) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_UNAUTHORIZED);
            } else if (bex.getErrorCode() == ErrorCode.NOT_FOUND) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_NOT_FOUND);
            } else {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_INTERNAL_ERROR);
            }
        } catch (Exception ex) {
            BazaarException bazaarException = ExceptionHandler.getInstance().convert(ex, ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, "");
            return new HttpResponse(ExceptionHandler.getInstance().toJSON(bazaarException), HttpURLConnection.HTTP_INTERNAL_ERROR);
        } finally {
            bazaarService.closeDBConnection(dalFacade);
        }
    }

    /**
     * This method removes the current user from a followers list of a given project.
     *
     * @param projectId id of the project
     * @return Response with project as a JSON object.
     */
    @DELETE
    @Path("/{projectId}/followers")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "This method removes the current user from a followers list of a given project.")
    @ApiResponses(value = {
            @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Returns the project"),
            @ApiResponse(code = HttpURLConnection.HTTP_UNAUTHORIZED, message = "Unauthorized"),
            @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Not found"),
            @ApiResponse(code = HttpURLConnection.HTTP_INTERNAL_ERROR, message = "Internal server problems")
    })
    public HttpResponse removeUserFromFollowers(@PathParam("projectId") int projectId) {
        DALFacade dalFacade = null;
        try {
            long userId = ((UserAgent) getActiveAgent()).getId();
            String registratorErrors = bazaarService.notifyRegistrators(EnumSet.of(BazaarFunction.VALIDATION, BazaarFunction.USER_FIRST_LOGIN_HANDLING));
            if (registratorErrors != null) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, registratorErrors);
            }
            dalFacade = bazaarService.getDBConnection();
            Integer internalUserId = dalFacade.getUserIdByLAS2PeerId(userId);
            boolean authorized = new AuthorizationManager().isAuthorized(internalUserId, PrivilegeEnum.Delete_FOLLOW, dalFacade);
            if (!authorized) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.AUTHORIZATION, Localization.getInstance().getResourceBundle().getString("error.authorization.follow.delete"));
            }
            dalFacade.unFollowProject(internalUserId, projectId);
            Project project = dalFacade.getProjectById(projectId);
            Gson gson = new Gson();
            bazaarService.getNotificationDispatcher().dispatchNotification(this, new Date(), Activity.ActivityAction.UNFOLLOW, project.getId(),
                    Activity.DataType.PROJECT, 0, null, internalUserId);
            return new HttpResponse(gson.toJson(project), HttpURLConnection.HTTP_OK);
        } catch (BazaarException bex) {
            if (bex.getErrorCode() == ErrorCode.AUTHORIZATION) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_UNAUTHORIZED);
            } else if (bex.getErrorCode() == ErrorCode.NOT_FOUND) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_NOT_FOUND);
            } else {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_INTERNAL_ERROR);
            }
        } catch (Exception ex) {
            BazaarException bazaarException = ExceptionHandler.getInstance().convert(ex, ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, "");
            return new HttpResponse(ExceptionHandler.getInstance().toJSON(bazaarException), HttpURLConnection.HTTP_INTERNAL_ERROR);
        } finally {
            bazaarService.closeDBConnection(dalFacade);
        }
    }

    /**
     * This method returns the list of components under a given project.
     *
     * @param projectId id of the project
     * @param page      page number
     * @param perPage   number of projects by page
     * @return Response with components as a JSON array.
     */
    @GET
    @Path("/{projectId}/components")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "This method returns the list of components under a given project.")
    @ApiResponses(value = {
            @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Returns a list of components for a given project"),
            @ApiResponse(code = HttpURLConnection.HTTP_UNAUTHORIZED, message = "Unauthorized"),
            @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Not found"),
            @ApiResponse(code = HttpURLConnection.HTTP_INTERNAL_ERROR, message = "Internal server problems")
    })
    public HttpResponse getComponentsByProject(
            @PathParam("projectId") int projectId,
            @ApiParam(value = "Page number", required = false) @DefaultValue("0") @QueryParam("page") int page,
            @ApiParam(value = "Elements of components by page", required = false) @DefaultValue("10") @QueryParam("per_page") int perPage) {
        DALFacade dalFacade = null;
        try {
            long userId = ((UserAgent) getActiveAgent()).getId();
            String registratorErrors = bazaarService.notifyRegistrators(EnumSet.of(BazaarFunction.VALIDATION, BazaarFunction.USER_FIRST_LOGIN_HANDLING));
            if (registratorErrors != null) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, registratorErrors);
            }
            Gson gson = new Gson();
            PageInfo pageInfo = new PageInfo(page, perPage, "");
            Vtor vtor = bazaarService.getValidators();
            vtor.validate(pageInfo);
            if (vtor.hasViolations()) {
                ExceptionHandler.getInstance().handleViolations(vtor.getViolations());
            }
            dalFacade = bazaarService.getDBConnection();
            Integer internalUserId = dalFacade.getUserIdByLAS2PeerId(userId);
            if (dalFacade.getProjectById(projectId) == null) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.NOT_FOUND, String.format(Localization.getInstance().getResourceBundle().getString("error.resource.notfound"), "component"));
            }
            if (dalFacade.isProjectPublic(projectId)) {
                boolean authorized = new AuthorizationManager().isAuthorized(internalUserId, PrivilegeEnum.Read_PUBLIC_COMPONENT, String.valueOf(projectId), dalFacade);
                if (!authorized) {
                    ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.AUTHORIZATION, Localization.getInstance().getResourceBundle().getString("error.authorization.anonymous"));
                }
            } else {
                boolean authorized = new AuthorizationManager().isAuthorized(internalUserId, PrivilegeEnum.Read_COMPONENT, String.valueOf(projectId), dalFacade);
                if (!authorized) {
                    ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.AUTHORIZATION, Localization.getInstance().getResourceBundle().getString("error.authorization.component.read"));
                }
            }
            PaginationResult<Component> componentsResult = dalFacade.listComponentsByProjectId(projectId, pageInfo);

            HttpResponse response = new HttpResponse(gson.toJson(componentsResult.getElements()), HttpURLConnection.HTTP_OK);
            Map<String, String> parameter = new HashMap<>();
            parameter.put("page", String.valueOf(page));
            parameter.put("per_page", String.valueOf(perPage));
            response = bazaarService.addPaginationToHtppResponse(componentsResult, "projects/" + String.valueOf(projectId) + "/components", parameter, response);

            return response;
        } catch (BazaarException bex) {
            if (bex.getErrorCode() == ErrorCode.AUTHORIZATION) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_UNAUTHORIZED);
            } else if (bex.getErrorCode() == ErrorCode.NOT_FOUND) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_NOT_FOUND);
            } else {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_INTERNAL_ERROR);
            }
        } catch (Exception ex) {
            BazaarException bazaarException = ExceptionHandler.getInstance().convert(ex, ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, "");
            return new HttpResponse(ExceptionHandler.getInstance().toJSON(bazaarException), HttpURLConnection.HTTP_INTERNAL_ERROR);
        } finally {
            bazaarService.closeDBConnection(dalFacade);
        }
    }

    /**
     * This method returns the list of requirements for a specific project.
     *
     * @param projectId id of the project to retrieve requirements for
     * @param page      page number
     * @param perPage   number of projects by page
     * @return Response with requirements as a JSON array.
     */
    @GET
    @Path("/{projectId}/requirements")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "This method returns the list of requirements for a specific project.")
    @ApiResponses(value = {
            @ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Returns a list of requirements for a given project"),
            @ApiResponse(code = HttpURLConnection.HTTP_UNAUTHORIZED, message = "Unauthorized"),
            @ApiResponse(code = HttpURLConnection.HTTP_NOT_FOUND, message = "Not found"),
            @ApiResponse(code = HttpURLConnection.HTTP_INTERNAL_ERROR, message = "Internal server problems")
    })
    public HttpResponse getRequirementsByProject(@PathParam("projectId") int projectId,
                                                 @ApiParam(value = "Page number", required = false) @DefaultValue("0") @QueryParam("page") int page,
                                                 @ApiParam(value = "Elements of requirements by page", required = false) @DefaultValue("10") @QueryParam("per_page") int perPage) {
        DALFacade dalFacade = null;
        try {
            long userId = ((UserAgent) getActiveAgent()).getId();
            String registratorErrors = bazaarService.notifyRegistrators(EnumSet.of(BazaarFunction.VALIDATION, BazaarFunction.USER_FIRST_LOGIN_HANDLING));
            if (registratorErrors != null) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, registratorErrors);
            }
            Gson gson = new Gson();
            PageInfo pageInfo = new PageInfo(page, perPage, "");
            Vtor vtor = bazaarService.getValidators();
            vtor.validate(pageInfo);
            if (vtor.hasViolations()) {
                ExceptionHandler.getInstance().handleViolations(vtor.getViolations());
            }
            dalFacade = bazaarService.getDBConnection();
            Integer internalUserId = dalFacade.getUserIdByLAS2PeerId(userId);
            if (dalFacade.getProjectById(projectId) == null) {
                ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.NOT_FOUND, String.format(Localization.getInstance().getResourceBundle().getString("error.resource.notfound"), "ressource"));
            }
            if (dalFacade.isProjectPublic(projectId)) {
                boolean authorized = new AuthorizationManager().isAuthorized(internalUserId, PrivilegeEnum.Read_PUBLIC_REQUIREMENT, String.valueOf(projectId), dalFacade);
                if (!authorized) {
                    ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.AUTHORIZATION, Localization.getInstance().getResourceBundle().getString("error.authorization.anonymous"));
                }
            } else {
                boolean authorized = new AuthorizationManager().isAuthorized(internalUserId, PrivilegeEnum.Read_REQUIREMENT, String.valueOf(projectId), dalFacade);
                if (!authorized) {
                    ExceptionHandler.getInstance().throwException(ExceptionLocation.BAZAARSERVICE, ErrorCode.AUTHORIZATION, Localization.getInstance().getResourceBundle().getString("error.authorization.component.read"));
                }
            }
            PaginationResult<RequirementEx> requirementsResult = dalFacade.listRequirementsByProject(projectId, pageInfo, internalUserId);

            HttpResponse response = new HttpResponse(gson.toJson(requirementsResult.getElements()), HttpURLConnection.HTTP_OK);
            Map<String, String> parameter = new HashMap<>();
            parameter.put("page", String.valueOf(page));
            parameter.put("per_page", String.valueOf(perPage));
            response = bazaarService.addPaginationToHtppResponse(requirementsResult, "projects/" + String.valueOf(projectId) + "/requirements", parameter, response);

            return response;
        } catch (BazaarException bex) {
            if (bex.getErrorCode() == ErrorCode.AUTHORIZATION) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_UNAUTHORIZED);
            } else if (bex.getErrorCode() == ErrorCode.NOT_FOUND) {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_NOT_FOUND);
            } else {
                return new HttpResponse(ExceptionHandler.getInstance().toJSON(bex), HttpURLConnection.HTTP_INTERNAL_ERROR);
            }
        } catch (Exception ex) {
            BazaarException bazaarException = ExceptionHandler.getInstance().convert(ex, ExceptionLocation.BAZAARSERVICE, ErrorCode.UNKNOWN, "");
            return new HttpResponse(ExceptionHandler.getInstance().toJSON(bazaarException), HttpURLConnection.HTTP_INTERNAL_ERROR);
        } finally {
            bazaarService.closeDBConnection(dalFacade);
        }
    }

}
