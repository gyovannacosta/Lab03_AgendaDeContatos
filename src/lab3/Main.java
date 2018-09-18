package lab3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String entrada;
		Agenda agenda = new Agenda();
		
		while(true) {
			System.out.print("(C)adastrar Contato" + System.lineSeparator()
			+				 "(L)istar Contatos" + System.lineSeparator()
			+				 "(E)xibir Contato" + System.lineSeparator()
			+				 "(S)air" + System.lineSeparator()
			+				 System.lineSeparator() + "Opção> ");
			
			entrada = scanner.nextLine();
			
			if(entrada.toLowerCase().equals("c")) {
				System.out.println(cadastroValido(scanner, agenda));
				
			}
			else if(entrada.toLowerCase().equals("l")) {
				
			}
			else if(entrada.toLowerCase().equals("e")) {
				
			}
			else if(entrada.toLowerCase().equals("s")) {
				break;
			}
			else {
				System.out.println("OPÇÃO INVÁLIDA!" + System.lineSeparator());
			}
		}

	}

	private static String cadastroValido(Scanner scanner, Agenda agenda) {
		String posicao;
		System.out.print("Posição: ");
		posicao = scanner.nextLine();
		try {
			if(Integer.parseInt(posicao) > 0 && Integer.parseInt(posicao) < 101) {
				System.out.print("Nome: ");
				String nome = scanner.nextLine();
				System.out.print("Sobrenome: ");
				String sobrenome = scanner.nextLine();
				System.out.print("Telefone: ");
				String telefone = scanner.nextLine();
			
				agenda.cadastraContado(nome, sobrenome, telefone, posicao);
				return "CADASTRO REALIZADO!" + System.lineSeparator();
			}
			else {
				return "POSIÇÃO INVÁLIDA!" + System.lineSeparator();
			}
		}catch(NumberFormatException e){
			return "POSIÇÃO INVÁLIDA!" + System.lineSeparator();
		}

	}
}