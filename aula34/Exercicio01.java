package aula34;

public class Exercicio01 {
	
	public static void imprimirValor() {
		System.out.println(Contador.obterContador());
	}

	public static void main(String[] args) {
		
		Contador.incrementar();
		imprimirValor();
		Contador.incrementar();
		imprimirValor();
		Contador.incrementar();
		imprimirValor();
		Contador.zerar();
		imprimirValor();
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		
		imprimirValor();

	}
}
