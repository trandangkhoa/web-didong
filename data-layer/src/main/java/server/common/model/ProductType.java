package server.common.model;

import java.io.Serializable;

public class ProductType
implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private Long productTypeId;
	private String productTypeName;
	public Long getProductTypeId() {
		return productTypeId;
	}
	public void setProductTypeId(Long productTypeId) {
		this.productTypeId = productTypeId;
	}
	public String getProductTypeName() {
		return productTypeName;
	}
	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

}
