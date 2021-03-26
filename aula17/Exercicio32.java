package aula17;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean sair = true;
		int opcoes, cod, qtde;
		double total = 0, compra;
		String output = "";
		
		System.out.println("Lanchonete do Kaabii");
		System.out.println("Especificação   Código  Preço");
		System.out.println("Cachorro quente   100   R$ 1,20");
		System.out.println("Bauru Simples     101   R$ 1,30");
		System.out.println("Bauru com ovo     102   R$ 1,50");
		System.out.println("Hamburguer        103   R$ 1,20");
		System.out.println("Cheeseburguer     104   R$ 1,30");
		System.out.println("Refrigerante      105   R$ 1,00");

		System.out.println();
		do {
			System.out.println("Digite o código do item e a quantidade, respectivamente. Para encerrar digite \"0\" em ambos. ");
			cod = scan.nextInt();
			qtde = scan.nextInt();
			if(cod == 0 & qtde == 0) {
				sair = false;
			}
			else if(cod == 100){
				output += "Cachorro Quente: 1,20 * " + qtde;
				output += "= " + (1.20 * qtde) + "\n";
				total += (1.20 * qtde);
			}
			else if (cod == 101){
				output += "Bauru Simples: 1,30 * " + qtde;
				output += "= " + (1.30 * qtde) + "\n";
				total += (1.30 * qtde);
			}
			else if (cod == 102){
				output += "Bauru com ovo: 1,50 * " + qtde;
				output += "= " + (1.50 * qtde) + "\n";	
				total += (1.50 * qtde);
				}
			else if (cod == 103){
				output += "Hamburguer: 1,20 * " + qtde;
				output += "= " + (1.20 * qtde) + "\n";
				total += (1.20 * qtde);
			}
			else if (cod == 104){
				output += "Cheeseburguer: 1,30 * " + qtde;
				output += "= " + (1.30 * qtde) + "\n";
				total += (1.30 * qtde);
			}
			else if (cod == 105){
				output += "Refrigerante: 1,00 * " + qtde;
				output += "= " + (1.00 * qtde) + "\n";
				total += (1.00 * qtde);
			}
			else {
				System.out.println("Código inválido, digite novamente. ");
			}
		}
		while(sair);
		System.out.println(output);
		System.out.println("Total a pagar: " + total);
	}

}
