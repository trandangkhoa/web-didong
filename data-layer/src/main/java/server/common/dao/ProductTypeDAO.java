package server.common.dao;

import org.hibernate.SessionFactory;

import server.common.model.ProductType;


/**
 * Created by khoa on 5/4/2014.
 */
public class ProductTypeDAO extends BaseDAO<ProductType> implements IProductTypeDAO {

    public ProductTypeDAO(SessionFactory sessionFactory)
    {
        super();
        setType(ProductType.class);
        this.sessionFactory = sessionFactory;
    }
}
