package aula20;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		int numero;
		int maior= Integer.MIN_VALUE;
		
		for(int i =1; i<=5; i++) {
			System.out.println("Digite o " + i + "º número.");
			numero= scan.nextInt();
			if(numero>maior) {
				maior=numero;
			}
			
		}
		System.out.println("O maior número é: " + maior);
	}

}
