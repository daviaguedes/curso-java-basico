package aula48;

public class MultiplosCatchJava7 {

	public static void main(String[] args) {


		int[] numerador = {10, 2, 5 , 4};
		int[] denominador = {0, 2 , 0};

		for(int i = 0; i<numerador.length; i++) {
			try{
				System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i]/denominador[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e1) {
				System.out.println("Ocorreu um erro.");
			}
		}
	}


}
