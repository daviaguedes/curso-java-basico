package aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int calculo;
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Qual a operação a ser realizada? ");
		String operaçao = scan.next();
		
		if (operaçao.equalsIgnoreCase("subtração")) {
			calculo= numero1 - numero2;
			System.out.println("O número1 - número2 é igual à: " + calculo);
			
			if (calculo%2 == 0) {
				System.out.println("O resultado é par.");
			}
			if (calculo%2 != 0) {
			System.out.println("O resultado é ímpar.");
			}
			if (calculo >= 0) {
				System.out.println("O resultado é positivo.");
			}
			if (calculo < 0) {
			System.out.println("O resultado é negativo.");
			
			}
		}
		else if (operaçao.equalsIgnoreCase("adição")) {
			
			calculo= numero1 + numero2;
			System.out.println("O número1 - número2 é igual à: " + calculo);
			
			if (calculo%2 == 0) {
				System.out.println("O resultado é par.");
			}
			if (calculo%2 != 0) {
			System.out.println("O resultado é ímpar.");
			}
			if (calculo >= 0) {
				System.out.println("O resultado é positivo.");
			}
			if (calculo < 0) {
			System.out.println("O resultado é negativo.");
			}
		}
		else if (operaçao.equalsIgnoreCase("divisão")) {
			
			calculo= numero1 / numero2;
			System.out.println("O número1 - número2 é igual à: " + calculo);
			
			if (calculo%2 == 0) {
				System.out.println("O resultado é par.");
			}
			if (calculo%2 != 0) {
			System.out.println("O resultado é ímpar.");
			}
			if (calculo >= 0) {
				System.out.println("O resultado é positivo.");
			}
			if (calculo < 0) {
			System.out.println("O resultado é negativo.");
			}
		}
		else if (operaçao.equalsIgnoreCase("multiplicação")) {
			
			calculo= numero1 * numero2;
			System.out.println("O número1 - número2 é igual à: " + calculo);
			
			if (calculo%2 == 0) {
				System.out.println("O resultado é par.");
			}
			if (calculo%2 != 0) {
			System.out.println("O resultado é ímpar.");
			}
			if (calculo >= 0) {
				System.out.println("O resultado é positivo.");
			}
			if (calculo < 0) {
			System.out.println("O resultado é negativo.");
			}
		}
		
		/*switch (operaçao) {
		case "subtração" : 
		case "Subtração" :
		case "SUBTRAÇÃO" :
			calculo= numero1 - numero2;
			System.out.println("O número1 - número2 é igual à: " + calculo); break;
		case "adição" :
		case "Adição" : 
		case "ADIÇÃO" : 
			calculo= numero1 + numero2;
			System.out.println("O número1 + número2 é igual à: " + calculo); break;
		case "divisão" :
		case "Divisão" :
		case "DIVISÃO" :
			calculo= numero1 / numero2;
			System.out.println("O número1 / número2 é igual à: " + calculo);break;
		case "multiplicação":
		case "Multiplicação":
		case "MULTIPLICAÇÃO":	
			calculo= numero1 * numero2;
			System.out.println("O número1 * número2 é igual à: " + calculo); break;
		default:
			System.out.println("Digite uma operação válida."); 
		}*/
	}
}
