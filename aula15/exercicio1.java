package aula15;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite dois n�meros: ");
		
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("O maior n�mero �: " + numero1);
		}
		else if (numero2 > numero1){
			System.out.println("O maior n�mero �: " + numero2);
		}
		
	}
	}
		
	
