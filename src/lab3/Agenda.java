package lab3;

import java.util.Arrays;

public class Agenda {
	private Contato[] contato;

	public Agenda() {
		this.contato = new Contato[100];
	}

	public String cadastraContado(String nome, String sobrenome, String telefone, int posicao) {
		if(posicao > 0 && posicao < 101) {
			contato[posicao - 1] = new Contato (nome, sobrenome, telefone);
			return "CADASTRO REALIZADO!" + System.lineSeparator();
		}
		return "POSIÇÃO INVÁLIDA!" + System.lineSeparator();
	}

	public String retornaContato(int posicao) {
		return this.contato[posicao - 1].toString() + System.lineSeparator();
	
	}
	
	public boolean existeContato(int posicao) {
		if(this.contato[posicao -1] != null) {
			return true;
		}
		return false;
	}
		
	public String listarContatos() {
		String listar = "";
		for (int i = 0; i < contato.length; i++) {
			if(contato[i] != null) {
				listar += (i+1) + " - " + contato[i].getNome() + " " + contato[i].getSobrenome() + System.lineSeparator();
			}
		}
		return listar.trim();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(contato);
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
		Agenda other = (Agenda) obj;
		if (!Arrays.equals(contato, other.contato))
			return false;
		return true;
	}

}
