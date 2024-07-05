package com;

public class Control {
	
	private String conexión;
	private int numBotones;
	private String color;
	
	public Control () {}

	public Control(String conexión, int numBotones, String color) {
		super();
		this.conexión = conexión;
		this.numBotones = numBotones;
		this.color = color;
	}

	public String getConexión() {
		return conexión;
	}

	public void setConexión(String conexión) {
		this.conexión = conexión;
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
		return "Control [conexión=" + conexión + ", numBotones=" + numBotones + ", color=" + color + "]";
	}
	
	

}
