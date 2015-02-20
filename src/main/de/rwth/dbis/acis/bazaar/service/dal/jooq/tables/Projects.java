/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Projects extends org.jooq.impl.TableImpl<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord> {

	private static final long serialVersionUID = 921456119;

	/**
	 * The singleton instance of <code>reqbaz.projects</code>
	 */
	public static final de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Projects PROJECTS = new de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Projects();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord> getRecordType() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord.class;
	}

	/**
	 * The column <code>reqbaz.projects.Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord, java.lang.Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.projects.name</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>reqbaz.projects.description</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "");

	/**
	 * The column <code>reqbaz.projects.visibility</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord, java.lang.String> VISIBILITY = createField("visibility", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>reqbaz.projects.Leader_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord, java.lang.Integer> LEADER_ID = createField("Leader_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.projects.Default_Components_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord, java.lang.Integer> DEFAULT_COMPONENTS_ID = createField("Default_Components_Id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>reqbaz.projects</code> table reference
	 */
	public Projects() {
		this("projects", null);
	}

	/**
	 * Create an aliased <code>reqbaz.projects</code> table reference
	 */
	public Projects(java.lang.String alias) {
		this(alias, de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Projects.PROJECTS);
	}

	private Projects(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Projects(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.rwth.dbis.acis.bazaar.service.dal.jooq.Reqbaz.REQBAZ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord, java.lang.Integer> getIdentity() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.IDENTITY_PROJECTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord> getPrimaryKey() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_PROJECTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord>>asList(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_PROJECTS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Projects as(java.lang.String alias) {
		return new de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Projects(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Projects rename(java.lang.String name) {
		return new de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Projects(name, null);
	}
}
