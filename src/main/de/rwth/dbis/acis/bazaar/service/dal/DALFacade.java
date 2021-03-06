/*
 *
 *  Copyright (c) 2015, RWTH Aachen University.
 *  For a list of contributors see the AUTHORS file at the top-level directory
 *  of this distribution.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */

package de.rwth.dbis.acis.bazaar.service.dal;

import de.rwth.dbis.acis.bazaar.service.dal.entities.*;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.CreationStatus;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.PageInfo;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.Pageable;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.PaginationResult;
import de.rwth.dbis.acis.bazaar.service.exception.BazaarException;

import java.sql.Connection;
import java.util.Calendar;
import java.util.List;


public interface DALFacade {

    void close();

    //region User

    /**
     * @param user which holds the data of the user to be inserted. Id field will be omitted, a new one will be generated.
     */
    User createUser(User user) throws BazaarException;

    /**
     * Modifies the user in the database to the data in the parameter. Id field of the parameter used for identifying the object to be modified.
     * It does NOT update any relations of the object, just only the direct fields!
     *
     * @param modifiedUser, which holds the data of the modification for the user in the database identified by the Id field.
     */
    User modifyUser(User modifiedUser) throws Exception;

     /* TODO delete? Should it delete its projects? What should happen after deletion? */

    /**
     * @param userId the identifier of the user, which should be retreived
     * @return the user with its data from the database
     */
    User getUserById(int userId) throws Exception;

    /**
     * @param las2PeerId the identifier of the user
     * @return the reqbaz userId of the las2Peer user
     */
    Integer getUserIdByLAS2PeerId(long las2PeerId) throws Exception;

    /**
     *
     * @param projectId
     * @return list of users to receive email notification
     */
    List<User> getRecipientListForProject(int projectId) throws BazaarException;

    /**
     *
     * @param componentId
     * @return list of users to receive email notification
     */
    List<User> getRecipientListForComponent(int componentId) throws BazaarException;

    /**
     *
     * @param requirementId
     * @return list of users to receive email notification
     */
    List<User> getRecipientListForRequirement(int requirementId) throws BazaarException;
    //endregion

    //region Project

    /**
     * @param pageable pagination information
     * @return the paginated result of the public projects
     */
    PaginationResult<Project> listPublicProjects(Pageable pageable) throws BazaarException;


    /**
     * @param pageable pagination information
     * @param userId   the identifier of the user, whose projects should be returned as well
     * @return all the public projects and all the projects, which the user is authorized to see
     */
    PaginationResult<Project> listPublicAndAuthorizedProjects(PageInfo pageable, long userId) throws BazaarException;

    /**
     * @param searchTerm the text, which is used to search. Search is case insensitive.
     * @param pageable   pagination information
     * @return the found projects from the database based on the given parameters
     */
    List<Project> searchProjects(String searchTerm, Pageable pageable) throws Exception;

    /**
     * @param projectId identifier of the project should be returned
     * @return the project and all of its data with the given id.
     */
    Project getProjectById(int projectId) throws Exception;

    /**
     * @param project data to be created.
     */
    Project createProject(Project project) throws Exception;

    /**
     * Modifies the project in the database to the data in the parameter. Id field of the parameter used for identifying the object to be modified.
     * It does NOT update any relations of the object, just only the direct fields!
     *
     * @param modifiedProject holds the modified data of the project identified by its id. Just only direct project data will be modified, relations not!
     */
    Project modifyProject(Project modifiedProject) throws Exception;

    /**
     * Returns if a project is public or not
     *
     * @param projectId
     * @return
     */
    boolean isProjectPublic(int projectId) throws BazaarException;

    /**
     * This method returns statistics filtered with userId, timestamp
     *
     * @param userId
     * @return the statistics with the given pageable parameters
     * @throws BazaarException
     */
    Statistic getStatisticsForAllProjects(int userId, Calendar since) throws BazaarException;

    Statistic getStatisticsForProject(int userId, int projectId, Calendar since) throws BazaarException;
    //endregion

    //region ProjectFollower

    /**
     * This method create a new follow relation between a user and a project
     *
     * @param userId        the identifier of the user, who wants to follow the project
     * @param projectId     the the identifier of the project to follow
     */
    CreationStatus followProject(int userId, int projectId) throws BazaarException;

    /**
     * This method deleted the follow relationship between the given user and project.
     *
     * @param userId        the identifier of the user, who wants not to follow the project
     * @param projectId     the the identifier of the project to unfollow
     */
    void unFollowProject(int userId, int projectId) throws BazaarException;
    //endregion

    //region Requirement

    /**
     * @param pageable pagination information
     * @return the requirements in a paginated way
     */
    List<Requirement> listRequirements(Pageable pageable) throws BazaarException;

    /**
     * @param projectId the id of the project we are looking in
     * @param pageable  pagination information
     * @param userId
     * @return the requirements under the given project in a paginated way
     */
    PaginationResult<RequirementEx> listRequirementsByProject(int projectId, Pageable pageable, int userId) throws BazaarException;

    /**
     * @param componentId the id of the component we are looking in
     * @param pageable    pagination information
     * @param userId
     * @return the requirements under the given component in a paginated way
     */
    PaginationResult<RequirementEx> listRequirementsByComponent(int componentId, Pageable pageable, int userId) throws BazaarException;

    /**
     * @param searchTerm the text, which is used to search. Search is case insensitive.
     * @param pageable   pagination information
     * @return the found requirements with the given parameters filled up with only the direct data.
     */
    List<Requirement> searchRequirements(String searchTerm, Pageable pageable) throws Exception;

    /**
     * @param requirementId the identifier of the requirement should be returned
     * @return the requirement identified by the given id and all of its assets: comments,attachments,followers,developers,creator
     */
    RequirementEx getRequirementById(int requirementId, int userId) throws Exception;


    /**
     * @param requirement to be added to the database.
     */
    RequirementEx createRequirement(Requirement requirement, int userId) throws Exception;

    /**
     * Modifies the requirement in the database to the data in the parameter. Id field of the parameter used for identifying the object to be modified.
     * It does NOT update any relations of the object, just only the direct fields!
     *
     * @param modifiedRequirement hold the modified data
     */
    RequirementEx modifyRequirement(Requirement modifiedRequirement, int userId) throws Exception;

    /**
     * This method deletes a requirement with its assets: All of its comments and attachments and connections to users, projects or components.
     *
     * @param requirementId which identifies the requirement to delete.
     */
    RequirementEx deleteRequirementById(int requirementId, int userId) throws Exception;

    /**
     * This method set a requirements realized flag to now
     *
     * @param requirementId
     * @param userId
     * @return updated RequirementEx
     * @throws Exception
     */
    RequirementEx setRequirementToRealized(int requirementId, int userId) throws Exception;

    /**
     * This method set a requirements realized flag to NULL
     *
     * @param requirementId
     * @param userId
     * @return updated RequirementEx
     * @throws Exception
     */
    RequirementEx setRequirementToUnRealized(int requirementId, int userId) throws Exception;

    /**
     *  This method set userId as lead developer for requirement
     *
     * @param requirementId
     * @param userId
     * @return
     * @throws Exception
     */
    RequirementEx setUserAsLeadDeveloper(int requirementId, int userId) throws Exception;

    /**
     * This method set lead developer for requirement to NULL
     *
     * @param requirementId
     * @param userId
     * @return
     * @throws Exception
     */
    RequirementEx deleteUserAsLeadDeveloper(int requirementId, int userId) throws Exception;

    /**
     * Returns true if requirement belongs to a public project
     *
     * @param requirementId
     * @return
     */
    boolean isRequirementPublic(int requirementId) throws BazaarException;

    Statistic getStatisticsForRequirement(int userId, int requirementId, Calendar timestamp) throws BazaarException;
    //endregion

    //region Component

    /**
     * @param projectId the id of the project we are looking in
     * @param pageable  pagination information
     * @return the components under the given project in a paginated way
     */
    PaginationResult<Component> listComponentsByProjectId(int projectId, Pageable pageable) throws BazaarException;

    /**
     * @param requirementId the id of the requirement we are looking in
     * @param pageable  pagination information
     * @return the components under the given project in a paginated way
     */
    PaginationResult<Component> listComponentsByRequirementId(int requirementId, Pageable pageable) throws BazaarException;

    /**
     * @param component to be added to the database.
     */
    Component createComponent(Component component) throws BazaarException;

   /**
     * @param componentId identifier of the component should be returned
     * @return the component and all of its data with the given id.
     */
    Component getComponentById(int componentId) throws Exception;

    /**
     * Modifies the component in the database to the data in the parameter. Id field of the parameter used for identifying the object to be modified.
     * It does NOT update any relations of the object, just only the direct fields!
     *
     * @param component hold the modified data
     */
    Component modifyComponent(Component component) throws Exception;


    /**
     * It deletes a component from the database with the tags to requirements
     *
     * @param componentId for the component to be deleted
     */
    Component deleteComponentById(int componentId, int userId) throws Exception;

    /**
     * Returns true if component belongs to a public project
     *
     * @param componentId
     * @return
     */
    boolean isComponentPublic(int componentId) throws BazaarException;

    Statistic getStatisticsForComponent(int userId, int componentId, Calendar timestamp) throws BazaarException;
    //endregion

    //region ComponentFollower

    /**
     * This method create a new follow relation between a user and a component
     *
     * @param userId        the identifier of the user, who wants to follow the component
     * @param componentId   the the identifier of the component to follow
     */
    CreationStatus followComponent(int userId, int componentId) throws BazaarException;

    /**
     * This method deleted the follow relationship between the given user and component.
     *
     * @param userId        the identifier of the user, who wants not to follow the component
     * @param componentId   the the identifier of the component to unfollow
     */
    void unFollowComponent(int userId, int componentId) throws BazaarException;
    //endregion

    //region Attachment

    /**
     * @param attachmentId
     * @return the attachment for a given id
     */
    Attachment getAttachmentById(int attachmentId) throws Exception;

    /**
     * @param requirementId the identifier of the requirement we are looking in
     * @param pageable      pagination information
     * @return the attachments for a given requirement
     */
    PaginationResult<Attachment> listAttachmentsByRequirementId(int requirementId, Pageable pageable) throws BazaarException;

    /**
     * @param attachment object, which holds the data should be persisted
     */
    Attachment createAttachment(Attachment attachment) throws BazaarException;

    /**
     * @param attachmentId id of the attachment should be deleted
     */
    Attachment deleteAttachmentById(int attachmentId) throws Exception;
    //endregion

    //region Comment

    /**
     * @param requirementId the identifier of the requirement we are looking in
     * @param pageable      pagination information
     * @return the comments for a given requirement
     */
    PaginationResult<Comment> listCommentsByRequirementId(int requirementId, Pageable pageable) throws BazaarException;

    /**
     * @param commentId
     * @return the comment for a given id
     */
    Comment getCommentById(int commentId) throws Exception;

    /**
     * @param comment which holds the data for the new comment.
     */
    Comment createComment(Comment comment) throws Exception;

    /**
     * @param commentId to identify the comment to be deleted
     */
    Comment deleteCommentById(int commentId) throws Exception;
    //endregion

    //region Requirement Follower

    /**
     * This method create a new follow relation between a user and a requirement
     *
     * @param userId        the identifier of the user, who wants to follow the requirement
     * @param requirementId the the identifier of the requirement to follow
     */
    CreationStatus followRequirement(int userId, int requirementId) throws BazaarException;

    /**
     * This method deleted the follow relationship between the given user and requirement.
     *
     * @param userId        the identifier of the user, who wants not to follow the requirement
     * @param requirementId the the identifier of the requirement to unfollow
     */
    void unFollowRequirement(int userId, int requirementId) throws BazaarException;
    //endregion

    //region Developer

    /**
     * This method create a develop relation between a given requirement and a given user
     *
     * @param userId
     * @param requirementId
     */
    CreationStatus wantToDevelop(int userId, int requirementId) throws BazaarException;

    /**
     * This method deletes the develop relation between a given requirement and a given user
     *
     * @param userId
     * @param requirementId
     */
    void notWantToDevelop(int userId, int requirementId) throws BazaarException;
    //endregion

    //region Tag (Component >-< Requirement)

    /**
     * This method creates a connection, that the given requirement belongs to the given component.
     *
     * @param requirementId the identifier of the requirement
     * @param componentId   the id of the component
     */
    void addComponentTag(int requirementId, int componentId) throws BazaarException;

    /**
     * This method removes the connection, that the given requirement belongs to the given component.
     *
     * @param requirementId the identifier of the requirement
     * @param componentId   the id of the component
     */
    void deleteComponentTag(int requirementId, int componentId) throws BazaarException;
    //endregion

    //region Vote

    /**
     * This method creates or modifies a vote of a given user for the given project. A vote can be even positive or negative.
     *
     * @param userId        the identifier of the user, who voted
     * @param requirementId the identifier of the requirement
     * @param isUpVote      true if the vote is positive, false if not.
     */
    CreationStatus vote(int userId, int requirementId, boolean isUpVote) throws BazaarException;

    /**
     * This method deletes the vote of the given user for the given project
     *
     * @param userId        the identifier of the user, who voted
     * @param requirementId the identifier of the requirement
     */
    void unVote(int userId, int requirementId) throws BazaarException;


    /**
     * This method checks if a given user has a vote for the given requirement
     *
     * @param userId        the identifier of the user, who voted
     * @param requirementId the identifier of the requirement
     * @return true if the user has voted for the requirement, false otherwise
     */
    boolean hasUserVotedForRequirement(int userId, int requirementId) throws BazaarException;
    //endregion

    //region Authorization
    /**
     * This method returns all the roles and permissions for the given user
     *
     * @param userId the identifier of the user
     * @return all the roles filled up with parents and permissions
     */
    List<Role> getRolesByUserId(int userId, String context) throws BazaarException;

    List<Role> getParentsForRole(int roleId) throws BazaarException;

    void createPrivilegeIfNotExists(PrivilegeEnum privilege) throws BazaarException;

    void addUserToRole(int userId, String roleName, String context) throws BazaarException;
    //endregion
}
