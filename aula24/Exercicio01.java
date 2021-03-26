package aula24;

public class Exercicio01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.modelo = "Kien";
		lampada.cor = "Branco";
		lampada.potencia = 20;
		lampada.tensao = "Bivolt";
		lampada.tipos = new String[2];
		lampada.tipos[0] = "Abajur";
		
		System.out.println(lampada.modelo);
		System.out.println(lampada.cor);
		System.out.println(lampada.potencia);
		System.out.println(lampada.tensao);
		System.out.println(lampada.tipos[0]);
	}

}
