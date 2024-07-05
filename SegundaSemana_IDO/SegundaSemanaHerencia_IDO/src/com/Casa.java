package com;

public class Casa {
	
	private int ventanas;
	private int puertas;
	private int alcobas;
	
public Casa() {
		
	}

public Casa(int ventanas, int puertas, int alcobas) {
	super();
	this.ventanas = ventanas;
	this.puertas = puertas;
	this.alcobas = alcobas;
}

public int getVentanas() {
	return ventanas;
}

public void setVentanas(int ventanas) {
	this.ventanas = ventanas;
}

public int getPuertas() {
	return puertas;
}

public void setPuertas(int puertas) {
	this.puertas = puertas;
}

public int getAlcobas() {
	return alcobas;
}

public void setAlcobas(int alcobas) {
	this.alcobas = alcobas;
}

@Override
public String toString() {
	return "Casa [ventanas=" + ventanas + ", puertas=" + puertas + ", alcobas=" + alcobas + "]";
}


	

}
