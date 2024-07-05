package com;

public abstract class Calculadora {

	private String marca;
	private String color;
	private String tipo;
	private double precio;
	
	public Calculadora () {}

	public Calculadora(String marca, String color, String tipo, double precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [marca = " + marca + ", color = " + color + ", tipo = " + tipo + ", precio = " + precio + "]";
	}
	
	public abstract void sumar ();
	
	public void sumar (int a, int b, int c) {
		System.out.println("La suma de tres numeros es: "+(a+b+c));
	}
	
	public abstract void restar ();
	
	public abstract void multiplicar ();
	
	public abstract void dividir ();
	
	
	
}
