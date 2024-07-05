package com;

public class Llanta {
	
	private String Medida;
	private String Diametro;
	private int Carga;
	private char Velocidad;
	
	public Llanta () {
		
	}

	public Llanta(String medida, String diametro, int carga, char velocidad) {
		super();
		Medida = medida;
		Diametro = diametro;
		Carga = carga;
		Velocidad = velocidad;
	}

	public String getMedida() {
		return Medida;
	}

	public void setMedida(String medida) {
		Medida = medida;
	}

	public String getDiametro() {
		return Diametro;
	}

	public void setDiametro(String diametro) {
		Diametro = diametro;
	}

	public int getCarga() {
		return Carga;
	}

	public void setCarga(int carga) {
		Carga = carga;
	}

	public char getVelocidad() {
		return Velocidad;
	}

	public void setVelocidad(char velocidad) {
		Velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Llanta [Medida = " + Medida + ", Diametro = " + Diametro + ", Carga = " + Carga + ", Velocidad = " + Velocidad
				+ "]";
	}

	
}
