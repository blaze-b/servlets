package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
//@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// String username = request.getParameter("uname");
		// String password = request.getParameter("pword");
		String username = request.getParameter("email");
		String password = request.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		if (username.equalsIgnoreCase("JAVA@GMAIL.COM") && password.equalsIgnoreCase("12345")) {
			// System.out.println("Login Successful");
			// response.sendRedirect("member.jsp");
			System.out.println(request.getRequestURI());
			System.out.println(request.getRequestURL());
			System.out.println(request.getCookies());
			System.out.println(request.getAttribute(getServletName()));
			System.out.println(request.getAttribute(getServletInfo()));
			String str = request.getRequestURL().toString();
			int index = str.lastIndexOf('/');
			System.out.println(str.substring(0, index));
			System.out.println(request.getDispatcherType());
			response.sendRedirect(str.substring(0, index)+"/welcome");
		} else {
			// response.sendRedirect("error.jsp");
			response.sendRedirect("loginHome.jsp");
		}
		doGet(request, response);
	}

}
