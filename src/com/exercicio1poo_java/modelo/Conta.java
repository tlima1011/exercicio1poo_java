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

	@Override
	public String toString() {
		return String.format("Conta: "
				+ "\nNumero: %s"
				+ ", Titular: %s"
				+ ", Saldo: $ %.2f", Numero, Titular, Saldo );
	}
	
}
