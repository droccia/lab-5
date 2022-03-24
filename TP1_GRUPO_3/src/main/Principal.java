package main;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import entidad.Entrada;
import entidad.Recital;
import tipo.EntradaRecital;

public class Principal {
	
	public static void main(String[] args) {
		Recital recital = new Recital("The Strokes", LocalDateTime.of(2022, 3, 19, 22, 30), LocalTime.of(1, 30));
		Entrada entradaGeneral = new Entrada(recital, EntradaRecital.GENERAL);
		Entrada entradaVip = new Entrada(recital, EntradaRecital.VIP);
		
		List<Entrada> entradas = Arrays.asList(entradaGeneral, entradaVip);
		
		ListIterator<Entrada> it = entradas.listIterator();
		while (it.hasNext()) {
			Entrada entrada = it.next();
			System.out.println(entrada.toString());
		}
		
	}

}
