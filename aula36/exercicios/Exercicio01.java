package aula36.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o nome da agenda");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda();
		agenda.setNomeAgenda(nome);
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0 ; i<3; i++) {
			
			System.out.println("Digite o nome do contato " + (i+1) + ":");
			Contato c = new Contato();
			nome = scan.nextLine();
			c.setNomeContato(nome);
			
			System.out.println("Digite o telefone:");
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Digite o email:");
			String email = scan.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);
	
	
	if(agenda != null) {
		
		System.out.println(agenda.mostrarContato());
	}
	
	}

}
