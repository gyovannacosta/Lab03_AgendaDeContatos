package lab3;

import java.util.Arrays;

/**
 * Agenda tem como objetivo armazenar um array de até 100 contatos cadastrados.
 * 
 * @author Deborah Gyovanna
 *
 */
public class Agenda {
	private Contato[] contato;

	/**
	 * Construtor de agenda tem como objetivo construir Agenda e inicializar o
	 * objeto Contato.
	 */
	public Agenda() {
		this.contato = new Contato[100];
	}

	/**
	 * O método cadastraContato, tem como objetivo receber o nome, sobrenome e
	 * telefone de um contato que deseja ser cadastrado, além da posição que o mesmo
	 * será cadastrado dentro da agenda, e assim verificar se a posição informada é
	 * válida para que o contato seja cadastrado.
	 * 
	 * @param nome      nome do contato.
	 * @param sobrenome sobrenome do contato.
	 * @param telefone  telefone do contato.
	 * @param posicao   posição em que o contato será cadastrado.
	 * @return retorna Posição inválida caso a posição seja menor que 1 ou maior que
	 *         100, e retorna Cadastro Realizado caso a posição seja válida e o
	 *         construtor de contato não lance nenhuma exceção.
	 */
	public String cadastraContado(String nome, String sobrenome, String telefone, int posicao) {

		if (posicao > 0 && posicao < 101) {
			contato[posicao - 1] = new Contato(nome, sobrenome, telefone);
			return "CADASTRO REALIZADO!" + System.lineSeparator();
		}
		return "POSIÇÃO INVÁLIDA!" + System.lineSeparator();
	}

	/**
	 * O método retornaContato(), tem como objetivo retornar o toString do contato
	 * de uma posição fornecida pelo usuário.
	 * 
	 * @param posicao posição do contato fornecida pelo usuário.
	 * @return representação textual do contato.
	 */
	public String retornaContato(int posicao) {
		return this.contato[posicao - 1].toString() + System.lineSeparator();
	}

	/**
	 * O método existeContato(), tem como objetivo verificar se um contato existe
	 * dentro de agenda.
	 * 
	 * @param posicao posição do contato fornecida pelo usuário.
	 * @return retorna true caso o contato exista dentro de agenda, e false caso
	 *         contrário.
	 */
	public boolean existeContato(int posicao) {
		if (this.contato[posicao - 1] != null) {
			return true;
		}
		return false;
	}

	/**
	 * O método listarContatos(), tem como objetivo listar os contatos cadastrados
	 * dentro de agenda.
	 * 
	 * @return lista com o toString de cada contato cadastrado ordenado de acordo
	 *         com sua posição de forma crescente.
	 */
	public String listarContatos() {
		String listar = "";
		for (int i = 0; i < this.contato.length; i++) {
			if (this.contato[i] != null) {
				listar += (i + 1) + " - " + this.contato[i].getNome() + " " + this.contato[i].getSobrenome()
						+ System.lineSeparator();
			}
		}
		return listar.trim();
	}

	/**
	 * O método hashCode(), tem como objetivo retornar um código hash do objeto.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(contato);
		return result;
	}

	/**
	 * O método equals(), tem como objetivo comparar se um objeto é igual a outro.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (!Arrays.equals(contato, other.contato))
			return false;
		return true;
	}

}
