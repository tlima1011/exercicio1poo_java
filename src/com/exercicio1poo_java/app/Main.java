package com.exercicio1poo_java.app;

import java.util.Locale;
import java.util.Scanner;

import com.exercicio1poo_java.modelo.ContaBancaria;

public class Main {
	
	public static void main(String[] args) {
		
		double quantia = 0.0; 
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		System.out.print("Entre o número da conta: "); 
		String n = ler.nextLine(); 
		
		System.out.print("Entre o titular da conta: "); 
		String t = ler.nextLine(); 
		
		System.out.print("Haverá depósito inicial (s/n)? "); 
		char resp = ler.nextLine().charAt(0); 
		
		ContaBancaria c1;
		
		if(resp == 's' || resp == 'S') {
			System.out.print("\nEntre o valor de depósito inicial: ");
			quantia = ler.nextDouble(); 
			c1= new ContaBancaria(n, t, quantia); 
		}
		else {
			c1 = new ContaBancaria(n,t); 
		}
		
		System.out.println("Dados da Conta"); 
		System.out.println(c1); 
		
		System.out.print("Entre um valor para depósito: ");
		quantia = ler.nextDouble();
		c1.Deposito(quantia); 
		
		System.out.println("\nDados da conta atualizados: "); 
		System.out.println(c1);
		
		System.out.print("Entre um valor para saque: "); 
		quantia = ler.nextDouble();
		ler.nextLine(); 
		c1.Saque(quantia); 
		
		System.out.println("\nDados da conta atualizados: "); 
		System.out.println(c1);
		
		System.out.println("Criação de uma nova conta: ");
		System.out.print("Entre o número da conta: "); 
		n = ler.nextLine(); 
		System.out.print("Entre o titular da conta: "); 
		t = ler.nextLine();
		
		ContaBancaria c2 = new ContaBancaria(n,t);
		System.out.println(c2);
		
		System.out.printf("Informe quantia de transferência de %s para %s ", c1.mostrarTitular(), c2.mostrarTitular()); 
		quantia = ler.nextDouble(); 
		
		ContaBancaria c = new ContaBancaria(); 
		
		c.Transfere(c1, c2, quantia); 
		System.out.println(); 
		System.out.println("-----------------------------------------");
		System.out.println(c1); 
		System.out.println("-----------------------------------------");
		System.out.println(c2);  
		System.out.println("-----------------------------------------");
	
		ler.close();
	}

}
