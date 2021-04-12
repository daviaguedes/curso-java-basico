package aula36.exercicios;

public class Agenda {
	
	private String nomeAgenda;
	private Contato[] contatos;
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	public Agenda() { }
	
	public String mostrarContato() {
		String nome = "Nome da agenda: " + nomeAgenda  + "\n" ;
		if(contatos != null) {
			for(Contato c : contatos ) {
				nome += c.mostrarContato();
			}
		}
		return nome;
	}

}
