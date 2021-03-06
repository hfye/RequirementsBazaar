/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Users;

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
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record10<Integer, String, String, String, Byte, Long, String, String, Byte, Byte> {

    private static final long serialVersionUID = -1508657521;

    /**
     * Setter for <code>reqbaz.users.Id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>reqbaz.users.Id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>reqbaz.users.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>reqbaz.users.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>reqbaz.users.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>reqbaz.users.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>reqbaz.users.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>reqbaz.users.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>reqbaz.users.admin</code>.
     */
    public void setAdmin(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>reqbaz.users.admin</code>.
     */
    public Byte getAdmin() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>reqbaz.users.Las2peer_Id</code>.
     */
    public void setLas2peerId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>reqbaz.users.Las2peer_Id</code>.
     */
    public Long getLas2peerId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>reqbaz.users.user_name</code>.
     */
    public void setUserName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>reqbaz.users.user_name</code>.
     */
    public String getUserName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>reqbaz.users.profile_image</code>.
     */
    public void setProfileImage(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>reqbaz.users.profile_image</code>.
     */
    public String getProfileImage() {
        return (String) get(7);
    }

    /**
     * Setter for <code>reqbaz.users.email_lead_items</code>.
     */
    public void setEmailLeadItems(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>reqbaz.users.email_lead_items</code>.
     */
    public Byte getEmailLeadItems() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>reqbaz.users.email_follow_items</code>.
     */
    public void setEmailFollowItems(Byte value) {
        set(9, value);
    }

    /**
     * Getter for <code>reqbaz.users.email_follow_items</code>.
     */
    public Byte getEmailFollowItems() {
        return (Byte) get(9);
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
    public Row10<Integer, String, String, String, Byte, Long, String, String, Byte, Byte> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, Byte, Long, String, String, Byte, Byte> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Users.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Users.USERS.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Users.USERS.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Users.USERS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field5() {
        return Users.USERS.ADMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Users.USERS.LAS2PEER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Users.USERS.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Users.USERS.PROFILE_IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field9() {
        return Users.USERS.EMAIL_LEAD_ITEMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field10() {
        return Users.USERS.EMAIL_FOLLOW_ITEMS;
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
    public String value2() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value5() {
        return getAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getLas2peerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getProfileImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value9() {
        return getEmailLeadItems();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value10() {
        return getEmailFollowItems();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value5(Byte value) {
        setAdmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value6(Long value) {
        setLas2peerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value7(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value8(String value) {
        setProfileImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value9(Byte value) {
        setEmailLeadItems(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value10(Byte value) {
        setEmailFollowItems(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(Integer value1, String value2, String value3, String value4, Byte value5, Long value6, String value7, String value8, Byte value9, Byte value10) {
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
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Integer id, String firstName, String lastName, String email, Byte admin, Long las2peerId, String userName, String profileImage, Byte emailLeadItems, Byte emailFollowItems) {
        super(Users.USERS);

        set(0, id);
        set(1, firstName);
        set(2, lastName);
        set(3, email);
        set(4, admin);
        set(5, las2peerId);
        set(6, userName);
        set(7, profileImage);
        set(8, emailLeadItems);
        set(9, emailFollowItems);
    }
}
