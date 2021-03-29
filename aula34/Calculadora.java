package aula34;

public class Calculadora {
	
	private static int um;
	private static int dois;
	private static int potencia=1;
	private static int resultado;
	
	public Calculadora() {	}

	public static int somar(int um, int dois) {
		resultado = um + dois;
		return resultado;
	}
	
	public static int subtrair(int um, int dois) {
		resultado = um - dois;
		return resultado;
	}
	
	public static int multiplicar(int um, int dois) {
		resultado = um * dois;
		return resultado;
	}
	
	public static int potenciar(int um, int dois) {
		potencia = um;
		for (int i=1; i<dois; i++) {
		um = um * potencia; 
		
		}
		return um;
	}
}
