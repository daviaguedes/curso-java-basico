package aula17;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		int numero = scan.nextInt();
		boolean primo;
		
		for(int i= 1; i<=numero; i++) {
			
			primo = true;
			
			for(int j = 2; j<i; j++) {
				if(i%j==0) {
					primo = false;
				}
				
			}
			if(primo) {
				System.out.println(i);
		}
		
		}
	}

}
