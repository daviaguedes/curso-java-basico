package aula15;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int calculo;
		
		System.out.println("Digite o primeiro n�mero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Qual a opera��o a ser realizada? ");
		String opera�ao = scan.next();
		
		if (opera�ao.equalsIgnoreCase("subtra��o")) {
			calculo= numero1 - numero2;
			System.out.println("O n�mero1 - n�mero2 � igual �: " + calculo);
			
			if (calculo%2 == 0) {
				System.out.println("O resultado � par.");
			}
			if (calculo%2 != 0) {
			System.out.println("O resultado � �mpar.");
			}
			if (calculo >= 0) {
				System.out.println("O resultado � positivo.");
			}
			if (calculo < 0) {
			System.out.println("O resultado � negativo.");
			
			}
		}
		else if (opera�ao.equalsIgnoreCase("adi��o")) {
			
			calculo= numero1 + numero2;
			System.out.println("O n�mero1 - n�mero2 � igual �: " + calculo);
			
			if (calculo%2 == 0) {
				System.out.println("O resultado � par.");
			}
			if (calculo%2 != 0) {
			System.out.println("O resultado � �mpar.");
			}
			if (calculo >= 0) {
				System.out.println("O resultado � positivo.");
			}
			if (calculo < 0) {
			System.out.println("O resultado � negativo.");
			}
		}
		else if (opera�ao.equalsIgnoreCase("divis�o")) {
			
			calculo= numero1 / numero2;
			System.out.println("O n�mero1 - n�mero2 � igual �: " + calculo);
			
			if (calculo%2 == 0) {
				System.out.println("O resultado � par.");
			}
			if (calculo%2 != 0) {
			System.out.println("O resultado � �mpar.");
			}
			if (calculo >= 0) {
				System.out.println("O resultado � positivo.");
			}
			if (calculo < 0) {
			System.out.println("O resultado � negativo.");
			}
		}
		else if (opera�ao.equalsIgnoreCase("multiplica��o")) {
			
			calculo= numero1 * numero2;
			System.out.println("O n�mero1 - n�mero2 � igual �: " + calculo);
			
			if (calculo%2 == 0) {
				System.out.println("O resultado � par.");
			}
			if (calculo%2 != 0) {
			System.out.println("O resultado � �mpar.");
			}
			if (calculo >= 0) {
				System.out.println("O resultado � positivo.");
			}
			if (calculo < 0) {
			System.out.println("O resultado � negativo.");
			}
		}
		
		/*switch (opera�ao) {
		case "subtra��o" : 
		case "Subtra��o" :
		case "SUBTRA��O" :
			calculo= numero1 - numero2;
			System.out.println("O n�mero1 - n�mero2 � igual �: " + calculo); break;
		case "adi��o" :
		case "Adi��o" : 
		case "ADI��O" : 
			calculo= numero1 + numero2;
			System.out.println("O n�mero1 + n�mero2 � igual �: " + calculo); break;
		case "divis�o" :
		case "Divis�o" :
		case "DIVIS�O" :
			calculo= numero1 / numero2;
			System.out.println("O n�mero1 / n�mero2 � igual �: " + calculo);break;
		case "multiplica��o":
		case "Multiplica��o":
		case "MULTIPLICA��O":	
			calculo= numero1 * numero2;
			System.out.println("O n�mero1 * n�mero2 � igual �: " + calculo); break;
		default:
			System.out.println("Digite uma opera��o v�lida."); 
		}*/
	}
}
