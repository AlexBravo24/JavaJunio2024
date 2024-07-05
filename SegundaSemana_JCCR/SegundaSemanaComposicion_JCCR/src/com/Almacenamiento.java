package com;

public class Almacenamiento {

	private String marca;
	private String modelo;
	private Double capacidad;
	
	public Almacenamiento() {
		super();
	}

	public Almacenamiento(String marca, String modelo, Double capacidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidad = capacidad;
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

	public Double getTama�o() {
		return capacidad;
	}

	public void setTama�o(Double tama�o) {
		this.capacidad = tama�o;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", modelo=" + modelo + ", tama�o=" + capacidad + "]";
	}
	
	
}
