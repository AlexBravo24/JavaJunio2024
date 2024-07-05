package com;

public class Bicicleta {
	
//atributos de la biciucleta
	private String marca;
	private String modelo;
	private String color;
	
	//objetos que serian atributos de la misma bicicleta
	

	private Llantas llantas;
	private Rin rin;
	private Frenos frenos;
	
	public Bicicleta () {
		
	}

	public Bicicleta(String marca, String modelo, String color, Llantas llan, Rin rin, Frenos fren) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.llantas = llan;
		this.rin = rin;
		this.frenos = fren;
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

	public Llantas getLlan() {
		return llantas;
	}

	public void setLlan(Llantas llan) {
		this.llantas = llan;
	}

	public Rin getRin() {
		return rin;
	}

	public void setRin(Rin rin) {
		this.rin = rin;
	}

	public Frenos getFren() {
		return frenos;
	}

	public void setFren(Frenos fren) {
		this.frenos = fren;
	}

	@Override
	public String toString() {
		return "Bicicleta [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", llan=" + llantas + ", rin="
				+ rin + ", fren=" + frenos + "]";
	}
	
	
	
	
	

}
