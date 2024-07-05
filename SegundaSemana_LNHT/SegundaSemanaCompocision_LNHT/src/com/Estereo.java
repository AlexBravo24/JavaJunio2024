package com;

public class Estereo {

	private String marca;
	private String modelo;
	private int wattOut;
	private int outAmpli;
	
	public Estereo() {}

	public Estereo(String marca, String modelo, int wattOut, int outAmpli) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.wattOut = wattOut;
		this.outAmpli = outAmpli;
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

	public int getOutAmpli() {
		return outAmpli;
	}

	public void setOutAmpli(int outAmpli) {
		this.outAmpli = outAmpli;
	}

	@Override
	public String toString() {
		return "Estereo [marca=" + marca + ", modelo=" + modelo + ", wattOut=" + wattOut + ", outAmpli=" + outAmpli
				+ "]";
	}
	
	
}
