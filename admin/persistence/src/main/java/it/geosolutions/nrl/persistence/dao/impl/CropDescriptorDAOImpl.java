/*
 *  nrl Crop Information Portal
 *  https://github.com/geosolutions-it/crop-information-portal
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

package it.geosolutions.nrl.persistence.dao.impl;

import it.geosolutions.nrl.model.CropDescriptor;
import it.geosolutions.nrl.persistence.dao.CropDescriptorDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Lorenzo Natali
 * @author ETj
 */
@Transactional(value = "nrlTransactionManager")
public class CropDescriptorDAOImpl extends BaseDAO<CropDescriptor, String> implements CropDescriptorDAO {

    @Override
    public void persist(CropDescriptor... entities) {
        super.persist(entities);
    }

    @Override
    public CropDescriptor merge(CropDescriptor entity) {
        return super.merge(entity); 
    }

    @Override
    public boolean remove(CropDescriptor entity) {
        return super.remove(entity);
    }

    @Override
    public boolean removeById(String id) {
        return super.removeById(id); 
    }
}
