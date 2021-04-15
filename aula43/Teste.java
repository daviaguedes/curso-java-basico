package aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Engenharia de Produção");
		double[] notas = {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "adgsaudas";
		String s2 = "adgsaudas";
		
		System.out.println(s1.equals(s2)); // true
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Engenharia de Produção");
		double[] notas2 = {1, 2, 3, 4};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno == aluno2); // false
		System.out.println(aluno.equals(aluno2)); // true
		
	}

}
