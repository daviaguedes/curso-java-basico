package aula42;

public class Professor {
	
	private double salario;
	private String nomeCurso;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() { //sobreescrita da Pessoa
		return 0;
	}
	public String obterEtiquetaEndereco() {
		String end = "Endere�o do professor: ";
			//	end += this.getEndereco();
		return end;
	}
	
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());	
	}
	
}
