package aula50;

public class ExceptionGenerica {

	public static void main(String[] args) {

		int[] numerador = {10, 2, 5 , 4};
		int[] denominador = {0, 2 , 0};

		for(int i = 0; i<numerador.length; i++) {
			try{
				System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i]/denominador[i]));
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
