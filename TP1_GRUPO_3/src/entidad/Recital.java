package entidad;

import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.List;
import tipo.GeneroMusical;

public class Recital extends Evento {
	private String banda;
	private GeneroMusical GeneroMusical;
	private List<String> bandasSoporte;
	
	public Recital(String banda, LocalDateTime fecha, LocalTime duracion) {
		super("Recital de " + banda, tipo.Evento.RECITAL, fecha, duracion);
		this.banda = banda;
	}

	public String getBanda() {
		return banda;
	}

	public GeneroMusical getGeneroMusical() {
		return GeneroMusical;
	}

	public List<String> getBandasSoporte() {
		return bandasSoporte;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public void setGeneroMusical(GeneroMusical GeneroMusical) {
		this.GeneroMusical = GeneroMusical;
	}

	public void setBandasSoporte(List<String> bandasSoporte) {
		this.bandasSoporte = bandasSoporte;
	}
}
