package application;

import dao.DaoInsert;
import dao.DaoSelect;

public class App 
{
    public static void main(String[] args)
    {
    	
    	//DaoInsert insert = new DaoInsert();
    	//insert.insert();
    	
	    DaoSelect select = new DaoSelect();
	    select.punto1();
	    select.punto2();
	    //select.punto3();
	    //select.punto4();
	    //select.punto5();
	    //select.punto6();
    }

}
