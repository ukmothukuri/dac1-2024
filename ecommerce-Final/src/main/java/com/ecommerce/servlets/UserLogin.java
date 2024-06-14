package com.ecommerce.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.ecommerce.utils.Validations;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String emailId = request.getParameter("emailid");
		String password = request.getParameter("userpwd");
		
		if(!Validations.validateEmailId(emailId)) 
		{
			request.setAttribute("errormsg", "Entered emailid is not valid.");			
			RequestDispatcher dispatchMe = request.getRequestDispatcher("usermgmt/Login.jsp");
			dispatchMe.forward(request, response);
		}else if(!Validations.validatePassword(password)){
			request.setAttribute("errormsg", "Entered password is invalid.");			
			RequestDispatcher dispatchMe = request.getRequestDispatcher("usermgmt/Login.jsp");
			dispatchMe.forward(request, response);
		} else {
			if(emailId.equals("admin@cdac.in") && password.equals("12345678"))
			{
				HttpSession session = request.getSession(true);
				session.setAttribute("email", emailId);				
				response.sendRedirect(request.getContextPath()+"/welcome");
			}
			else {
				request.setAttribute("errormsg", "Invalid login credentials.");			
				RequestDispatcher dispatchMe = request.getRequestDispatcher("usermgmt/Login.jsp");
				dispatchMe.forward(request, response);
			}			
		}
	}

}
