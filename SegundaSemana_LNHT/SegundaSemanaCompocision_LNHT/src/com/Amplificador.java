package com;

public class Amplificador {
	private String marca;
	private String modelo;
	private int wattOut;
	
	public Amplificador() {}
	public Amplificador(String marca, String modelo, int wattOut) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.wattOut = wattOut;
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
	public int getWattOut() {
		return wattOut;
	}
	public void setWattOut(int wattOut) {
		this.wattOut = wattOut;
	}
	@Override
	public String toString() {
		return "Amplificador [marca=" + marca + ", modelo=" + modelo + ", wattOut=" + wattOut + "]";
	}
	
	
}
