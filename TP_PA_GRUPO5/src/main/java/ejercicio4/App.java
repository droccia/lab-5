package ejercicio4;

import java.util.HashSet;
import java.util.Set;

import dao.DaoHibernate;

public class App {

	public static void main(String[] args) {
		DaoHibernate<Cliente> daoCli = new DaoHibernate<Cliente>(Cliente.class);
		DaoHibernate<Producto> daoPro = new DaoHibernate<Producto>(Producto.class);
		DaoHibernate<Ventas> daoVen = new DaoHibernate<Ventas>(Ventas.class);
		Cliente cliente1= new Cliente("Juana", "Perez");
		Cliente cliente2= new Cliente("Pedro", "Gomez");
		Set<Producto> productos = new HashSet<Producto>();
		productos.add(new Producto("Remera", 150));
		productos.add(new Producto("Pantalon", 300));
		cliente1.setProductos(productos);
		cliente2.setProductos(productos);

		int idCliente1 = daoCli.create(cliente1);
		
		int idCliente2 = daoCli.create(cliente2);
		
		cliente1 = daoCli.readOne(idCliente1);
		cliente2 = daoCli.readOne(idCliente2);
		
		cliente1.getDatosVenta();
		cliente2.getDatosVenta();
	}
}