package aula20;

import java.util.Random;

public class Exercicio02 {

	public static void main(String[] args) {

		Random numeroRandom = new Random();
		int[][] numeroAleatorio = new int[10][10];

		for(int i=0; i<numeroAleatorio.length; i++) {
			for(int j=0; j<numeroAleatorio.length; j++) {
				numeroAleatorio[i][j]= numeroRandom.nextInt(10);

			}
		}
		for(int i=0; i<numeroAleatorio.length; i++) {
			for(int j=0; j<numeroAleatorio.length; j++) {
				System.out.print(numeroAleatorio[i][j] + " ");
			}
		System.out.println();
		}
		int maiorLinha5= 0;
		int menorLinha5= 100;
		int linha5= 4;
		
		for(int j=0;j<numeroAleatorio.length;j++ ) {
			if(numeroAleatorio[linha5][j]>maiorLinha5) {
				maiorLinha5 = numeroAleatorio[linha5][j];
			}
			if(numeroAleatorio[linha5][j]<menorLinha5) {
				menorLinha5 = numeroAleatorio[linha5][j];
			}
		}
		
		int maiorColuna7= 0;
		int menorColuna7= 100;
		int coluna7= 6;
		
		for(int i=0;i<numeroAleatorio.length;i++ ) {
			if(numeroAleatorio[i][coluna7]>maiorColuna7) {
				maiorColuna7 = numeroAleatorio[i][coluna7];
			}
			if(numeroAleatorio[i][coluna7]<menorColuna7) {
				menorColuna7 = numeroAleatorio[i][coluna7];
			}
		}
		
		System.out.println("Maior da linha 5 é " + maiorLinha5);
		System.out.println("Menor da linha 5 é " + menorLinha5);
		System.out.println("Maior da coluna 7 é " + maiorColuna7);
		System.out.println("Menor da coluna 7 é " + menorColuna7);
	}

}
