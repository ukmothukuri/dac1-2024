package com.ecommerce;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.ecommerce.utils.Validations;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String emailid;
		String password;
		
		emailid = request.getParameter("emailid");		
		password = request.getParameter("userpwd");
		System.out.println("===> email id "+emailid);
		System.out.println("===> password "+password);
		
		if(!Validations.validateEmailId(emailid)) {
			out.print("Please enter a proper emailid");
		} else if(!Validations.validatePassword(password)) {
			out.print("Please enter a proper password");
		} else {
			if(emailid.equals("admin@cdac.in") &&
					password.equals("12345678")) {
				/*
				RequestDispatcher dispatch = request.getRequestDispatcher("/welcome"); 
				dispatch.forward(request, response);
				*/
				response.sendRedirect("./welcome");
				
			}else {
				out.print("Invalid User Credentials. Please try again.");
			}
			
			//out.print("You have successfully loggedin");
		}
		
	}

}
