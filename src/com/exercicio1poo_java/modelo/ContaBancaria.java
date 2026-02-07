package com.exercicio1poo_java.modelo;

public class ContaBancaria {
	
	private String Numero;
	private String Titular; 
	private Double Saldo = 0.0; 
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(String t) {
		Titular = validarTitular(t); 
		Numero = validarNumero("0");
		Deposito(0.0); 
	}
	
	public ContaBancaria(String n, String t) {
		Numero = validarNumero(n); 
		Titular = validarTitular(t); 
	}
	
	public ContaBancaria(String n, String t, double DepositoInicial) {
		this(n, t); 
		Deposito(DepositoInicial);
	}
		
	private String validarNumero(String n) {
		return (n != null && n.length() >= 4) ? n : "0000";
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
	
	public void Transfere(ContaBancaria c1, ContaBancaria c2, double quantia) { 
		if(quantia <= 0) {
			System.out.println("Valor de quantia inválido $ 0.00");
		}else {
			c1.Saque(quantia);
			c2.Deposito(quantia);
		}
	}
	
	public String mostrarTitular() {
		return Titular; 
	}

	@Override
	public String toString() {
		return String.format("Conta: "
				+ "\nNumero: %s"
				+ ", Titular: %s"
				+ ", Saldo: $ %.2f", Numero, Titular, Saldo );
	}
	
}
