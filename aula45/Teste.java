package aula45;

public class Teste {

	public static void main(String[] args) {
		
		//ex1: ok
		//retorno do m�todo pode referenciar String
		Object o1= obterString();
		String s1=(String) o1;

		//ex2: ok
		// o2 referencia String explicitamente
		Object o2= "Curso de Java";
		String s2= (String) o2;
		
		//ex3: falha
		//o3 n�o referencia String
		Object o3 = new Object();
		String s3 = (String) o3;
		
		//ex4: falha
		//o4 nunca referencia String j� que retorno do m�todo � int
		Integer o4; obterInteiro();
		//String s4= (String) o4;
	}

	public static String obterString() {
		return "Minha String";
	}
	
	public static int obterInteiro() {
		return 1;
	}
}
