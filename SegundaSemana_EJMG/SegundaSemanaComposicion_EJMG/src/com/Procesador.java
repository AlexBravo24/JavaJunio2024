
package com;

public class Procesador {

	//Atributos
	
	private String marca;
	private String modelo;
	private double frecuencia;
	
	public Procesador() {}

	public Procesador(String marca, String modelo, double freciencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.frecuencia = freciencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getFreciencia() {
		return frecuencia;
	}

	public void setFreciencia(double freciencia) {
		this.frecuencia = freciencia;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", freciencia=" + frecuencia + "]";
	}
	
	
}
