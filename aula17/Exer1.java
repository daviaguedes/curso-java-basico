package aula17;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		boolean notaValida = false;
		System.out.println("Digite o valor da nota entre 0 e 10: ");
		do {

		Scanner scan = new Scanner(System.in);
		
		
		double nota = scan.nextDouble();	
		
		if (nota >= 0 && nota <= 10) {
			notaValida = true;
			System.out.println("Sua nota é:" + nota);
			
		}
		else {
			System.out.println("Digite uma nota válida: ");
		}
			} while(notaValida == false);
		
		
	} 

}	
