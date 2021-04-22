package aula48;

public class MultiplosCatchGenerico {
	
	public static void main(String[] args) {


		int[] numerador = {10, 2, 5 , 4};
		int[] denominador = {0, 2 , 0};

		for(int i = 0; i<numerador.length; i++) {
			try{
				System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i]/denominador[i]));
			}
			catch(ArithmeticException e1) {
				System.out.println("Erro de divisão por 0.");
			}
			catch(Throwable e1) { //Throwable para exception genérica, não é boa prática. 
				System.out.println("Ocorreu um erro.");
			}
		}
	}


}
