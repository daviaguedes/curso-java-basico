package aula47;

public class TryCatch {

	public static void main(String[] args) {
	
		int[] teste = new int[4];
		
		try {
		teste[4]= 5; //ArrayIndexOutOfBoundsException
		System.out.println("N�o ser� executado");
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Executado");
		}
		

	}

}
