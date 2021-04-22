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
			if(contatos[i] != null) {
				contatos[i] = c;
				cheia = false;
			}
		}
		
		if(cheia) {
			throw new AgendaCheiaException();
			
		}
		
	}
	
	public void consultarContato(Contato c[], int id) throws ContatoNaoExisteException {

		if(c[id] != null) {
		System.out.println(c[id].toString());
		}
		else {
			throw new ContatoNaoExisteException();
		}
	}
	
	
	
}
