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

package de.rwth.dbis.acis.bazaar.service.dal.repositories;

import de.rwth.dbis.acis.bazaar.service.dal.entities.Comment;
import de.rwth.dbis.acis.bazaar.service.dal.entities.Project;
import de.rwth.dbis.acis.bazaar.service.dal.helpers.Pageable;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Projects;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Requirements;
import de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.records.CommentsRecord;
import de.rwth.dbis.acis.bazaar.service.dal.transform.CommentTransformator;
import de.rwth.dbis.acis.bazaar.service.exception.BazaarException;
import de.rwth.dbis.acis.bazaar.service.exception.ErrorCode;
import de.rwth.dbis.acis.bazaar.service.exception.ExceptionHandler;
import de.rwth.dbis.acis.bazaar.service.exception.ExceptionLocation;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;

import java.util.ArrayList;
import java.util.List;

import static de.rwth.dbis.acis.bazaar.service.dal.jooq.tables.Comments.COMMENTS;

/**
 * @author Adam Gavronek <gavronek@dbis.rwth-aachen.de>
 * @since 6/23/2014
 */
public class CommentRepositoryImpl extends RepositoryImpl<Comment, CommentsRecord> implements CommentRepository {

    /**
     * @param jooq DSLContext for JOOQ connection
     */
    public CommentRepositoryImpl(DSLContext jooq) {
        super(jooq, new CommentTransformator());
    }

    @Override
    public List<Comment> findAllByRequirementId(int requirementId, Pageable pageable) throws BazaarException {
        List<Comment> entries = null;
        try {
            entries = new ArrayList<Comment>();

            List<CommentsRecord> queryResults = jooq.selectFrom(transformator.getTable())
                    .where(COMMENTS.REQUIREMENT_ID.equal(requirementId))
                    .orderBy(transformator.getSortFields(pageable.getSortDirection()))
                    .limit(pageable.getPageSize())
                    .offset(pageable.getOffset())
                    .fetchInto(transformator.getRecordClass());

            for (CommentsRecord queryResult : queryResults) {
                Comment entry = transformator.mapToEntity(queryResult);
                entries.add(entry);
            }
        } catch (DataAccessException e) {
            ExceptionHandler.getInstance().convertAndThrowException(e, ExceptionLocation.REPOSITORY, ErrorCode.UNKNOWN);
        }

        return entries;
    }

    @Override
    public boolean belongsToPublicProject(int id) throws BazaarException {
        try {

            Integer countOfPublicProjects = jooq.selectCount()
                    .from(transformator.getTable())
                    .join(Requirements.REQUIREMENTS).on(Requirements.REQUIREMENTS.ID.eq(COMMENTS.REQUIREMENT_ID))
                    .join(Projects.PROJECTS).on(Projects.PROJECTS.ID.eq(Requirements.REQUIREMENTS.PROJECT_ID))
                    .where(transformator.getTableId().eq(id).and(Projects.PROJECTS.VISIBILITY.eq(Project.ProjectVisibility.PUBLIC.asChar())))
                    .fetchOne(0, int.class);

            return (countOfPublicProjects == 1);
        } catch (DataAccessException e) {
            ExceptionHandler.getInstance().convertAndThrowException(e, ExceptionLocation.REPOSITORY, ErrorCode.UNKNOWN);
        }
        return false;
    }
}
