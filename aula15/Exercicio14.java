package aula15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o valor da primeira nota: ");
	double nota1 = scan.nextDouble();
	
	System.out.println("Digite o valor da segunda nota: ");
	double nota2 = scan.nextDouble();
	
	double media = (nota1 + nota2)/2;
	
	if(media >= 9 && media <10){
		System.out.println("As notas são: " + nota1 + " e " + nota2);
		System.out.println("A média é:" + media);
		System.out.println("Conceito A");
		System.out.println("APROVADO ");
		
	}
	
	else if(media >= 7.5 && media <9){
		System.out.println("As notas são: " + nota1 + " e " + nota2);
		System.out.println("A média é:" + media);
		System.out.println("Conceito B");
		System.out.println("APROVADO ");
	}
	else if(media >= 6 && media <7.5){
		System.out.println("As notas são: " + nota1 + " e " + nota2);
		System.out.println("A média é:" + media);
		System.out.println("Conceito C");
		System.out.println("APROVADO ");
	}
	else if(media >= 4 && media <6){
		System.out.println("As notas são: " + nota1 + " e " + nota2);
		System.out.println("A média é:" + media);
		System.out.println("Conceito D");
		System.out.println("REPROVADO ");
	}
	else if(media >= 0 && media <4){
		System.out.println("As notas são: " + nota1 + " e " + nota2);
		System.out.println("A média é:" + media);
		System.out.println("Conceito E");
		System.out.println("REPROVADO ");
	}
	else {
		System.out.println("O valor está incorreto.");
	}

}
	}
