package com.exercicio1poo_java.modelo;

public class Conta {
	
	private String Numero;
	private String Titular; 
	private Double Saldo; 
	
	public Conta(String n, String t) {
		Numero = validarNumero(n); 
		Titular = validarTitular(t); 
		Saldo = 0.0; 
	}
	
	private String validarNumero(String n) {
		String numero = ""; 
		if(n != null && n.length() >= 4) {
			numero = n; 
		}else {
			numero = "0000";
		}
		return numero;
	}
	
	private String validarTitular(String t) {
		String titular = "";
		if (t != null && t.length() > 1) {
			titular = t;
		}
		else {
			titular = "N/D";
		}
		return titular;
	}
	
	public void Saque(double quantia) {
		if(quantia <= 0.0) {
			System.out.println("Saque não pode ser menor ou igual a $0.00");
		}else {
			quantia += 5.0;
			Saldo -= quantia; 
		}
	}
	
	public void Deposito(double quantia) {
		if(quantia <= 0.0) {
			System.out.println("Depósito não pode ser menor ou igual a $0.00");
		}else {
			Saldo += quantia; 
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
