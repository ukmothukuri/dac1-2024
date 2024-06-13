package com.ecommerce;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.ecommerce.pojo.Product;

/**
 * Servlet implementation class Products
 */
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String role = null;
		String emailId = null;	
		
		HttpSession session = request.getSession(false);
		if(session == null) {
			out.println("Your session is empty. Please login");
		}else {
			
			role = (String)session.getAttribute("Role");
			emailId = (String)session.getAttribute("emailId");	
								
			out.println("<div style='float:right'>");
			out.println("<a href='./welcome'>Home </a> |");
			out.println("<a href='./Logout'>Logout</a> |");
			out.println("</div>");
			out.println("<br>");
			out.println("<hr>");
			out.println("<div style='float:right'>");
			out.println("Welcome "+emailId);
			out.println("<br>");
			out.println("Your Role is :"+role);
			out.println("</div>");
			ArrayList<Product> products = new ArrayList<>();
			
			Product prod1 = new Product();
			prod1.setProductId(1);
			prod1.setProductName("Google Pixel 8");
			prod1.setProductCategory("Mobiles");
			prod1.setPrice(50000.00);
			prod1.setRating(4);
			
			Product prod2 = new Product();
			prod2.setProductId(2);
			prod2.setProductName("HP Pavillion");
			prod2.setProductCategory("Laptop");
			prod2.setPrice(90000.00);
			prod2.setRating(3);
			
			
			Product prod3 = new Product();
			prod3.setProductId(3);
			prod3.setProductName("Samsung Refridgerator 60Lts");
			prod3.setProductCategory("Fridge");
			prod3.setPrice(20000.00);
			prod3.setRating(5);
			
			products.add(prod1);
			products.add(prod2);
			products.add(prod3);			
			
			
			out.println(products);
		}			
		
	}

}
