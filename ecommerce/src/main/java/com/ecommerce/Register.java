package com.ecommerce;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username;
		String emailid;
		String mobile;
		String password;
		
		username = request.getParameter("username");		
		emailid = request.getParameter("emailid");	
		mobile = request.getParameter("mobile");
		password = request.getParameter("userpwd");
		
		System.out.println("===> username "+username);
		System.out.println("===> email id "+emailid);
		System.out.println("===> mobile "+mobile);
		System.out.println("===> password "+password);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
