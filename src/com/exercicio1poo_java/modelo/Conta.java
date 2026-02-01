package com.exercicio1poo_java.modelo;

public class Conta {
	
	private String Numero;
	private String Titular; 
	private Double Saldo; 
	
	public Conta(String n, String t) {
		Numero = n; 
		Titular = validarTitular(t); 
		Saldo = 0.0; 
	}
	
	public void Deposito(double quantia) {
		if(quantia < 0.0) {
			System.out.println("Depósito não pode ser menor que $0.00");
		}else {
			Saldo += quantia; 
		}
	}
	
	private String validarTitular(String t) {
		String titular = "";
		if (t != null && t.length() > 1) {
			titular = t;
		}
		else {
			titular = "N/A";
		}
		return titular;
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
