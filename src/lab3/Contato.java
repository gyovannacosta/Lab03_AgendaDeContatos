package lab3;

public class Contato {
	private String nome;
	private String sobrenome;
	private String telefone;

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

	public String getNome() {
		return this.nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	@Override
	public String toString() {
		return this.nome + " " + this.sobrenome + " - " + this.telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		return result;
	}

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
