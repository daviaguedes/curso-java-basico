package aula34;

public class Exercicio02 {
	
	public static void imprimirTela(int num) {
		System.out.println(num);
	}

	public static void main(String[] args) {

		imprimirTela(Calculadora.potenciar(2, 3));
		imprimirTela(Calculadora.somar(2, 5));
		imprimirTela(Calculadora.dividir(21, 3));
		imprimirTela(Calculadora.fatorial(5));
	}

}
