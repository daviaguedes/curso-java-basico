package aula34;

public class Exercicio04 {

	public static void imprimirTela (double num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {

		imprimirTela(ConversaoDeUnidadesDeArea.metroParaPe(2));
		imprimirTela(ConversaoDeUnidadesDeArea.peParaCentimetro(2));
		imprimirTela(ConversaoDeUnidadesDeArea.milhaParaAcre(2));
		imprimirTela(ConversaoDeUnidadesDeArea.acreParaPe(2));
	}

}
