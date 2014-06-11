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
public class Users extends org.jooq.impl.TableImpl<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord> {

	private static final long serialVersionUID = 1690874703;

	/**
	 * The singleton instance of <code>reqbaz.users</code>
	 */
	public static final de.rwth.dbis.acis.bazaar.dal.jooq.tables.Users USERS = new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Users();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord> getRecordType() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord.class;
	}

	/**
	 * The column <code>reqbaz.users.Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord, java.lang.Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.users.frist_name</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord, java.lang.String> FRIST_NAME = createField("frist_name", org.jooq.impl.SQLDataType.VARCHAR.length(150).nullable(false), this, "");

	/**
	 * The column <code>reqbaz.users.last_name</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(150).nullable(false), this, "");

	/**
	 * The column <code>reqbaz.users.email</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord, java.lang.String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>reqbaz.users.User_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord, java.lang.Integer> USER_ID = createField("User_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>reqbaz.users</code> table reference
	 */
	public Users() {
		this("users", null);
	}

	/**
	 * Create an aliased <code>reqbaz.users</code> table reference
	 */
	public Users(java.lang.String alias) {
		this(alias, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Users.USERS);
	}

	private Users(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Users(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.rwth.dbis.acis.bazaar.dal.jooq.Reqbaz.REQBAZ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord, java.lang.Integer> getIdentity() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.Keys.IDENTITY_USERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord> getPrimaryKey() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.Keys.KEY_USERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.UsersRecord>>asList(de.rwth.dbis.acis.bazaar.dal.jooq.Keys.KEY_USERS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.rwth.dbis.acis.bazaar.dal.jooq.tables.Users as(java.lang.String alias) {
		return new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Users(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.rwth.dbis.acis.bazaar.dal.jooq.tables.Users rename(java.lang.String name) {
		return new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Users(name, null);
	}
}
