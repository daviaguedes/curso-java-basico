package aula17;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o n�mero que deseja saber a tabuada: ");
	int numero = scan.nextInt();
	
	boolean invalido = true;
	int de, ate;
	
	do {
		System.out.println("Digite a partir de qual n�mero deve come�ar: ");
		de = scan.nextInt();
		System.out.println("Digite at� qual n�mero deve ser feita: ");
		ate = scan.nextInt();	
		
		if(ate>de) {
		
			invalido = false;
		}
	} while(invalido);
	
	System.out.println("Tabuada do " + numero + " come�ando em " + de + " terminando em " + ate);
	for(int i = de; i<=ate; i++) {
		System.out.println(numero + " X " + i + " = " + (numero*i));
	}
	
	}

}
