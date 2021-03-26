package aula24;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.autor = "J.K Rowling";
		livro.editora = new String[4];
		livro.editora[0] = "Rocco";
		livro.genero = new String [5];
		livro.genero[0] = "Fantasia";
		livro.idioma = new String[5];
		livro.idioma[0] = "Português";
		
		System.out.println(livro.autor);
		System.out.println(livro.editora[0]);
		System.out.println(livro.genero[0]);
		System.out.println(livro.idioma[0]);
		

	}

}
