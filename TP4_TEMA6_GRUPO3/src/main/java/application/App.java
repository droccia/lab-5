package application;

import dao.ConfigHibernate;

public class App 
{
    public static void main(String[] args)
    {
	    Consignas consignas = new Consignas();
	    MockData.create().insert();
	    consignas.punto1();
	    consignas.punto2();
	    consignas.punto3();
	    consignas.punto4();
	    consignas.punto5();
	    consignas.punto6();
	    ConfigHibernate.getInstance().cerrarSessionFactory();
    }
}
