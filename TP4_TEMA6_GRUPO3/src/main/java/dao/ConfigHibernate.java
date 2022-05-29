package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ConfigHibernate {
    private static ConfigHibernate instance;
	private SessionFactory sessionFactory;
	private Session session;

	private ConfigHibernate()
	{
		Configuration configuration = new Configuration();
        configuration.configure();
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
	
	public static ConfigHibernate getInstance() {
        if (instance == null) {
            instance = new ConfigHibernate();
        }
        return instance;
    }
	
	public Session abrirConexion()
	{
		session=sessionFactory.openSession();
		return session;
	}
	
	public void cerrarSession()
	{
		session.close();
	}
	
	
	public void cerrarSessionFactory()
	{
		sessionFactory.close();
	}
	
}
