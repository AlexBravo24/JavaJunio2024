package com;

public class Televisor {
	
	private String marca;
	private String color;
	private int tamaño;
	private double precio;
	
	
public Televisor () {
		
		
	}


public Televisor(String marca, String color, int tamaño, double precio) {
	super();
	this.marca = marca;
	this.color = color;
	this.tamaño = tamaño;
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


public int getTamaño() {
	return tamaño;
}


public void setTamaño(int tamaño) {
	this.tamaño = tamaño;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


@Override
public String toString() {
	return "Televisor [marca=" + marca + ", color=" + color + ", tamaño=" + tamaño + ", precio=" + precio + "]";
}



	

}


