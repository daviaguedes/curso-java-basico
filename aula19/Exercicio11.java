package aula19;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i<vetorA.length; i++) {
			System.out.println("Digite o valor de A na posi��o " + i);
			vetorA[i] = scan.nextInt();
			if(vetorA[i]%2==0) {
				System.out.println("O vetor A na posi��o " + i + " � par.");
			}
			else {
				System.out.println("O vetor A na posi��o"+ i + " � �mpar.");
			}
		}
		
	}

}
