package aula43.exercicios;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacar(double valor) {
		if(this.getSaldo() + limite  < valor) {
			System.out.println("Saldo insuficiente para o saque.");
			
		}
		else if(this.getSaldo() > valor) {
		this.setSaldo(getSaldo()-valor);	
		}

		else {
			double usoLimite;
			usoLimite = valor - this.getSaldo();
			this.setSaldo(getSaldo()+ limite - valor - usoLimite );
			limite -= usoLimite;
		}
	}
	
public String toString() {
		
		String info = " - Conta Especial - ";
		info += "Limite: " + limite + "\n";
		info += super.toString() + "\n";
		
		return info;
		
	}
}
