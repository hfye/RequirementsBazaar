/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.dal.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CommentsRecord extends org.jooq.impl.UpdatableRecordImpl<de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.CommentsRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -221595580;

	/**
	 * Setter for <code>reqbaz.comments.Id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>reqbaz.comments.Id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>reqbaz.comments.message</code>.
	 */
	public void setMessage(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>reqbaz.comments.message</code>.
	 */
	public java.lang.String getMessage() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>reqbaz.comments.creation_time</code>.
	 */
	public void setCreationTime(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>reqbaz.comments.creation_time</code>.
	 */
	public java.sql.Timestamp getCreationTime() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>reqbaz.comments.Requirement_Id</code>.
	 */
	public void setRequirementId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>reqbaz.comments.Requirement_Id</code>.
	 */
	public java.lang.Integer getRequirementId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>reqbaz.comments.User_Id</code>.
	 */
	public void setUserId(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>reqbaz.comments.User_Id</code>.
	 */
	public java.lang.Integer getUserId() {
		return (java.lang.Integer) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.tables.Comments.COMMENTS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.tables.Comments.COMMENTS.MESSAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.tables.Comments.COMMENTS.CREATION_TIME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.tables.Comments.COMMENTS.REQUIREMENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return de.rwth.dbis.acis.bazaar.dal.jooq.tables.Comments.COMMENTS.USER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getMessage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getCreationTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getRequirementId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getUserId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord value2(java.lang.String value) {
		setMessage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord value3(java.sql.Timestamp value) {
		setCreationTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord value4(java.lang.Integer value) {
		setRequirementId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord value5(java.lang.Integer value) {
		setUserId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CommentsRecord values(java.lang.Integer value1, java.lang.String value2, java.sql.Timestamp value3, java.lang.Integer value4, java.lang.Integer value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CommentsRecord
	 */
	public CommentsRecord() {
		super(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Comments.COMMENTS);
	}

	/**
	 * Create a detached, initialised CommentsRecord
	 */
	public CommentsRecord(java.lang.Integer id, java.lang.String message, java.sql.Timestamp creationTime, java.lang.Integer requirementId, java.lang.Integer userId) {
		super(de.rwth.dbis.acis.bazaar.dal.jooq.tables.Comments.COMMENTS);

		setValue(0, id);
		setValue(1, message);
		setValue(2, creationTime);
		setValue(3, requirementId);
		setValue(4, userId);
	}
}