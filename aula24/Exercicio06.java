package aula24;

public class Exercicio06 {

	public static void main(String[] args) {

		Agenda contatos = new Agenda();
		
		contatos.nome = new String[200];
		contatos.nome[0]= "Davi";
		contatos.numero = 989331032;	
		
		 System.out.println(contatos.numero);
		 System.out.println(contatos.nome[0]);
		 
	}

}
