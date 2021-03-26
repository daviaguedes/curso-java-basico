package aula17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double salario = 1000, percentual = 0.015;

		for (int i = 1996; i<= 2021; i++) {
						
				salario = salario * ( 1+ percentual);
				percentual = percentual * 2;
				
				
			System.out.println("O salário no ano " + i + "é " + "R$ " + salario);
		}
	}

}
