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

package org.mapfish.print.processor.http.matcher;

import org.mapfish.print.config.Configuration;

import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.List;

/**
 * A matcher that always returns true.
 * [[examples=http_processors]]
 *
 * @author jesseeichar on 1/20/14.
 */
public final class AcceptAllMatcher extends AbstractMatcher {
    /**
     * A singleton instance to reduce creating unnecessary instances.
     */
    public static final AcceptAllMatcher INSTANCE = new AcceptAllMatcher();

    @Override
    public void validate(final List<Throwable> validationErrors, final Configuration configuration) {
        // no checks required
    }

    @Override
    public String toString() {
        return "Accept All";
    }

    @Override
    public boolean matches(final MatchInfo matchInfo) throws UnknownHostException, SocketException, MalformedURLException {
        return true;
    }
}
