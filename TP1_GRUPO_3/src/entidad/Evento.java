package entidad;

import java.time.LocalTime;
import java.time.LocalDateTime;

public abstract class Evento {
	private String nombre;
	private tipo.Evento tipo;
	private LocalDateTime fecha;
	private LocalTime duracion;
	
	public Evento(String nombre, tipo.Evento tipo, LocalDateTime fecha, LocalTime duracion) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.fecha = fecha;
		this.duracion = duracion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public tipo.Evento getTipo() {
		return tipo;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public LocalTime getDuracion() {
		return duracion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTipo(tipo.Evento tipo) {
		this.tipo = tipo;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}
	
	
}
