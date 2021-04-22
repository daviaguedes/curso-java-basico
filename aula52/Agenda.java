package aula52;

public class Agenda {
	
	private Contato[] contatos;

	public Agenda() {
		contatos = new Contato[5];
	}

	public Contato[] getContatos() {
		return contatos;
	}
	
	public void adicionarContato(Contato c) throws AgendaCheiaException {
		
		boolean cheia = true;
		for(int i = 0; i<contatos.length; i++) {
			if(contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		
		if(cheia) {
			throw new AgendaCheiaException();
			
		}
		
	}
	
	public int consultarContato(String nome) throws ContatoNaoExisteException {
		
		for(int i=0; i<contatos.length; i++) {
			if(contatos[i] != null) {
				if(contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
			}
		}
		throw new ContatoNaoExisteException();
	}

	public String toString() {
		String info = null;
		for(Contato c : contatos) {
			if(c !=null) {
				info = c.toString() + "\n";
			}
		}
		return info;
		
		
	}
	
	
	
}
