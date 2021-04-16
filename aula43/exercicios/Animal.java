package aula43.exercicios;


public abstract class Animal {
	
	private String nome;
	private String comprimento;
	private int patas;
	private String cor;
	private String ambiente;
	private String velocidade;
	
	public Animal() {
	this.setPatas(4);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComprimento() {
		return comprimento;
	}

	public void setComprimento(String comprimento) {
		this.comprimento = comprimento;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}

	public String toString() {
		String info = "Zoo:\n";
		info+= "Animal: " + nome + "\n";
		info+= "Comprimento: " + comprimento + "\n" ;
		info+= "Patas: " + patas + "\n";
		info+= "Cor: " +cor + "\n";
		info+= "Ambiente: " + ambiente + "\n";
		info+= "Velocidade: " + velocidade +"\n";
		return info;
	}
	
	

}
