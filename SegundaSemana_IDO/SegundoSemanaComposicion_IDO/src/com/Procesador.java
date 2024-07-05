package com;

public class Procesador {
	
	// Atributos del procesador 
	
	private String marca;
	private String modelo;
	private Double frecuencia;
	
	//creacion de un objeto 
	
	public Procesador () {
		
	}

	public Procesador(String marca, String modelo, Double frecuencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.frecuencia = frecuencia;
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

	public Double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(Double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", frecuencia=" + frecuencia + "]";
	}
	
	

}