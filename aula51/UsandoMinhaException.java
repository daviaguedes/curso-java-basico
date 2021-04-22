package aula51;

public class UsandoMinhaException {

	public static void main(String[] args) {

		
		int[] numerador = {4, 8, 5, 16, 32, 21 , 64, 128};
		int[] denominador = {2 , 0, 4 , 8, 0, 2, 4};
		
		for(int i = 0; i<numerador.length; i++) {
			try{
				if(numerador[i]%2 != 0 ) {
				throw new DivisaoNaoExata(numerador[i], denominador[i]);	
				}
			System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i]/denominador[i]));
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
			System.out.println("Aconteceu um erro.");
			e.printStackTrace();
		}

		}
	}

}
