import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab3.Agenda;
import lab3.Contato;

class AgendaTest {

	Agenda agenda = new Agenda();
	Contato[] contato = new Contato[100];
	
	@Test
	void testCadastraContadoValido() {
		assertEquals("CADASTRO REALIZADO!" + System.lineSeparator(), agenda.cadastraContado("Gyovanna", "Costa", "000 - 000", 1));
	}
	
	@Test
	void testCadastraContatoPosicaoNegativa() {
		assertEquals("POSIÇÃO INVÁLIDA!" + System.lineSeparator(), agenda.cadastraContado("Gyovanna", "Costa", "000 - 000", -5));
	}
	
	@Test
	void testCadastraContatoPosicaoZero() {
		assertEquals("POSIÇÃO INVÁLIDA!" + System.lineSeparator(), agenda.cadastraContado("Gyovanna", "Costa", "000 - 000", 0));
	}

	@Test
	void testRetornaContato() {
		agenda.cadastraContado("Gyovanna", "Costa", "000 - 000", 2);
		assertEquals("Gyovanna Costa - 000 - 000" + System.lineSeparator(), agenda.retornaContato(2));
	}

	@Test
	void testExisteContato() {
		agenda.cadastraContado("Gyovanna", "Costa", "000 - 000", 2);
		assertEquals(true, agenda.existeContato(2));
	}
	
	@Test
	void testNaoExisteContato() {
		assertEquals(false, agenda.existeContato(12));
	}

	@Test
	void testListarContatos() {
		agenda.cadastraContado("Gyovanna", "Costa", "000 - 000", 2);
		agenda.cadastraContado("Pessoa", "Qualquer","111 - 111" , 17);
		assertEquals("2 - Gyovanna Costa" + System.lineSeparator() + "17 - Pessoa Qualquer", agenda.listarContatos());
	}

}
