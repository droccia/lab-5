package ejercicio1;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VehiculoEmpresa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String modelo;
	public String marca;
	public String anio;
	
	public VehiculoEmpresa() {}

	public VehiculoEmpresa(String marca, String modelo, String anio) {
		this.modelo = modelo;
		this.marca = marca;
		this.anio = anio;
	}

	public int getID() {
		return id;
	}

	public void setID(int iD) {
		id = iD;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return " ID=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]";
	}
}
