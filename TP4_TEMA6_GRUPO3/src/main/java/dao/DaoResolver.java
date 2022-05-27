package dao;

import dominio.Autor;
import dominio.Biblioteca;
import dominio.Genero;
import dominio.Libro;
import dominio.Nacionalidad;

public class DaoResolver {
	
	DaoHibernate<Libro> libroDao;
	DaoHibernate<Autor> autorDao;
	DaoHibernate<Genero> generoDao;
	DaoHibernate<Nacionalidad> nacionalidadDao;
	DaoHibernate<Biblioteca> bibliotecaDao;
	
	public DaoResolver() {
    	libroDao = new DaoHibernate<Libro>(Libro.class);
    	autorDao = new DaoHibernate<Autor>(Autor.class);
    	generoDao = new DaoHibernate<Genero>(Genero.class);
    	nacionalidadDao = new DaoHibernate<Nacionalidad>(Nacionalidad.class);
    	bibliotecaDao = new DaoHibernate<Biblioteca>(Biblioteca.class);
	}
	
	public DaoHibernate<Libro> getLibroDao() {
		return libroDao;
	}

	public DaoHibernate<Autor> getAutorDao() {
		return autorDao;
	}

	public DaoHibernate<Genero> getGeneroDao() {
		return generoDao;
	}

	public DaoHibernate<Nacionalidad> getNacionalidadDao() {
		return nacionalidadDao;
	}

	public DaoHibernate<Biblioteca> getBibliotecaDao() {
		return bibliotecaDao;
	}
	
}
