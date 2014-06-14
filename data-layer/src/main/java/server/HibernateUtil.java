package server;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
	static{
		try {
			// sessionFactory = new Configuration().configure( new File("D:/Workspace/Eclipse/hibernate-spring/src/main/resources/hibernate.cfg.xml")).buildSessionFactory();
			/*sessionFactory = new Configuration()
							    .configure( new File("D:/Workspace/Eclipse/hibernate-spring/src/main/resources/hibernate.cfg.xml"))
							    .buildSessionFactory();*/
            sessionFactory = new Configuration()
                    .configure( HibernateUtil.class.getResource("/hibernate/hibernate.cfg.xml")).buildSessionFactory();
			} catch (Throwable e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	public static void shutDown(){
		//closes caches and connections
		getSessionFactory().close();
	}
}