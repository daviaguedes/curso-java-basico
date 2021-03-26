package aula20;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		int num1, num2, soma = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextInt();

			for (int i=num1; i<=num2; i++) {
				System.out.println(i);
				soma= soma + i;
			}
			System.out.println("A soma dos números é: " + soma);

	}

}
