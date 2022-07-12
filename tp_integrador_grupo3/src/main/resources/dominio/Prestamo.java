package dominio;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Prestamo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade= {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinColumn(name="idBiblioteca")
	private Biblioteca biblioteca;
	
	private Date fechaPrestamo;
	private int cantidadDias;
	
	@ManyToOne(cascade= {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinColumn(name="idCliente")
	private Clientes cliente;
	
	public Prestamo() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}
	
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	
	public int getCantidadDias() {
		return cantidadDias;
	}

	public void setCantidadDias(int cantidadDias) {
		this.cantidadDias = cantidadDias;
	}
	
	public Clientes getCantidadDias() {
		return cliente;
	}

	public void setClientes(Clientes cliente) {
		this.cliente = cliente;
	}
	
}
