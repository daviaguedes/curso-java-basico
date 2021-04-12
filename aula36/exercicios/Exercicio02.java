package aula36.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o nome do curso: ");
		String nome = scan.nextLine();
		
		System.out.println("Digite o horário do curso: ");
		String horario = scan.nextLine();
		 
		System.out.println("Digite o nome do professor: ");
		String nomeProf = scan.nextLine();

		System.out.println("Digite o departamento do professor: ");
		String dep = scan.nextLine();
		

		System.out.println("Digite o email do professor: ");
		String emailProf = scan.nextLine();
		
		Curso curso = new Curso();
		curso.setNomeCurso(nome);
		curso.setHorario(horario);
		
		Professor professor = new Professor();
		professor.setNomeProfessor(nomeProf);
		professor.setDepartamento(dep);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		Aluno[] alunos = new Aluno[5];
	
		
		for(int i = 0 ; i<alunos.length ; i++) {
			
			String nomeAluno;
			String matAluno;
			
			scan.nextLine();
			
			System.out.println("Digite o nome do aluno " +(i+1) + ":");
			nomeAluno = scan.nextLine();
			System.out.println("Digite a matrícula do aluno " +(i+1) + ":");
			matAluno = scan.nextLine();
			
			double notas[] = new double[4];
			
			for(int j = 0 ; j<4; j++ ) {
				System.out.println("Digite a nota " + (j+1) + ":");
				notas[j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNomeAluno(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNota(notas);
			alunos[i] = aluno;
		}
		curso.setAlunos(alunos);
		System.out.println(curso.mostrarInfo());

	}
	
}
