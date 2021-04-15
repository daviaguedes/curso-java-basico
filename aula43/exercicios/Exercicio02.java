package aula43.exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		
		p1.setNome("1");
		p1.setCpf("111111111-11");
		p1.setRendaBruta(1000);
		
		PessoaFisica p2 = new PessoaFisica();
		
		p2.setNome("2");
		p2.setCpf("22222222-22");
		p2.setRendaBruta(2500);
		
		PessoaFisica p3 = new PessoaFisica();
		
		p3.setNome("3");
		p3.setCpf("333333333-33");
		p3.setRendaBruta(3200);
		
		PessoaJuridica p4 = new PessoaJuridica();
		
		p4.setNome("4");
		p4.setCnpj("44444444444.44");
		p4.setRendaBruta(1200);
		
		PessoaJuridica p5 = new PessoaJuridica();
		
		p5.setNome("5");
		p5.setCnpj("555555555.55");
		p5.setRendaBruta(2500);
		
		PessoaJuridica p6 = new PessoaJuridica();
		
		p6.setNome("6");
		p6.setCnpj("666666666.66");
		p6.setRendaBruta(3100);
		
		
		Contribuinte[] contribuintes = new Contribuinte[6];
				
		contribuintes[0]= p1;
		contribuintes[1]= p2;
		contribuintes[2]= p3;
		contribuintes[3]= p4;
		contribuintes[4]= p5;
		contribuintes[5]= p6;
		
		for(Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
			

	}

}
