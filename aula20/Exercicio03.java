package aula20;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[][] numeros = new int[3][3];
		
		for(int i=0; i<numeros.length; i++) {
			for(int j=0; j<numeros[i].length; j++) {
				System.out.println("Digite o valor da posição [" + i + "," + j +"]");
				numeros[i][j]= scan.nextInt();
			}
		}
		int numerosPares = 0;
		int numerosImpares = 0;
		
		for(int i=0; i<numeros.length; i++) {
			for(int j=0; j<numeros[i].length; j++) {
				if(numeros[i][j]%2==0) {
					numerosPares = numerosPares + 1;
				}
				else {
					numerosImpares = numerosImpares +1;
				}
				
			}
			
		}
		System.out.println("A quantidade de números pares é: " + numerosPares);
		System.out.println("A quantidade de números ímpares é: " + numerosImpares);
	}

}
