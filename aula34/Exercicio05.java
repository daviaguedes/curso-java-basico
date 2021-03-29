package aula34;

public class Exercicio05 {

	public static void imprimirTela(double num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		imprimirTela(ConversaoDeUnidadesDeVolume.litroParaCentimetro(5));
		imprimirTela(ConversaoDeUnidadesDeVolume.metroParaLitro(2));
		imprimirTela(ConversaoDeUnidadesDeVolume.metroParaPes(3));
		imprimirTela(ConversaoDeUnidadesDeVolume.galaoParaPolegada(2));
		imprimirTela(ConversaoDeUnidadesDeVolume.galaoParaLitro(2));
		
	}
}
