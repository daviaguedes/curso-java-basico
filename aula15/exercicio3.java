package aula15;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
				
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Digite a letra: ");
		
		String letra = scan.next();
		
		if(letra.length() > 1) {
			System.out.println("N�o � uma letra v�lida.");
		} else {
		switch (letra) {
		case "a": case "A": System.out.println("� uma vogal.");break;
		case "e": case "E": System.out.println("� uma vogal.");break;
		case "i": case "I": System.out.println("� uma vogal.");break;
		case "o": case "O": System.out.println("� uma vogal.");break;
		case "u": case "U": System.out.println("� uma vogal.");break;
		default: System.out.println("� uma consoante.");break;
		}
		}
	
}
}