package com;

public class Motor {
	
	private String transmision;
	private String potencia;
	private String traccion;
	
	public Motor () {}

	public Motor(String transmision, String potencia, String traccion) {
		super();
		this.transmision = transmision;
		this.potencia = potencia;
		this.traccion = traccion;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	@Override
	public String toString() {
		return "Motor [transmision=" + transmision + ", potencia=" + potencia + ", traccion=" + traccion + "]";
	}
	
	
	

}
