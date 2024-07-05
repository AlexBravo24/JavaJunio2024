package com;

public class Ram {

	private String marca;
	private String modelo;
	private Double capacidad;
	
	public Ram() {
		super();
	}

	public Ram(String marca, String modelo, Double capacidad) {
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

	public Double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Ram [marca = " + marca + ", modelo = " + modelo + ", capacidad = " + capacidad + "]";
	}
	
	
	
}
