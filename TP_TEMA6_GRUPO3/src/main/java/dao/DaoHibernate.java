package dao;

import java.io.Serializable;

import org.hibernate.Session;

public class DaoHibernate<T extends Serializable> {
	private Class<T> entityClass;
	
	public DaoHibernate(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public int create(T entity)
	{
		ConfigHibernate ch = new ConfigHibernate();
		Session session= ch.abrirConexion();
		session.beginTransaction();
	    int id = (Integer) session.save(entity);
	    session.getTransaction().commit();
		ch.cerrarSession();
		return id;
	}
	
	public T readOne(int id)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
		session.beginTransaction();
        T entity = (T) session.get(entityClass, id);
        config.cerrarSession();
        return entity;
	}
	
	public T update(T entity)
	{
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();     
        config.cerrarSession();
        return entity;
	}
	
	public void delete(T entity)
	{
		
		ConfigHibernate config = new ConfigHibernate();
		Session session= config.abrirConexion();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        config.cerrarSession();

	}
}
