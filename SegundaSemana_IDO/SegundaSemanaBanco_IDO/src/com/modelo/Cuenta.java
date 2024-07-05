package com.modelo;

public class Cuenta {
	
	//En el paquete com.modelos  se guarda la informacion de los objetos o entidades
	//A los cuales quremos acceder
	
	
	//em este ejercicio se requiere crear varias cuantas de usuario y se agregaran aan HM
	//para simular una pequeña BD
	
	
	//Atributos de una cuenta bancaria
	
	private String usuario;
	private double saldo;
	private double saldoMin;
	private double saldoMax;
	private String tipoCuenta;
	
	
	public Cuenta() {
		
	}


	public Cuenta(String usuario, double saldo, double saldoMin, double saldoMax, String tipoCuenta) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldoMin = saldoMin;
		this.saldoMax = saldoMax;
		this.tipoCuenta = tipoCuenta;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getSaldoMin() {
		return saldoMin;
	}


	public void setSaldoMin(double saldoMin) {
		this.saldoMin = saldoMin;
	}


	public double getSaldoMax() {
		return saldoMax;
	}


	public void setSaldoMax(double saldoMax) {
		this.saldoMax = saldoMax;
	}


	public String getTipoCuenta() {
		return tipoCuenta;
	}


	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}


	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldoMin=" + saldoMin + ", saldoMax=" + saldoMax
				+ ", tipoCuenta=" + tipoCuenta + "]";
	}
	

}
