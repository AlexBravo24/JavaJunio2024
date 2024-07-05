package com;

public class Departamento extends Casa{
	
	private int focos;
	private int estacionamiento;
	private int cp;
	
public Departamento() {
		
	}

public Departamento(int ventanas, int puertas, int alcobas, int focos, int estacionamiento, int cp) {
	super(ventanas, puertas, alcobas);
	this.focos = focos;
	this.estacionamiento = estacionamiento;
	this.cp = cp;
}

public int getFocos() {
	return focos;
}

public void setFocos(int focos) {
	this.focos = focos;
}

public int getEstacionamiento() {
	return estacionamiento;
}

public void setEstacionamiento(int estacionamiento) {
	this.estacionamiento = estacionamiento;
}

public double getCp() {
	return cp;
}

public void setCp(int cp) {
	this.cp = cp;
}

@Override
public String toString() {
	return "Departamento [focos=" + focos + ", estacionamiento=" + estacionamiento + ", cp=" + cp + ", toString()="
			+ super.toString() + "]";
}



}
