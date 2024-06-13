package com.ecommerce;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
// Use it when the request is forwarded by requestdispatcher
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
//		String role = (String)request.getAttribute("Role");
//		String emailId = request.getParameter("emailid");	
		String role = null;
		String emailId = null;
		HttpSession session = request.getSession(false);
		if(session == null) {
			out.println("Your session is empty/expired. Please login");
		}else 
		{
			emailId = (String)session.getAttribute("emailId");
			role = (String)session.getAttribute("Role");
			
			out.println("<html>");
			out.println("<body>");
			out.println("<div style='float:right'>");
			out.println("<a href='./ProductDetails'>Products </a> |");
			out.println("<a href='./Logout'>Logout</a> |");
			out.println("</div>");
			out.println("<br>");
			out.println("<hr>");
			out.println("<div style='text-align:center'>");
			out.println("Welcome "+emailId);
			out.println("<br>");
			out.println("Your role is: "+role);
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		}		
	}
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

}
