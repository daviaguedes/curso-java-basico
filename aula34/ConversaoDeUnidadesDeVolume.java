package aula34;

public class ConversaoDeUnidadesDeVolume {
	
	private static double unidade1; 
	private static double unidade2;

	public static double litroParaCentimetro(double unidade1) {
		unidade2 = unidade1 * 1000;
		return unidade2;
	}
	
	public static double metroParaLitro(double unidade1) {
		unidade2 = unidade1 * 1000;
		return unidade2;
	}
	
	public static double metroParaPes(double unidade1) {
		unidade2 = unidade1 * 35.32;
		return unidade2;
	}
	
	public static double galaoParaPolegada(double unidade1) {
		unidade2 = unidade1 * 231;
		return unidade2;
	}
	
	public static double galaoParaLitro(double unidade1) {
		unidade2 = unidade1 * 3785;
		return unidade2;
	}
	
	
}
