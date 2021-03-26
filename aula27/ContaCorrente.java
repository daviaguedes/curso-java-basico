package aula27;

public class ContaCorrente {

	int numero;
	int agencia;
	double saldo;
	boolean especial;
	double limiteEspecial;
	double especialUsado;
	String status[];
	
	public ContaCorrente() { }

	public void mostrarInfo() {
		System.out.println("Saldo: " +saldo);
		System.out.println("Limite Especial: " + limiteEspecial);
		}

	boolean realizarSaque(double quantiaSacar) {
		
		if (saldo>=quantiaSacar) {
			saldo-=quantiaSacar;
			System.out.println("Saque realizado com sucesso. ");
			System.out.println("Saldo: " +saldo);
			System.out.println("Limite Especial: " + limiteEspecial);
			return true;
		}
		
		else if (especial) {
			
			if(quantiaSacar<= saldo+limiteEspecial) {
				double usoEspecial = quantiaSacar - saldo;

				saldo = 0 - usoEspecial;
				limiteEspecial -= usoEspecial;
				System.out.println("Saque realizado com sucesso. ");
				System.out.println("Saldo: " +saldo);
				System.out.println("Limite Especial: " + limiteEspecial);
				return true;
			}

			else if(quantiaSacar> saldo+limiteEspecial) {
				System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
				return false;
			}

		}
		else {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");

			return false;
		}
		return true;

	}
	void realizarDeposito(int valor) {
		if (valor<=0) {
			System.out.println("Valor insuficiente.");
		}
		else {
			saldo += valor;
			System.out.println("Depósito realizado com sucesso.");
			System.out.println("Saldo: " +saldo);
			System.out.println("Limite Especial: " + limiteEspecial);
			
		}
		
	}
}
