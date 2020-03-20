package test.java.liceosorolla;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import mein.java.liceosorolla.Animal;

public class AnimalTest {
	private Animal animal;
	@Before
	public void Before() {
		animal = new Animal ("Rana","anfivio", 50 , 25,"verde");
	}
	@Test
	public void comprobarColor() {
		assertEquals("verde", animal.getColorPelo());
}
	@Test
	public void comprobarEspecie() {
		assertEquals("anfivio", animal.getEspecie());
}
	@Test
	public void comprobarEdad() {
		assertEquals(25, animal.getEdad());
}
	@Test
	public void comprobarPeso() {
		assertEquals(50, animal.getPeso());
	}
	@Test
	public void comprobarAnimal() {
		assertEquals("Rana", animal.getAnimal());
}
}
