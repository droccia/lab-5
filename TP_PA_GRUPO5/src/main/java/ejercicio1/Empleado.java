package ejercicio1;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Empleado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String nombre;
	public String apellido;
	public String puesto;
	
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name="idVehiculoEmpresa")
	public VehiculoEmpresa vehiculo;
	
	public Empleado() {}

	public Empleado(String nombre, String apellido, String puesto, VehiculoEmpresa vehiculo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto = puesto;
		this.vehiculo = vehiculo;
	}

	public int getID() {
		return id;
	}

	public void setID(int iD) {
		this.id = iD;
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

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public VehiculoEmpresa getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(VehiculoEmpresa vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Empleado ID=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto
				+ ", vehiculo=" + vehiculo.toString();
	}
}
