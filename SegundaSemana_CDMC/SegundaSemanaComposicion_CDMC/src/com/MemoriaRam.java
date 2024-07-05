package com;

public class MemoriaRam {

	
	
	private String tipo;
	private double salida;
	private double capacidad;
	
	
	
	public MemoriaRam() {
		
	}



	public MemoriaRam(String tipo, double salida, double capacidad) {
		super();
		this.tipo = tipo;
		this.salida = salida;
		this.capacidad = capacidad;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public double getSalida() {
		return salida;
	}



	public void setSalida(double salida) {
		this.salida = salida;
	}



	public double getCapacidad() {
		return capacidad;
	}



	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}



	@Override
	public String toString() {
		return "MemoriaRam [tipo=" + tipo + ", salida=" + salida + ", capacidad=" + capacidad + "]";
	}
	

}
