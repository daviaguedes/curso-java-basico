package aula43.exercicios;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public double calcularImposto() {
	
		return this.getRendaBruta()*0.1;
		
	}

	public String toString() {
		
		String info = " - Pessoa Jurídica - " + "\n"; 
		info += super.toString();
		info +=	 "CNPJ: " + cnpj + "\n";
		info += "Imposto a pagar: " + calcularImposto();
		return info;
	}


}
