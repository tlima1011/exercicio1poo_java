package com.exercicio1poo_java.modelo;

public class Conta {
	
	public String Numero;
	public String Titular; 
	public Double Saldo; 
	
	public Conta(String n, String t) {
		Numero = n; 
		Titular = t; 
		Saldo = 0.0; 
	}
	
	public void Deposito(double quantia) {
		if(quantia < 0.0) {
			System.out.println("Depósito não pode ser menor que $0.00");
		}else {
			Saldo += quantia; 
		}
	}
	
	public void Saque(double quantia) {
		if(quantia < 0.0) {
			System.out.println("Saque não pode ser menor que $0.00");
		}else {
			quantia += 5.0;
			Saldo -= quantia; 
		}
	}

	@Override
	public String toString() {
		return String.format("Conta: "
				+ "\nNumero: %s"
				+ ", Titular: %s"
				+ ", Saldo: $ %.2f", Numero, Titular, Saldo );
	}
	
}
