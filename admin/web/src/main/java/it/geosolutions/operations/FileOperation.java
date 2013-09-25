/*
 *  OpenSDI Manager
 *  Copyright (C) 2013 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 *  GPLv3 + Classpath exception
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.geosolutions.operations;

import java.util.List;

public interface FileOperation extends Operation {
	
	/**
	 * List of Strings representing all the extensions this Operation can work on.
	 * Extensions can be specified multiple times if isMultiple == true,
	 * meaning that this Operation needs more than one file to run.
	 * IE: {'shp', 'shp', 'dxf'}
	 * @return 
	 */
	public List<String> getExtensions();
	
	/**
	 * Tells if all the specified Extensions are necessary to run
	 * @return
	 */
	public boolean isMultiple();
}
