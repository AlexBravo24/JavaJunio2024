package com;

public abstract class Calculadora {
	private String marca ;
	private String color ;
	private double precio ;
	
	
public Calculadora() {
		
	}

	//constructor con todos los atributos
public Calculadora(String marca, String color, double precio) {
	super();
	this.marca = marca;
	this.color = color;
	this.precio = precio;
}

//geters y setters

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

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

//toString

@Override
public String toString() {
	return "Calculadora [marca=" + marca + ", color=" + color + ", precio=" + precio + "]";
}


public abstract void sumar ();
public abstract void restar ();
public abstract void multiplicar ();
public abstract void dividir ();



	

}
