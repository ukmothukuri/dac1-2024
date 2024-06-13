package com.ecommerce;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.ecommerce.utils.Validations;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
				
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
		
		if(!Validations.validateUserName(username)) {
			out.print("UserName is invalid. Please enter a proper name");
		}
		else if(!Validations.validateEmailId(emailid)){
			out.print("Emailid is invalid. Please try again");
		}
		else if(!Validations.validateMobile(mobile)){
			out.print("Mobile is invalid. Please try again");
		}
		else if(!Validations.validatePassword(mobile)){
			out.print("Password is invalid. Please try again");
		}
		else {
			out.println("User Registration is successful");
		}
	}
}
