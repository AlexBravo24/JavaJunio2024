package com_TMJ;

public class Cerveza {
	private String marca;
	private String presentacion ;
	private double alcohol;
	private double precio;
	
	public Cerveza()
	{		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cerveza [marca=" + marca + ", presentacion=" + presentacion + ", alcohol=" + alcohol+" %" + ", precio="+"$"+
				+ precio + "]";
	}
	
	

}
