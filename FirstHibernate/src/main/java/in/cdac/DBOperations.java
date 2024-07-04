package in.cdac;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class DBOperations {
	public static void main(String[] ar) {
		
		SessionFactory sfactory = HibernateUtil.getSessionFactory();
		Session session = sfactory.openSession();
		
		Product pd = new Product();
		pd.setProductId(100);
		pd.setProductName("Samsung Mobile Phone");
		pd.setProductCategory("Mobiles");
		pd.setProductPrice(10000.00);
		
		Transaction tns = session.beginTransaction();		
		session.save(pd);
		tns.commit();
		
		session.close();
		
		//System.out.println("Connection is successful");
	}
}
