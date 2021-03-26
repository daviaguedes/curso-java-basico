package aula15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("É um número par.");
		}
		else {
			System.out.println("É um número impar.");
		}
	}

}
