package com;

public class Autos {

	private String marca;
	private int a�o;
	private String color;
	
	public Autos () {
		
	}

	public Autos(String marca, int a�o, String color) {
		super();
		this.marca = marca;
		this.a�o = a�o;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Autos [marca=" + marca + ", a�o=" + a�o + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
