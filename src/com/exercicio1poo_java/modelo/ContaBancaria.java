package com.exercicio1poo_java.modelo;

public class ContaBancaria {
	
	private String Numero;
	private String Titular; 
	private Double Saldo = 0.0; 
	
	public ContaBancaria(String n, String t) {
		Numero = validarNumero(n); 
		Titular = validarTitular(t); 
	}
	
	public ContaBancaria(String n, String t, double DepositoInicial) {
		this(n, t); 
		Deposito(DepositoInicial);
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
		return (t != null && t.length() > 5) ? t : "N/D"; 
	}
	
	public void Saque(double quantia) {
		if(quantia <= 0.0 && quantia > Saldo) {
			System.out.println("Saque não pode ser menor ou igual a $0.00 ou Saldo Disponível Insuficiente");
		}else {
			Saldo -= quantia + 5.00; 
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
