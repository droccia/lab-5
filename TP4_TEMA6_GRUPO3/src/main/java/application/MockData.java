package application;

import java.util.Date;
import dao.DaoHibernate;
import dominio.Autor;
import dominio.Biblioteca;
import dominio.Genero;
import dominio.Libro;
import dominio.Nacionalidad;

public final class MockData {
	private static DaoHibernate<Nacionalidad> daoNac = new DaoHibernate<Nacionalidad>(Nacionalidad.class);
	private static DaoHibernate<Autor> daoAut = new DaoHibernate<Autor>(Autor.class);
	private static DaoHibernate<Biblioteca> daoBib = new DaoHibernate<Biblioteca>(Biblioteca.class);
	private static DaoHibernate<Libro> daoLib = new DaoHibernate<Libro>(Libro.class);
	private static DaoHibernate<Genero> daoGen = new DaoHibernate<Genero>(Genero.class);
	
	public static MockData create() {
		return new MockData();
	}
	
	private MockData() {}

	public void insert() {
		nacionalidades();
		generos();
		autores();
		libros();
		bibliotecas();
	}
	
	public static void nacionalidades() {
		Nacionalidad n = new Nacionalidad();
    	n.setDescripcion("Argentina");
    	daoNac.create(n);
    	n.setDescripcion("España");
    	daoNac.create(n);
    	n.setDescripcion("Brasil");
    	daoNac.create(n);
    	n.setDescripcion("Chile");
    	daoNac.create(n);
    	n.setDescripcion("Paraguay");
    	daoNac.create(n);
    	n.setDescripcion("Italia");
    	daoNac.create(n);
    	n.setDescripcion("Inglaterra");
    	daoNac.create(n);
    	n.setDescripcion("Colombia");
    	daoNac.create(n);
    	n.setDescripcion("India");
    	daoNac.create(n);
    	n.setDescripcion("China");
    	daoNac.create(n);
	}
	
	public static void generos() {
    	Genero g = new Genero();
    	g.setDescripcion("Terror");
    	daoGen.create(g);
    	g.setDescripcion("Suspenso");
    	daoGen.create(g);
    	g.setDescripcion("Historia");
    	daoGen.create(g);
    	g.setDescripcion("Ciencia Ficcion");
    	daoGen.create(g);
    	g.setDescripcion("Romance");
    	daoGen.create(g);
    	g.setDescripcion("Aventuras");
    	daoGen.create(g);
    	g.setDescripcion("Gotica");
    	daoGen.create(g);
    	g.setDescripcion("Fantastica");
    	daoGen.create(g);
    	g.setDescripcion("Paranormal");
    	daoGen.create(g);
    	g.setDescripcion("Novela");
    	daoGen.create(g);
    	g.setDescripcion("Accion");
    	daoGen.create(g);
    	g.setDescripcion("Poema");
    	daoGen.create(g);
	}
	
	public static void autores() {
    	Autor a = new Autor();  
    	
    	a.setNombre("Julio");
    	a.setApellido("Cortázar");
    	a.setEmail("julito@gmail.com");
    	a.setNacionalidad(daoNac.readOne(1));
    	daoAut.create(a);
    	
    	a.setNombre("Jorge Luis");
    	a.setApellido("Borges");
    	a.setEmail("jorgeb@gmail.com");
    	a.setNacionalidad(daoNac.readOne(2));
    	daoAut.create(a);
    	
    	a.setNombre("Ernesto");
    	a.setApellido("Sabato");
    	a.setEmail("Ernestos@gmail.com");
    	a.setNacionalidad(daoNac.readOne(3));
    	daoAut.create(a);
    	
    	a.setNombre("Adolfo bioy");
    	a.setApellido("Casares");
    	a.setEmail("adolfoc@gmail.com");
    	a.setNacionalidad(daoNac.readOne(4));
    	daoAut.create(a);
    	
    	a.setNombre("Pablo");
    	a.setApellido("Neruda");
    	a.setEmail("pablon@gmail.com");
    	a.setNacionalidad(daoNac.readOne(5));
    	daoAut.create(a);
    	
    	a.setNombre("Esteban");
    	a.setApellido("Echeverría");
    	a.setEmail("Esteban@gmail.com");
    	a.setNacionalidad(daoNac.readOne(1));
    	daoAut.create(a);
    	
    	a.setNombre("Matias");
    	a.setApellido("Sanchez");
    	a.setEmail("Matias@gmail.com");
    	a.setNacionalidad(daoNac.readOne(1));
    	daoAut.create(a);
    	
    	a.setNombre("Jose");
    	a.setApellido("Hernandez");
    	a.setEmail("Jose@gmail.com");
    	a.setNacionalidad(daoNac.readOne(1));
    	daoAut.create(a);
    	
    	a.setNombre("Rafael");
    	a.setApellido("Pombo");
    	a.setEmail("Rafael@gmail.com");
    	a.setNacionalidad(daoNac.readOne(8));
    	daoAut.create(a);
    	
    	a.setNombre("Niccolo");
    	a.setApellido("Ammaniti");
    	a.setEmail("Niccolo@gmail.com");
    	a.setNacionalidad(daoNac.readOne(6));
    	daoAut.create(a);
    	
    	a.setNombre("William");
    	a.setApellido("Shakespeare");
    	a.setEmail("William@gmail.com");
    	a.setNacionalidad(daoNac.readOne(7));
    	daoAut.create(a);
    	
    	a.setNombre("Rabindranath");
    	a.setApellido("Tagore");
    	a.setEmail("Tagore@gmail.com");
    	a.setNacionalidad(daoNac.readOne(9));
    	daoAut.create(a);
    	
    	a.setNombre("Gao");
    	a.setApellido("Xingjian");
    	a.setEmail("Gao@gmail.com");
    	a.setNacionalidad(daoNac.readOne(10));
    	daoAut.create(a);
	}
	
	public static void libros() {
    	Libro l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(1));
    	l.setCantidadPaginas(100);
    	l.setDescripcion("Antinovela");
    	l.agregarGenero(daoGen.readOne(1));
    	l.agregarGenero(daoGen.readOne(2));
    	l.setIdioma("Español");
    	l.setTitulo("Rayuela");
    	l.setIsbn(12340);
    	daoLib.create(l); 
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(2));
    	l.setCantidadPaginas(300);
    	l.setDescripcion("Antinovela");
    	l.agregarGenero(daoGen.readOne(4));
    	l.agregarGenero(daoGen.readOne(5));
    	l.setIdioma("Español");
    	l.setTitulo("El tunel");
    	l.setIsbn(12341);
    	daoLib.create(l);  
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(3));
    	l.setCantidadPaginas(200);
    	l.setDescripcion("poemas");
    	l.agregarGenero(daoGen.readOne(5));
    	l.setIdioma("Español");
    	l.setTitulo("veinte poemas de amor y una cancion desesperada");
    	l.setIsbn(12342);
    	daoLib.create(l);  
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(4));
    	l.setCantidadPaginas(250);
    	l.setDescripcion("historias");
    	l.agregarGenero(daoGen.readOne(2));
    	l.setIdioma("Español");
    	l.setTitulo("El sueño de los heroes");
    	l.setIsbn(12343);
    	daoLib.create(l);  
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(5));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("historias");
    	l.agregarGenero(daoGen.readOne(3));
    	l.setIdioma("Español");
    	l.setTitulo("El libro de arena");
    	l.setIsbn(12344);
    	daoLib.create(l);  
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(11));
    	l.setCantidadPaginas(185);
    	l.setDescripcion("Tragedia");
    	l.agregarGenero(daoGen.readOne(5));
    	l.setIdioma("Español");
    	l.setTitulo("Hamlet");
    	l.setIsbn(12345);
    	daoLib.create(l);    
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(11));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("tragedia");
    	l.agregarGenero(daoGen.readOne(5));
    	l.setIdioma("Español");
    	l.setTitulo("Romeo y Julieta");
    	l.setIsbn(12346);
    	daoLib.create(l); 
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(11));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Obra teatral");
    	l.agregarGenero(daoGen.readOne(5));
    	l.setIdioma("Español");
    	l.setTitulo("El mercader de Venecia");
    	l.setIsbn(12347);
    	daoLib.create(l);  
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(9));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Animado");
    	l.agregarGenero(daoGen.readOne(9));
    	l.setIdioma("Español");
    	l.setTitulo("El renacuajo paseador");
    	l.setIsbn(12348);
    	daoLib.create(l);
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(6));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Animado");
    	l.agregarGenero(daoGen.readOne(4));
    	l.setIdioma("Español");
    	l.setTitulo("El matadero");
    	l.setIsbn(12349);
    	daoLib.create(l); 
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(6));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Ficcion");
    	l.agregarGenero(daoGen.readOne(4));
    	l.setIdioma("Español");
    	l.setTitulo("La cautiva");
    	l.setIsbn(12350);
    	daoLib.create(l);   
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(8));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("poema narrativo");
    	l.agregarGenero(daoGen.readOne(12));
    	l.setIdioma("Español");
    	l.setTitulo("El Gaucho Martín Fierro");
    	l.setIsbn(12351);
    	daoLib.create(l);
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(8));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("poema narrativo");
    	l.agregarGenero(daoGen.readOne(12));
    	l.setIdioma("Español");
    	l.setTitulo("El Gaucho Martín Fierro");
    	l.setIsbn(12352);
    	daoLib.create(l);  
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(10));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("ficción");
    	l.agregarGenero(daoGen.readOne(4));
    	l.setIdioma("Español");
    	l.setTitulo("Anna");
    	l.setIsbn(12353);
    	daoLib.create(l);
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(12));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Poesia");
    	l.agregarGenero(daoGen.readOne(12));
    	l.setIdioma("Español");
    	l.setTitulo("Gitanjali");
    	l.setIsbn(12354);
    	daoLib.create(l);
    	
    	l = new Libro();
    	l.setFechaLanzamiento(new Date());
    	l.setAutor(daoAut.readOne(13));
    	l.setCantidadPaginas(181);
    	l.setDescripcion("Novela china");
    	l.agregarGenero(daoGen.readOne(10));
    	l.setIdioma("Español");
    	l.setTitulo("La montaña del alma");
    	l.setIsbn(12355);
    	daoLib.create(l);
	}
	
	public static void bibliotecas() {
		Biblioteca b = new Biblioteca();
		
    	b.setEstado(1);
    	b.setLibro(daoLib.readOne(1));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(2);
    	b.setLibro(daoLib.readOne(2));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(1);
    	b.setLibro(daoLib.readOne(3));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(2);
    	b.setLibro(daoLib.readOne(4));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(1);
    	b.setLibro(daoLib.readOne(5));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(2);
    	b.setLibro(daoLib.readOne(6));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(1);
    	b.setLibro(daoLib.readOne(7));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(1);
    	b.setLibro(daoLib.readOne(8));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(2);
    	b.setLibro(daoLib.readOne(9));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(1);
    	b.setLibro(daoLib.readOne(10));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(2);
    	b.setLibro(daoLib.readOne(11));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(1);
    	b.setLibro(daoLib.readOne(12));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(2);
    	b.setLibro(daoLib.readOne(13));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(1);
    	b.setLibro(daoLib.readOne(14));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(2);
    	b.setLibro(daoLib.readOne(15));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
    	
    	b.setEstado(1);
    	b.setLibro(daoLib.readOne(16));
    	b.setFechaAlta(new Date());
    	b.setId(daoBib.create(b));
	}
}
