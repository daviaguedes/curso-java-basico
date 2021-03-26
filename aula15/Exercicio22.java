package aula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		double valorCompraTotal;		
		double valorCompraMorango = 0;
		double valorCompraMaça = 0;
		double morangoAte = 2.50;
		double morangoAcima = 2.20;
		double maçaAte = 1.80;
		double maçaAcima = 1.50;
		
			System.out.println("Digite a quantidade de kg de morangos que deseja comprar: ");
			int kgCompraMorango = scan.nextInt();
			if (kgCompraMorango <= 5 ) {			
			
				valorCompraMorango = morangoAte * kgCompraMorango;
				
			}
			
			else if (kgCompraMorango > 5) {
				valorCompraMorango = morangoAte * kgCompraMorango;
				
			}
			
			System.out.println("Digite a quantidade de kg de maçãs que deseja comprar: ");
			int kgCompraMaça = scan.nextInt();
			if (kgCompraMaça <= 5 ) {			
			
				valorCompraMaça = maçaAte * kgCompraMaça;
				
			}
			
			else if (kgCompraMaça > 5) {
				valorCompraMaça = maçaAte * kgCompraMaça;
				
			}
			
			valorCompraTotal = valorCompraMorango + valorCompraMaça;
			System.out.println("O valor da compra é de: " + valorCompraTotal);

			
			if (kgCompraMaça + kgCompraMorango >= 8 || valorCompraMorango + valorCompraMaça >= 25) {
			valorCompraTotal = (valorCompraMorango + valorCompraMaça)*0.90;
			System.out.println("O valor da compra total, com o desconto foi de: " + valorCompraTotal);
			}

	}

}
