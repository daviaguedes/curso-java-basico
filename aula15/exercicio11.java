package aula15;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário: ");
		
		float salario = scan.nextFloat();
		float novoSalario1 = (float) (salario*1.20);
		float novoSalario2 = (float) (salario*1.15);
		float novoSalario3 = (float) (salario*1.10);
		float novoSalario4 = (float) (salario*1.05);
		
		if (salario <= 280 && salario > 0) {
			System.out.println("Seu novo salário é de R$" + (novoSalario1));
			System.out.println("Seu salário era de R$" + (salario));
			System.out.println("O percentual de aumento foi de 20% ");
			System.out.println("O aumento do salário foi de R$" + (salario*0.20));
		}
		else if (salario > 280 && salario <= 700) {
			System.out.println("Seu novo salário é de R$" + (novoSalario2));
			System.out.println("Seu novo salário é de R$" + (novoSalario2));
			System.out.println("Seu salário era de R$" + (salario));
			System.out.println("O percentual de aumento foi de 15% ");
			System.out.println("O aumento do salário foi de R$" + (salario*0.15));
		}
		else if (salario > 700 && salario <= 1500) {
			System.out.println("Seu novo salário é de R$" + (novoSalario3));
			System.out.println("Seu novo salário é de R$" + (novoSalario3));
			System.out.println("Seu salário era de R$" + (salario));
			System.out.println("O percentual de aumento foi de 10% ");
			System.out.println("O aumento do salário foi de R$" + (salario*0.10));
		}
		else if (salario > 1500) {
			System.out.println("Seu novo salário é de R$" + (novoSalario4));
			System.out.println("Seu novo salário é de R$" + (novoSalario4));
			System.out.println("Seu salário era de R$" + (salario));
			System.out.println("O percentual de aumento foi de 05% ");
			System.out.println("O aumento do salário foi de R$" + (salario*0.05));
		}
		else {
			System.out.println("O valor não é válido.");
		}
}
	}