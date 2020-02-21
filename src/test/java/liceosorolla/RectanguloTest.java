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
	
	
}
