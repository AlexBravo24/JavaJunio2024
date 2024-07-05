package com;

public class Bateria {
	private double voltaje;
	private int capacidad;
	private double precio;
	
	public Bateria () {}

	public Bateria(double voltaje, int capacidad, double precio) {
		super();
		this.voltaje = voltaje;
		this.capacidad = capacidad;
		this.precio = precio;
	}

	public double getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Bateria [voltaje = " + voltaje + ", capacidad = " + capacidad + ", precio = " + precio + "]";
	}
	
	

}
