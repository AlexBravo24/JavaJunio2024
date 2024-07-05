package com;

public abstract class Calculadora {

	private String Marca;
	private String Color;
	private double precio;
	
	public Calculadora () {
	}

	public Calculadora(String Marca, String color, double precio) {
		super();
		Marca = Marca;
		Color = color;
		this.precio = precio;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [Marca=" + Marca + ", Color=" + Color + ", precio=" + precio + "]";
	}

	public abstract void sumar ();
	public abstract void restar ();
	public abstract void multiplicar ();
	public abstract void dividir ();
	
	
	
	
	
	
	
}
