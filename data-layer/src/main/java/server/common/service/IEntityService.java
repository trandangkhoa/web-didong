package server.common.service;

import server.common.model.BaseEntity;
import server.exception.UnableToDeleteException;
import server.exception.UnableToInsertException;

/**
 * Created by khoa on 5/4/2014.
 */
public interface IEntityService {
    public void insertNewEntity(BaseEntity baseEntity) throws UnableToInsertException;
    public void deleteEntity(BaseEntity baseEntity) throws UnableToDeleteException;
    public BaseEntity getEntityById(Long id);
}
