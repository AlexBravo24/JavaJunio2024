package com;

public abstract class Calculadora {

	
	private String tipo;
	private String color;
	private int precio;
	
	public Calculadora() {
		
	}

	public Calculadora(String tipo, String color, int precio) {
		super();
		this.tipo = tipo;
		this.color = color;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "Calculadora [tipo=" + tipo + ", color=" + color + ", precio=" + precio + "]";
	}
	
	public abstract void sumar();

	public void sumar(int a, int b) {
		
	} 
	public abstract void resta();

	public void resta(int a, int b) {
		
	} 
	public abstract void multiplicacion();

	public void multiplicacion(int a, int b) {
		
	} 
	public abstract void division();

	public void division(int a, int b) {
		
	} 
}
