package com;

public abstract class Calculadora {
	private String marca;
	private String modelo;
	private String color;
	private String baterias;
	
	
	public Calculadora() {
		
	}
	
	public Calculadora(String marca, String modelo, String color, String baterias) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.baterias = baterias;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getBaterias() {
		return baterias;
	}


	public void setBaterias(String baterias) {
		this.baterias = baterias;
	}


	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", baterias=" + baterias
				+ "]";
	}
	

	
	    public abstract void sumar();
	    public abstract void restar();
	    public abstract void multiplicar();
	    public abstract void dividir();
	

	
}
