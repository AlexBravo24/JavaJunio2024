package com;

public abstract class Calculadora {

	private String color;
	private String marca;
	private String pantalla;
	
	public Calculadora() {}

	public Calculadora(String color, String marca, String pantalla) {
		super();
		this.color = color;
		this.marca = marca;
		this.pantalla = pantalla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", pantalla=" + pantalla + "]";
	}
	
	public abstract void sumar ();
	
	public abstract  void restar ();
	
	public abstract void multiplicar();
	
	public abstract void dividir();
	
}
