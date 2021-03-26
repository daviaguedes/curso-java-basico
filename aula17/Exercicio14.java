package aula17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero, contPar = 0, contImpar=0;
		
		for(int i = 0; i <10 ; i++) {
			System.out.println("Digite o número: ");
			numero = scan.nextInt();
			if(numero%2==0) {
				contPar++;
			}
			if(numero%2==1) {
				contImpar++;
			}
		}
		System.out.println("A quantidade de números pares é: " + contPar);
		System.out.println("A quantidade de números ímpares é: " + contImpar);
	}

}
