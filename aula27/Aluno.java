package aula27;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String disciplinas[];
	Double[][] nota;

	void mostrarInfo() {
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Curso: " + curso);
		System.out.println();
		
		for(int i = 0; i<nota.length; i++) {
			System.out.println("Exibindo as notas da disciplina " + disciplinas[i]);
			for(int j = 0; j<nota[i].length; j++) {
				System.out.println("Nota " + (j+1) + ": " + nota[i][j] );
				
			}
			System.out.println();
		}
	}
	
	void verificarAprovacao(int indice) {
		indice--;
		double soma = 0;
		for(int i = 0; i<nota[indice].length; i++) {
			soma += nota[indice][i];
			
		}
		double media = soma/4;
		
		if(media>=7) {
			System.out.println("Aluno aprovado na disciplina " +(indice + 1));
		}
		else {
			System.out.println("Aluno reprovado na disciplina " +(indice + 1));
		}
	}
}