package aula17;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero = 0;
		int tabuada;
		System.out.println("Digite o número que deseja ver a tabuada.");
		numero = scan.nextInt();
		System.out.println("Tabuada de " + numero + ":");
		for(int i=1; i<=10; i++) {
		tabuada= numero*i;
		System.out.println(numero + " X " + i + " = " + tabuada);
		}

	}

}
