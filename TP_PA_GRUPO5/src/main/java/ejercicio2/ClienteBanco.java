package ejercicio2;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ClienteBanco implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	
	private String apellido;
	
	private int dni;

	private LocalDate fechaNacimiento;
	
	private String email;
	
	private String banco;
	
	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name="id_cliente_banco")
	private List<TarjetaCredito> tarjetas;

	public ClienteBanco() {}

	public ClienteBanco(String nombre, String apellido, int dni, LocalDate fechaNacimiento, String email, String banco) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.banco = banco;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	public List<TarjetaCredito> getTarjetas() {
		return tarjetas;
	}
	
	public void setTarjetas(List<TarjetaCredito> tarjetas) {
		this.tarjetas = tarjetas;
	}

	@Override
	public String toString() {
		return "\nCliente: " + nombre + " " + apellido + ", Fecha nacimiento: " + fechaNacimiento
				+ ", Email: " + email;
	}
	
	
}
