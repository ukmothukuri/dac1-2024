package firstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{	
 public static void main(String a[]) {
	ApplicationContext context = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
//	Customer c1 = context.getBean(Customer.class);		
//	c1.setEmail("abc@cdac.in");
//	c1.setName("abc");
//	System.out.println(c1);
//	
//	Customer c2 = context.getBean(Customer.class);		
//	c2.setEmail("def@cdac.in");
//	c2.setName("def");
//	System.out.println(c2);
//	
//	Address ads = context.getBean(Address.class);
//	System.out.println(ads);
	
	Customer c = context.getBean(Customer.class);
	System.out.println("Customer :"+c);
	System.out.println("Address : "+c.getAddress());
	
	
	
	
 }
}
