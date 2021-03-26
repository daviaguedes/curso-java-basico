package aula17;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int impar;
		
		for(int i = 1; i<= 50; i++) {
			if(i%2==1) {
				System.out.println("O número " + i + " é ímpar.");
			}
		}
	}

}
