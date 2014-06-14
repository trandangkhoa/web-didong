package server.common.service;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import server.common.dao.IProductTypeDAO;
import server.common.model.ProductType;
import server.exception.UnableToDeleteException;
import server.exception.UnableToInsertException;

/**
 * Created by khoa on 5/4/2014.
 */
public class ProductTypeService extends BaseService implements IProductTypeService {
    private IProductTypeDAO productTypeDAO;
 
    public ProductTypeService(SessionFactory sessionFactory, IProductTypeDAO productTypeDAO){
        this.sessionFactory  = sessionFactory;
        this.productTypeDAO = productTypeDAO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void insertNewProductType(ProductType productType) throws UnableToInsertException {
        try{
        	productTypeDAO.insert(productType);
        }
        catch(Exception ex){
            throw new UnableToInsertException(ex.getMessage());
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteProductType(ProductType productType) throws UnableToDeleteException {
        try{
        	productTypeDAO.delete(productType);
        }
        catch(Exception ex){
            throw new UnableToDeleteException(ex.getMessage());
        }
    }

    @Override
    @Transactional
    public ProductType getProductTypeById(Long id) {
        try{
        	ProductType res = productTypeDAO.getById(id);
            return res;
        }
        catch(Exception ex){
        }

        return null;
    }
}
