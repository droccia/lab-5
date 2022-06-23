package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Clientes implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String DNI;
	private String nombre;
	private String apellido;
	private Nacionalidad nacionalidad;
	private String email;
	private String direccion;
	private String localidad;
	private String telefono;
	private date fechaNacimiento;
}
