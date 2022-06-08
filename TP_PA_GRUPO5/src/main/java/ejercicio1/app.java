package ejercicio1;

import dao.DaoHibernate;

public class app {

	public static void main(String[] args) {
		DaoHibernate<Empleado> dao = new DaoHibernate<Empleado>(Empleado.class);
		
		VehiculoEmpresa vehiculo = new VehiculoEmpresa("Fiat", "Palio", "2015");
		Empleado empleado = new Empleado("Matias", "Sanchez", "Comisionista", vehiculo);
		
		empleado.setID(dao.create(empleado));
		
		Empleado empleadoSaved = dao.readOne(empleado.getID());
		
		System.out.print(empleadoSaved.toString());
	}

}
