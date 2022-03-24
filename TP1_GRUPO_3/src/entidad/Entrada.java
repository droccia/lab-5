package entidad;

import java.util.concurrent.atomic.AtomicInteger;

import tipo.EntradaRecital;

public class Entrada {
	private static final AtomicInteger contador = new AtomicInteger(0);
	
	private Integer numero;
	private double precio;
	private Evento evento;
	
	public Entrada(Recital recital, EntradaRecital tipo) {
		this.numero = contador.incrementAndGet();
		this.evento = recital;
		this.precio = tipo.getPrecio();
	}
	public Integer getNumero() {
		return numero;
	}
	public double getPrecio() {
		return precio;
	}
	public Evento getEvento() {
		return evento;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	@Override
	public String toString() {
		return "Número único de entrada: " + numero.toString() + System.lineSeparator() + "Nombre del show: "
				+ evento.getNombre() + System.lineSeparator() + "Tipo de evento: " + evento.getTipo()
				+ System.lineSeparator() + "Día y horario del evento: " + evento.getFecha() + System.lineSeparator()
				+ "Tiempo aproximado de duración: " + evento.getDuracion() + System.lineSeparator();
	}
}
