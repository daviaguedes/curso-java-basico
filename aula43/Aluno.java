package aula43;

import java.util.Arrays;

public class Aluno {
	
	private String curso;
	private double[] notas;
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	public String obterEtiquetaEndereco() { // sobreescrita da Pessoa
		String end = "Endere?o do aluno: ";
			//	end += this.getEndereco();
		return end;
	}

	public void imprimirEtiquetaEndereco() {
		
		System.out.println(this.obterEtiquetaEndereco());
	}
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		
		if (curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		return false;
	}
	
	/*public String toString() {
		String s = curso + "\n";
		for(double nota : notas) {
			s += nota + " ";
		}
		return s;
	}*/
	
	
}
