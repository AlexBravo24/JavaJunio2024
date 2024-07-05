package com;

public class Dron {
	private String marca;
	private String modelo;
	private String color;
	private Motor motor;
	private Camara cam;
	private Bateria pila;
	
	public Dron () {}

	public Dron(String marca, String modelo, String color, Motor motor, Camara cam, Bateria pila) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.motor = motor;
		this.cam = cam;
		this.pila = pila;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Camara getCam() {
		return cam;
	}

	public void setCam(Camara cam) {
		this.cam = cam;
	}

	public Bateria getPila() {
		return pila;
	}

	public void setPila(Bateria pila) {
		this.pila = pila;
	}

	@Override
	public String toString() {
		return "Dron [marca = " + marca + ", modelo = " + modelo + ", color = " + color + ", motor = " + motor + ", cam = " + cam
				+ ", pila = " + pila + "]";
	}
	
	
	
}
