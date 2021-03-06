/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.Reqbaz;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ComponentsRecord;

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
public class Components extends TableImpl<ComponentsRecord> {

    private static final long serialVersionUID = -1517011723;

    /**
     * The reference instance of <code>reqbaz.components</code>
     */
    public static final Components COMPONENTS = new Components();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ComponentsRecord> getRecordType() {
        return ComponentsRecord.class;
    }

    /**
     * The column <code>reqbaz.components.Id</code>.
     */
    public final TableField<ComponentsRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.components.name</code>.
     */
    public final TableField<ComponentsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>reqbaz.components.description</code>.
     */
    public final TableField<ComponentsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>reqbaz.components.creation_time</code>.
     */
    public final TableField<ComponentsRecord, Timestamp> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>reqbaz.components.lastupdated_time</code>.
     */
    public final TableField<ComponentsRecord, Timestamp> LASTUPDATED_TIME = createField("lastupdated_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>reqbaz.components.Project_Id</code>.
     */
    public final TableField<ComponentsRecord, Integer> PROJECT_ID = createField("Project_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.components.Leader_Id</code>.
     */
    public final TableField<ComponentsRecord, Integer> LEADER_ID = createField("Leader_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>reqbaz.components</code> table reference
     */
    public Components() {
        this("components", null);
    }

    /**
     * Create an aliased <code>reqbaz.components</code> table reference
     */
    public Components(String alias) {
        this(alias, COMPONENTS);
    }

    private Components(String alias, Table<ComponentsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Components(String alias, Table<ComponentsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ComponentsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMPONENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ComponentsRecord> getPrimaryKey() {
        return Keys.KEY_COMPONENTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ComponentsRecord>> getKeys() {
        return Arrays.<UniqueKey<ComponentsRecord>>asList(Keys.KEY_COMPONENTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ComponentsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ComponentsRecord, ?>>asList(Keys.COMPONENT_PROJECT, Keys.COMPONENTS_USERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Components as(String alias) {
        return new Components(alias, this);
    }

    /**
     * Rename this table
     */
    public Components rename(String name) {
        return new Components(name, null);
    }
}
