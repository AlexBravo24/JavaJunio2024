package com;

public class Laptop {
	
	// Atributos
	
	private String marca;
	private String modelo;
	private String color;	
	//Estos son objetos que también son atributos de una laptop.
	private Procesador cpu;
	private Almacenamiento disco;
	private Ram memoria;
	
	//Constructores
	public Laptop () {
		
	}

	public Laptop(String marca, String modelo, String color, Procesador cpu, Almacenamiento disco, Ram memoria) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
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
		return "Laptop [marca = " + marca + ", modelo = " + modelo + ", color = " + color + ", cpu = " + cpu + ", disco = "
				+ disco + ", memoria = " + memoria + "]";
	}
	


}
