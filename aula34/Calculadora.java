package aula34;

public class Calculadora {
	
	private static int um;
	private static int dois;
	private static int potencia=1;
	
	public Calculadora() {	}

	public static int somar(int um, int dois) {
		return um + dois;
	}
	
	public static int subtrair(int um, int dois) {
		return um - dois;
	}
	
	public static int multiplicar(int um, int dois) {
		return um *dois;
	}
	
	public static int dividir(int um, int dois) {
		return um / dois;
	}
	
	public static int potenciar(int um, int dois) {
		potencia = um;
		for (int i=1; i<dois; i++) {
		um *= potencia; 
		}
		return um;
	}
	
	public static int fatorial(int num) {
		int fatorial = 1;
		for(int i = num; i>=2; i--) {
			fatorial *=i;
		}
		return fatorial;
	}
}
