package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entidad.Usuario;

@Configuration
public class Config {
	
	@Bean
	public Usuario UsuarioPepe() {
		Usuario usuario = new Usuario();
		usuario.setUsuario("Pepe");
		usuario.setContrasenia("123");
		return usuario;
	}
}
