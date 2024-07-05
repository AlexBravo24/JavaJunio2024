package com;

public class Camioneta {

	private String marca;
	private String color; 
	private int puertas;
	
	private Motor potencia;
	private Interior inside;
	private Exterior outside;
	
	public Camioneta () {}

	public Camioneta(String marca, String color, int puertas, Motor potencia, Interior inside, Exterior outside) {
		super();
		this.marca = marca;
		this.color = color;
		this.puertas = puertas;
		this.potencia = potencia;
		this.inside = inside;
		this.outside = outside;
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

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public Motor getPotencia() {
		return potencia;
	}

	public void setPotencia(Motor potencia) {
		this.potencia = potencia;
	}

	public Interior getInside() {
		return inside;
	}

	public void setInside(Interior inside) {
		this.inside = inside;
	}

	public Exterior getOutside() {
		return outside;
	}

	public void setOutside(Exterior outside) {
		this.outside = outside;
	}

	@Override
	public String toString() {
		return "Camioneta [marca=" + marca + ", color=" + color + ", puertas=" + puertas + ", potencia=" + potencia
				+ ", inside=" + inside + ", outside=" + outside + "]";
	}
	
	

	
}
