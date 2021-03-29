package aula33;

public class JogoVelha {
	
	
	private char[][] tabuleiro;
	private int jogador;

	
	public JogoVelha() {
		tabuleiro = new char[3][3]; 
		jogador = 1;
	}

	public JogoVelha(char[][] tabuleiro, int jogador) {
		this.tabuleiro = tabuleiro;
		this.jogador = jogador;
	}

	public char[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(char[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public int getJogador() {
		return jogador;
	}

	public void setJogador(int jogador) {
		this.jogador = jogador;
	}

	public boolean validarJogada(int linha, int coluna, char sinal) {

		if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O' ) {
			return false;
		}
		else {
			tabuleiro[linha][coluna] = sinal;
			jogador++;
			return true;
		}
	}
	
	public void imprimirTabuleiro() {
		for(int i = 0; i<tabuleiro.length; i++) {
			for(int j = 0; j<tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " | ");

			}
			System.out.println();
		}
	}

	public boolean verificarGanhador(char sinal) {

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
	
	public boolean vezJogador1() {
		if (jogador %2 == 1) {
			return true;
		}
		return false;
	}

}
