package aula15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n�mero: ");
		
		int numero = scan.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("� um n�mero par.");
		}
		else {
			System.out.println("� um n�mero impar.");
		}
	}

}
