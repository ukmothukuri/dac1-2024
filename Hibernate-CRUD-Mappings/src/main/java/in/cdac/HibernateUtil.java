package in.cdac;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		return sessionFactory;
	}
}
