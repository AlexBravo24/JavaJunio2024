package com;

public class Fuente {
	private String material; // ej. piedra, metal etc
	private double altura;
	private double capacidad;

	public Fuente() {
		super();
	}

	public Fuente(String material, double altura, double capacidad) {
		super();
		this.material = material;
		this.altura = altura;
		this.capacidad = capacidad;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Fuente [material=" + material + ", altura=" + altura + ", capacidad=" + capacidad + "]";
	}

}
