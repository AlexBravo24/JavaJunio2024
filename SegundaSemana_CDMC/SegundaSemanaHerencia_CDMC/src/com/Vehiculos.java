package com;

public class Vehiculos {

	
	private String matricula;
	private String modelo;
	private int a�o;
	
	public Vehiculos() {
		
	}

	
	
	public Vehiculos(String matricula, String modelo, int a�o) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.a�o = a�o;
	}




	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Vehiculos [matricula=" + matricula + ", modelo=" + modelo + ", a�o=" + a�o + "]";
	}

	
	
	
}
