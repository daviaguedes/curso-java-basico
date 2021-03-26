package aula27;

public class Exercicio01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.ligada = false;
		lampada.verificarEstado();
		lampada.ligar();
		lampada.verificarEstado();
		lampada.desligar();
		lampada.verificarEstado();
	}

}
