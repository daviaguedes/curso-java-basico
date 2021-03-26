package aula15;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 a 7: ");
		
		int diaSemana = scan.nextInt();
		
	switch(diaSemana) {
	case 1: System.out.println("Domingo");break;
	case 2: System.out.println("Segunda");break;
	case 3: System.out.println("Terça-feira");break;
	case 4: System.out.println("Quarta-feira");break;
	case 5: System.out.println("Quinta-feira");break;
	case 6: System.out.println("Sexta-feira");break;
	case 7: System.out.println("Sábado");break;
	default: System.out.println("Não é um valor válido.");break;
	}
	
	}

}
