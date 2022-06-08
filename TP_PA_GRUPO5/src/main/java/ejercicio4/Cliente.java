package ejercicio4;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellido;
	
	@ManyToMany (fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
	@JoinTable(name="ventas",
	joinColumns= { @JoinColumn (name="idcliente") }, 
	inverseJoinColumns= 
		{ @JoinColumn(name="idproducto") }
	)
	private Set<Producto> listaProductos;
	
	public Cliente() {}
	
	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void getDatosVenta() {
		System.out.print(this + "\n");
		for (Producto producto : listaProductos) {
			System.out.print(producto + "\n");
		}
	}
	
	public void setProductos(Set<Producto> productos) {
		this.listaProductos = productos;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
}