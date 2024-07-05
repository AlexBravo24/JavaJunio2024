package com;

public class Envasado {

	private String vidrio;
	private String plastico;
	private String carton;
	
	public Envasado () {}

	public Envasado(String vidrio, String plastico, String carton) {
		super();
		this.vidrio = vidrio;
		this.plastico = plastico;
		this.carton = carton;
	}

	public String getVidrio() {
		return vidrio;
	}

	public void setVidrio(String vidrio) {
		this.vidrio = vidrio;
	}

	public String getPlastico() {
		return plastico;
	}

	public void setPlastico(String plastico) {
		this.plastico = plastico;
	}

	public String getCarton() {
		return carton;
	}

	public void setCarton(String carton) {
		this.carton = carton;
	}

	@Override
	public String toString() {
		return "Envasado [vidrio=" + vidrio + ", plastico=" + plastico + ", carton=" + carton + "]";
	}
	
	
	
	
}
