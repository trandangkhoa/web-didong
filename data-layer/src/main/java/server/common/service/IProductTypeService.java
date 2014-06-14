package server.common.service;

import server.common.model.ProductType;
import server.exception.UnableToDeleteException;
import server.exception.UnableToInsertException;

/**
 * Created by khoa on 5/4/2014.
 */
public interface IProductTypeService {
    public void insertNewProductType(ProductType productType) throws UnableToInsertException;
    public void deleteProductType(ProductType productType) throws UnableToDeleteException;
    public ProductType getProductTypeById(Long id);
}
