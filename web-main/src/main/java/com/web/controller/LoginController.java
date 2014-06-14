package com.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import com.web.model.Device;

import server.common.service.*;

@Controller
public class LoginController {
	private EntityService entityService;
	
	public EntityService getEntityService() {
		return entityService;
	}
	public void setEntityService(EntityService entityService) {
		this.entityService = entityService;
	}
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public String showLogin() {
		return "login";
	}
	

    @RequestMapping(value="",method = RequestMethod.GET)
    public String index() {
    	return "index";
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello.htm")
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		String now = (new Date()).toString();
		logger.info("Returning hello view with " + now);
		
		if(entityService == null){
			logger.error("Entity service is null, spring configuration got problem");
		}
		
		ModelAndView model = new ModelAndView("index");
		Device device = new Device();
		device.setDeviceName("Test device");
		model.addObject("device", device);
		
		return model;
	}	
}
