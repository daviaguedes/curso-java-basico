package aula20;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int[][] tabuleiro = new int[3][3];
		boolean ganhou = false;
		int jogador = 1;
		char sinal;
		int linha=0;
		int coluna=0;
		System.out.println("Jogador 1 = \"X\"");
		System.out.println("Jogador 2 = \"O\"");

		while(!ganhou) {
			if(jogador%2==1) {
				System.out.println("Vez do jogador 1.");
				sinal = 'X';

			}
			else {
				System.out.println("Vez do jogador 2.");
				sinal = 'O';
			}
			boolean linhaValida = false;
			while(!linhaValida) {
				System.out.println("Escolha uma linha (1-3)");
				linha= scan.nextInt();
				if(linha>=1 && linha<=3) {
					linhaValida = true;
				}
				else {
					System.out.println("Digite um número válido.");
				}

			}
			boolean colunaValida = false;
			while(!colunaValida) {
				System.out.println("Escolha uma coluna (1-3)");
				coluna= scan.nextInt();
				if(coluna>=1 && coluna<=3) {
					colunaValida = true;
				}
				else {
					System.out.println("Digite um número válido.");
				}
			}
			linha--;
			coluna--;
			if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O' ) {
				System.out.println("Posição já usada, tente novamente.");
			}
			else {
				tabuleiro[linha][coluna] = sinal;
				jogador++;
			}
			for(int i = 0; i<tabuleiro.length; i++) {
				for(int j = 0; j<tabuleiro[i].length; j++) {
					System.out.print(tabuleiro[i][j] + " | ");

				}
				System.out.println();
			}

			if(tabuleiro[0][0] == 'X' && tabuleiro[0][1]== 'X'  && tabuleiro[0][2]== 'X' ||
					tabuleiro[1][0] == 'X' && tabuleiro[1][1]== 'X'  && tabuleiro[1][2]== 'X' ||
					tabuleiro[2][0] == 'X' && tabuleiro[2][1]== 'X'  && tabuleiro[2][2]== 'X' ||
					tabuleiro[0][0] == 'X' && tabuleiro[1][0]== 'X'  && tabuleiro[2][0]== 'X' ||
					tabuleiro[0][1] == 'X' && tabuleiro[1][1]== 'X'  && tabuleiro[2][1]== 'X' ||
					tabuleiro[0][2] == 'X' && tabuleiro[1][2]== 'X'  && tabuleiro[2][2]== 'X' ||
					tabuleiro[0][0] == 'X' && tabuleiro[1][1]== 'X'  && tabuleiro[2][2]== 'X' ||
					tabuleiro[0][2] == 'X' && tabuleiro[1][1]== 'X'  && tabuleiro[2][0]== 'X' ) {
				System.out.println("Parabéns, o jogador 1 ganhou.");
				ganhou = true;
			}
			else if(tabuleiro[0][0] == 'O' && tabuleiro[0][1]== 'O'  && tabuleiro[0][2]== 'O' ||
					tabuleiro[1][0] == 'O' && tabuleiro[1][1]== 'O'  && tabuleiro[1][2]== 'O' ||
					tabuleiro[2][0] == 'O' && tabuleiro[2][1]== 'O'  && tabuleiro[2][2]== 'O' ||
					tabuleiro[0][0] == 'O' && tabuleiro[1][0]== 'O'  && tabuleiro[2][0]== 'O' ||
					tabuleiro[0][1] == 'O' && tabuleiro[1][1]== 'O'  && tabuleiro[2][1]== 'O' ||
					tabuleiro[0][2] == 'O' && tabuleiro[1][2]== 'O'  && tabuleiro[2][2]== 'O' ||
					tabuleiro[0][0] == 'O' && tabuleiro[1][1]== 'O'  && tabuleiro[2][2]== 'O' ||
					tabuleiro[0][2] == 'O' && tabuleiro[1][1]== 'O'  && tabuleiro[2][0]== 'O' ) {
				System.out.println("Parabéns, o jogador 1 ganhou.");
				ganhou = true;

			}
			else if (jogador > 9) {
				System.out.println("Deu velha.");
				ganhou= true;
			}

		}

	}
}