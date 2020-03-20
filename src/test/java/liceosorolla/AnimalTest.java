package test.java.liceosorolla;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import mein.java.liceosorolla.Animal;

public class AnimalTest {
	private Animal animal;
	@Before
	public void Before() {
		animal = new Animal ("Rana","Cefalopodo", 100 , 19,"rosa");
	}
	@Test
	public void comprobarColor() {
		assertEquals("rosa", animal.getColorPelo());
}
	@Test
	public void comprobarEspecie() {
		assertEquals("Cefalopodo", animal.getEspecie());
}
	@Test
	public void comprobarEdad() {
		assertEquals(19, animal.getEdad());
}
	@Test
	public void comprobarPeso() {
		assertEquals(100, animal.getPeso());
	}
	@Test
	public void comprobarAnimal() {
		assertEquals("Rana", animal.getAnimal());
}
}
