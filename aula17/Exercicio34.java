package aula17;

import java.util.Scanner;

public class Exercicio34 {

	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número de termos: ");
		double soma=0;
		int n = scan.nextInt();
		
		for(double i = 1, j=1 ; i<=n ; i++) {
			System.out.print(j + "/" + i + " + ");
			soma += j/i;
		}
		System.out.println("Soma = " + soma);
	}
}
