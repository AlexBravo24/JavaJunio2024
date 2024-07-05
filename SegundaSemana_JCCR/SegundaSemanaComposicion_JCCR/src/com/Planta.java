package com;

public class Planta {

	private String especie;
	private String color;
	private Double altura;
	
	public Planta() {
		super();
	}
	
	public Planta(String especie, String color, Double altura) {
		super();
		this.especie = especie;
		this.color = color;
		this.altura = altura;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Planta [especie=" + especie + ", color=" + color + ", altura=" + altura + "]";
	}
	
	
	
}
