package com.ecommerce.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

import com.ecommerce.pojo.Product;

/**
 * Servlet implementation class Products
 */
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session == null || session.getAttribute("email") == null) {
			response.sendRedirect(request.getContextPath()+"/usermgmt/SessionExpired.jsp");
		}
		else {
			
			ArrayList<Product> products = new ArrayList<>();
			
			Product prod1 = new Product();
			prod1.setPid(1);
			prod1.setPname("Google Pixel 8");
			prod1.setCategory("Mobiles");
			prod1.setPrice(50000.00);
			prod1.setRating(4.1);
			
			Product prod2 = new Product();
			prod2.setPid(2);
			prod2.setPname("HP Pavillion");
			prod2.setCategory("Laptop");
			prod2.setPrice(90000.00);
			prod2.setRating(3.8);
			
			
			Product prod3 = new Product();
			prod3.setPid(3);
			prod3.setPname("Samsung Refridgerator 60Lts");
			prod3.setCategory("Fridge");
			prod3.setPrice(20000.00);
			prod3.setRating(5.0);
			
			products.add(prod1);
			products.add(prod2);
			products.add(prod3);
			
			request.setAttribute("productdetails", products);
			request.getRequestDispatcher("/main/Products.jsp").forward(request, response);					
		}
	}
}
