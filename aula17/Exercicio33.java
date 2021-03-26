package aula17;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double soma= 0;
		System.out.println("Digite o número para \"n\" ");
		double n = scan.nextDouble();
		
		for(double i = 1, j = 1; i<=n; i++, j+= 2) {
			System.out.print(i + "/" + j + " + ");
			soma = soma + (i/j);
		}
		System.out.println("\nSoma: " + soma);

	}

}
