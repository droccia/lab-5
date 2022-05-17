package frgp.utn.edu.ar;
import java.util.Date;

import frgp.utn.edu.ar.dao.DaoHibernate;
import frgp.utn.edu.ar.entidad.Autor;
import frgp.utn.edu.ar.entidad.Biblioteca;
import frgp.utn.edu.ar.entidad.Genero;
import frgp.utn.edu.ar.entidad.Libro;
import frgp.utn.edu.ar.entidad.Nacionalidad;

public class App 
{
    public static void main(String[] args)
    {
    	DaoHibernate<Libro> libroDao = new DaoHibernate<Libro>(Libro.class);
    	DaoHibernate<Autor> autorDao = new DaoHibernate<Autor>(Autor.class);
    	DaoHibernate<Genero> generoDao = new DaoHibernate<Genero>(Genero.class);
    	DaoHibernate<Nacionalidad> nacionalidadDao = new DaoHibernate<Nacionalidad>(Nacionalidad.class);
    	DaoHibernate<Biblioteca> bibliotecaDao = new DaoHibernate<Biblioteca>(Biblioteca.class);
    	
    	Nacionalidad n = new Nacionalidad();
    	n.setDescripcion("Argentino");
    	n.setId(nacionalidadDao.create(n));
    	
    	Autor a = new Autor();
    	a.setNombre("Julio");
    	a.setApellido("Cortázar");
    	a.setEmail("julito@gmail.com");
    	a.setNacionalidad(n);
    	a.setId(autorDao.create(a));
    	
    	Genero g = new Genero();
    	g.setDescripcion("Novela");
    	g.setId(generoDao.create(g));
    	
    	Libro l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(a);
    	l.setCantidadPaginas(100);
    	l.setDescripcion("Antinovela");
    	l.agregarGenero(g);
    	l.setIdioma("Español");
    	l.setTitulo("Rayuela");
    	l.setIsbn(libroDao.create(l));
    	
    	Biblioteca b = new Biblioteca();
    	b.setEstado(1);
    	b.setLibro(l);
    	b.setFechaAlta(new Date());
    	b.setId(bibliotecaDao.create(b));
    }
}
