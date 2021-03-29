package aula34;

public class Exercicio06 {
	
	public static void imprimirTela(double num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		imprimirTela(ConversaoDeUnidadeDeTempo.minutoParaSegundo(3));
		imprimirTela(ConversaoDeUnidadeDeTempo.horaParaMinuto(4));
		imprimirTela(ConversaoDeUnidadeDeTempo.diaParaHoras(5));
		imprimirTela(ConversaoDeUnidadeDeTempo.semanaParaDias(5));
		imprimirTela(ConversaoDeUnidadeDeTempo.mesParaDias(10));
		imprimirTela(ConversaoDeUnidadeDeTempo.anoParaDias(2));
	}

}
