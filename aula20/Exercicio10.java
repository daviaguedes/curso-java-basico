package aula20;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		int num1, num2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextInt();

			for (int i=num1; i<=num2; i++) {
				System.out.println(i);
			}
			
		}
	}


