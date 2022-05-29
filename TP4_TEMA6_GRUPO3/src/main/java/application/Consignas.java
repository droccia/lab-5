package application;

import java.util.List;

import dao.DaoHibernate;
import dominio.Autor;
import dominio.Biblioteca;
import dominio.Libro;
import dominio.Nacionalidad;

public class Consignas {
	//Mostrar todos los libros ordenados según ISBN de mayor a menor.
	public void punto1() {
		System.out.println("\n1) Mostrar todos los libros ordenados según ISBN de mayor a menor");
		DaoHibernate<Libro> dao = new DaoHibernate<Libro>(Libro.class);
		List<Libro> list = (List<Libro>) dao.selectList("order by isbn desc");
		
		for (Libro libro : list) {
			System.out.println(libro.toString());
		}
	}
	
	//Mostrar todos los libros de la biblioteca que se encuentran prestados
	public void punto2() {
		System.out.println("\n2) Mostrar todos los libros de la biblioteca que se encuentran prestados");
		DaoHibernate<Biblioteca> dao = new DaoHibernate<Biblioteca>(Biblioteca.class);
		List<Biblioteca> list = (List<Biblioteca>) dao.selectList("where estado = 2");
		
		for (Biblioteca biblioteca : list) {
			System.out.println(biblioteca.GetDatosPunto2());
		}
	}
	
	//Mostrar todos los autores que sean de nacionalidad Argentina
	public void punto3() {
		System.out.println("\n3) Mostrar todos los autores que sean de nacionalidad Argentina");
		DaoHibernate<Autor> daoAut = new DaoHibernate<Autor>(Autor.class);
		DaoHibernate<Nacionalidad> daoNac = new DaoHibernate<Nacionalidad>(Nacionalidad.class);
		Nacionalidad arg = (Nacionalidad) daoNac.selectUnique("where descripcion = 'Argentina'");
		List<Autor> autores = daoAut.selectList("where idNacionalidad = " + arg.getId());
		
		for (Autor autor : autores) {
			System.out.println(autor.toString());
		}
	}
	
	//Mostrar el libro con ISBN 12345 junto con todos sus géneros 
	public void punto4() {
		System.out.println("\n4) Mostrar el libro con ISBN 12345 junto con todos sus géneros");
		DaoHibernate<Libro> daoLib = new DaoHibernate<Libro>(Libro.class);
		Libro lib = daoLib.selectUnique("where isbn = 12345");
		System.out.println(lib.toString());
	}
	
	//Mostrar el libro que tenga el mayor número de ISBN
	public void punto5() {
		
		
	}

	//Mostrar la cantidad de libros que existen para cada género.
	public void punto6() {
		
	}
}
