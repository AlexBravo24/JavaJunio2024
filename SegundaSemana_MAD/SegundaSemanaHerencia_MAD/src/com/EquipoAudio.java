package com;

public class EquipoAudio {
	
	private double potencia; 
	private double frecuencia;
	private String conectividad;
	
	public EquipoAudio() {}

	public EquipoAudio(double potencia, double frecuencia, String conectividad) {
		super();
		this.potencia = potencia;
		this.frecuencia = frecuencia;
		this.conectividad = conectividad;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getConectividad() {
		return conectividad;
	}

	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}

	@Override
	public String toString() {
		return "EquipoAudio [potencia = " + potencia + ", frecuencia = " + frecuencia + ", conectividad = " + conectividad
				+ "]";
	}
	
	
	
	

}
