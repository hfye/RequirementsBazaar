/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.Reqbaz;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.CommentsRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Comments extends TableImpl<CommentsRecord> {

    private static final long serialVersionUID = -1036214342;

    /**
     * The reference instance of <code>reqbaz.comments</code>
     */
    public static final Comments COMMENTS = new Comments();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommentsRecord> getRecordType() {
        return CommentsRecord.class;
    }

    /**
     * The column <code>reqbaz.comments.Id</code>.
     */
    public final TableField<CommentsRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.comments.message</code>.
     */
    public final TableField<CommentsRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR.length(140).nullable(false), this, "");

    /**
     * The column <code>reqbaz.comments.creation_time</code>.
     */
    public final TableField<CommentsRecord, Timestamp> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>reqbaz.comments.lastupdated_time</code>.
     */
    public final TableField<CommentsRecord, Timestamp> LASTUPDATED_TIME = createField("lastupdated_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>reqbaz.comments.Requirement_Id</code>.
     */
    public final TableField<CommentsRecord, Integer> REQUIREMENT_ID = createField("Requirement_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.comments.User_Id</code>.
     */
    public final TableField<CommentsRecord, Integer> USER_ID = createField("User_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.comments.BelongsToComment_Id</code>.
     */
    public final TableField<CommentsRecord, Integer> BELONGSTOCOMMENT_ID = createField("BelongsToComment_Id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>reqbaz.comments</code> table reference
     */
    public Comments() {
        this("comments", null);
    }

    /**
     * Create an aliased <code>reqbaz.comments</code> table reference
     */
    public Comments(String alias) {
        this(alias, COMMENTS);
    }

    private Comments(String alias, Table<CommentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Comments(String alias, Table<CommentsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Reqbaz.REQBAZ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CommentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CommentsRecord> getPrimaryKey() {
        return Keys.KEY_COMMENTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CommentsRecord>> getKeys() {
        return Arrays.<UniqueKey<CommentsRecord>>asList(Keys.KEY_COMMENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CommentsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CommentsRecord, ?>>asList(Keys.COMMENT_REQUIREMENT, Keys.COMMENT_USER, Keys.BELONGSTOCOMMENT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Comments as(String alias) {
        return new Comments(alias, this);
    }

    /**
     * Rename this table
     */
    public Comments rename(String name) {
        return new Comments(name, null);
    }
}
