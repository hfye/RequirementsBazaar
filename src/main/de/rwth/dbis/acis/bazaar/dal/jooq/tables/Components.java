/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.dal.jooq.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Components extends org.jooq.impl.TableImpl<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord> {

	private static final long serialVersionUID = 1806351343;

	/**
	 * The singleton instance of <code>reqbaz.components</code>
	 */
	public static final de.rwth.dbis.acis.bazaar.dal.jooq.tables.Components COMPONENTS = new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Components();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord> getRecordType() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord.class;
	}

	/**
	 * The column <code>reqbaz.components.Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord, java.lang.Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.components.name</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>reqbaz.components.description</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.length(65535).nullable(false), this, "");

	/**
	 * The column <code>reqbaz.components.Project_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord, java.lang.Integer> PROJECT_ID = createField("Project_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>reqbaz.components</code> table reference
	 */
	public Components() {
		this("components", null);
	}

	/**
	 * Create an aliased <code>reqbaz.components</code> table reference
	 */
	public Components(java.lang.String alias) {
		this(alias, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Components.COMPONENTS);
	}

	private Components(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Components(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.rwth.dbis.acis.bazaar.dal.jooq.Reqbaz.REQBAZ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord, java.lang.Integer> getIdentity() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.Keys.IDENTITY_COMPONENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord> getPrimaryKey() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.Keys.KEY_COMPONENTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ComponentsRecord>>asList(de.rwth.dbis.acis.bazaar.dal.jooq.Keys.KEY_COMPONENTS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.rwth.dbis.acis.bazaar.dal.jooq.tables.Components as(java.lang.String alias) {
		return new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Components(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.rwth.dbis.acis.bazaar.dal.jooq.tables.Components rename(java.lang.String name) {
		return new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Components(name, null);
	}
}
