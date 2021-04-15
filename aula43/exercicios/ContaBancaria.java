package aula43.exercicios;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		String info = "Nome do cliente: " + nomeCliente + "\n";
		info += "Número da conta: " + numConta + "\n";
		info += "Saldo: " + saldo + "\n";
		return info;
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	public void sacar(double valor) {
		if(saldo < valor ) {
			System.out.println("Não foi possível realizar o saque.");
		}
		else {
			saldo -=valor;
		}
	}
	/*public String mostrarInfo() {
		String info = "Nome do cliente: " + nomeCliente + "\n";
				info += "Número da conta: " + numConta + "\n";
				info += "Saldo: " + saldo;
			return info;
		
	}*/
}
