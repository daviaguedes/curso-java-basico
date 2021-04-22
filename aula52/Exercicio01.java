package aula52;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		opcoesMenu(scan);

	}
	public static void opcoesMenu(Scanner scan) {
		boolean entradaValida = false;

		while(!entradaValida) {
			System.out.println("Digite uma das opções:");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Sair");

			try{
				String opcao = scan.nextLine();
				int opcaoInt = Integer.valueOf(opcao);
				
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

	}

}

