package lab3;

public class Agenda {
	private Contato[] contato;

	public Agenda() {
		this.contato = new Contato[100];
	}

	public void cadastraContado(String nome, String sobrenome, String telefone, String posicao) {
		this.contato[Integer.parseInt(posicao)-1] = new Contato(nome, sobrenome,telefone);
	}

	public String buscarContato(int posicao) {
		for (int i = 0; i < contato.length; i++) {
			if(i == (posicao -1) && contato[posicao -1] != null) {
				return contato[posicao - 1].toString();
			}
		}
		return "POSIÇÃO INVÁLIDA!" + System.lineSeparator();
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

}
