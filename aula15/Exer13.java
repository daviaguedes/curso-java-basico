package aula15;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número que corresponde ao tipo de carne:");
		System.out.println("1 - Filé Duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		
		double tipo = scan.nextDouble();
		double preco = 0;
		
		System.out.println("Digite a quantidade, em quilos, :");
		double quantidade = scan.nextDouble();
		
			if (tipo == 1) {
				if (quantidade < 5) {
					preco = 4.90;
				}
				else {
					preco = 5.80;
				}
			}
			if (tipo == 2) {
				if (quantidade < 5) {
					preco = 5.90;
				}
				else {
					preco = 6.80;
				}
			}
			if (tipo == 3) {
				if (quantidade < 5) {
					preco = 6.90;
				}
				else {
					preco = 7.80;
				}
			}
			
			double total = quantidade * preco;
			
			System.out.println("Digite o número que corresponde a forma de pagamento: ");
			System.out.println("1 - Cartão Tabajara");
			System.out.println("2 - Dinheiro");
			System.out.println("3 - Outros");
			
			int pagamento = scan.nextInt();
			
			if (pagamento == 1) {
				double totalCartao = total * 0.90;
				System.out.println("O valor total, com desconto, é R$" + totalCartao);
			}
			if (pagamento == 2 || pagamento == 3) {
				System.out.println("O valor total é R$" + total);
			}
	}

}
