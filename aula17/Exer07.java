package aula17;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		double um = scan.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		double dois = scan.nextDouble();
		
		System.out.println("Digite o terceiro n�mero: ");
		double tres = scan.nextDouble();
		
		System.out.println("Digite o quarto n�mero: ");
		double quatro = scan.nextDouble();
		
		System.out.println("Digite o quinto n�mero: ");
		double cinco = scan.nextDouble();

		
		if (um > dois && um > tres && um > quatro && um > cinco) {
			System.out.println("O maior n�mero � " + um);
		}
		if (dois > um && dois > tres && dois > quatro && dois > cinco) {
			System.out.println("O maior n�mero � " + dois);
		}
		if (tres > um && tres > dois && tres > quatro && tres > cinco) {
			System.out.println("O maior n�mero � " + tres);
		}
		if (quatro > um && quatro > dois && quatro > tres && quatro > cinco) {
			System.out.println("O maior n�mero � " + quatro);
		}
		if (cinco > um && cinco > dois && cinco > tres && cinco > quatro) {
			System.out.println("O maior n�mero � " + cinco);
		}
	}

}
