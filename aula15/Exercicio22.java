package aula15;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		double valorCompraTotal;		
		double valorCompraMorango = 0;
		double valorCompraMa�a = 0;
		double morangoAte = 2.50;
		double morangoAcima = 2.20;
		double ma�aAte = 1.80;
		double ma�aAcima = 1.50;
		
			System.out.println("Digite a quantidade de kg de morangos que deseja comprar: ");
			int kgCompraMorango = scan.nextInt();
			if (kgCompraMorango <= 5 ) {			
			
				valorCompraMorango = morangoAte * kgCompraMorango;
				
			}
			
			else if (kgCompraMorango > 5) {
				valorCompraMorango = morangoAte * kgCompraMorango;
				
			}
			
			System.out.println("Digite a quantidade de kg de ma��s que deseja comprar: ");
			int kgCompraMa�a = scan.nextInt();
			if (kgCompraMa�a <= 5 ) {			
			
				valorCompraMa�a = ma�aAte * kgCompraMa�a;
				
			}
			
			else if (kgCompraMa�a > 5) {
				valorCompraMa�a = ma�aAte * kgCompraMa�a;
				
			}
			
			valorCompraTotal = valorCompraMorango + valorCompraMa�a;
			System.out.println("O valor da compra � de: " + valorCompraTotal);

			
			if (kgCompraMa�a + kgCompraMorango >= 8 || valorCompraMorango + valorCompraMa�a >= 25) {
			valorCompraTotal = (valorCompraMorango + valorCompraMa�a)*0.90;
			System.out.println("O valor da compra total, com o desconto foi de: " + valorCompraTotal);
			}

	}

}
