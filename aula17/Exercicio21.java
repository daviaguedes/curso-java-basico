package aula17;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o número de turmas");
	int numTurmas = scan.nextInt();
	int alunos, media = 0;
	
	for (int i = 0 ; i< numTurmas ; i++ ) {
	System.out.println("Digite a quantidade de alunos da turma " + (i+1));
	alunos = scan.nextInt();
	
	if(alunos > 40) {
		System.out.println("A turma não pode ter mais que 40 alunos.");
		i--;
	}
	media = media + alunos;
	}
	media = media/numTurmas;
	System.out.println("O número médio de alunos por sala é " + media);
	}

}
