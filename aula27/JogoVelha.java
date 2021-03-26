package aula27;

public class JogoVelha {

	int[][] tabuleiro = new int[3][3];
	int jogador = 1;

	boolean validarJogada(int linha, int coluna, char sinal) {

		if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O' ) {
			return false;
		}
		else {
			tabuleiro[linha][coluna] = sinal;
			jogador++;
			return true;
		}
	}
	
	void imprimirTabuleiro() {
		for(int i = 0; i<tabuleiro.length; i++) {
			for(int j = 0; j<tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " | ");

			}
			System.out.println();
		}
	}

	boolean verificarGanhador(char sinal) {

		if(tabuleiro[0][0] == sinal && tabuleiro[0][1]== sinal  && tabuleiro[0][2]== sinal ||
				tabuleiro[1][0] == sinal && tabuleiro[1][1]== sinal  && tabuleiro[1][2]== sinal ||
				tabuleiro[2][0] == sinal && tabuleiro[2][1]== sinal  && tabuleiro[2][2]== sinal ||
				tabuleiro[0][0] == sinal && tabuleiro[1][0]== sinal  && tabuleiro[2][0]== sinal ||
				tabuleiro[0][1] == sinal && tabuleiro[1][1]== sinal  && tabuleiro[2][1]== sinal ||
				tabuleiro[0][2] == sinal && tabuleiro[1][2]== sinal  && tabuleiro[2][2]== sinal ||
				tabuleiro[0][0] == sinal && tabuleiro[1][1]== sinal  && tabuleiro[2][2]== sinal ||
				tabuleiro[0][2] == sinal && tabuleiro[1][1]== sinal  && tabuleiro[2][0]== sinal ) {
			return true;
		}
		return false;
	}
	
	boolean vezJogador1() {
		if (jogador %2 == 1) {
			return true;
		}
		return false;
	}
}
