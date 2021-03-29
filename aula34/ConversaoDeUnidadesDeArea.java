package aula34;

import java.util.Scanner;

public class ConversaoDeUnidadesDeArea {
	
	private static double unidade1; 
	private static double unidade2;

	public static double metroParaPe(double unidade1) {
		unidade2 = unidade1 * 10.76;
		return unidade2;
	}
	
	public static double peParaCentimetro(double unidade1) {
		unidade2 = unidade1 * 929;
		return unidade2;
	}
	
	public static double milhaParaAcre(double unidade1) {
		unidade2 = unidade1 * 640;
		return unidade2;
	}
	
	public static double acreParaPe(double unidade1) {
		unidade2 = unidade1 * 43560;
		return unidade2;
	}
	
	
}