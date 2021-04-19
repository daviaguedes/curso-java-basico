package aula46;

public class Cubo extends Figura3D {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularVolume() {
		return Math.pow(lado, 3);
	}

	public double calcularArea() {
		return Math.pow(lado, 2);
	}

}
