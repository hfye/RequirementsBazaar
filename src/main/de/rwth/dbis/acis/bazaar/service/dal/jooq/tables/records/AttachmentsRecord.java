/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Attachments;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AttachmentsRecord extends UpdatableRecordImpl<AttachmentsRecord> implements Record10<Integer, Timestamp, Timestamp, Integer, Integer, String, String, String, String, String> {

    private static final long serialVersionUID = -1941330386;

    /**
     * Setter for <code>reqbaz.attachments.Id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>reqbaz.attachments.Id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>reqbaz.attachments.creation_time</code>.
     */
    public void setCreationTime(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>reqbaz.attachments.creation_time</code>.
     */
    public Timestamp getCreationTime() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>reqbaz.attachments.lastupdated_time</code>.
     */
    public void setLastupdatedTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>reqbaz.attachments.lastupdated_time</code>.
     */
    public Timestamp getLastupdatedTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>reqbaz.attachments.Requirement_Id</code>.
     */
    public void setRequirementId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>reqbaz.attachments.Requirement_Id</code>.
     */
    public Integer getRequirementId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>reqbaz.attachments.User_Id</code>.
     */
    public void setUserId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>reqbaz.attachments.User_Id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>reqbaz.attachments.title</code>.
     */
    public void setTitle(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>reqbaz.attachments.title</code>.
     */
    public String getTitle() {
        return (String) get(5);
    }

    /**
     * Setter for <code>reqbaz.attachments.description</code>.
     */
    public void setDescription(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>reqbaz.attachments.description</code>.
     */
    public String getDescription() {
        return (String) get(6);
    }

    /**
     * Setter for <code>reqbaz.attachments.mime_type</code>.
     */
    public void setMimeType(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>reqbaz.attachments.mime_type</code>.
     */
    public String getMimeType() {
        return (String) get(7);
    }

    /**
     * Setter for <code>reqbaz.attachments.identifier</code>.
     */
    public void setIdentifier(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>reqbaz.attachments.identifier</code>.
     */
    public String getIdentifier() {
        return (String) get(8);
    }

    /**
     * Setter for <code>reqbaz.attachments.fileUrl</code>.
     */
    public void setFileurl(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>reqbaz.attachments.fileUrl</code>.
     */
    public String getFileurl() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, Timestamp, Integer, Integer, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, Timestamp, Timestamp, Integer, Integer, String, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Attachments.ATTACHMENTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Attachments.ATTACHMENTS.CREATION_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Attachments.ATTACHMENTS.LASTUPDATED_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Attachments.ATTACHMENTS.REQUIREMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Attachments.ATTACHMENTS.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Attachments.ATTACHMENTS.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Attachments.ATTACHMENTS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Attachments.ATTACHMENTS.MIME_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Attachments.ATTACHMENTS.IDENTIFIER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Attachments.ATTACHMENTS.FILEURL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getCreationTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getLastupdatedTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRequirementId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getMimeType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getIdentifier();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getFileurl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentsRecord value2(Timestamp value) {
        setCreationTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentsRecord value3(Timestamp value) {
        setLastupdatedTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentsRecord value4(Integer value) {
        setRequirementId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentsRecord value5(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentsRecord value6(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentsRecord value7(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentsRecord value8(String value) {
        setMimeType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentsRecord value9(String value) {
        setIdentifier(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentsRecord value10(String value) {
        setFileurl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttachmentsRecord values(Integer value1, Timestamp value2, Timestamp value3, Integer value4, Integer value5, String value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AttachmentsRecord
     */
    public AttachmentsRecord() {
        super(Attachments.ATTACHMENTS);
    }

    /**
     * Create a detached, initialised AttachmentsRecord
     */
    public AttachmentsRecord(Integer id, Timestamp creationTime, Timestamp lastupdatedTime, Integer requirementId, Integer userId, String title, String description, String mimeType, String identifier, String fileurl) {
        super(Attachments.ATTACHMENTS);

        set(0, id);
        set(1, creationTime);
        set(2, lastupdatedTime);
        set(3, requirementId);
        set(4, userId);
        set(5, title);
        set(6, description);
        set(7, mimeType);
        set(8, identifier);
        set(9, fileurl);
    }
}
