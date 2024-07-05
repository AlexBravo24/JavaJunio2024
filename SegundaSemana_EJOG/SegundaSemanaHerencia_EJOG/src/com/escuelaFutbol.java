package com;

public class escuelaFutbol extends Jugador {
	
	private String escuela;
	private String region;
	private String estado;
	
	public escuelaFutbol() {}

	public escuelaFutbol(String nombre, String genero, int edad, String posicion, String categoria,
			int tiempoEntrenando, String escuela, String region, String estado) {
		super(nombre, genero, edad, posicion, categoria, tiempoEntrenando);
		this.escuela = escuela;
		this.region = region;
		this.estado = estado;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "escuelaFutbol [escuela=" + escuela + ", region=" + region + ", estado=" + estado + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
