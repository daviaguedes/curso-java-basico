package aula36.exercicios;

public class Curso {
	
	private String nomeCurso;
	private String horario;
	private Aluno[] alunos;
	private Professor professor;
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Aluno[] getAlunos() {
		return alunos;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public String mostrarInfo() {
		
		String info = "Nome do curso: " + nomeCurso + ";\n" +
			"Horário: " + horario + ";\n";
		if(professor != null) {
			info += professor.mostrarInfo();
		}
		if(alunos != null) {
			System.out.println("Lista de alunos: ");
			for(Aluno aluno : alunos) {
				info += aluno.mostrarInfo();
			}
		}
		
		return info;
	}
	
	public double obterMediaTurma() {
		double soma = 0;
		for(Aluno aluno : alunos) {
			if (aluno != null) {
			soma+= aluno.obterMedia();
			}
		}
		return soma/alunos.length;
	}
}
