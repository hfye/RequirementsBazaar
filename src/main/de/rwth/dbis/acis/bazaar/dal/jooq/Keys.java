/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.dal.jooq;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>reqbaz</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord, java.lang.Integer> IDENTITY_ATTACHEMENTS = Identities0.IDENTITY_ATTACHEMENTS;
	public static final org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AuthorizationsRecord, java.lang.Integer> IDENTITY_AUTHORIZATIONS = Identities0.IDENTITY_AUTHORIZATIONS;
	public static final org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.CommentsRecord, java.lang.Integer> IDENTITY_COMMENTS = Identities0.IDENTITY_COMMENTS;
	public static final org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord, java.lang.Integer> IDENTITY_COMPONENTS = Identities0.IDENTITY_COMPONENTS;
	public static final org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord, java.lang.Integer> IDENTITY_DEVELOPERS = Identities0.IDENTITY_DEVELOPERS;
	public static final org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.FollowersRecord, java.lang.Integer> IDENTITY_FOLLOWERS = Identities0.IDENTITY_FOLLOWERS;
	public static final org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ProjectsRecord, java.lang.Integer> IDENTITY_PROJECTS = Identities0.IDENTITY_PROJECTS;
	public static final org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.RequirementsRecord, java.lang.Integer> IDENTITY_REQUIREMENTS = Identities0.IDENTITY_REQUIREMENTS;
	public static final org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord, java.lang.Integer> IDENTITY_USERS = Identities0.IDENTITY_USERS;
	public static final org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.VotesRecord, java.lang.Integer> IDENTITY_VOTES = Identities0.IDENTITY_VOTES;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord> KEY_ATTACHEMENTS_PRIMARY = UniqueKeys0.KEY_ATTACHEMENTS_PRIMARY;
	public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AuthorizationsRecord> KEY_AUTHORIZATIONS_PRIMARY = UniqueKeys0.KEY_AUTHORIZATIONS_PRIMARY;
	public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.CommentsRecord> KEY_COMMENTS_PRIMARY = UniqueKeys0.KEY_COMMENTS_PRIMARY;
	public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord> KEY_COMPONENTS_PRIMARY = UniqueKeys0.KEY_COMPONENTS_PRIMARY;
	public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord> KEY_DEVELOPERS_PRIMARY = UniqueKeys0.KEY_DEVELOPERS_PRIMARY;
	public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.FollowersRecord> KEY_FOLLOWERS_PRIMARY = UniqueKeys0.KEY_FOLLOWERS_PRIMARY;
	public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ProjectsRecord> KEY_PROJECTS_PRIMARY = UniqueKeys0.KEY_PROJECTS_PRIMARY;
	public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.RequirementsRecord> KEY_REQUIREMENTS_PRIMARY = UniqueKeys0.KEY_REQUIREMENTS_PRIMARY;
	public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord> KEY_USERS_PRIMARY = UniqueKeys0.KEY_USERS_PRIMARY;
	public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.VotesRecord> KEY_VOTES_PRIMARY = UniqueKeys0.KEY_VOTES_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord, java.lang.Integer> IDENTITY_ATTACHEMENTS = createIdentity(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Attachements.ATTACHEMENTS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Attachements.ATTACHEMENTS.ID);
		public static org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AuthorizationsRecord, java.lang.Integer> IDENTITY_AUTHORIZATIONS = createIdentity(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Authorizations.AUTHORIZATIONS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Authorizations.AUTHORIZATIONS.ID);
		public static org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.CommentsRecord, java.lang.Integer> IDENTITY_COMMENTS = createIdentity(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Comments.COMMENTS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Comments.COMMENTS.ID);
		public static org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord, java.lang.Integer> IDENTITY_COMPONENTS = createIdentity(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Components.COMPONENTS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Components.COMPONENTS.ID);
		public static org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord, java.lang.Integer> IDENTITY_DEVELOPERS = createIdentity(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Developers.DEVELOPERS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Developers.DEVELOPERS.ID);
		public static org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.FollowersRecord, java.lang.Integer> IDENTITY_FOLLOWERS = createIdentity(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Followers.FOLLOWERS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Followers.FOLLOWERS.ID);
		public static org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ProjectsRecord, java.lang.Integer> IDENTITY_PROJECTS = createIdentity(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Projects.PROJECTS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Projects.PROJECTS.ID);
		public static org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.RequirementsRecord, java.lang.Integer> IDENTITY_REQUIREMENTS = createIdentity(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Requirements.REQUIREMENTS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Requirements.REQUIREMENTS.ID);
		public static org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord, java.lang.Integer> IDENTITY_USERS = createIdentity(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Users.USERS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Users.USERS.ID);
		public static org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.VotesRecord, java.lang.Integer> IDENTITY_VOTES = createIdentity(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Votes.VOTES, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Votes.VOTES.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord> KEY_ATTACHEMENTS_PRIMARY = createUniqueKey(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Attachements.ATTACHEMENTS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Attachements.ATTACHEMENTS.ID);
		public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AuthorizationsRecord> KEY_AUTHORIZATIONS_PRIMARY = createUniqueKey(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Authorizations.AUTHORIZATIONS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Authorizations.AUTHORIZATIONS.ID);
		public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.CommentsRecord> KEY_COMMENTS_PRIMARY = createUniqueKey(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Comments.COMMENTS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Comments.COMMENTS.ID);
		public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord> KEY_COMPONENTS_PRIMARY = createUniqueKey(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Components.COMPONENTS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Components.COMPONENTS.ID);
		public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord> KEY_DEVELOPERS_PRIMARY = createUniqueKey(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Developers.DEVELOPERS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Developers.DEVELOPERS.ID);
		public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.FollowersRecord> KEY_FOLLOWERS_PRIMARY = createUniqueKey(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Followers.FOLLOWERS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Followers.FOLLOWERS.ID);
		public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ProjectsRecord> KEY_PROJECTS_PRIMARY = createUniqueKey(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Projects.PROJECTS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Projects.PROJECTS.ID);
		public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.RequirementsRecord> KEY_REQUIREMENTS_PRIMARY = createUniqueKey(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Requirements.REQUIREMENTS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Requirements.REQUIREMENTS.ID);
		public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord> KEY_USERS_PRIMARY = createUniqueKey(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Users.USERS, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Users.USERS.ID);
		public static final org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.VotesRecord> KEY_VOTES_PRIMARY = createUniqueKey(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Votes.VOTES, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Votes.VOTES.ID);
	}
}
