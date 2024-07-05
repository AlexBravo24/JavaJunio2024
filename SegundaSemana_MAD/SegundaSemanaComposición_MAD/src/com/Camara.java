package com;

public class Camara {
	private String Imagen;
	private double frecuencia;
	private int precio;
	
	public Camara() {}

	public Camara(String imagen, double frecuencia, int precio) {
		super();
		Imagen = imagen;
		this.frecuencia = frecuencia;
		this.precio = precio;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Camara [Imagen = " + Imagen + ", frecuencia = " + frecuencia + ", precio = " + precio + "]";
	}
	
	

}
