package com.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.web.model.Device;

public class PostRequestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping(value = "/addDevice", method = RequestMethod.POST)
	public String addDevice(@ModelAttribute("device") Device device) {

		return "redirect:contacts.html";
	}

}
