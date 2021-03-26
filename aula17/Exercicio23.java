package aula17;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double tabela, preco = 1.99;
		System.out.println("Tabela Quase Dois = Tabela de preços:");
		for(int i = 0; i< 51 ; i++) {
			tabela = preco*i;
			
			System.out.println(i + " - R$ " + tabela);
		}
	}

}
