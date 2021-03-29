package aula34;

public class ConversaoDeUnidadeDeTempo {

	private static double unidade1; 
	private static double unidade2;

	public static double minutoParaSegundo(double unidade1) {
		unidade2 = unidade1 * 60;
		return unidade2;
	}
	
	public static double horaParaMinuto(double unidade1) {
		unidade2 = unidade1 * 60;
		return unidade2;
	}
	
	public static double diaParaHoras(double unidade1) {
		unidade2 = unidade1 * 24;
		return unidade2;
	}
	
	public static double semanaParaDias(double unidade1) {
		unidade2 = unidade1 * 7;
		return unidade2;
	}
	
	public static double mesParaDias(double unidade1) {
		unidade2 = unidade1 * 30;
		return unidade2;
	}
	
	public static double anoParaDias(double unidade1) {
		unidade2 = unidade1 * 365.25;
		return unidade2;
	}

}
