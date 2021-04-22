package aula51;

public class DivisaoNaoExata extends Exception {
	
	private int numerador;
	private int denominador;
	
	public DivisaoNaoExata(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public String toString() {
		return "Resultado de " + numerador + "/" + denominador + " não é um inteiro.";
	}
	
	

}
