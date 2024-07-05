package com;

public class Motocicleta extends Transporte{
	
	private String transmision;
	private String velocidadMax;
	private String potenciaMax;
	
	public Motocicleta () {}

	public Motocicleta(String nombre, String color, int llantas, String transmision, String velocidadMax,
			String potenciaMax) {
		super(nombre, color, llantas);
		this.transmision = transmision;
		this.velocidadMax = velocidadMax;
		this.potenciaMax = potenciaMax;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	public String getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(String velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public String getPotenciaMax() {
		return potenciaMax;
	}

	public void setPotenciaMax(String potenciaMax) {
		this.potenciaMax = potenciaMax;
	}

	@Override
	public String toString() {
		return "Motocicleta [transmision=" + transmision + ", velocidadMax=" + velocidadMax + ", potenciaMax="
				+ potenciaMax + ", toString()=" + super.toString() + "]";
	}
	
	

}
