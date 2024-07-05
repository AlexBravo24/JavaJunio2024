package com;

public abstract class  Calculadora {

	private String marca;
	private String color;
	private int precio;
	
	
	public Calculadora() {
		super();	
	}
	
	public Calculadora(String marca, String color, int precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + ", precio=" + precio + "]";
	}
	
	public abstract int Sumar() ;
	public abstract int Restar() ;
	public abstract double Multiplicar() ;
	public abstract double Dividir() ;
	
}