package aula27;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMes;
	String[] tipos; 
	boolean ligada;
	
	void ligar() {
		ligada = true;
		
	}
	void desligar() {
		ligada = false;
	}

	void verificarEstado() {
		if(ligada) {
			System.out.println("A lâmpada está ligada.");
		}
		else {
			System.out.println("A lâmpada está desligada.");
		}
	}
}
