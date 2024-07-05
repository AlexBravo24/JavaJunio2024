package com;

public class Televisor {
	
	private String marca;
	private String color;
	private int tama�o;
	private double precio;
	
	
public Televisor () {
		
		
	}


public Televisor(String marca, String color, int tama�o, double precio) {
	super();
	this.marca = marca;
	this.color = color;
	this.tama�o = tama�o;
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


public int getTama�o() {
	return tama�o;
}


public void setTama�o(int tama�o) {
	this.tama�o = tama�o;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


@Override
public String toString() {
	return "Televisor [marca=" + marca + ", color=" + color + ", tama�o=" + tama�o + ", precio=" + precio + "]";
}



	

}


