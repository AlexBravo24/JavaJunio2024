package com;

public class Vehiculos {

	
	private String matricula;
	private String modelo;
	private int año;
	
	public Vehiculos() {
		
	}

	
	
	public Vehiculos(String matricula, String modelo, int año) {
		super();
		this.matricula = matricula;
		this.modelo = modelo;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Vehiculos [matricula=" + matricula + ", modelo=" + modelo + ", año=" + año + "]";
	}

	
	
	
}
