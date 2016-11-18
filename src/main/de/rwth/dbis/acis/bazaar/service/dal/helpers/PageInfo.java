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

package de.rwth.dbis.acis.bazaar.service.dal.helpers;

import jodd.vtor.constraint.Min;

import java.util.Map;

/**
 * @author Adam Gavronek <gavronek@dbis.rwth-aachen.de>
 * @since 6/15/2014
 */
public class PageInfo implements Pageable {
    @Min(-1)
    private final int pageNumber;

    @Min(0)
    private final int pageSize;
    private final SortDirection sortDirection;
    private final Map<String, String> filters;

    public PageInfo(int pageNumber, int pageSize, Map<String, String> filters) {
        this(pageNumber, pageSize, filters, SortDirection.DEFAULT);
    }

    public PageInfo(int pageNumber, int pageSize, Map<String, String> filters, SortDirection sortDirection) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.filters = filters;
        this.sortDirection = sortDirection;
    }

    @Override
    public int getOffset() {
        return pageNumber * pageSize;
    }

    @Override
    public int getPageNumber() {
        return pageNumber;
    }

    @Override
    public int getPageSize() {
        return pageSize;
    }

    @Override
    public Map<String, String> getFilters() {
        return filters;
    }

    @Override
    public SortDirection getSortDirection() {
        return sortDirection;
    }
}
