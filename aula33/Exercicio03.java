package aula33;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome:");
		aluno.setNome(scan.nextLine());
		
		System.out.println("Digite a matricula:");
		aluno.setMatricula(scan.nextLine());
		
		System.out.println("Digite o nome do curso:");
		aluno.setCurso(scan.nextLine());
		
		for(int i = 0; i<aluno.getDisciplinas().length; i++) {
			System.out.println("Digite o nome da disciplina " + (1+i));
			aluno.setNomeDisciplinaPos(i, scan.nextLine());
			
		}
		
		for(int i = 0; i<aluno.getNota().length; i++) {
			for (int j = 0; j<aluno.getNota()[i].length; j++) {
				System.out.println("Digite a nota " + (1+j) + " da disciplina " + aluno.getDisciplinas()[i]);
				aluno.setNota(i, j, scan.nextDouble());
			}

		}
		
		aluno.verificarAprovacao(1);
		aluno.verificarAprovacao(2);
		aluno.verificarAprovacao(3);

	}

}
