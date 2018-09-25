package lab3;

public class Saida {
	
	public Saida() {
		
	}

	public String opcoesEntrada() {
		return "(C)adastrar Contato" + System.lineSeparator()
		+				 "(L)istar Contatos" + System.lineSeparator()
		+				 "(E)xibir Contato" + System.lineSeparator()
		+				 "(S)air" + System.lineSeparator()
		+				 System.lineSeparator() + "Opção> ";
	}
	
	public String posicao() {
		return "Posição: ";
	}
	
	public String nome() {
		return "Nome: ";
	}
	
	public String sobrenome() {
		return "Sobrenome: ";
	}
	
	public String telefone() {
		return "Telefone: ";
	}

	public String contato() {
		return "Contato> ";
	}

	public String posIvld() {
		return "POSIÇÃO INVÁLIDA!";
	}

}
