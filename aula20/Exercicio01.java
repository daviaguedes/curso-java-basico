package aula20novamente;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
	
		int [][] numerosAleatorios = new int [4][4];
		int maior= Integer.MIN_VALUE, menor=Integer.MAX_VALUE, linha=0, coluna = 0;
		int linhaMaior =0, colunaMaior=0, linhaMenor=0, colunaMenor=0;
		
		Random numeroRandom = new Random();
		
		for( int i = 0; i<numerosAleatorios.length; i++) {
			for (int j = 0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				System.out.print(numerosAleatorios[i][j] + " ");
				if(numerosAleatorios[i][j]>maior) {
					maior = numerosAleatorios[i][j];
					linhaMaior = i;
					colunaMaior =j;
					
				}
				if(numerosAleatorios[i][j]<menor) {
					menor = numerosAleatorios[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}
			}
			System.out.println();
		}
		System.out.println("O maior número é: " + maior + " e está na linha " + (linhaMaior + 1) + " e coluna " + (colunaMaior +1) );
		System.out.println("O maior número é: " + menor + " e está na linha " + (linhaMenor + 1) + " e coluna " + (colunaMenor +1) );
	}

}
