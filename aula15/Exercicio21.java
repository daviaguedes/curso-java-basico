package aula15;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Para realizar a compra, digite \"�lcool\" ou \"Gasolina\": ") ;

		String alcoolGasolina = scan.next();
		double alcoolFinal;
		double gasolinaFinal;
		double pre�oAlcool =1.90;
		double pre�oGasolina =2.50;
		
		if (alcoolGasolina.equalsIgnoreCase("�lcool" ) || alcoolGasolina.contentEquals("alcool")) {
			
			System.out.println("Digite a quantidade de litros de �lcool: ");
			int litrosAlcool = scan.nextInt();
			
			if (litrosAlcool <= 20 && litrosAlcool > 0) {
				alcoolFinal = (pre�oAlcool * 0.97 * litrosAlcool);
				System.out.println("O valor para ser pago �: "+ alcoolFinal) ;
			}
				else if (litrosAlcool > 20){
				alcoolFinal = (pre�oAlcool * 0.95 * litrosAlcool);
				System.out.println("O valor para ser pago �: "+ alcoolFinal) ;
				}
			else {
				System.out.println("Digite um valor a partir de \"0\"");
			}
		}
			
		else if (alcoolGasolina.equalsIgnoreCase("Gasolina")) {
			System.out.println("Digite a quantidade de litros de gasolina: ");
			int litrosGasolina = scan.nextInt();
			
			if (litrosGasolina <= 20 && litrosGasolina > 0) {
				gasolinaFinal = (pre�oGasolina * 0.97 * litrosGasolina);
				System.out.println("O valor para ser pago �: "+ gasolinaFinal) ;
			}
				else if (litrosGasolina > 20){
				gasolinaFinal = (pre�oGasolina * 0.95 * litrosGasolina);
				System.out.println("O valor para ser pago �: "+ gasolinaFinal) ;

				}
			else {
				System.out.println("Digite um valor a partir de \"0\"");
			}
		}
	}
}
