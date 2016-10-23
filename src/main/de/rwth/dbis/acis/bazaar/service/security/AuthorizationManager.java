package de.rwth.dbis.acis.bazaar.service.security;


import de.rwth.dbis.acis.bazaar.service.dal.DALFacade;
import de.rwth.dbis.acis.bazaar.service.dal.entities.PrivilegeEnum;
import de.rwth.dbis.acis.bazaar.service.exception.BazaarException;


public interface AuthorizationManager {

    boolean isAuthorized(int userId, PrivilegeEnum privilege, DALFacade facade) throws BazaarException;

    boolean isAuthorized(int userId, PrivilegeEnum privilege, String context, DALFacade facade) throws BazaarException;

    void syncPrivileges(DALFacade facade) throws BazaarException;
}
