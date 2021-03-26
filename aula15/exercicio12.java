package aula15;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da hora trabalhada: ");
		
		double valorHora = scan.nextFloat();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		double horaTrabalho = scan.nextDouble();
		
		double salarioBruto = valorHora * horaTrabalho;
		double descontoIR ;
		double INSS= (float) (salarioBruto* 0.10);
		double FGTS = (float) (salarioBruto* 0.11);
		double sindicato = (float) (salarioBruto *0.03);
		double totalDescontos;
		double salarioLiquido;
		
		
		if (salarioBruto <= 900 && salarioBruto > 0) {
			salarioLiquido= salarioBruto - INSS; 
			totalDescontos= INSS;
			
			System.out.println("Salário Bruto: (" + horaTrabalho + ")" + "*(" + valorHora + ")=  R$" + salarioBruto) ; 
			System.out.println("(-) IR ( ):                    R$"  ); 
			System.out.println("(-) INSS (10%):                R$" + INSS  );
			System.out.println("(-) FGTS (11%):                R$" + FGTS  );
			System.out.println("Total de descontos:            R$" + totalDescontos  );
			System.out.println("Salário Líquido:               R$" + salarioLiquido  );
		}
		else if (salarioBruto <= 1500) {
			descontoIR= salarioBruto * 0.05;
			salarioLiquido= salarioBruto - INSS - descontoIR; 
			totalDescontos= INSS + descontoIR;
			
			System.out.println("Salário Bruto: (" + horaTrabalho + ")" + "*(" + valorHora + ")=  R$" + salarioBruto) ; 
			System.out.println("(-) IR (5%):                   R$" + descontoIR  ); 
			System.out.println("(-) INSS (10%):                R$" + INSS  );
			System.out.println("(-) FGTS (11%):                R$" + FGTS  );
			System.out.println("Total de descontos:            R$" + totalDescontos  );
			System.out.println("Salário Líquido:               R$" + salarioLiquido  );
		}
		else if (salarioBruto <= 2500) {
			descontoIR= salarioBruto * 0.10;
			salarioLiquido= salarioBruto - INSS - descontoIR; 
			totalDescontos= INSS + descontoIR;
			
			System.out.println("Salário Bruto: (" + horaTrabalho + ")" + "*(" + valorHora + ")=  R$" + salarioBruto) ; 
			System.out.println("(-) IR (10%):                  R$" + descontoIR  ); 
			System.out.println("(-) INSS (10%):                R$" + INSS  );
			System.out.println("(-) FGTS (11%):                R$" + FGTS  );
			System.out.println("Total de descontos:            R$" + totalDescontos  );
			System.out.println("Salário Líquido:               R$" + salarioLiquido  );
		}
		else if (salarioBruto > 2500) {
			descontoIR= salarioBruto * 0.20;
			salarioLiquido= salarioBruto - INSS - descontoIR; 
			totalDescontos= INSS + descontoIR;
			
			System.out.println("Salário Bruto: (" + horaTrabalho + ")" + "*(" + valorHora + ")=  R$" + salarioBruto) ; 
			System.out.println("(-) IR (20%):                  R$" + descontoIR  ); 
			System.out.println("(-) INSS (10%):                R$" + INSS  );
			System.out.println("(-) FGTS (11%):                R$" + FGTS  );
			System.out.println("Total de descontos:            R$" + totalDescontos  );
			System.out.println("Salário Líquido:               R$" + salarioLiquido  );
		}
		else {
			System.out.println("Valor de salário não é válido.");
			}
		}

}
