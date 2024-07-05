package com;

public class Motor {
	private double voltaje;
	private int velocidad;
	private int peso;
	
	public Motor () {}

	public Motor(double voltaje, int velocidad, int peso) {
		super();
		this.voltaje = voltaje;
		this.velocidad = velocidad;
		this.peso = peso;
	}

	public double getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Motor [voltaje=" + voltaje + ", velocidad=" + velocidad + ", peso=" + peso + "]";
	}
	
	

}
