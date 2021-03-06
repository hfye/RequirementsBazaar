/**
 * This class is generated by jOOQ
 */
package de.rwth.dbis.acis.bazaar.service.dal.jooq.tables;


import de.rwth.dbis.acis.bazaar.service.dal.jooq.Keys;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.Reqbaz;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.ProjectsRecord;

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
public class Projects extends TableImpl<ProjectsRecord> {

    private static final long serialVersionUID = -1574052916;

    /**
     * The reference instance of <code>reqbaz.projects</code>
     */
    public static final Projects PROJECTS = new Projects();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProjectsRecord> getRecordType() {
        return ProjectsRecord.class;
    }

    /**
     * The column <code>reqbaz.projects.Id</code>.
     */
    public final TableField<ProjectsRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.projects.name</code>.
     */
    public final TableField<ProjectsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>reqbaz.projects.description</code>.
     */
    public final TableField<ProjectsRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>reqbaz.projects.visibility</code>.
     */
    public final TableField<ProjectsRecord, String> VISIBILITY = createField("visibility", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

    /**
     * The column <code>reqbaz.projects.creation_time</code>.
     */
    public final TableField<ProjectsRecord, Timestamp> CREATION_TIME = createField("creation_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.inline("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>reqbaz.projects.lastupdated_time</code>.
     */
    public final TableField<ProjectsRecord, Timestamp> LASTUPDATED_TIME = createField("lastupdated_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>reqbaz.projects.Leader_Id</code>.
     */
    public final TableField<ProjectsRecord, Integer> LEADER_ID = createField("Leader_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>reqbaz.projects.Default_Components_Id</code>.
     */
    public final TableField<ProjectsRecord, Integer> DEFAULT_COMPONENTS_ID = createField("Default_Components_Id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>reqbaz.projects</code> table reference
     */
    public Projects() {
        this("projects", null);
    }

    /**
     * Create an aliased <code>reqbaz.projects</code> table reference
     */
    public Projects(String alias) {
        this(alias, PROJECTS);
    }

    private Projects(String alias, Table<ProjectsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Projects(String alias, Table<ProjectsRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ProjectsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROJECTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProjectsRecord> getPrimaryKey() {
        return Keys.KEY_PROJECTS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProjectsRecord>> getKeys() {
        return Arrays.<UniqueKey<ProjectsRecord>>asList(Keys.KEY_PROJECTS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ProjectsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProjectsRecord, ?>>asList(Keys.PROJECTS_USERS, Keys.PROJECTS_COMPONENTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Projects as(String alias) {
        return new Projects(alias, this);
    }

    /**
     * Rename this table
     */
    public Projects rename(String name) {
        return new Projects(name, null);
    }
}
