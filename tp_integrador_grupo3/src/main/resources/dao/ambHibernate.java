package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ambHibernate {
	
	private SessionFactory sessionFactory;
	private Session session;
	
	public ambHibernate() {
		Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        session = sessionFactory.openSession();
        session.beginTransaction();
	}
	
	private void closeSession() {
		session.getTransaction().commit();    
	    session.close();
	    sessionFactory.close();
	}
	
	public static void Add(T entity)
	{
	    session.save(entity);
	    
	    this.closeSession();
	}
	
	
	public static void Update(T entity)
	{
        session.update(entity);
        
        this.closeSession();
	}
	
	public static void Delete(T entity)
	{
        session.delete(entity);
        
        this.closeSession();
	}
}
