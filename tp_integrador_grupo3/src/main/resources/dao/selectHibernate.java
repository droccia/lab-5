package dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public class selectHibernate {
	
	private ConfigHibernate ch;
	private Session session;
	
	public selectHibernate() {
		ch = new ConfigHibernate();
		session= ch.abrirConexion();
		session.beginTransaction();
	}
	
	private void closeConnection() {
		session.close();
	    ch.cerrarSession();
	}
	
	public static List<t> selectList(String query){
		List<T> list = (T) session.createQuery(query).list();
		
		this.closeConnection();
        return list;
	}
	
	public static T selectUnique(String query) {
        T entity = (T) session.createQuery(query).uniqueResult();
        
        this.closeConnection();
        return entity;
	}
	
}
