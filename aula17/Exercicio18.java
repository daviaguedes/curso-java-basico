package aula17;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int fatorial;
	System.out.println("Digite o número: ");
	fatorial = scan.nextInt();
	int num=1;
	for(int i = fatorial; i>0 ; --i ) {
		num = num * i;	
	}
	System.out.println(num);
	}

}
