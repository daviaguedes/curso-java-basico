package aula15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		int resposta=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Telefonou para v�tima ?");
		String telefone = scan.next();
		System.out.println("Esteve no local do crime ?");
		String localCrime = scan.next();
		System.out.println("Mora perto da v�tima ?");
		String pertoVitima = scan.next();
		System.out.println("Devia para v�tima ?");
		String deviaVitima = scan.next();
		System.out.println("J� trabalhou com a v�tima ?");
		String trabalhouVitima = scan.next();
		
		switch (telefone) {
		case "sim" : case "SIM" : case "Sim" :
		resposta= resposta + 1;
		case "n�o" : case "N�O" : case "N�o" : break;
		default: System.out.println("Digite apenas \"Sim\" ou \"N�o\"");
		}
		switch (localCrime) {
		case "sim" : case "SIM" : case "Sim" :
		resposta= resposta + 1;
		case "n�o" : case "N�O" : case "N�o" :break;
		default: System.out.println("Digite apenas \"Sim\" ou \"N�o\"");
		}
		switch (pertoVitima) {
		case "sim" : case "SIM" : case "Sim" :
		resposta= resposta + 1;
		case "n�o" : case "N�O" : case "N�o" :break;
		default: System.out.println("Digite apenas \"Sim\" ou \"N�o\"");
		}
		switch (deviaVitima) {
		case "sim" : case "SIM" : case "Sim" :
		resposta= resposta + 1;
		case "n�o" : case "N�O" : case "N�o" :break;
		default: System.out.println("Digite apenas \"Sim\" ou \"N�o\"");
		}
		switch (trabalhouVitima) {
		case "sim" : case "SIM" : case "Sim" :
		resposta= resposta + 1;
		case "n�o" : case "N�O" : case "N�o" : break;
		default: System.out.println("Digite apenas \"Sim\" ou \"N�o\"");
		}
		
		if (resposta <=1) {
			System.out.println("Inocente.");
		}
		else if (resposta ==2) {
			System.out.println("Suspeita.");
		}
		else if (resposta <= 4) {
			System.out.println("C�mplice.");
		}
		else if (resposta == 5) {
			System.out.println("Assassino.");
		}
	}

}
