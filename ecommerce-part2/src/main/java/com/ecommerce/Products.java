package com.ecommerce;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
		
		// ServletConfig Object.		
		ServletConfig sconfig = getServletConfig();
		String fileName = sconfig.getInitParameter("filename");
		System.out.println("FileName is :"+fileName);
		
		
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
		
		
		
		
		out.print(products);
		
	}

}
