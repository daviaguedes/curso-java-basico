package aula17;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int primeiro=1, segundo=1, proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		for(int i = 3; i <90 ; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		
		
	}
}
