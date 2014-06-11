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
public class Attachements extends org.jooq.impl.TableImpl<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord> {

	private static final long serialVersionUID = -2113000652;

	/**
	 * The singleton instance of <code>reqbaz.attachements</code>
	 */
	public static final de.rwth.dbis.acis.bazaar.dal.jooq.tables.Attachements ATTACHEMENTS = new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Attachements();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord> getRecordType() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord.class;
	}

	/**
	 * The column <code>reqbaz.attachements.Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord, java.lang.Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.attachements.creation_time</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord, java.sql.Timestamp> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>reqbaz.attachements.Requirement_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord, java.lang.Integer> REQUIREMENT_ID = createField("Requirement_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.attachements.User_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord, java.lang.Integer> USER_ID = createField("User_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>reqbaz.attachements</code> table reference
	 */
	public Attachements() {
		this("attachements", null);
	}

	/**
	 * Create an aliased <code>reqbaz.attachements</code> table reference
	 */
	public Attachements(java.lang.String alias) {
		this(alias, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Attachements.ATTACHEMENTS);
	}

	private Attachements(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Attachements(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.rwth.dbis.acis.bazaar.dal.jooq.Reqbaz.REQBAZ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord, java.lang.Integer> getIdentity() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.Keys.IDENTITY_ATTACHEMENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord> getPrimaryKey() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.Keys.KEY_ATTACHEMENTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.AttachementsRecord>>asList(de.rwth.dbis.acis.bazaar.dal.jooq.Keys.KEY_ATTACHEMENTS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.rwth.dbis.acis.bazaar.dal.jooq.tables.Attachements as(java.lang.String alias) {
		return new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Attachements(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.rwth.dbis.acis.bazaar.dal.jooq.tables.Attachements rename(java.lang.String name) {
		return new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Attachements(name, null);
	}
}