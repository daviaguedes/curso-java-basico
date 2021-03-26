package aula17;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o número que deseja saber a tabuada: ");
	int numero = scan.nextInt();
	
	boolean invalido = true;
	int de, ate;
	
	do {
		System.out.println("Digite a partir de qual número deve começar: ");
		de = scan.nextInt();
		System.out.println("Digite até qual número deve ser feita: ");
		ate = scan.nextInt();	
		
		if(ate>de) {
		
			invalido = false;
		}
	} while(invalido);
	
	System.out.println("Tabuada do " + numero + " começando em " + de + " terminando em " + ate);
	for(int i = de; i<=ate; i++) {
		System.out.println(numero + " X " + i + " = " + (numero*i));
	}
	
	}

}
