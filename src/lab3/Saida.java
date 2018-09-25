package lab3;

/**
 * Saída é uma classe com objetivo de fornecer saídas para auxiliar o main.
 * 
 * @author Deborah Gyovanna.
 *
 */
public class Saida {

	/**
	 * Construtor de Saída.
	 */
	public Saida() {

	}

	/**
	 * O método opcoesEntrada(), tem como objetivo apresentar as opções do menu para
	 * que o usuário possa visualizar e escolher
	 * 
	 * @return retorna as opções de menu.
	 */
	public String opcoesEntrada() {
		return "(C)adastrar Contato" + System.lineSeparator() + "(L)istar Contatos" + System.lineSeparator()
				+ "(E)xibir Contato" + System.lineSeparator() + "(S)air" + System.lineSeparator()
				+ System.lineSeparator() + "Opção> ";
	}

	/**
	 * O método posicao(), retorna uma string para pedir posição.
	 * 
	 * @return "Posição".
	 */
	public String posicao() {
		return "Posição: ";
	}

	/**
	 * O método nome(), retorna uma string para pedir nome.
	 * 
	 * @return "Nome".
	 */
	public String nome() {
		return "Nome: ";
	}

	/**
	 * O método sobrenome(), retorna uma string para pedir sobrenome.
	 * 
	 * @return "Sobrenome".
	 */
	public String sobrenome() {
		return "Sobrenome: ";
	}

	/**
	 * O método telefone(), retorna uma string para pedir telefone.
	 * 
	 * @return "Telefone".
	 */
	public String telefone() {
		return "Telefone: ";
	}

	/**
	 * O método contato(), retorna uma string para pedir contato.
	 * 
	 * @return "Contato".
	 */
	public String contato() {
		return "Contato> ";
	}

	/**
	 * O método posIvld(), retorna uma string que informa que a posição é inválida.
	 * 
	 * @return "Posição Inválida".
	 */
	public String posIvld() {
		return "POSIÇÃO INVÁLIDA!";
	}

}
