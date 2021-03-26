package aula17;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int soma=0;
		double media;
		
		for(int i = 1; i<=5; i++) {
			System.out.println("Digite o " + i + "º número.");
			numero= scan.nextInt();
			soma= soma + numero;
		}
		media= soma/5;
	
		System.out.println("O valor da soma é: "+soma);
		System.out.println("O valor da média é: "+media);
		
	}
}
