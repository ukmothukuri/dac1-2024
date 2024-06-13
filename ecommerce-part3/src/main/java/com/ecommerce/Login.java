package com.ecommerce;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
				//request.setAttribute("Role", "admin");
				
				HttpSession session = request.getSession(true);
				System.out.println("Your session ID is "+session.getId());
				
				session.setAttribute("emailId", emailid);
				session.setAttribute("Role", "admin");
				
				RequestDispatcher dispatch = request.getRequestDispatcher("/welcome"); 
				dispatch.forward(request, response);												
			}
//			else if(emailid.equals("user@cdac.in") &&
//					password.equals("12345678")) {
//				//request.setAttribute("Role", "user");
//				
//				HttpSession session = request.getSession(true);
//				session.setAttribute("emailId", emailid);
//				session.setAttribute("Role", "user");
//				
//				RequestDispatcher dispatch = request.getRequestDispatcher("/welcome"); 
//				dispatch.forward(request, response);	
//			}
			else {
				out.print("Invalid User Credentials. Please try again.");
			}
			
			//out.print("You have successfully loggedin");
		}
		
	}

}
