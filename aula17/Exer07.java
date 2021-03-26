package aula17;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double um = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double dois = scan.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double tres = scan.nextDouble();
		
		System.out.println("Digite o quarto número: ");
		double quatro = scan.nextDouble();
		
		System.out.println("Digite o quinto número: ");
		double cinco = scan.nextDouble();

		
		if (um > dois && um > tres && um > quatro && um > cinco) {
			System.out.println("O maior número é " + um);
		}
		if (dois > um && dois > tres && dois > quatro && dois > cinco) {
			System.out.println("O maior número é " + dois);
		}
		if (tres > um && tres > dois && tres > quatro && tres > cinco) {
			System.out.println("O maior número é " + tres);
		}
		if (quatro > um && quatro > dois && quatro > tres && quatro > cinco) {
			System.out.println("O maior número é " + quatro);
		}
		if (cinco > um && cinco > dois && cinco > tres && cinco > quatro) {
			System.out.println("O maior número é " + cinco);
		}
	}

}
