package aula52;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();


		int opcaoInt = 1;
		while(opcaoInt != 3) {

			opcaoInt = opcoesMenu(scan);

			if(opcaoInt == 1) {
				consultarContato(scan, agenda);
			}
			else if(opcaoInt == 2) {
				adicionarContato(scan, agenda);
			}

		}

	}
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		System.out.println("Digite as informações do contato. ");
		System.out.println("Digite o nome do contato: ");
		String nome = scan.nextLine();
		System.out.println("Digite o telefone do contato. ");
		String telefone = scan.nextLine();
		System.out.println("Digite o email do contato. ");
		String email = scan.nextLine();

		try {
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTelefone(telefone);
			contato.setEmail(email);


			agenda.adicionarContato(contato);
			System.out.println("Contato que será criado: ");
			System.out.println(contato);
			
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("Contatos na agenda: ");
			System.out.println(agenda);
		}

	}

	public static String lerString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;		
	}

	public static void consultarContato(Scanner scan, Agenda agenda) {

		String nomeContato = lerString(scan, "Digite nome do contato que quer buscar");
		try {
			if(agenda.consultarContato(nomeContato)>=0) {
				System.out.println("Contato existe.");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

	}

	public static int opcoesMenu(Scanner scan) {
		boolean entradaValida = false;
		int opcaoInt = 0;
		while(!entradaValida) {
			System.out.println("Digite uma das opções:");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Sair");

			try{
				String opcao = scan.nextLine();
				opcaoInt = Integer.valueOf(opcao);

				if(opcaoInt == 1 || opcaoInt == 2 || opcaoInt ==3) {
					entradaValida = true;
				}
				else {
					throw new Exception ("Entrada inválida.");

				}
			}
			catch(Exception e) {
				System.out.println("Entrada inválida.");
			}

		}
		return opcaoInt;
	}

}

