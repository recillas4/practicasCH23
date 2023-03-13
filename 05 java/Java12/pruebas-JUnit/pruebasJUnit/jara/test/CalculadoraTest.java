package pruebasJUnit.jara.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import pruebasJUnit.jara.app.Calculadora;

class CalculadoraTest {
	
	private Calculadora ct;
	private Calculadora ct1 = null;
	
	@BeforeEach
	public void configurandobefore() {
		ct = new Calculadora();
		System.out.println("Ejecutando Before");
	}
	@AfterEach
	public void configurandoAfter() {
		ct = null;
		System.out.println("Ejecutando AfterEach");
		System.out.println(" **** ");
	}
	@Test
	public void  CalculadoraNull() {
		assertNull(ct1, "la clase es una instancia no nula");
		System.out.println("ejecutando 1 test, calduladora");
	
		
}
	@Test
	public void calculadoraNotNull() {
		assertNotNull(ct);
		System.out.println("ejecutando segundo test");
	}
	
	@Test
	public void primerosAssert() {
//		1 indicar que se evalua
//		2 ubicar lo que se realizara
//		3 evaluar con el Assert indicado
		
		int resultadoEsperado = 10;
		int resultadoActual;
		resultadoActual = ct.sumar(7, 3);
		assertEquals(resultadoEsperado, resultadoActual);
		System.out.println("ejecutando tercer test ");
	}
	@Test
	public void sumaTest() {
		assertEquals(20, ct.sumar(10, 10));
		Calculadora calculadora = new Calculadora();
		
		System.out.println("ejecutando sumaTest");

	}
	
//	tipos de test
	@Test
	public void tiposDeAsserts() {
		assertTrue(1 == 1);
		assertEquals("Generation", "Generation");
		assertNull(ct1);
		
		Calculadora c1 = new Calculadora();

		Calculadora c2 = new Calculadora();

		Calculadora c3 = c1;

		assertSame(c1, c3);
		assertNotSame(c2, c3);
		assertEquals(1, 1.5, .5);
	}
	@Test
	public void validarSuma() {
		
		assertEquals(11, ct.sumar(5, 6));
		

	}
	
	@Test
	public void validarResta() {
		assertEquals(50, ct.restar(56, 6));

	}
	
	public void ValidandoRestaNeg() {
		assertEquals(-10, ct.restar(10, 20));

	}
	@Test
	public void validandoDivision() {
		assertEquals(2, ct.division(10,5));

	}
	
	
//	@Test
//	
//	public void validandoDivicero() {
//		assertThrows(ArithmeticException.class, ()->ct.divicero(10,0 ),"nose puede dividir por cero");
//
//	}
//	//prueba unitaria = probar bloque de codigo junit5

	//@Disabled("en espera")
//	@Test
//	private void validandidivicero() {
//		// TODO Auto-generated method stub
//		assertThrows(ArithmeticException.class, null)
//	}
	
}
