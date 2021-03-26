package aula33;

public class ContaCorrente {
	
	private int numero;
	private int agencia;
	private double saldo;
	private boolean especial;
	private double limiteEspecial;
	private double especialUsado;
	private String status[];
	
	public ContaCorrente(int numero, int agencia, double saldo, boolean especial, double limiteEspecial,
			double especialUsado, String[] status) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.especialUsado = especialUsado;
		this.status = status;
	}

	public ContaCorrente() { }

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public boolean isEspecial() {
		return especial;
	}


	public void setEspecial(boolean especial) {
		this.especial = especial;
	}


	public double getLimiteEspecial() {
		return limiteEspecial;
	}


	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}


	public double getEspecialUsado() {
		return especialUsado;
	}


	public void setEspecialUsado(double especialUsado) {
		this.especialUsado = especialUsado;
	}


	public String[] getStatus() {
		return status;
	}


	public void setStatus(String[] status) {
		this.status = status;
	}


	public void mostrarInfo() {
		System.out.println("Saldo: " + saldo );
		System.out.println("Limite Especial: " + limiteEspecial);
		}
	
	
	public boolean realizarSaque(double quantiaSacar) {
		
		if (saldo>=quantiaSacar) {
			saldo-=quantiaSacar;
			System.out.println("Saque realizado com sucesso. ");
			System.out.println("Saldo: " +getSaldo());
			System.out.println("Limite Especial: " + getLimiteEspecial());
			return true;
		}
		
		else if (especial) {
			
			if(quantiaSacar<= saldo+ limiteEspecial) {
				double usoEspecial = quantiaSacar - getSaldo();

				saldo = 0 - usoEspecial;
				limiteEspecial -= usoEspecial;
				System.out.println("Saque realizado com sucesso. ");
				System.out.println("Saldo: " +getSaldo());
				System.out.println("Limite Especial: " + getLimiteEspecial());
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
	
	public void realizarDeposito(int valor) {
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
