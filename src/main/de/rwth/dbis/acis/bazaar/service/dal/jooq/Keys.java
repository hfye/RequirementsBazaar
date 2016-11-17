/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachments;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Comments;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.ComponentFollower;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Components;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Developers;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Privileges;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.ProjectFollower;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Projects;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RequirementFollower;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirements;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RolePrivilege;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.RoleRole;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Roles;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Tags;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.UserRole;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Users;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Votes;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.CommentsRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ComponentFollowerRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ComponentsRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.DevelopersRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.PrivilegesRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectFollowerRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementFollowerRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RequirementsRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RolePrivilegeRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RoleRoleRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.RolesRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.TagsRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.UserRoleRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.UsersRecord;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.VotesRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>reqbaz</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AttachmentsRecord, Integer> IDENTITY_ATTACHMENTS = Identities0.IDENTITY_ATTACHMENTS;
    public static final Identity<CommentsRecord, Integer> IDENTITY_COMMENTS = Identities0.IDENTITY_COMMENTS;
    public static final Identity<ComponentsRecord, Integer> IDENTITY_COMPONENTS = Identities0.IDENTITY_COMPONENTS;
    public static final Identity<ComponentFollowerRecord, Integer> IDENTITY_COMPONENT_FOLLOWER = Identities0.IDENTITY_COMPONENT_FOLLOWER;
    public static final Identity<DevelopersRecord, Integer> IDENTITY_DEVELOPERS = Identities0.IDENTITY_DEVELOPERS;
    public static final Identity<PrivilegesRecord, Integer> IDENTITY_PRIVILEGES = Identities0.IDENTITY_PRIVILEGES;
    public static final Identity<ProjectsRecord, Integer> IDENTITY_PROJECTS = Identities0.IDENTITY_PROJECTS;
    public static final Identity<ProjectFollowerRecord, Integer> IDENTITY_PROJECT_FOLLOWER = Identities0.IDENTITY_PROJECT_FOLLOWER;
    public static final Identity<RequirementsRecord, Integer> IDENTITY_REQUIREMENTS = Identities0.IDENTITY_REQUIREMENTS;
    public static final Identity<RequirementFollowerRecord, Integer> IDENTITY_REQUIREMENT_FOLLOWER = Identities0.IDENTITY_REQUIREMENT_FOLLOWER;
    public static final Identity<RolesRecord, Integer> IDENTITY_ROLES = Identities0.IDENTITY_ROLES;
    public static final Identity<RolePrivilegeRecord, Integer> IDENTITY_ROLE_PRIVILEGE = Identities0.IDENTITY_ROLE_PRIVILEGE;
    public static final Identity<RoleRoleRecord, Integer> IDENTITY_ROLE_ROLE = Identities0.IDENTITY_ROLE_ROLE;
    public static final Identity<TagsRecord, Integer> IDENTITY_TAGS = Identities0.IDENTITY_TAGS;
    public static final Identity<UsersRecord, Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;
    public static final Identity<UserRoleRecord, Integer> IDENTITY_USER_ROLE = Identities0.IDENTITY_USER_ROLE;
    public static final Identity<VotesRecord, Integer> IDENTITY_VOTES = Identities0.IDENTITY_VOTES;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AttachmentsRecord> KEY_ATTACHMENTS_PRIMARY = UniqueKeys0.KEY_ATTACHMENTS_PRIMARY;
    public static final UniqueKey<CommentsRecord> KEY_COMMENTS_PRIMARY = UniqueKeys0.KEY_COMMENTS_PRIMARY;
    public static final UniqueKey<ComponentsRecord> KEY_COMPONENTS_PRIMARY = UniqueKeys0.KEY_COMPONENTS_PRIMARY;
    public static final UniqueKey<ComponentFollowerRecord> KEY_COMPONENT_FOLLOWER_PRIMARY = UniqueKeys0.KEY_COMPONENT_FOLLOWER_PRIMARY;
    public static final UniqueKey<DevelopersRecord> KEY_DEVELOPERS_PRIMARY = UniqueKeys0.KEY_DEVELOPERS_PRIMARY;
    public static final UniqueKey<PrivilegesRecord> KEY_PRIVILEGES_PRIMARY = UniqueKeys0.KEY_PRIVILEGES_PRIMARY;
    public static final UniqueKey<ProjectsRecord> KEY_PROJECTS_PRIMARY = UniqueKeys0.KEY_PROJECTS_PRIMARY;
    public static final UniqueKey<ProjectFollowerRecord> KEY_PROJECT_FOLLOWER_PRIMARY = UniqueKeys0.KEY_PROJECT_FOLLOWER_PRIMARY;
    public static final UniqueKey<RequirementsRecord> KEY_REQUIREMENTS_PRIMARY = UniqueKeys0.KEY_REQUIREMENTS_PRIMARY;
    public static final UniqueKey<RequirementFollowerRecord> KEY_REQUIREMENT_FOLLOWER_PRIMARY = UniqueKeys0.KEY_REQUIREMENT_FOLLOWER_PRIMARY;
    public static final UniqueKey<RolesRecord> KEY_ROLES_PRIMARY = UniqueKeys0.KEY_ROLES_PRIMARY;
    public static final UniqueKey<RolesRecord> KEY_ROLES_ROLE_IDX_1 = UniqueKeys0.KEY_ROLES_ROLE_IDX_1;
    public static final UniqueKey<RolePrivilegeRecord> KEY_ROLE_PRIVILEGE_PRIMARY = UniqueKeys0.KEY_ROLE_PRIVILEGE_PRIMARY;
    public static final UniqueKey<RoleRoleRecord> KEY_ROLE_ROLE_PRIMARY = UniqueKeys0.KEY_ROLE_ROLE_PRIMARY;
    public static final UniqueKey<TagsRecord> KEY_TAGS_PRIMARY = UniqueKeys0.KEY_TAGS_PRIMARY;
    public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = UniqueKeys0.KEY_USERS_PRIMARY;
    public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = UniqueKeys0.KEY_USER_ROLE_PRIMARY;
    public static final UniqueKey<VotesRecord> KEY_VOTES_PRIMARY = UniqueKeys0.KEY_VOTES_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AttachmentsRecord, RequirementsRecord> ATTACHEMENT_REQUIREMENT = ForeignKeys0.ATTACHEMENT_REQUIREMENT;
    public static final ForeignKey<AttachmentsRecord, UsersRecord> ATTACHEMENT_USER = ForeignKeys0.ATTACHEMENT_USER;
    public static final ForeignKey<CommentsRecord, RequirementsRecord> COMMENT_REQUIREMENT = ForeignKeys0.COMMENT_REQUIREMENT;
    public static final ForeignKey<CommentsRecord, UsersRecord> COMMENT_USER = ForeignKeys0.COMMENT_USER;
    public static final ForeignKey<CommentsRecord, CommentsRecord> BELONGSTOCOMMENT = ForeignKeys0.BELONGSTOCOMMENT;
    public static final ForeignKey<ComponentsRecord, ProjectsRecord> COMPONENT_PROJECT = ForeignKeys0.COMPONENT_PROJECT;
    public static final ForeignKey<ComponentsRecord, UsersRecord> COMPONENTS_USERS = ForeignKeys0.COMPONENTS_USERS;
    public static final ForeignKey<ComponentFollowerRecord, ComponentsRecord> COMPONENT_FOLLOWER = ForeignKeys0.COMPONENT_FOLLOWER;
    public static final ForeignKey<ComponentFollowerRecord, UsersRecord> COMPONENT_FOLLOWER_USER = ForeignKeys0.COMPONENT_FOLLOWER_USER;
    public static final ForeignKey<DevelopersRecord, RequirementsRecord> DEVELOPER_REQUIREMENT = ForeignKeys0.DEVELOPER_REQUIREMENT;
    public static final ForeignKey<DevelopersRecord, UsersRecord> DEVELOPER_USER = ForeignKeys0.DEVELOPER_USER;
    public static final ForeignKey<ProjectsRecord, UsersRecord> PROJECTS_USERS = ForeignKeys0.PROJECTS_USERS;
    public static final ForeignKey<ProjectsRecord, ComponentsRecord> PROJECTS_COMPONENTS = ForeignKeys0.PROJECTS_COMPONENTS;
    public static final ForeignKey<ProjectFollowerRecord, ProjectsRecord> PROJECT_FOLLOWER = ForeignKeys0.PROJECT_FOLLOWER;
    public static final ForeignKey<ProjectFollowerRecord, UsersRecord> PROJECT_FOLLOWER_USER = ForeignKeys0.PROJECT_FOLLOWER_USER;
    public static final ForeignKey<RequirementsRecord, UsersRecord> LEADDEVELOPER = ForeignKeys0.LEADDEVELOPER;
    public static final ForeignKey<RequirementsRecord, UsersRecord> CREATOR = ForeignKeys0.CREATOR;
    public static final ForeignKey<RequirementsRecord, ProjectsRecord> REQUIREMENT_PROJECT = ForeignKeys0.REQUIREMENT_PROJECT;
    public static final ForeignKey<RequirementFollowerRecord, RequirementsRecord> REQUIREMENT_FOLLOWER = ForeignKeys0.REQUIREMENT_FOLLOWER;
    public static final ForeignKey<RequirementFollowerRecord, UsersRecord> REQUIREMENT_FOLLOWER_USER = ForeignKeys0.REQUIREMENT_FOLLOWER_USER;
    public static final ForeignKey<RolePrivilegeRecord, RolesRecord> ROLE_PRIVILEGE_ROLES = ForeignKeys0.ROLE_PRIVILEGE_ROLES;
    public static final ForeignKey<RolePrivilegeRecord, PrivilegesRecord> ROLE_PRIVILEGE_PRIVILEGES = ForeignKeys0.ROLE_PRIVILEGE_PRIVILEGES;
    public static final ForeignKey<RoleRoleRecord, RolesRecord> ROLE_CHILD = ForeignKeys0.ROLE_CHILD;
    public static final ForeignKey<RoleRoleRecord, RolesRecord> ROLE_PARENT = ForeignKeys0.ROLE_PARENT;
    public static final ForeignKey<TagsRecord, ComponentsRecord> TAGS_COMPONENTS = ForeignKeys0.TAGS_COMPONENTS;
    public static final ForeignKey<TagsRecord, RequirementsRecord> TAGS_REQUIREMENTS = ForeignKeys0.TAGS_REQUIREMENTS;
    public static final ForeignKey<UserRoleRecord, RolesRecord> USER_ROLE_ROLES = ForeignKeys0.USER_ROLE_ROLES;
    public static final ForeignKey<UserRoleRecord, UsersRecord> USER_ROLE_USERS = ForeignKeys0.USER_ROLE_USERS;
    public static final ForeignKey<VotesRecord, RequirementsRecord> VOTES_REQUIREMENT = ForeignKeys0.VOTES_REQUIREMENT;
    public static final ForeignKey<VotesRecord, UsersRecord> VOTES_USER = ForeignKeys0.VOTES_USER;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AttachmentsRecord, Integer> IDENTITY_ATTACHMENTS = createIdentity(Attachments.ATTACHMENTS, Attachments.ATTACHMENTS.ID);
        public static Identity<CommentsRecord, Integer> IDENTITY_COMMENTS = createIdentity(Comments.COMMENTS, Comments.COMMENTS.ID);
        public static Identity<ComponentsRecord, Integer> IDENTITY_COMPONENTS = createIdentity(Components.COMPONENTS, Components.COMPONENTS.ID);
        public static Identity<ComponentFollowerRecord, Integer> IDENTITY_COMPONENT_FOLLOWER = createIdentity(ComponentFollower.COMPONENT_FOLLOWER, ComponentFollower.COMPONENT_FOLLOWER.ID);
        public static Identity<DevelopersRecord, Integer> IDENTITY_DEVELOPERS = createIdentity(Developers.DEVELOPERS, Developers.DEVELOPERS.ID);
        public static Identity<PrivilegesRecord, Integer> IDENTITY_PRIVILEGES = createIdentity(Privileges.PRIVILEGES, Privileges.PRIVILEGES.ID);
        public static Identity<ProjectsRecord, Integer> IDENTITY_PROJECTS = createIdentity(Projects.PROJECTS, Projects.PROJECTS.ID);
        public static Identity<ProjectFollowerRecord, Integer> IDENTITY_PROJECT_FOLLOWER = createIdentity(ProjectFollower.PROJECT_FOLLOWER, ProjectFollower.PROJECT_FOLLOWER.ID);
        public static Identity<RequirementsRecord, Integer> IDENTITY_REQUIREMENTS = createIdentity(Requirements.REQUIREMENTS, Requirements.REQUIREMENTS.ID);
        public static Identity<RequirementFollowerRecord, Integer> IDENTITY_REQUIREMENT_FOLLOWER = createIdentity(RequirementFollower.REQUIREMENT_FOLLOWER, RequirementFollower.REQUIREMENT_FOLLOWER.ID);
        public static Identity<RolesRecord, Integer> IDENTITY_ROLES = createIdentity(Roles.ROLES, Roles.ROLES.ID);
        public static Identity<RolePrivilegeRecord, Integer> IDENTITY_ROLE_PRIVILEGE = createIdentity(RolePrivilege.ROLE_PRIVILEGE, RolePrivilege.ROLE_PRIVILEGE.ID);
        public static Identity<RoleRoleRecord, Integer> IDENTITY_ROLE_ROLE = createIdentity(RoleRole.ROLE_ROLE, RoleRole.ROLE_ROLE.ID);
        public static Identity<TagsRecord, Integer> IDENTITY_TAGS = createIdentity(Tags.TAGS, Tags.TAGS.ID);
        public static Identity<UsersRecord, Integer> IDENTITY_USERS = createIdentity(Users.USERS, Users.USERS.ID);
        public static Identity<UserRoleRecord, Integer> IDENTITY_USER_ROLE = createIdentity(UserRole.USER_ROLE, UserRole.USER_ROLE.ID);
        public static Identity<VotesRecord, Integer> IDENTITY_VOTES = createIdentity(Votes.VOTES, Votes.VOTES.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AttachmentsRecord> KEY_ATTACHMENTS_PRIMARY = createUniqueKey(Attachments.ATTACHMENTS, "KEY_attachments_PRIMARY", Attachments.ATTACHMENTS.ID);
        public static final UniqueKey<CommentsRecord> KEY_COMMENTS_PRIMARY = createUniqueKey(Comments.COMMENTS, "KEY_comments_PRIMARY", Comments.COMMENTS.ID);
        public static final UniqueKey<ComponentsRecord> KEY_COMPONENTS_PRIMARY = createUniqueKey(Components.COMPONENTS, "KEY_components_PRIMARY", Components.COMPONENTS.ID);
        public static final UniqueKey<ComponentFollowerRecord> KEY_COMPONENT_FOLLOWER_PRIMARY = createUniqueKey(ComponentFollower.COMPONENT_FOLLOWER, "KEY_component_follower_PRIMARY", ComponentFollower.COMPONENT_FOLLOWER.ID);
        public static final UniqueKey<DevelopersRecord> KEY_DEVELOPERS_PRIMARY = createUniqueKey(Developers.DEVELOPERS, "KEY_developers_PRIMARY", Developers.DEVELOPERS.ID);
        public static final UniqueKey<PrivilegesRecord> KEY_PRIVILEGES_PRIMARY = createUniqueKey(Privileges.PRIVILEGES, "KEY_privileges_PRIMARY", Privileges.PRIVILEGES.ID);
        public static final UniqueKey<ProjectsRecord> KEY_PROJECTS_PRIMARY = createUniqueKey(Projects.PROJECTS, "KEY_projects_PRIMARY", Projects.PROJECTS.ID);
        public static final UniqueKey<ProjectFollowerRecord> KEY_PROJECT_FOLLOWER_PRIMARY = createUniqueKey(ProjectFollower.PROJECT_FOLLOWER, "KEY_project_follower_PRIMARY", ProjectFollower.PROJECT_FOLLOWER.ID);
        public static final UniqueKey<RequirementsRecord> KEY_REQUIREMENTS_PRIMARY = createUniqueKey(Requirements.REQUIREMENTS, "KEY_requirements_PRIMARY", Requirements.REQUIREMENTS.ID);
        public static final UniqueKey<RequirementFollowerRecord> KEY_REQUIREMENT_FOLLOWER_PRIMARY = createUniqueKey(RequirementFollower.REQUIREMENT_FOLLOWER, "KEY_requirement_follower_PRIMARY", RequirementFollower.REQUIREMENT_FOLLOWER.ID);
        public static final UniqueKey<RolesRecord> KEY_ROLES_PRIMARY = createUniqueKey(Roles.ROLES, "KEY_roles_PRIMARY", Roles.ROLES.ID);
        public static final UniqueKey<RolesRecord> KEY_ROLES_ROLE_IDX_1 = createUniqueKey(Roles.ROLES, "KEY_roles_Role_idx_1", Roles.ROLES.NAME);
        public static final UniqueKey<RolePrivilegeRecord> KEY_ROLE_PRIVILEGE_PRIMARY = createUniqueKey(RolePrivilege.ROLE_PRIVILEGE, "KEY_role_privilege_PRIMARY", RolePrivilege.ROLE_PRIVILEGE.ID);
        public static final UniqueKey<RoleRoleRecord> KEY_ROLE_ROLE_PRIMARY = createUniqueKey(RoleRole.ROLE_ROLE, "KEY_role_role_PRIMARY", RoleRole.ROLE_ROLE.ID);
        public static final UniqueKey<TagsRecord> KEY_TAGS_PRIMARY = createUniqueKey(Tags.TAGS, "KEY_tags_PRIMARY", Tags.TAGS.ID);
        public static final UniqueKey<UsersRecord> KEY_USERS_PRIMARY = createUniqueKey(Users.USERS, "KEY_users_PRIMARY", Users.USERS.ID);
        public static final UniqueKey<UserRoleRecord> KEY_USER_ROLE_PRIMARY = createUniqueKey(UserRole.USER_ROLE, "KEY_user_role_PRIMARY", UserRole.USER_ROLE.ID);
        public static final UniqueKey<VotesRecord> KEY_VOTES_PRIMARY = createUniqueKey(Votes.VOTES, "KEY_votes_PRIMARY", Votes.VOTES.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<AttachmentsRecord, RequirementsRecord> ATTACHEMENT_REQUIREMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENTS_PRIMARY, Attachments.ATTACHMENTS, "Attachement_Requirement", Attachments.ATTACHMENTS.REQUIREMENT_ID);
        public static final ForeignKey<AttachmentsRecord, UsersRecord> ATTACHEMENT_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, Attachments.ATTACHMENTS, "Attachement_User", Attachments.ATTACHMENTS.USER_ID);
        public static final ForeignKey<CommentsRecord, RequirementsRecord> COMMENT_REQUIREMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENTS_PRIMARY, Comments.COMMENTS, "Comment_Requirement", Comments.COMMENTS.REQUIREMENT_ID);
        public static final ForeignKey<CommentsRecord, UsersRecord> COMMENT_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, Comments.COMMENTS, "Comment_User", Comments.COMMENTS.USER_ID);
        public static final ForeignKey<CommentsRecord, CommentsRecord> BELONGSTOCOMMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_COMMENTS_PRIMARY, Comments.COMMENTS, "belongsToComment", Comments.COMMENTS.BELONGSTOCOMMENT_ID);
        public static final ForeignKey<ComponentsRecord, ProjectsRecord> COMPONENT_PROJECT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_PROJECTS_PRIMARY, Components.COMPONENTS, "Component_Project", Components.COMPONENTS.PROJECT_ID);
        public static final ForeignKey<ComponentsRecord, UsersRecord> COMPONENTS_USERS = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, Components.COMPONENTS, "Components_Users", Components.COMPONENTS.LEADER_ID);
        public static final ForeignKey<ComponentFollowerRecord, ComponentsRecord> COMPONENT_FOLLOWER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_COMPONENTS_PRIMARY, ComponentFollower.COMPONENT_FOLLOWER, "Component_Follower", ComponentFollower.COMPONENT_FOLLOWER.COMPONENT_ID);
        public static final ForeignKey<ComponentFollowerRecord, UsersRecord> COMPONENT_FOLLOWER_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, ComponentFollower.COMPONENT_FOLLOWER, "Component_Follower_User", ComponentFollower.COMPONENT_FOLLOWER.USER_ID);
        public static final ForeignKey<DevelopersRecord, RequirementsRecord> DEVELOPER_REQUIREMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENTS_PRIMARY, Developers.DEVELOPERS, "Developer_Requirement", Developers.DEVELOPERS.REQUIREMENT_ID);
        public static final ForeignKey<DevelopersRecord, UsersRecord> DEVELOPER_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, Developers.DEVELOPERS, "Developer_User", Developers.DEVELOPERS.USER_ID);
        public static final ForeignKey<ProjectsRecord, UsersRecord> PROJECTS_USERS = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, Projects.PROJECTS, "Projects_Users", Projects.PROJECTS.LEADER_ID);
        public static final ForeignKey<ProjectsRecord, ComponentsRecord> PROJECTS_COMPONENTS = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_COMPONENTS_PRIMARY, Projects.PROJECTS, "Projects_Components", Projects.PROJECTS.DEFAULT_COMPONENTS_ID);
        public static final ForeignKey<ProjectFollowerRecord, ProjectsRecord> PROJECT_FOLLOWER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_PROJECTS_PRIMARY, ProjectFollower.PROJECT_FOLLOWER, "Project_Follower", ProjectFollower.PROJECT_FOLLOWER.PROJECT_ID);
        public static final ForeignKey<ProjectFollowerRecord, UsersRecord> PROJECT_FOLLOWER_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, ProjectFollower.PROJECT_FOLLOWER, "Project_Follower_User", ProjectFollower.PROJECT_FOLLOWER.USER_ID);
        public static final ForeignKey<RequirementsRecord, UsersRecord> LEADDEVELOPER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, Requirements.REQUIREMENTS, "LeadDeveloper", Requirements.REQUIREMENTS.LEAD_DEVELOPER_ID);
        public static final ForeignKey<RequirementsRecord, UsersRecord> CREATOR = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, Requirements.REQUIREMENTS, "Creator", Requirements.REQUIREMENTS.CREATOR_ID);
        public static final ForeignKey<RequirementsRecord, ProjectsRecord> REQUIREMENT_PROJECT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_PROJECTS_PRIMARY, Requirements.REQUIREMENTS, "Requirement_Project", Requirements.REQUIREMENTS.PROJECT_ID);
        public static final ForeignKey<RequirementFollowerRecord, RequirementsRecord> REQUIREMENT_FOLLOWER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENTS_PRIMARY, RequirementFollower.REQUIREMENT_FOLLOWER, "Requirement_Follower", RequirementFollower.REQUIREMENT_FOLLOWER.REQUIREMENT_ID);
        public static final ForeignKey<RequirementFollowerRecord, UsersRecord> REQUIREMENT_FOLLOWER_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, RequirementFollower.REQUIREMENT_FOLLOWER, "Requirement_Follower_User", RequirementFollower.REQUIREMENT_FOLLOWER.USER_ID);
        public static final ForeignKey<RolePrivilegeRecord, RolesRecord> ROLE_PRIVILEGE_ROLES = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_ROLES_PRIMARY, RolePrivilege.ROLE_PRIVILEGE, "Role_Privilege_Roles", RolePrivilege.ROLE_PRIVILEGE.ROLES_ID);
        public static final ForeignKey<RolePrivilegeRecord, PrivilegesRecord> ROLE_PRIVILEGE_PRIVILEGES = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_PRIVILEGES_PRIMARY, RolePrivilege.ROLE_PRIVILEGE, "Role_Privilege_Privileges", RolePrivilege.ROLE_PRIVILEGE.PRIVILEGES_ID);
        public static final ForeignKey<RoleRoleRecord, RolesRecord> ROLE_CHILD = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_ROLES_PRIMARY, RoleRole.ROLE_ROLE, "Role_Child", RoleRole.ROLE_ROLE.CHILD_ID);
        public static final ForeignKey<RoleRoleRecord, RolesRecord> ROLE_PARENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_ROLES_PRIMARY, RoleRole.ROLE_ROLE, "Role_Parent", RoleRole.ROLE_ROLE.PARENT_ID);
        public static final ForeignKey<TagsRecord, ComponentsRecord> TAGS_COMPONENTS = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_COMPONENTS_PRIMARY, Tags.TAGS, "Tags_Components", Tags.TAGS.COMPONENTS_ID);
        public static final ForeignKey<TagsRecord, RequirementsRecord> TAGS_REQUIREMENTS = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENTS_PRIMARY, Tags.TAGS, "Tags_Requirements", Tags.TAGS.REQUIREMENTS_ID);
        public static final ForeignKey<UserRoleRecord, RolesRecord> USER_ROLE_ROLES = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_ROLES_PRIMARY, UserRole.USER_ROLE, "User_Role_Roles", UserRole.USER_ROLE.ROLES_ID);
        public static final ForeignKey<UserRoleRecord, UsersRecord> USER_ROLE_USERS = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, UserRole.USER_ROLE, "User_Role_Users", UserRole.USER_ROLE.USERS_ID);
        public static final ForeignKey<VotesRecord, RequirementsRecord> VOTES_REQUIREMENT = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_REQUIREMENTS_PRIMARY, Votes.VOTES, "Votes_Requirement", Votes.VOTES.REQUIREMENT_ID);
        public static final ForeignKey<VotesRecord, UsersRecord> VOTES_USER = createForeignKey(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_USERS_PRIMARY, Votes.VOTES, "Votes_User", Votes.VOTES.USER_ID);
    }
}
