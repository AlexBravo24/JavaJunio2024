package com;

public class Refrigerador extends Electrodomestico {
	private double capacidad;
	private boolean tieneDispensadorDeAgua;

	public Refrigerador() {

	}

	public Refrigerador(String marca, String modelo, double precio, double capacidad, boolean tieneDispensadorDeAgua) {
		super(marca, modelo, precio);
		this.capacidad = capacidad;
		this.tieneDispensadorDeAgua = tieneDispensadorDeAgua;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isTieneDispensadorDeAgua() {
		return tieneDispensadorDeAgua;
	}

	public void setTieneDispensadorDeAgua(boolean tieneDispensadorDeAgua) {
		this.tieneDispensadorDeAgua = tieneDispensadorDeAgua;
	}

	@Override
	public String toString() {
		return "Refrigerador [capacidad=" + capacidad + ", tieneDispensadorDeAgua=" + tieneDispensadorDeAgua
				+ ", toString()=" + super.toString() + "]";
	}

}
