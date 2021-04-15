package aula43.exercicios;

public class PessoaFisica extends Contribuinte {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double calcularImposto() {
		
		double renda = this.getRendaBruta();

		if(renda >=0 && renda <=1400) {
			return 0;
		}
		else if(renda >=1400.01 && renda <=2100) {
			return (renda * 0.1) - 100;
		}
		else if(renda >=2100.01 && renda <=2800) {
			return (renda * 0.15) - 270;
		}
		else if(renda >=2800.01 && renda <=3600) {
			return (renda * 0.25) - 500;
		}
		else {
			return (renda * 0.3) - 700;
		}
	}
	
	public String toString() {
		
		String info= " - Pessoa Física - " + "\n"; 
		info += super.toString();
		info +=	 "CPF: " + cpf + "\n";
		info += "Imposto a pagar: " + calcularImposto();
		return info;
	}

}
