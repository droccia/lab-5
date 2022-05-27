package dao;

import java.util.List;

import dominio.Autor;
import dominio.Biblioteca;
import dominio.Libro;

public class DaoSelect {
	
	private DaoHql hql;
	
	public DaoSelect() {
		hql = new DaoHql();
	}
	
	//Mostrar todos los libros ordenados según ISBN de mayor a menor.
	public void punto1() {
		List<Libro> list = (List<Libro>)(Object)hql.selectAllRow("FROM Libro order by isbn desc");
		
		for (Libro libro : list) {
			System.out.println(libro.toString());
		}
	}
	
	//Mostrar todos los libros de la biblioteca que se encuentran prestados
	public void punto2() {
		List<Biblioteca> list = (List<Biblioteca>)(Object)hql.selectAllRow("FROM Biblioteca where estado = 2");
		
		for (Biblioteca biblioteca : list) {
			System.out.println(biblioteca.GetDatosPunto2());
		}
	}
	
	//Mostrar todos los autores que sean de nacionalidad Argentina
	public void punto3() {
	}
	
	//Mostrar el libro con ISBN 12345 junto con todos sus géneros 
	public void punto4() {
		
		
	}
	
	//Mostrar el libro que tenga el mayor número de ISBN
	public void punto5() {
		
		
	}

	//Mostrar la cantidad de libros que existen para cada género.
	public void punto6() {
		
		
		
		hql.signOff();
	}
}
