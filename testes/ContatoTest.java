import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab3.Contato;

class ContatoTest {
	
	private Contato contato;
	
	@Test
	void testExibirContatoBasico() {
		contato = new Contato("Gyovanna", "Costa", "000 - 000");
		assertEquals("Gyovanna Costa - 000 - 000", contato.toString());
	}
	
	@Test
	void testCadastraContatoNomeNull() {
		try{
			contato = new Contato(null, "Costa", "000 - 000");
			fail("Esperado lançar uma exceção do tipo Nullpointer");
		}catch(NullPointerException e) {}	
	}
	
	@Test
	void testCadastraContatoSobrenomeNull() {
		try{
			contato = new Contato("Gyovanna", null, "000 - 000");
			fail("Esperado lançar uma exceção do tipo Nullpointer");
		}catch(NullPointerException e) {}
	}
	
	@Test
	void testCadastraContatoTelefoneNull() {
		try{
			contato = new Contato("Gyovanna", "Costa", null);
			fail("Esperado lançar uma exceção do tipo Nullpointer");
		}catch(NullPointerException e) {}
	}
	
	@Test
	void testCadastraContatoNomeVazio() {
		try{
			contato = new Contato("   ", "Costa", "000 - 000");
			fail("Esperado lançar uma exceção do tipo IllegalArgument");
		}catch(IllegalArgumentException e) {}
	}
	
	@Test
	void testCadastraContatoSobrenomeVazio() {
		try{
			contato = new Contato("Gyovanna", "", "000 - 000");
			fail("Esperado lançar uma exceção do tipo IllegalArgument");
		}catch(IllegalArgumentException e) {}
	}
	
	@Test
	void testCadatraContatoTelefoneVazio() {
		try{
			contato = new Contato("Gyovanna", "Costa", "                                  ");
			fail("Esperado lançar uma exceção do tipo IllegalArgument");
		}catch(IllegalArgumentException e) {}
	}
	
}
