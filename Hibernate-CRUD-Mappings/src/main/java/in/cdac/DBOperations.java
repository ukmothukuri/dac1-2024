package in.cdac;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class DBOperations {
	
	private SessionFactory sfactory;
	
	public DBOperations() {
		sfactory = HibernateUtil.getSessionFactory();
	}
	
	public boolean saveProductDetails(Product pd) {
		Session session = sfactory.openSession();
		Transaction tns = session.beginTransaction();
		session.persist(pd);
		tns.commit();
		session.close();
		return true;
	}
	
	public Product getProductDetails(int productId) {
		Session session = sfactory.openSession();
		Product pd = session.get(Product.class, productId);
		//Product pd = session.
		//		createQuery("from Product where productId="+productId, Product.class)
		//.uniqueResult();
		session.close();
		return pd;
	}
	
	public List<Product> getAllProductDetails() {
		Session session = sfactory.openSession();
		List<Product> products = 
				session.createQuery("from Product", Product.class).list();
		return products;
	}
	
	public boolean updateProductDetails(int productId, double updatedprice) {
		Session session = sfactory.openSession();
		Product pd = session.get(Product.class, productId);
		pd.setProductPrice(updatedprice);
		Transaction tns = session.beginTransaction();
		session.persist(pd);
		tns.commit();
		session.close();
		return true;
	}
	
	public boolean deleteProduct(int productId) {
		Session session = sfactory.openSession();
		Product pd = session.get(Product.class, productId);
		Transaction tns = session.beginTransaction();
		session.remove(pd);
		tns.commit();
		session.close();
		return true;
	}
	
	public boolean saveCustomerDetails(Customer c) {
		Session session = sfactory.openSession();
		Transaction tns = session.beginTransaction();
		session.persist(c);
		tns.commit();
		session.close();
		return true;
	}
	
	public boolean updateCustomerDetails(String email, List<Address> l) {
		Session session = sfactory.openSession();
		Transaction tns = session.beginTransaction();
		Customer c = session.get(Customer.class, email);
		c.setShippingAddress(l);
		session.persist(c);
		tns.commit();
		session.close();
		return true;
	}
	
	public Customer getCustomerDetails(String email) {
		Session session = sfactory.openSession();		
		Customer c = session.get(Customer.class, email);
		session.close();
		return c;
	}
	
}
