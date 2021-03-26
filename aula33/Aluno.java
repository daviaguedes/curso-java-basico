package aula33;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private String disciplinas[];
	private Double[][] nota;
	
	public Aluno() { 
		disciplinas = new String [3];
		nota = new Double [3][4];
	}

	public Aluno(String nome, String matricula, String curso, String[] disciplinas, Double[][] nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.nota = nota;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Double[][] getNota() {
		return nota;
	}

	public void setNota(Double[][] nota) {
		this.nota = nota;
	}

	public void mostrarInfo() {
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
	
	public void verificarAprovacao(int indice) {
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
	public void setNomeDisciplinaPos(int pos, String disciplina){
		this.disciplinas[pos] = disciplina;
	}
	
	public void setNota(int posI, int posJ, Double nota) {
		this.getNota()[posI][posJ] = nota;
	}
}
