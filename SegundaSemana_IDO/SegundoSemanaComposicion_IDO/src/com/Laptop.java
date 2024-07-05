package com;

public class Laptop {
	
	//Atributos
	
	private String marca;
	private String color;
	private String modelo;
	
	// estoss son objetos que tambien son atributos de una laptoop
	
	private Procesador cpu;
	private Almacenamiento disco;
	private Ram memoria;
	
	public Laptop () {
		
	}

	public Laptop(String marca, String color, String modelo, Procesador cpu, Almacenamiento disco, Ram memoria) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cpu = cpu;
		this.disco = disco;
		this.memoria = memoria;
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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Ram getMemoria() {
		return memoria;
	}

	public void setMemoria(Ram memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cpu=" + cpu + ", disco="
				+ disco + ", memoria=" + memoria + "]";
	}
	
	
	

}
