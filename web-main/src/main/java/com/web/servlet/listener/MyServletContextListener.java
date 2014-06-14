package com.web.servlet.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {

	private static final String PARAM_CONTACT_EMAIL = "contact.email";

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		ServletContext sc = arg0.getServletContext();
		String email = sc.getInitParameter(PARAM_CONTACT_EMAIL);
		System.out.println(email);
	}

}
