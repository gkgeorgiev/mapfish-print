/*
 * Copyright (C) 2014  Camptocamp
 *
 * This file is part of MapFish Print
 *
 * MapFish Print is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MapFish Print is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MapFish Print.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mapfish.print.config;

import java.util.List;

/**
 * A flag interface for a configuration object.  This to allow spring to find them as plugins.
 * <p></p>
 * @author jesseeichar on 3/4/14.
 */
public interface ConfigurationObject {
    /**
     * validate that the configuration was correct.
     *
     * @param validationErrors a list to add any detected errors to.
     * @param configuration the containing configuration
     */
    void validate(List<Throwable> validationErrors, final Configuration configuration);
}
