package aula17;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do pão");
		double precoPao = scan.nextDouble();
		double tabela;
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for(int i = 0; i< 51 ; i++) {
			tabela = precoPao*i;
			
			System.out.println(i + " - R$ " + tabela);
		}
	}

}
