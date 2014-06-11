package de.rwth.dbis.acis.bazaar.dal.transform;

import de.rwth.dbis.acis.bazaar.dal.entities.Project;
import de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ProjectsRecord;
import static de.rwth.dbis.acis.bazaar.dal.jooq.tables.Projects.PROJECTS;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Adam Gavronek <gavronek@dbis.rwth-aachen.de>
 * @since 6/9/2014
 */
public class ProjectTransformator implements Transformator<de.rwth.dbis.acis.bazaar.dal.entities.Project,de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.ProjectsRecord> {
    @Override
    public ProjectsRecord createRecord(Project entry) {
        ProjectsRecord record = new ProjectsRecord();
        record.setDescription(entry.getDescription());
        record.setName(entry.getName());

        return record;
    }

    @Override
    public Project mapToEntity(ProjectsRecord record) {
        return Project.getBuilder(record.getName())
                .description(record.getDescription())
                .id(record.getId())
                .build();
    }

    @Override
    public Table<ProjectsRecord> getTable() {
        return PROJECTS;
    }

    @Override
    public TableField<ProjectsRecord, Integer> getTableId() {
        return PROJECTS.ID;
    }

    @Override
    public Class<? extends ProjectsRecord> getRecordClass() {
        return ProjectsRecord.class;
    }

    @Override
    public Map<Field, Object> getUpdateMap(final Project entry) {
        return new HashMap<Field, Object>(){{
            put(PROJECTS.DESCRIPTION, entry.getDescription());
            put(PROJECTS.NAME, entry.getName());
        }};

    }
}
