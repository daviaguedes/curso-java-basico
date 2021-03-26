package aula15;

import java.util.Scanner;

public class exercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 'M' para Matutinho, 'V' para Vespertino ou 'N' para Noturno: ");
		String tempo = scan.next();
		
		switch (tempo) {
		case "M": case"m": System.out.println("Bom dia!");break;
		case "V": case"v": System.out.println("Boa tarde!");break;
		case "N": case"n": System.out.println("Boa noite!");break;
		default: System.out.println("Digite uma letra válida.");
		}
		
		
}
	}
