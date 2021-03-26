package aula33;


public class Exercicio02 {

	public static void main(String[] args) {
	
		ContaCorrente conta = new ContaCorrente();
		
		conta.setNumero(123456);
		conta.setAgencia(012);
		conta.setEspecial(true);
		conta.setLimiteEspecial(400);
		conta.setSaldo(1900);
		conta.setEspecialUsado(0);
	
		boolean saqueEfetuado = conta.realizarSaque(500);
		System.out.println();
		conta.realizarDeposito(600);

		
	}

}
