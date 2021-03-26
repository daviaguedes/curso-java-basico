package aula33;

public class Lampada {
	
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMes;
	private String[] tipos; 
	private boolean ligada;
	

	public Lampada() { }
	
	public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMes,
			String[] tipos, boolean ligada) {
		this.modelo = modelo;
		this.tensao = tensao;
		this.potencia = potencia;
		this.cor = cor;
		this.tipoLuz = tipoLuz;
		this.garantiaMes = garantiaMes;
		this.tipos = tipos;
		this.ligada = ligada;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public int getGarantiaMes() {
		return garantiaMes;
	}
	public void setGarantiaMes(int garantiaMes) {
		this.garantiaMes = garantiaMes;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligar() {
		setLigada(true);
		
	}
	public void desligar() {
		setLigada(false);
	}
	
	public void verificarEstado() {
		if(isLigada()) {
			System.out.println("A lâmpada está ligada.");
		}
		else {
			System.out.println("A lâmpada está desligada.");
		}
	}
}
