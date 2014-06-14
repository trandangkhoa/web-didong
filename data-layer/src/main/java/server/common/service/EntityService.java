package server.common.service;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import server.common.dao.IEntityDAO;
import server.common.model.BaseEntity;
import server.exception.UnableToDeleteException;
import server.exception.UnableToInsertException;

/**
 * Created by khoa on 5/4/2014.
 */
public class EntityService extends BaseService implements IEntityService {
    private IEntityDAO entityDAO;

    public EntityService(SessionFactory sessionFactory,IEntityDAO entityDAO){
        this.sessionFactory  = sessionFactory;
        this.entityDAO = entityDAO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void insertNewEntity(BaseEntity baseEntity) throws UnableToInsertException {
      //  Transaction transaction = null;
        try{
      //      transaction = openTransaction(sessionFactory.getCurrentSession());
            entityDAO.insert(baseEntity);
     //       transaction.commit();
        }
        catch(Exception ex){
           /* if(transaction != null)
                transaction.rollback();*/
            throw new UnableToInsertException(ex.getMessage());
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteEntity(BaseEntity baseEntity) throws UnableToDeleteException {
     //   Transaction transaction = null;
        try{
       //     transaction = openTransaction(sessionFactory.getCurrentSession());
            entityDAO.delete(baseEntity);
       //     transaction.commit();
        }
        catch(Exception ex){
         /*   if(transaction != null)
                transaction.rollback();*/
            throw new UnableToDeleteException(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public BaseEntity getEntityById(Long id) {
    //    Transaction transaction;
        try{
      //      transaction = openTransaction(sessionFactory.getCurrentSession());
            BaseEntity res = entityDAO.getById(id);
        //    transaction.commit();
            return res;
        }
        catch(Exception ex){
        }

        return null;
    }
}
