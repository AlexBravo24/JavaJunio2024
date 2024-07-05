package com;

public class Motocicleta extends Bicicleta{
	
	private String motor;
	private String color;
	private String guantera;
	
	public Motocicleta () {}

	public Motocicleta(String volante, String cadena, String pedales, String motor, String color, String guantera) {
		super(volante, cadena, pedales);
		this.motor = motor;
		this.color = color;
		this.guantera = guantera;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGuantera() {
		return guantera;
	}

	public void setGuantera(String guantera) {
		this.guantera = guantera;
	}

	@Override
	public String toString() {
		return "Motocicleta [motor=" + motor + ", color=" + color + ", guantera=" + guantera + ", toString()="
				+ super.toString() + "]";
	}
	
	
		
	}


