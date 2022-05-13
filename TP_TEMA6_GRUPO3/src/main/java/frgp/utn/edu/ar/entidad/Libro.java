package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Libro implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ISBN;
	
	private String titulo;
	
	private String fechaLanzamiento;
	
	private String idioma;
	
	private int cantidadPaginas;
	
	@ManyToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="idAutor")
	private Autor autor;
	
	private String descripcion;
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="libros_x_generos",
	    joinColumns=
	        @JoinColumn(name="id_libro"),
	    inverseJoinColumns=
	        @JoinColumn(name="id_genero")
    )
	private Set <Genero> genero;
	
	public Libro(){}
	
	public Libro(int iSBN, String titulo, String fechaLanzamiento, String idioma, int cantidadPaginas, Autor autor,
			String descripcion, Set<Genero> genero) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.fechaLanzamiento = fechaLanzamiento;
		this.idioma = idioma;
		this.cantidadPaginas = cantidadPaginas;
		this.autor = autor;
		this.descripcion = descripcion;
		this.genero = genero;
	}

	public int getISBN() {
		return ISBN;
	}
	
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	
	public void setFechaLanzamiento(String fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
	public String getIdioma() {
		return idioma;
	}
	
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public int getCantidadPaginas() {
		return cantidadPaginas;
	}
	
	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Genero> getGenero() {
		return genero;
	}

	public void setGenero(Set<Genero> genero) {
		this.genero = genero;
	}
}
