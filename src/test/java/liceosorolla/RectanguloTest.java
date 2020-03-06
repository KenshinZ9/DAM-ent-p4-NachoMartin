package test.java.liceosorolla;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import mein.java.liceosorolla.Rectangulo;

public class RectanguloTest {
	private Rectangulo rectangulo;
	@Before
	public void Before() {
		rectangulo = new Rectangulo(5,5);
	}
	@Test
	public void comprobarLadosIguales() {
		boolean bool=true;
		assertEquals(bool,rectangulo.esCuadrado());
	}
	@Test
	public void comprobarPerimetro() {
		assertEquals(20,rectangulo.perimetro());
	}
	@Test
	public void comprobarArea() {
		assertEquals(25,rectangulo.area());
	}
	@Test
	public void comprobarHipotenusa() {
		assertEquals(7,rectangulo.hipotenusa());
	}
	
}
