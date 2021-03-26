package aula27;

public class Exercicio02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		
		conta.numero= 123456;
		conta.agencia= 012;
		conta.especial= true;
		conta.limiteEspecial= 400;
		conta.saldo = 1900;
		conta.especialUsado = 0;
		
		
		boolean saqueEfetuado = conta.realizarSaque(500);
		System.out.println();
		conta.realizarDeposito(600);

		
	}

}
