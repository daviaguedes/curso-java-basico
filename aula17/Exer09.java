package aula17;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um n?mero");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		
		for (int i = num; i<=max; i++) {
			System.out.println(i);
			if (i%7==0) {
				System.out.println("O valor de i ?: " + i);
				break;
			}
		}
	}

}
