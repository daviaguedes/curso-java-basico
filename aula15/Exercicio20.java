package aula15;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		int resposta=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Telefonou para vítima ?");
		String telefone = scan.next();
		System.out.println("Esteve no local do crime ?");
		String localCrime = scan.next();
		System.out.println("Mora perto da vítima ?");
		String pertoVitima = scan.next();
		System.out.println("Devia para vítima ?");
		String deviaVitima = scan.next();
		System.out.println("Já trabalhou com a vítima ?");
		String trabalhouVitima = scan.next();
		
		switch (telefone) {
		case "sim" : case "SIM" : case "Sim" :
		resposta= resposta + 1;
		case "não" : case "NÃO" : case "Não" : break;
		default: System.out.println("Digite apenas \"Sim\" ou \"Não\"");
		}
		switch (localCrime) {
		case "sim" : case "SIM" : case "Sim" :
		resposta= resposta + 1;
		case "não" : case "NÃO" : case "Não" :break;
		default: System.out.println("Digite apenas \"Sim\" ou \"Não\"");
		}
		switch (pertoVitima) {
		case "sim" : case "SIM" : case "Sim" :
		resposta= resposta + 1;
		case "não" : case "NÃO" : case "Não" :break;
		default: System.out.println("Digite apenas \"Sim\" ou \"Não\"");
		}
		switch (deviaVitima) {
		case "sim" : case "SIM" : case "Sim" :
		resposta= resposta + 1;
		case "não" : case "NÃO" : case "Não" :break;
		default: System.out.println("Digite apenas \"Sim\" ou \"Não\"");
		}
		switch (trabalhouVitima) {
		case "sim" : case "SIM" : case "Sim" :
		resposta= resposta + 1;
		case "não" : case "NÃO" : case "Não" : break;
		default: System.out.println("Digite apenas \"Sim\" ou \"Não\"");
		}
		
		if (resposta <=1) {
			System.out.println("Inocente.");
		}
		else if (resposta ==2) {
			System.out.println("Suspeita.");
		}
		else if (resposta <= 4) {
			System.out.println("Cúmplice.");
		}
		else if (resposta == 5) {
			System.out.println("Assassino.");
		}
	}

}
