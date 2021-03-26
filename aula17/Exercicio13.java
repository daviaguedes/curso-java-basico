package aula17;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		int base = scan.nextInt();
		System.out.println("Digite o valor do expoente: ");
		int exp = scan.nextInt();
		int result = base;
		for(int i = 1; i<exp; i++) {
			result = result * base;
		}
		System.out.println("O valor é " + result);
	}

}
