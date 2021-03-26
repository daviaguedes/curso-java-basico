package aula15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	

	System.out.println("Digite o valor de a ");
	double valorA= scan.nextDouble();
	if (valorA == 0) {
		System.out.println("N�o existe equa��o do segundo grau.");	
		System.exit(0);
	}
		
	System.out.println("Digite o valor de b ");
	double valorB= scan.nextDouble();
	
	System.out.println("Digite o valor de c ");
	double valorC= scan.nextDouble();
	
	double delta = ((Math.pow(valorB,2)) - (4 * valorA * valorC));
	double raiz1;
	double raiz2;
	
	if (delta < 0) {
		System.out.println("A equa��o n�o possui raizes reais.");
		System.exit(0);
	}
	else if (delta == 0) {
		System.out.println("A equa��o possui uma raiz real.");
		raiz1= (-valorB + Math.sqrt(delta))/(2* valorA);
		System.out.println("O valor da raiz � "+ raiz1);
	}
	else if (delta > 0) {
		System.out.println("A equa��o possui duas raiz reais.");
		raiz1= (-valorB + Math.sqrt(delta))/(2* valorA);
		raiz2= (-valorB - Math.sqrt(delta))/(2* valorA);
		System.out.println("O valor das raizes s�o "+ raiz1 + " e " + raiz2);
	}
	
	
}
}
