package dao;

import java.util.List;

import org.hibernate.Session;

public class DaoHql {
	
	private ConfigHibernate ch;
	private Session session;
	
	public DaoHql() {
		ch = new ConfigHibernate();
		session= ch.abrirConexion();
	}
	
    public List<Object> selectAllRow (String query) {
		
		List<Object> list = (List<Object>)session.createQuery(query).list();
		
		return list;
    }
    
    public Object uniqueResult (String query) {
		
		Object object = (Object)session.createQuery(query).uniqueResult();
		
		return object;
    }
    
    public List<Object[]> selectMetodRow (String query) {
		
		List<Object[]> list = (List<Object[]>)session.createQuery(query).list();
		
		return list;
    }
    
    public void signOff () {
    	ch.cerrarSession();
    }

}
