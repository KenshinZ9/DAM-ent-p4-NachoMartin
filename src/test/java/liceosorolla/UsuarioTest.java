package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import mein.java.liceosorolla.Usuario;


public class UsuarioTest {
	
	private Usuario usuario;
	@Before
	public void Before() {
		usuario = new Usuario("Nacho","Martin", "2020-03-6", 9);
	}
	@Test
	public void comprobarNombre() {
		assertEquals("Nacho", usuario.getNombre());
	}
	@Test
	public void comprobarApellidos() {
		assertEquals("Martin", usuario.getApellidos());
	}
	@Test
	public void comprobarNombreCompleto() {
		assertEquals("Nacho Martin ",usuario.getNombre()+" "+usuario.getApellidos());
	}
	
	@Test
	public void comprobarMayus() {
		assertEquals("NACHO MARTIN",usuario.mayus());
	}
	@Test
	public void comprobarMinus() {
		assertEquals("nacho martin",usuario.minus());
	}
}
