package aula24;

public class Exercicio05 {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.limite= 2500;
		conta.numero= 200102334;
		conta.status= new String[1];
		conta.status[0] = "Ativo";
		conta.saldo = 524.23;
		
		System.out.println(conta.limite);
		System.out.println(conta.numero);
		System.out.println(conta.status[0]);
		System.out.println(conta.saldo);
	}

}
