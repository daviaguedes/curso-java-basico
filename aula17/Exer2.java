package aula17;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean igual = false;
		
		do {
			
			System.out.println("Digite o usu�rio: ");
			String usuario = scan.next();
		
			System.out.println("Digite a senha: ");
			String senha = scan.next();
			
			if (usuario.equalsIgnoreCase(senha)) {
				System.out.println("Usu�rio e senha n�o podem ser iguais, digite novamente.");
				}
			else {
				igual = true;
				System.out.println("Usu�rio e senha v�lidos.");

			}
			
													
		} while(!igual);

	}

}
