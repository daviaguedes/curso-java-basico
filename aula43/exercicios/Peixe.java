package aula43.exercicios;

public class Peixe extends Animal {
	
	private String caracteristicas;

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String adicionarAnimal() {
		return null;
	}

	public Peixe() {
		this.setPatas(0);
		this.setCaracteristicas("Barbatanas e cauda");
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
	}
	
	

}
