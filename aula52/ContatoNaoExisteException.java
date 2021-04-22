package aula52;

public class ContatoNaoExisteException extends Exception{
	
	public String getMessage() {
		
		return "Esse contato não existe."; 
	}

}
