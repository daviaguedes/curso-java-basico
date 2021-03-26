package aula17;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número para verificar se é primo: ");

		int numero = scan.nextInt();
		boolean primo = false;

		for(int i=2; i< numero; i++ ) {
			
			if(numero%i==0) {
				System.out.println("Não é primo.");
				primo= true;
			}

		}
		if(!primo) {
			System.out.println("É primo");
		}
	}
}
