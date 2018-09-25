package lab3;

/**
 * Contato é uma classe que armazena nome, sobrenome e telefone de um
 * determinado contato.
 * 
 * @author Deborah Gyovanna.
 *
 */
public class Contato {
	private String nome;
	private String sobrenome;
	private String telefone;

	/**
	 * Construtor de Contato tem como objetivo construir o objeto contato recebendo
	 * como parâmetro nome, sobrenome e telefone de um determinado usuário, também
	 * inicializando as váriáveis para armazenamento dessas informações, além de
	 * verificar se os parâmetros fornecidos são válidos para crianção do contato.
	 * Caso seja inválido Contato retorna uma mensagem de erro de acordo com a opção
	 * inválida fornecida.
	 * 
	 * @param nome      nome do contato.
	 * @param sobrenome sobrenome do contato.
	 * @param telefone  telefone do contato.
	 */
	public Contato(String nome, String sobrenome, String telefone) {

		if (nome == null || sobrenome == null) {
			throw new NullPointerException("NOME INVÁLIDO!");
		}

		if (nome.trim().equals("") || sobrenome.trim().equals("")) {
			throw new IllegalArgumentException("NOME INVÁLIDO!");
		}

		if (telefone == null) {
			throw new NullPointerException("TELEFONE INVÁLIDO!");
		}

		if (telefone.trim().equals("")) {
			throw new IllegalArgumentException("TELEFONE INVÁLIDO!");
		}

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;

	}

	/**
	 * O método getNome(), tem como objetivo retornar o nome do contato.
	 * 
	 * @return nome do contato
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * O método getSobrenome(), tem como objetivo retornar o sobrenome do contato.
	 * 
	 * @return sobrenome do contato.
	 */
	public String getSobrenome() {
		return this.sobrenome;
	}

	/**
	 * O método toString(), tem como objetivo retornar a representação textual do
	 * contato.
	 */
	@Override
	public String toString() {
		return this.nome + " " + this.sobrenome + " - " + this.telefone;
	}

	/**
	 * O método hashCode(), tem como objetivo retornar um código hash do objeto.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
		Contato other = (Contato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

}
