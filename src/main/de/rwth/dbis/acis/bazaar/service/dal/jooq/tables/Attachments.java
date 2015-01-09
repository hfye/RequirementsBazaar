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
public class Attachments extends org.jooq.impl.TableImpl<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord> {

	private static final long serialVersionUID = -1336357178;

	/**
	 * The singleton instance of <code>reqbaz.attachments</code>
	 */
	public static final de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachments ATTACHMENTS = new de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachments();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord> getRecordType() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord.class;
	}

	/**
	 * The column <code>reqbaz.attachments.Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.attachments.creation_time</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.sql.Timestamp> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>reqbaz.attachments.Requirement_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.Integer> REQUIREMENT_ID = createField("Requirement_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.attachments.User_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.Integer> USER_ID = createField("User_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.attachments.title</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>reqbaz.attachments.discriminator</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.String> DISCRIMINATOR = createField("discriminator", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>reqbaz.attachments.file_path</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.String> FILE_PATH = createField("file_path", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "");

	/**
	 * The column <code>reqbaz.attachments.description</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>reqbaz.attachments.story</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.String> STORY = createField("story", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>reqbaz.attachments.subject</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.String> SUBJECT = createField("subject", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>reqbaz.attachments.object</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.String> OBJECT = createField("object", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>reqbaz.attachments.object_desc</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.String> OBJECT_DESC = createField("object_desc", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>reqbaz.attachments</code> table reference
	 */
	public Attachments() {
		this("attachments", null);
	}

	/**
	 * Create an aliased <code>reqbaz.attachments</code> table reference
	 */
	public Attachments(java.lang.String alias) {
		this(alias, de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachments.ATTACHMENTS);
	}

	private Attachments(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Attachments(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.rwth.dbis.acis.bazaar.service.dal.jooq.Reqbaz.REQBAZ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord, java.lang.Integer> getIdentity() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.IDENTITY_ATTACHMENTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord> getPrimaryKey() {
		return de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_ATTACHMENTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.AttachmentsRecord>>asList(de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys.KEY_ATTACHMENTS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachments as(java.lang.String alias) {
		return new de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachments(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachments rename(java.lang.String name) {
		return new de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachments(name, null);
	}
}
