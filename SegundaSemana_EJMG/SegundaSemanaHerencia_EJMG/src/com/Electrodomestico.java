package com;

public class Electrodomestico {
	
	   private String nombre;
	   private String color;
	   private int precio ;
	   
	   public Electrodomestico() {}

	public Electrodomestico(String nombre, String color, int precio) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Electrodomestico [nombre=" + nombre + ", color=" + color + ", precio=" + precio + "]";
	}
	   

}
