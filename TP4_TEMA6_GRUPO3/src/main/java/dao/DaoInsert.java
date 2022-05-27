package dao;

import java.util.Date;

import dominio.Autor;
import dominio.Biblioteca;
import dominio.Genero;
import dominio.Libro;
import dominio.Nacionalidad;

public class DaoInsert {
	
	private DaoResolver clasesDao;
	
	public DaoInsert() {
		this.clasesDao = new DaoResolver();
	}
	
	public void insert() {
		this.addNacionalidad();
		this.addGenero();
		this.addAutores();
		this.addLibros();
		this.addBiblioteca();
	}
	
	public void addNacionalidad() {
		Nacionalidad n = new Nacionalidad();
		
    	n.setDescripcion("Argentina");
    	n.setId(this.clasesDao.getNacionalidadDao().create(n));
    	
    	n.setDescripcion("España");
    	n.setId(this.clasesDao.getNacionalidadDao().create(n));
    	
    	n.setDescripcion("Brasil");
    	n.setId(this.clasesDao.getNacionalidadDao().create(n));
        
    	n.setDescripcion("Chile");
    	n.setId(this.clasesDao.getNacionalidadDao().create(n));
    	
    	n.setDescripcion("Paraguay");
    	n.setId(this.clasesDao.getNacionalidadDao().create(n));

    	n.setDescripcion("Italia");
    	n.setId(this.clasesDao.getNacionalidadDao().create(n));

    	n.setDescripcion("Inglaterra");
    	n.setId(this.clasesDao.getNacionalidadDao().create(n));

    	n.setDescripcion("Colombia");
    	n.setId(this.clasesDao.getNacionalidadDao().create(n));

    	n.setDescripcion("India");
    	n.setId(this.clasesDao.getNacionalidadDao().create(n));

    	n.setDescripcion("China");
    	n.setId(this.clasesDao.getNacionalidadDao().create(n));
	}
	
	public void addGenero() {
    	Genero g = new Genero();
    	
    	g.setDescripcion("Terror");
    	g.setId(this.clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Suspenso");
    	g.setId(this.clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Historia");
    	g.setId(this.clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Ciencia Ficcion");
    	g.setId(this.clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Romance");
    	g.setId(this.clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Aventuras");
    	g.setId(this.clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Gotica");
    	g.setId(this.clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Fantastica");
    	g.setId(this.clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Paranormal");
    	g.setId(this.clasesDao.getGeneroDao().create(g));

    	g.setDescripcion("Novela");
    	g.setId(this.clasesDao.getGeneroDao().create(g));

    	g.setDescripcion("Accion");
    	g.setId(this.clasesDao.getGeneroDao().create(g));
    	
    	g.setDescripcion("Poema");
    	g.setId(this.clasesDao.getGeneroDao().create(g));
	}
	
	public void addAutores() {
    	Autor a = new Autor();  
    	
    	a.setNombre("Julio");
    	a.setApellido("Cortázar");
    	a.setEmail("julito@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(1));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Jorge Luis");
    	a.setApellido("Borges");
    	a.setEmail("jorgeb@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(2));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Ernesto");
    	a.setApellido("Sabato");
    	a.setEmail("Ernestos@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(3));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Adolfo bioy");
    	a.setApellido("Casares");
    	a.setEmail("adolfoc@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(4));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Pablo");
    	a.setApellido("Neruda");
    	a.setEmail("pablon@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(5));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Esteban");
    	a.setApellido("Echeverría");
    	a.setEmail("Esteban@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(1));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Matias");
    	a.setApellido("Sanchez");
    	a.setEmail("Matias@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(1));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Jose");
    	a.setApellido("Hernandez");
    	a.setEmail("Jose@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(1));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Rafael");
    	a.setApellido("Pombo");
    	a.setEmail("Rafael@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(8));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Niccolo");
    	a.setApellido("Ammaniti");
    	a.setEmail("Niccolo@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(6));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("William");
    	a.setApellido("Shakespeare");
    	a.setEmail("William@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(7));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Rabindranath");
    	a.setApellido("Tagore");
    	a.setEmail("Tagore@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(9));
    	a.setId(this.clasesDao.getAutorDao().create(a));
    	
    	a.setNombre("Gao");
    	a.setApellido("Xingjian");
    	a.setEmail("Gao@gmail.com");
    	a.setNacionalidad(this.clasesDao.getNacionalidadDao().readOne(10));
    	a.setId(this.clasesDao.getAutorDao().create(a));
	}
	
	public void addLibros() {
    	Libro l = new Libro();
    	
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(1));
    	l.setCantidadPaginas(100);
    	l.setDescripcion("Antinovela");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(1));
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(2));
    	l.setIdioma("Español");
    	l.setTitulo("Rayuela");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(2));
    	l.setCantidadPaginas(300);
    	l.setDescripcion("Antinovela");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(4));
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(5));
    	l.setIdioma("Español");
    	l.setTitulo("El tunel");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(3));
    	l.setCantidadPaginas(200);
    	l.setDescripcion("poemas");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(5));
    	l.setIdioma("Español");
    	l.setTitulo("veinte poemas de amor y una cancion desesperada");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(4));
    	l.setCantidadPaginas(250);
    	l.setDescripcion("historias");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(2));
    	l.setIdioma("Español");
    	l.setTitulo("El sueño de los heroes");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(5));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("historias");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(3));
    	l.setIdioma("Español");
    	l.setTitulo("El libro de arena");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(11));
    	l.setCantidadPaginas(185);
    	l.setDescripcion("Tragedia");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(5));
    	l.setIdioma("Español");
    	l.setTitulo("Hamlet");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(11));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("tragedia");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(5));
    	l.setIdioma("Español");
    	l.setTitulo("Romeo y Julieta");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(11));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Obra teatral");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(5));
    	l.setIdioma("Español");
    	l.setTitulo("El mercader de Venecia");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(9));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Animado");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(9));
    	l.setIdioma("Español");
    	l.setTitulo("El renacuajo paseador");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(6));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Animado");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(4));
    	l.setIdioma("Español");
    	l.setTitulo("El matadero");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(6));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Ficcion");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(4));
    	l.setIdioma("Español");
    	l.setTitulo("La cautiva");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(8));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("poema narrativo");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(12));
    	l.setIdioma("Español");
    	l.setTitulo("El Gaucho Martín Fierro");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(8));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("poema narrativo");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(12));
    	l.setIdioma("Español");
    	l.setTitulo("El Gaucho Martín Fierro");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(10));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("ficción");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(4));
    	l.setIdioma("Español");
    	l.setTitulo("Anna");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(12));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Poesia");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(12));
    	l.setIdioma("Español");
    	l.setTitulo("Gitanjali");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(this.clasesDao.getAutorDao().readOne(13));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Novela china");
    	l.agregarGenero(this.clasesDao.getGeneroDao().readOne(10));
    	l.setIdioma("Español");
    	l.setTitulo("La montaña del alma");
    	l.setIsbn(this.clasesDao.getLibroDao().create(l));
	}
	
	public void addBiblioteca() {
		Biblioteca b = new Biblioteca();
		
    	b.setEstado(1);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(1));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(2);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(2));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(3));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(2);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(4));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(5));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(2);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(6));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(7));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(8));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(2);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(9));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(10));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(2);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(11));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(12));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(2);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(13));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(14));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(2);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(15));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
    	
    	b.setEstado(1);
    	b.setLibro(this.clasesDao.getLibroDao().readOne(16));
    	b.setFechaAlta(new Date());
    	b.setId(this.clasesDao.getBibliotecaDao().create(b));
	}
}
