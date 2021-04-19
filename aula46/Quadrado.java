package aula46;

public class Quadrado extends Figura2D {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public double calcularArea() {
		return Math.pow(lado, 2);
	}

}
