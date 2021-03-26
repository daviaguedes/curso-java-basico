package aula15;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite os três preços: ");
		
		float preco1 = scan.nextFloat();
		float preco2 = scan.nextFloat();
		float preco3 = scan.nextFloat();
		
	
		if(preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Você deve comprar o primeiro no valor de R$" + preco1);
		}
		else if(preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Você deve comprar o segundo no valor de R$" + preco2);
		}
		else if(preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("Você deve comprar o terceiro no valor de R$" + preco3);
		}

}
}
