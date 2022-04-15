package frgp.utn.edu.ar.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;

import frgp.utn.edu.ar.main.MatrizAdyacencia;

public class MatrizAdyacenciaTest {
	
	public static final int TAMAÑO_MATRIZ = 10;
	
	private MatrizAdyacencia matriz = new MatrizAdyacencia(TAMAÑO_MATRIZ);

	static class Params implements ArgumentsProvider {
		@Override
		public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
			return Stream.of(Arguments.of(0, 0), Arguments.of(1, 2), Arguments.of(2, 3));
		}
	}

	@ParameterizedTest
	@ArgumentsSource(Params.class)
	public void agregarElementoTest(int elementoI, int elementoJ) {
		matriz.agregarElemento(elementoI, elementoJ);
		assertEquals(true, matriz.existeElemento(elementoI, elementoJ));
	}

	@ParameterizedTest
	@ArgumentsSource(Params.class)
	public void agregarElementoSimetriaTest(int elementoI, int elementoJ) {
		matriz.agregarElemento(elementoI, elementoJ);
		assertEquals(true, matriz.existeElemento(elementoJ, elementoI));
	}

	@ParameterizedTest
	@ArgumentsSource(Params.class)
	public void eliminarElementoTest(int elementoI, int elementoJ) {
		matriz.eliminarElemento(elementoI, elementoJ);
		assertEquals(false, matriz.existeElemento(elementoI, elementoJ));
	}

	@ParameterizedTest
	@ArgumentsSource(Params.class)
	public void eliminarElementoSimetricoTest(int elementoI, int elementoJ) {
		matriz.eliminarElemento(elementoI, elementoJ);
		assertEquals(false, matriz.existeElemento(elementoJ, elementoI));
	}

	@Test
	public void contarRelacionesTest() {

	}

	@Test
	public void existenTodosLosElementoTest() {

	}

	@ParameterizedTest
	@CsvSource({"-1, 1", "-10000000, 1"})
	public void agregarElementoFilaNegativaTest(int elementoJ, int elementoI) {
		Exception excepcionEsperada = null;
		try {
			matriz.agregarElemento(elementoJ, elementoI);
		} catch (Exception e) {
			excepcionEsperada = e;
		}
		assertNotEquals(excepcionEsperada, null);
	}
	
	@ParameterizedTest
	@CsvSource({"1, -1", "1, -10000000"})
	public void agregarElementoColumnaNegativaTest(int elementoJ, int elementoI) {
		Exception excepcionEsperada = null;
		try {
			matriz.agregarElemento(elementoJ, elementoI);
		} catch (Exception e) {
			excepcionEsperada = e;
		}
		assertNotEquals(excepcionEsperada, null);
	}

	@Test
	public void agregarElementoFueraRangoTest() {

	}

}
