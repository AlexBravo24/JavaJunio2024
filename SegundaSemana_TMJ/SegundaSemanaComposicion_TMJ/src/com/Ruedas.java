package com;

public class Ruedas {
	
	private String color;
	private String rodada;
	private String modelo;

	
	public Ruedas() {
		
	}


	public Ruedas(String color, String rodada, String modelo) {
		super();
		this.color = color;
		this.rodada = rodada;
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getRodada() {
		return rodada;
	}


	public void setRodada(String rodada) {
		this.rodada = rodada;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	@Override
	public String toString() {
		return "Ruedas [color=" + color + ", rodada=" + rodada + ", modelo=" + modelo + "]";
	}
	

}
