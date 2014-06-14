package com.web.controller.product;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import server.common.model.ProductType;
import server.common.service.IProductTypeService;

@Controller
public class ProductTypeController{

	protected final Log logger = LogFactory.getLog(getClass());
	
	private IProductTypeService productTypeService;
	
	public IProductTypeService getProductTypeService() {
		return productTypeService;
	}

	public void setProductTypeService(IProductTypeService productTypeService) {
		this.productTypeService = productTypeService;
	}
	private static List<ProductType> lstTemp = new LinkedList<ProductType>();
	
	static {
		for(int i = 1; i< 6; i++){
			ProductType pt = new ProductType();
			pt.setProductTypeId(new Long(i));
			pt.setProductTypeName("ProductType " + i);
			lstTemp.add(pt);
		}
	}	
	

    @RequestMapping(value="/productTypes",method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		// TODO Auto-generated method stub
		model.addAttribute("model", lstTemp);
		return "product_type_list";
	}
    
    /*
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public String listById(@PathVariable Long id,Model model) throws Exception {
        // TODO Auto-generated method stub
        List<ProductType> lst = generateTestData();
        List<ProductType> toRemove = new LinkedList<ProductType>();
        for(ProductType pt : lst){
            if (!pt.getProductTypeId().equals(id))
                toRemove.add(pt);
        }
        lst.removeAll(toRemove);
        model.addAttribute("model", lst);
        return "product_type_list";
    }
    */
    
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public @ResponseBody ProductType getById(@PathVariable Long id) throws Exception {
        // TODO Auto-generated method stub
    	for(ProductType temp : lstTemp){
            if (temp.getProductTypeId().equals(id))
            	return temp;
        }
        return null;
    }
    @RequestMapping(value="/new", method=RequestMethod.GET)
    public ModelAndView add(HttpServletRequest arg0,
                             HttpServletResponse arg1) throws Exception {
        // TODO Auto-generated method stub
       return  new ModelAndView("product_type_add","productType", new ProductType());
    }

    
    @RequestMapping(value="/addProduct",method=RequestMethod.POST, headers = "Accept=application/json")
    public @ResponseBody  Map<Long, String> createProductType(@RequestBody ProductType productType){
    	 Map<Long, String> res = new HashedMap();
    	lstTemp.add(productType);
    	res.put(1L, "Done");
    	return res;
    }
}
