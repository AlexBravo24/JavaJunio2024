package com;

public class OldSmartphones {
	
	private String marca;
	private String modelo;
	private double memoriaGB;
	private String internet;
	
	public OldSmartphones ()
	{}

	public OldSmartphones(String marca, String modelo, double memoriaGB, String internet) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.memoriaGB = memoriaGB;
		this.internet = internet;
	
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

	public double getMemoriaGB() {
		return memoriaGB;
	}

	public void setMemoriaGB(double memoriaGB) {
		this.memoriaGB = memoriaGB;
	}

	public String getInternet() {
		return internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
	}

	@Override
	public String toString() {
		return "OldSmartphones [marca=" + marca + ", modelo=" + modelo + ", memoriaGB=" + memoriaGB + ", internet="
				+ internet + "]";
	}
	
	

}
