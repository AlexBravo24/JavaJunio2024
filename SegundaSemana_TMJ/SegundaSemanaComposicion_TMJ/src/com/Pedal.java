package com;

public class Pedal {
	private String marca;
	private String modelo; 
	private String color;
	private String material;
	
	public Pedal() {
		
	}

	public Pedal(String marca, String modelo, String color, String material) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.material = material;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Pedal [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", material=" + material + "]";
	}
	
	
}
