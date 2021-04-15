package aula43.exercicios;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private double diaRendimento;

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public String toString() {
		
		String info = " - Conta Poupança - ";
		info += "Dia Rendimento: " + diaRendimento + "\n";
		info += super.toString() + "\n";
		
		return info;
		
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hoje = Calendar.getInstance();
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			
			this.setSaldo(this.getSaldo() + (this.getSaldo()* taxaRendimento));
			return true;
		}
		
		return false;
	}
	
}
