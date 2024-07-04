package in.cdac;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] ar) {
	
		DBOperations dbop = new DBOperations();
		boolean status = false;
		
		Product pd = new Product();
		pd.setProductId(103);
		pd.setProductName("Samsung Mobile Phone");
		pd.setProductCategory("Mobile");
		pd.setProductPrice(10000.00);
		
		// Insertion
//		status = dbop.saveProductDetails(pd);
//		if(status) {
//			System.out.println("1 Record inserted..");
//		}
		
		// Get all products
//		List<Product> pds = dbop.getAllProductDetails();
//		for(Product p : pds) {
//			System.out.println(p.getProductId());
//			System.out.println(p.getProductName());
//			System.out.println(p.getProductCategory());
//			System.out.println(p.getProductPrice());
//		}
		
		// Get all products
//		Product p1 = dbop.getProductDetails(102);
//		System.out.println(p1.getProductId());
//		System.out.println(p1.getProductName());
//		System.out.println(p1.getProductCategory());
//		System.out.println(p1.getProductPrice());
		
		//update the product
//		status = dbop.updateProductDetails(101, 46000);
//		if(status) {
//			System.out.println("record Updated ");
//		}
		
		//delete the product
//		status = dbop.deleteProduct(102);
//		if(status) {
//			System.out.println("record deleted ");
//		}
		
		
		//creating the customer details
//		Customer c = new Customer();
//		c.setEmail("abc@cdac.in");
//		c.setName("abc");
//		c.setMobile("1234567890");
//		c.setAddress("cdac hyd");
//		
//		CustomerLogin cl = new CustomerLogin();
//		cl.setEmail("abc@cdac.in");
//		cl.setPassword("abc@123");
//		
//		c.setCustomerLogin(cl);
//		
//		dbop.saveCustomerDetails(c);
		
		// To save the address of the customer
//		Address ads1 = new Address();
//		ads1.setStreet("st-1");
//		ads1.setLocality("l1");
//		ads1.setCity("Hyd");
//		ads1.setState("TG");
//		ads1.setPincode(500001);
//		
//		Address ads2 = new Address();
//		ads2.setStreet("st-2");
//		ads2.setLocality("ha11");
//		ads2.setCity("Hyd");
//		ads2.setState("TG");
//		ads2.setPincode(500071);
//		
//		List<Address> list = new ArrayList<Address>();
//		list.add(ads1);
//		list.add(ads2);
//		
//		dbop.updateCustomerDetails("abc@cdac.in", list);
		
		Customer c = dbop.getCustomerDetails("abc@cdac.in");
		System.out.println(c.getName());
		List<Address> ads = c.getShippingAddress();
		System.out.println("==="+ads.get(0).toString());
		System.out.println("==="+ads.get(1).toString());
		
	}
}
