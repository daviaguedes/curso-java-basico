package aula36.exercicios;

public class Aluno {

	private String nomeAluno;
	private String matricula;
	private double nota[];

	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String mostrarInfo() {
		
		String info = "Nome do aluno: " + nomeAluno + "\n" +
				"Matrícula: " + matricula + "\n" +
				"Notas: ";
		
		double soma = 0;
		
		for (double nota : nota) {
			soma += nota;
			info += nota + " ";
			
		}
		double media = soma/4;
		
		if(media>=7) {
			info += "\n" + "Está aprovado";
		}
		
		else {
			info +="\n" + "Reprovado.";
		}
		return info;
	}
	
	public double obterMedia() {
		double soma = 0;
		for (double nota : nota) {
			soma += nota;
		}
		return soma/4;
	}
	
}
