package com.modelo;

public class Cuenta {

	
	//El paquete com.modelo guardamos la informacion 
	//de los objetos o entidades a los cuales que queremos acceder
	//necesitamos crear varias cuentas de banco 
	//agregar Hashmap para simular una BD
	
	private String usuario;
	private double saldo;
	private double saldominimo;
	private double saldomax;
	private String tipoDC;
	
	private Cuenta() {
		
	}

	public Cuenta(String usuario, double saldo, double saldominimo, double saldomax, String tipoDC) {
		super();
		this.usuario = usuario;
		this.saldo = saldo;
		this.saldominimo = saldominimo;
		this.saldomax = saldomax;
		this.tipoDC = tipoDC;
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

	public double getSaldominimo() {
		return saldominimo;
	}

	public void setSaldominimo(double saldominimo) {
		this.saldominimo = saldominimo;
	}

	public double getSaldomax() {
		return saldomax;
	}

	public void setSaldomax(double saldomax) {
		this.saldomax = saldomax;
	}

	public String getTipoDC() {
		return tipoDC;
	}

	public void setTipoDC(String tipoDC) {
		this.tipoDC = tipoDC;
	}

	@Override
	public String toString() {
		return "Cuenta [usuario=" + usuario + ", saldo=" + saldo + ", saldominimo=" + saldominimo + ", saldomax="
				+ saldomax + ", tipoDC=" + tipoDC + "]";
	}
	
}
