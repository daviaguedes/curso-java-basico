package aula43.exercicios;

public class Mamifero extends Animal {
	
	private String alimento;

	public Mamifero() {
		this.setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String toString() {
		String info = super.toString();
		info+= "Alimento: " + alimento + "\n";
		return info;
	}


}
