package com;

public class Exterior {

	private int largo;
	private int ancho;
	private String iluminacion;
	
	public Exterior () {}

	public Exterior(int largo, int ancho, String iluminacion) {
		super();
		this.largo = largo;
		this.ancho = ancho;
		this.iluminacion = iluminacion;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public String getIluminacion() {
		return iluminacion;
	}

	public void setIluminacion(String iluminacion) {
		this.iluminacion = iluminacion;
	}

	@Override
	public String toString() {
		return "Exterior [largo=" + largo + ", ancho=" + ancho + ", iluminacion=" + iluminacion + "]";
	}
	
	
}
