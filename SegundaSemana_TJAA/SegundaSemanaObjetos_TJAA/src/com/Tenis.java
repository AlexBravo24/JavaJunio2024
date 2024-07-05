package com;

public class Tenis {

	private String marca;
	private int precio; 
	private String color;
	private double talla;

	public Tenis () {
	}

	public Tenis(String marca, int precio, String color, double talla) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.color = color;
		this.talla = talla;
	}

	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Tenis [marca=" + marca + ", precio=" + precio + ", color=" + color + ", talla=" + talla + "]";
	}
	
	
	
	
}
