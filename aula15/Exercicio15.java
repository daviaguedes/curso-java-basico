package aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro lado do triângulo: ");
		double lado1 = scan.nextDouble();
		
		System.out.println("Digite o segundo lado do triângulo: ");
		double lado2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro lado do triângulo: ");
		double lado3 = scan.nextDouble();
		
		if( (lado1+lado2)>lado3 || (lado1+lado3)>lado2 || (lado3+lado2)>lado1) {
		System.out.println("É um triângulo");
			if(lado1 == lado2 && lado1 == lado3) {
				System.out.println("Todos os lados são iguais, logo, é um triângulo equilátero.");
			}
			else if((lado1 == lado2) && (lado1 != lado3) || (lado1 == lado3) && (lado1 != lado2) || (lado2 == lado3) && (lado1 != lado1)){
				System.out.println("Dois lados são iguais e um deles é diferente, logo, é um triângulo isósceles.");
			}
			else if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
				System.out.println("Todos os lados são diferentes, logo, é um triângulo escaleno. ");
			}
		
		}
		else {
			System.out.println("Não é um valor válido");
		}
	}
}	
