package aula43.exercicios;

import java.util.Scanner;

public class Exercicio02Alternativo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		PessoaFisica[] pessoasFisica = new PessoaFisica[3];
		
		for(int i = 0; i<pessoasFisica.length; i++) {
			
			PessoaFisica pessoaFisica = new PessoaFisica();
			
			scan.nextLine();
			
			System.out.println("Digite seu nome: ");
			pessoaFisica.setNome(scan.nextLine());
			System.out.println("Digite seu CPF: ");
			pessoaFisica.setCpf(scan.nextLine());
			System.out.println("Digite sua renda: ");
			pessoaFisica.setRendaBruta(scan.nextDouble());
			
			pessoasFisica[i]= pessoaFisica;
		}
		
		System.out.println("Metodo for: " + "\n");
		for (PessoaFisica p : pessoasFisica) {
			System.out.println(p.toString());
			
		}

	}

}
