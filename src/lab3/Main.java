package lab3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String entrada;
		Agenda agenda = new Agenda();
		Saida opcao = new Saida();

		do {
			System.out.print(opcao.opcoesEntrada());
			entrada = scanner.nextLine().toLowerCase();

			if (entrada.equals("c")) {
				cadastroValido(scanner, opcao, agenda);
			} else if (entrada.equals("l")) {
				System.out.println(agenda.listarContatos() + System.lineSeparator());
			} else if (entrada.equals("e")) {
				buscaContato(scanner, opcao, agenda);
			} else if (entrada.equals("s")) {
				break;
			} else {
				System.out.println(opcao.posIvld() + System.lineSeparator());
			}
		} while (!entrada.equals("s"));

	}

	private static void buscaContato(Scanner scanner, Saida opcao, Agenda agenda) {
		System.out.print(opcao.contato());
		int posicao = scanner.nextInt();
		scanner.nextLine();

		if (posicao < 1 || posicao > 100 || (agenda.existeContato(posicao) != true)) {
			System.out.println(opcao.posIvld() + System.lineSeparator());
		} else {
			System.out.println(agenda.retornaContato(posicao) + System.lineSeparator());
		}

	}

	private static void cadastroValido(Scanner scanner, Saida opcao, Agenda agenda) {

		try {
			System.out.print(opcao.posicao());
			String entrada = scanner.nextLine();
			int posicao = Integer.parseInt(entrada);

			System.out.print(opcao.nome());
			String nome = scanner.nextLine();

			System.out.print(opcao.sobrenome());
			String sobrenome = scanner.nextLine();

			System.out.print(opcao.telefone());
			String telefone = scanner.nextLine();

			System.out.println(agenda.cadastraContado(nome, sobrenome, telefone, posicao));
		} catch (NumberFormatException e) {
			System.out.println(opcao.posIvld() + System.lineSeparator());
		} catch (Exception s) {
			System.out.println(s.getMessage() + System.lineSeparator());
		}
	}

}
