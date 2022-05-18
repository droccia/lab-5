package application;
import java.util.Date;

import dao.DaoResolver;
import dominio.Autor;
import dominio.Biblioteca;
import dominio.Genero;
import dominio.Libro;
import dominio.Nacionalidad;

public class App 
{
    public static void main(String[] args)
    {
    	DaoResolver clasesDao = new DaoResolver();
    	
    	// Nacionalidades
    	Nacionalidad n = new Nacionalidad();
    	n.setDescripcion("Argentina");
    	n.setId(clasesDao.getNacionalidadDao().create(n));
    	
    	n.setDescripcion("Español");
    	n.setId(clasesDao.getNacionalidadDao().create(n));
    	
    	n.setDescripcion("Brasil");
    	n.setId(clasesDao.getNacionalidadDao().create(n));
    	
    	n.setDescripcion("Chile");
    	n.setId(clasesDao.getNacionalidadDao().create(n));
    	
    	n.setDescripcion("Paraguay");
    	n.setId(clasesDao.getNacionalidadDao().create(n));
    	
    	// Generos
    	Genero g = new Genero();
    	g.setDescripcion("Terror");
    	g.setId(clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Suspenso");
    	g.setId(clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Historia");
    	g.setId(clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Ciencia Ficcion");
    	g.setId(clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Romance");
    	g.setId(clasesDao.getGeneroDao().create(g));
    	
    	// Autores
    	Autor a = new Autor();  	
    	a.setNombre("Julio");
    	a.setApellido("Cortázar");
    	a.setEmail("julito@gmail.com");
    	a.setNacionalidad(clasesDao.getNacionalidadDao().readOne(1));
    	a.setId(clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Jorge Luis");
    	a.setApellido("Borges");
    	a.setEmail("jorgeb@gmail.com");
    	a.setNacionalidad(clasesDao.getNacionalidadDao().readOne(2));
    	a.setId(clasesDao.getAutorDao().create(a));
    	

    	a.setNombre("Ernesto");
    	a.setApellido("Sabato");
    	a.setEmail("Ernestos@gmail.com");
    	a.setNacionalidad(clasesDao.getNacionalidadDao().readOne(3));
    	a.setId(clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Adolfo bioy");
    	a.setApellido("Casares");
    	a.setEmail("adolfoc@gmail.com");
    	a.setNacionalidad(clasesDao.getNacionalidadDao().readOne(4));
    	a.setId(clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Pablo");
    	a.setApellido("Neruda");
    	a.setEmail("pablon@gmail.com");
    	a.setNacionalidad(clasesDao.getNacionalidadDao().readOne(5));
    	a.setId(clasesDao.getAutorDao().create(a));
    	
    	// Libros
    	Libro l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(clasesDao.getAutorDao().readOne(1));
    	l.setCantidadPaginas(100);
    	l.setDescripcion("Antinovela");
    	l.agregarGenero(clasesDao.getGeneroDao().readOne(1));
    	l.setIdioma("Español");
    	l.setTitulo("Rayuela");
    	l.setIsbn(clasesDao.getLibroDao().create(l));
    	
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(clasesDao.getAutorDao().readOne(2));
    	l.setCantidadPaginas(300);
    	l.setDescripcion("Antinovela");
    	l.agregarGenero(clasesDao.getGeneroDao().readOne(4));
    	l.setIdioma("Español");
    	l.setTitulo("El tunel");
    	l.setIsbn(clasesDao.getLibroDao().create(l));
    	
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(clasesDao.getAutorDao().readOne(3));
    	l.setCantidadPaginas(200);
    	l.setDescripcion("poemas");
    	l.agregarGenero(clasesDao.getGeneroDao().readOne(5));
    	l.setIdioma("Español");
    	l.setTitulo("veinte poemas de amor y una cancion desesperada");
    	l.setIsbn(clasesDao.getLibroDao().create(l));
    	
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(clasesDao.getAutorDao().readOne(4));
    	l.setCantidadPaginas(250);
    	l.setDescripcion("historias");
    	l.agregarGenero(clasesDao.getGeneroDao().readOne(2));
    	l.setIdioma("Español");
    	l.setTitulo("El sueño de los heroes");
    	l.setIsbn(clasesDao.getLibroDao().create(l));
    	
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(clasesDao.getAutorDao().readOne(5));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("historias");
    	l.agregarGenero(clasesDao.getGeneroDao().readOne(3));
    	l.setIdioma("Español");
    	l.setTitulo("El libro de arena");
    	l.setIsbn(clasesDao.getLibroDao().create(l));
    	
    	// Bibliotecas
    	Biblioteca b = new Biblioteca();
    	b.setEstado(1);
    	b.setLibro(clasesDao.getLibroDao().readOne(1));
    	b.setFechaAlta(new Date());
    	b.setId(clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(clasesDao.getLibroDao().readOne(2));
    	b.setFechaAlta(new Date());
    	b.setId(clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(clasesDao.getLibroDao().readOne(3));
    	b.setFechaAlta(new Date());
    	b.setId(clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(clasesDao.getLibroDao().readOne(4));
    	b.setFechaAlta(new Date());
    	b.setId(clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(clasesDao.getLibroDao().readOne(5));
    	b.setFechaAlta(new Date());
    	b.setId(clasesDao.getBibliotecaDao().create(b));
    	
    	
    	//ABML Biblioteca
    	Biblioteca biblioteca = new Biblioteca();
    	biblioteca.setEstado(2);
    	biblioteca.setLibro(clasesDao.getLibroDao().readOne(1));
    	biblioteca.setFechaAlta(new Date());
    	biblioteca.setId(clasesDao.getBibliotecaDao().create(biblioteca));
    	
    	System.out.print("Biblioteca Alta: " + biblioteca.toString());
    	
    	biblioteca.setEstado(1);
    	biblioteca.setLibro(clasesDao.getLibroDao().readOne(3));
    	clasesDao.getBibliotecaDao().update(biblioteca);
    	
    	System.out.print("Biblioteca Modificada: " + biblioteca.toString());
    	
    	Biblioteca bibliotecaAEliminar = clasesDao.getBibliotecaDao().readOne(1);
    	
    	System.out.print("Biblioteca a eliminar: " + bibliotecaAEliminar.toString());
    	
    	clasesDao.getBibliotecaDao().delete(bibliotecaAEliminar);
    	
    }
}
