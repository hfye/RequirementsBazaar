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
public class Tags extends org.jooq.impl.TableImpl<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord> {

	private static final long serialVersionUID = -439605895;

	/**
	 * The singleton instance of <code>reqbaz.tags</code>
	 */
	public static final de.rwth.dbis.acis.bazaar.dal.jooq.tables.Tags TAGS = new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Tags();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord> getRecordType() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord.class;
	}

	/**
	 * The column <code>reqbaz.tags.Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord, java.lang.Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.tags.Components_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord, java.lang.Integer> COMPONENTS_ID = createField("Components_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>reqbaz.tags.Requirements_Id</code>.
	 */
	public final org.jooq.TableField<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord, java.lang.Integer> REQUIREMENTS_ID = createField("Requirements_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>reqbaz.tags</code> table reference
	 */
	public Tags() {
		this("tags", null);
	}

	/**
	 * Create an aliased <code>reqbaz.tags</code> table reference
	 */
	public Tags(java.lang.String alias) {
		this(alias, de.rwth.dbis.acis.bazaar.dal.jooq.tables.Tags.TAGS);
	}

	private Tags(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tags(java.lang.String alias, org.jooq.Table<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.rwth.dbis.acis.bazaar.dal.jooq.Reqbaz.REQBAZ, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord, java.lang.Integer> getIdentity() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.Keys.IDENTITY_TAGS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord> getPrimaryKey() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.Keys.KEY_TAGS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord>>asList(de.rwth.dbis.acis.bazaar.dal.jooq.Keys.KEY_TAGS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.rwth.dbis.acis.bazaar.dal.jooq.tables.Tags as(java.lang.String alias) {
		return new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Tags(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.rwth.dbis.acis.bazaar.dal.jooq.tables.Tags rename(java.lang.String name) {
		return new de.rwth.dbis.acis.bazaar.dal.jooq.tables.Tags(name, null);
	}
}