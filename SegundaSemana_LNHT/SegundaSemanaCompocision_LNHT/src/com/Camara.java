package com;

public class Camara {
	private String marca;
	private String modelo;
	private int pixeles;
	
	public Camara() {}
	public Camara(String marca, String modelo, int pixeles) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.pixeles = pixeles;
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
	public int getPixeles() {
		return pixeles;
	}
	public void setPixeles(int pixeles) {
		this.pixeles = pixeles;
	}
	@Override
	public String toString() {
		return "Camara [marca=" + marca + ", modelo=" + modelo + ", pixeles=" + pixeles + "]";
	}
	
	 
}
