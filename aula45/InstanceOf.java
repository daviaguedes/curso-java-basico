package aula45;

public class InstanceOf {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Pessoa pessoa = new Pessoa();
		
		if(aluno instanceof Aluno) {
			System.out.println("Verdadeiro");
		}
		
		if(professor instanceof Professor) {
			System.out.println("Verdadeiro");
		}
		
		if(pessoa instanceof Pessoa) {
			System.out.println("Verdadeiro");
		}
		
	}

}
