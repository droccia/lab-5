package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dao.DaoHibernate;

public class App {

	public static void main(String[] args) {
		DaoHibernate<ClienteBanco> dao = new DaoHibernate<ClienteBanco>(ClienteBanco.class);
		ClienteBanco cliente = new ClienteBanco("Elmer", "Vasquez", 38749844, LocalDate.of(1995, 7, 23), "elmer@gmail.com", "Galicia");
		List<TarjetaCredito> tarjetas = new ArrayList<TarjetaCredito>();
		
		tarjetas.add(new TarjetaCredito("4568554698521364", LocalDate.of(2024, 9, 27)));
		tarjetas.add(new TarjetaCredito("4654554698521589", LocalDate.of(2024, 5, 15)));
		
		cliente.setTarjetas(tarjetas);
		
		cliente.setId(dao.create(cliente));
		
		ClienteBanco clienteSaved = dao.readOne(cliente.getId());
		
		clienteSaved.GetAllDatos();
		
	}

}
