package ejercicio3;

import java.util.Calendar;
import java.util.GregorianCalendar;

import dao.DaoHibernate;

public class App {

	public static void main(String[] args) {
		DaoHibernate<Director> daoDir = new DaoHibernate<Director>(Director.class);
		DaoHibernate<Pelicula> daoPel = new DaoHibernate<Pelicula>(Pelicula.class);
		Director director = new Director("Joon Ho", "Bong");
		Pelicula pelicula = new Pelicula("Parasite", new GregorianCalendar(2019, Calendar.MAY, 30).getTime(), director);
		int idDirector = daoDir.create(director);
		int idPelicula = daoPel.create(pelicula);
		director = daoDir.readOne(idDirector);
		pelicula = daoPel.readOne(idPelicula);
		System.out.println(director);
		System.out.println(pelicula);
	}
}