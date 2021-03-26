package aula27;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Aluno alunos = new Aluno();
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		alunos.nome = scan.nextLine();

		System.out.println("Digite a matrícula: ");
		alunos.matricula = scan.nextLine();

		System.out.println("Digite o nome do curso: ");
		alunos.curso = scan.nextLine();

		alunos.disciplinas = new String[3];

		for(int i = 0; i<alunos.disciplinas.length; i++) {
			System.out.println("Digite o nome da disciplina " + (1+i));
			alunos.disciplinas[i] = scan.nextLine();
		}
		
		alunos.nota = new Double[3][4];
		for(int i = 0; i<alunos.nota.length; i++) {
			for (int j = 0; j<alunos.nota[i].length; j++) {
				System.out.println("Digite a nota " + (1+j) + " da disciplina " + alunos.disciplinas[i]);
				alunos.nota[i][j] = scan.nextDouble();
			}

		}
		
		alunos.verificarAprovacao(1);
		alunos.verificarAprovacao(2);
		alunos.verificarAprovacao(3);
	}

}
