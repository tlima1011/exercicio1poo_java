package com.exercicio1poo_java.app;

import java.util.Locale;
import java.util.Scanner;

import com.exercicio1poo_java.modelo.Conta;

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
		
		Conta c = new Conta(n,t);
		
		if(resp == 's' || resp == 'S') {
			System.out.print("\nEntre o valor de depósito inicial: ");
			quantia = ler.nextDouble(); 
			c.Deposito(quantia); 
		}
		
		System.out.println("Dados da Conta"); 
		System.out.println(c); 
		
		System.out.print("Entre um valor para depósito: ");
		quantia = ler.nextDouble();
		c.Deposito(quantia); 
		
		System.out.println("\nDados da conta atualizados: "); 
		System.out.println(c);
		
		System.out.print("Entre um valor para saque: "); 
		quantia = ler.nextDouble(); 
		c.Saque(quantia); 
		
		System.out.println("\nDados da conta atualizados: "); 
		System.out.println(c);
		
		ler.close();
	}

}
