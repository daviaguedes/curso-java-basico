package aula52;

public class Contato {
	
	private static int contador = 0;
	private String nome;
	private String telefone;
	private String email;
	private int identificador;
	
	
	
	public Contato() {
		contador++;
		identificador = contador;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String toString() {
		
		String info = " --- Contato " + identificador + " ---\n";
		info += "Nome: " + nome + "\n";
		info += "Telefone: " + telefone + "\n";
		info += "E-mail: " + email + "\n";
		
		return info;
	}
	
	

}
