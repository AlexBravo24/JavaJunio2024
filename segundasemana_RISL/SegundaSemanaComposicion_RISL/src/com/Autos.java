package com;

public class Autos {

	private String marca;
	private int modelo;
	private String color;
	
	private Llanta llantas;
	private motor motor;
	private asientos Asientos;
	
	public Autos () {
		
	}

	public Autos(String marca, double modelo, String color, Llanta llantas, com.motor motor, asientos asientos) {
		super();
		this.marca = marca;
		this.modelo = (int) modelo;
		this.color = color;
		this.llantas = llantas;
		this.motor = motor;
		Asientos = asientos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getModelo() {
		return modelo;
	}

	public void setModelo(double modelo) {
		this.modelo = (int) modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Llanta getLlantas() {
		return llantas;
	}

	public void setLlantas(Llanta llantas) {
		this.llantas = llantas;
	}

	public motor getMotor() {
		return motor;
	}

	public void setMotor(motor motor) {
		this.motor = motor;
	}

	public asientos getAsientos() {
		return Asientos;
	}

	public void setAsientos(asientos asientos) {
		Asientos = asientos;
	}

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", llantas=" + llantas + ", motor="
				+ motor + ", Asientos=" + Asientos + "]";
	}
	


	}
	