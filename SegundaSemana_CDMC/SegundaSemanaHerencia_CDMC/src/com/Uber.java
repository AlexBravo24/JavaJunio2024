package com;

public class Uber extends Vehiculos{
	
	private String nombre;
	private double licencia;
	private String sexo;
	
	public Uber() {
		
	}

	public Uber(String matricula, String modelo, int año, String nombre, double licencia, String sexo) {
		super(matricula, modelo, año);
		this.nombre = nombre;
		this.licencia = licencia;
		this.sexo = sexo;
	}



	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public double getLicencia() {
		return licencia;
	}




	public void setLicencia(double licencia) {
		this.licencia = licencia;
	}




	public String getSexo() {
		return sexo;
	}




	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




	@Override
	public String toString() {
		return "Uber [nombre=" + nombre + ", licencia=" + licencia + ", sexo=" + sexo + ", toString()="
				+ super.toString() + "]";
	}




	


	

}
