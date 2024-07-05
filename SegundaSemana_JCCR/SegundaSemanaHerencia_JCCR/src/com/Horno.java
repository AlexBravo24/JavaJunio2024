package com;

public class Horno extends Cocina {
	private double capacidadInterna;
	private int temperaturaMaxima;

	public Horno(String marca, String modelo, double precio, int numeroDeQuemadores, boolean tieneHorno,
			double capacidadInterna, int temperaturaMaxima) {
		super(marca, modelo, precio, numeroDeQuemadores, tieneHorno);
		this.capacidadInterna = capacidadInterna;
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public double getCapacidadInterna() {
		return capacidadInterna;
	}

	public void setCapacidadInterna(double capacidadInterna) {
		this.capacidadInterna = capacidadInterna;
	}

	public int getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public void setTemperaturaMaxima(int temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

	@Override
	public String toString() {
		return "Horno [capacidadInterna=" + capacidadInterna + ", temperaturaMaxima=" + temperaturaMaxima
				+ ", toString()=" + super.toString() + "]";
	}

}
