package com.test;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Testing
 * Servlet is the interface
 * Consist of the unimplemented methods
 * Main are the init,destroy,
 */
//@WebServlet("/welcome")
public class Testing implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Inside Destroy");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig request) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Inside Init");
		System.out.println(request.getServletContext());
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside Service");
		
	}

   

}
