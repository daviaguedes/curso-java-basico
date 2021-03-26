package aula27;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		JogoVelha jogo = new JogoVelha(); 

		boolean ganhou = false;
		char sinal;
		int linha=0;
		int coluna=0;

		System.out.println("Jogador 1 = \"X\"");
		System.out.println("Jogador 2 = \"O\"");

		while(!ganhou) {
			if(jogo.vezJogador1()) {
				System.out.println("Vez do jogador 1.");
				sinal = 'X';
			}

			else {
				System.out.println("Vez do jogador 2.");
				sinal = 'O';
			}
			
			linha = valor("Linha", scanner);
			coluna = valor("Coluna", scanner);

			if(!jogo.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posição já usada, tente novamente.");
			}

			jogo.imprimirTabuleiro();

			if(jogo.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 1 ganhou! ");
			}
			else if (jogo.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 2 ganhou!");
			}
			else if (jogo.jogador > 9) {
				System.out.println("Deu velha.");
				ganhou= true;
			}
		}


	}
	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;

		while(!valorValida) {
			System.out.println("Escolha uma " + tipoValor + " (1-3)");
			valor= scan.nextInt();
			if(valor>=1 && valor<=3) {
				valorValida = true;
			}
			else {
				System.out.println("Digite um número válido.");
			}
		}
		valor--;
		return valor;
	}

}
