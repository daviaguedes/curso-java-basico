package aula15;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner("System.in");
		
			System.out.println("Digite o número equivalente ao tipo de carne que quer comprar: ");
			System.out.println("1 - Filé Duplo ");
			System.out.println("2 - Alcatra");
			System.out.println("3 - Picanha");
			int tipo = scan.nextInt();
		                          
			System.out.println("Digite a quantidade, em quilos, de carne: ");
			double quantidade = scan.nextDouble();
			
			double precoKg = 0;
			
				if (tipo == 1) {
					System.out.println(+quantidade + "kg - Filé Duplo");
					if (quantidade < 5 ) {
						precoKg = 4.90;
				}
					else {
						precoKg = 5.80;
					}
					
				}
				
				else if (tipo == 2) {
					System.out.println(+quantidade + "kg - Alcatra");

					if (quantidade < 5 ) {
						precoKg = 5.90;
				}
					else {
						precoKg = 6.80;
					}
				
				}
				else if (tipo == 3) {
					System.out.println(+quantidade + "kg - Picanha");

					if (quantidade < 5 ) {
						precoKg = 6.90;
				}
					else {
						precoKg = 7.80;
					}
				
				}
			double total = quantidade * precoKg;
				System.out.println(+quantidade + "kg * " + precoKg + " = " + total );					
	}
}