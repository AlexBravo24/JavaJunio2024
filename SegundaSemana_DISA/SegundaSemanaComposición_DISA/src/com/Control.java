package com;

public class Control {
	
	private String conexi�n;
	private int numBotones;
	private String color;
	
	public Control () {}

	public Control(String conexi�n, int numBotones, String color) {
		super();
		this.conexi�n = conexi�n;
		this.numBotones = numBotones;
		this.color = color;
	}

	public String getConexi�n() {
		return conexi�n;
	}

	public void setConexi�n(String conexi�n) {
		this.conexi�n = conexi�n;
	}

	public int getNumBotones() {
		return numBotones;
	}

	public void setNumBotones(int numBotones) {
		this.numBotones = numBotones;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Control [conexi�n=" + conexi�n + ", numBotones=" + numBotones + ", color=" + color + "]";
	}
	
	

}
