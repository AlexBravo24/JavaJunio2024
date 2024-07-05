package com;

public class Motos_CDMC {

	private String marca;
	private String modelo;
	private double precio;
	private String color;
	
	public Motos_CDMC() {
		
		
	}

	public Motos_CDMC(String marca, String modelo, double precio, String color) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		
	}
/*
	public Motos_CDMC(String marca) {
		super();
		this.marca = marca;
	}
*/


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	//public void setMarca(String CFmotos) {
		//this.marca = CFmotos;
	//}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	
	
	@Override
	public String toString() {
		return "Motos_CDMC [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + "]";
	}

	
	
	
	
}
