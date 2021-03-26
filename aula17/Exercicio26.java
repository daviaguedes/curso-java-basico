package aula17;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
	int fatorial=1;	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite um número:");
	int numero = scan.nextInt();
	
	System.out.print(numero + "! = " );

	for (int i = numero; i>1; i--) {
		fatorial = fatorial *i;
		System.out.print(i + " *  ");
		
	}
	System.out.print("1 = ");
	System.out.println(fatorial);
	
	
	} 

}
