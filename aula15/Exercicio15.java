package aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do tri�ngulo: ");
		double lado1 = scan.nextDouble();
		
		System.out.println("Digite o segundo lado do tri�ngulo: ");
		double lado2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro lado do tri�ngulo: ");
		double lado3 = scan.nextDouble();
		
		if( (lado1+lado2)>lado3 || (lado1+lado3)>lado2 || (lado3+lado2)>lado1) {
		System.out.println("� um tri�ngulo");
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.println("Todos os lados s�o iguais, logo, � um tri�ngulo equil�tero.");
			}
			else if((lado1 == lado2) && (lado1 != lado3) || (lado1 == lado3) && (lado1 != lado2) || (lado2 == lado3) && (lado1 != lado1)){
				System.out.println("Dois lados s�o iguais e um deles � diferente, logo, � um tri�ngulo is�sceles.");
			}
			else if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
				System.out.println("Todos os lados s�o diferentes, logo, � um tri�ngulo escaleno. ");
			}
		
		}
		else {
			System.out.println("N�o � um valor v�lido");
		}
	}
}	
