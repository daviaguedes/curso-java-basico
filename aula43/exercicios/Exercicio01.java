package aula43.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
		System.out.println(" - Conta Bancária - " + "\n");
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.setNomeCliente("Kirby");
		conta.setNumConta("66666-6");
		conta.setSaldo(1500);
		
		System.out.println(conta);
		conta.sacar(1600);
		System.out.println(conta);
		conta.depositar(200);
		System.out.println(conta);
		conta.sacar(1700);
		System.out.println(conta);
		
		System.out.println(" - Conta Poupança - " + "\n");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		
		contaPoupanca.setNomeCliente("King Dedede");
		contaPoupanca.setNumConta("98765-4");
		contaPoupanca.setSaldo(2500);
		contaPoupanca.setDiaRendimento(14);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)){
			System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
		}else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado");
		}
		
		System.out.println(contaPoupanca);
		contaPoupanca.sacar(1600);
		System.out.println(contaPoupanca);
		contaPoupanca.depositar(200);
		System.out.println(contaPoupanca);
		contaPoupanca.sacar(1700);
		System.out.println(contaPoupanca);
		
		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaEspecial.setNomeCliente("Meta Knight");
		contaEspecial.setNumConta("33333-3");
		contaEspecial.setSaldo(500);
		contaEspecial.setLimite(100);
		
		System.out.println(contaEspecial);
		contaEspecial.sacar(400);
		System.out.println(contaEspecial);
		contaEspecial.depositar(500);
		System.out.println(contaEspecial);
		contaEspecial.sacar(700);
		System.out.println(contaEspecial);
		contaEspecial.sacar(100);
		
	}
}
