package com;

public class Laptop {

	//atributos
	
	private String marca;
	private String modelo;
	private String color;
	
	private procesador cpu;
	private Almacenamiento disco;
	private Ram memoria;
	
	public Laptop (){
		
	}
	
	
	public Laptop(String marca, String modelo, String color, procesador cpu, Almacenamiento disco, Ram memoria) {
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
	public procesador getCpu() {
		return cpu;
	}
	public void setCpu(procesador cpu) {
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
		return "Laptop [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", disco=" + disco + ", memoria="
				+ memoria + "]";
	}
	
	
	
	
	
	
	
	
	
}
