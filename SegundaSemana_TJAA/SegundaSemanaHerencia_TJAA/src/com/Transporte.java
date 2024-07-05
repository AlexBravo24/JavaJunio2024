package com;

public class Transporte {
	
	private String nombre;
	private String color;
	private int llantas;
	
	public Transporte () {}

	public Transporte(String nombre, String color, int llantas) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.llantas = llantas;
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

	public int getLlantas() {
		return llantas;
	}

	public void setLlantas(int llantas) {
		this.llantas = llantas;
	}

	@Override
	public String toString() {
		return "Transporte [nombre=" + nombre + ", color=" + color + ", llantas=" + llantas + "]";
	}
	
	
	

}
