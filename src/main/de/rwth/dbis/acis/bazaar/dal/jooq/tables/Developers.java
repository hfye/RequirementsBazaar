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
public class Developers extends org.jooq.impl.TableImpl<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord> {

	private static final long serialVersionUID = -728275041;

	/**
	 * The singleton instance of <code>reqbaz.developers</code>
	 */
	public static final de.rwth.dbis.acis.bazaar.dal.jooq.tables.Developers DEVELOPERS = new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Developers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord> getRecordType() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord.class;
	}

	/**
	 * The column <code>reqbaz.developers.Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord, java.lang.Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.developers.Requirement_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord, java.lang.Integer> REQUIREMENT_ID = createField("Requirement_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.developers.User_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord, java.lang.Integer> USER_ID = createField("User_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>reqbaz.developers</code> table reference
	 */
	public Developers() {
		this("developers", null);
	}

	/**
	 * Create an aliased <code>reqbaz.developers</code> table reference
	 */
	public Developers(java.lang.String alias) {
		this(alias, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Developers.DEVELOPERS);
	}

	private Developers(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Developers(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.rwth.dbis.acis.bazaar.dal.jooq.Reqbaz.REQBAZ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord, java.lang.Integer> getIdentity() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.Keys.IDENTITY_DEVELOPERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord> getPrimaryKey() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.Keys.KEY_DEVELOPERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.DevelopersRecord>>asList(de.rwth.dbis.acis.bazaar.dal.jooq.Keys.KEY_DEVELOPERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.rwth.dbis.acis.bazaar.dal.jooq.tables.Developers as(java.lang.String alias) {
		return new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Developers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.rwth.dbis.acis.bazaar.dal.jooq.tables.Developers rename(java.lang.String name) {
		return new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Developers(name, null);
	}
}
