/*
 *
 *  Copyright (c) 2014, RWTH Aachen University.
 *  For a list of contributors see the AUTHORS file at the top-level directory
 *  of this distribution.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * /
 */

package de.rwth.dbis.acis.bazaar.dal.transform;

import de.rwth.dbis.acis.bazaar.dal.entities.Tag;
import de.rwth.dbis.acis.bazaar.dal.helpers.Pageable;
import de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord;
import org.jooq.*;

import static de.rwth.dbis.acis.bazaar.dal.jooq.tables.Tags.TAGS;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Adam Gavronek <gavronek@dbis.rwth-aachen.de>
 * @since 6/23/2014
 */
public class TagTransformator implements Transformator<de.rwth.dbis.acis.bazaar.dal.entities.Tag,de.rwth.dbis.acis.bazaar.dal.jooq.tables.records.TagsRecord> {
    @Override
    public TagsRecord createRecord(Tag entity) {
        TagsRecord record = new TagsRecord();
        record.setId(entity.getId());
        record.setComponentsId(entity.getComponentId());
        record.setRequirementsId(entity.getRequirementId());
        return record;
    }

    @Override
    public Tag mapToEntity(TagsRecord record) {
        return Tag.getBuilder(record.getComponentsId())
                .id(record.getId())
                .requirementId(record.getRequirementsId())
                .build();
    }

    @Override
    public Table<TagsRecord> getTable() {
        return TAGS;
    }

    @Override
    public TableField<TagsRecord, Integer> getTableId() {
        return TAGS.ID;
    }

    @Override
    public Class<? extends TagsRecord> getRecordClass() {
        return TagsRecord.class;
    }

    @Override
    public Map<Field, Object> getUpdateMap(final Tag entity) {
        return new HashMap<Field, Object>(){{
            put(TAGS.COMPONENTS_ID,entity.getComponentId());
            put(TAGS.REQUIREMENTS_ID,entity.getRequirementId());
        }};
    }

    @Override
    public Collection<? extends SortField<?>> getSortFields(Pageable.SortDirection sortDirection) {
        switch (sortDirection){
            case DEFAULT:
                return Arrays.asList(TAGS.ID.asc());
            case ASC:
                return Arrays.asList(TAGS.ID.asc());
            case DESC:
                return Arrays.asList(TAGS.ID.desc());
        }
        return null;
    }

    @Override
    public Collection<? extends Condition> getSearchFields(String likeExpression) throws Exception {
        throw new Exception("Search is not supported!");
    }
}
