package aula24;

public class Exercicio04 {

	public static void main(String[] args) {

		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.leitorEmprestado = new String[10];
		livro.leitorEmprestado[0] = "Davi Guedes";
		
		System.out.println(livro.leitorEmprestado[0]);
	}

}
