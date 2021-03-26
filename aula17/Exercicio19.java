package aula17;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas: ");
		int qtdeNotas = scan.nextInt();
		double media=0, notas;
		
		for (int i = 0; i<qtdeNotas; i++ ) {
			System.out.println("Digite a nota " + (i+1));
			notas = scan.nextInt();
			media = media + notas;
		}
		media = media/qtdeNotas;
		System.out.println("A média foi " + media);
	}

}
