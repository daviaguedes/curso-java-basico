package aula43.exercicios;

public class Exercicio03 {

	public static void main(String[] args) {

		Mamifero camelo = new Mamifero();
		camelo.setNome("Camelo");
		camelo.setComprimento("150 cm");
		camelo.setCor("Amarelo");
		camelo.setVelocidade("2.0 m/s");

		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento("300 cm");
		tubarao.setVelocidade("1.5 m/s");
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-canadá");
		urso.setComprimento("180 cm");
		urso.setCor("Vermelho");
		urso.setVelocidade("5.0 m/s");
		urso.setAlimento("Mel");
		
		System.out.println(camelo);
		System.out.println(tubarao);
		System.out.println(urso);
	}

}
