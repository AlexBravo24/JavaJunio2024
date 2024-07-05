package com;

public class Autos {

	private String marca;
	private int año;
	private String color;
	
	public Autos () {
		
	}

	public Autos(String marca, int año, String color) {
		super();
		this.marca = marca;
		this.año = año;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", año=" + año + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
