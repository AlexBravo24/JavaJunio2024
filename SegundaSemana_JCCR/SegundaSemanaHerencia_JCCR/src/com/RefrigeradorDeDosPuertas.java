package com;

public class RefrigeradorDeDosPuertas extends Refrigerador {
	private boolean tieneDispensadorDeHielo;

	public RefrigeradorDeDosPuertas() {

	}

	public RefrigeradorDeDosPuertas(String marca, String modelo, double precio, double capacidad,
			boolean tieneDispensadorDeAgua, boolean tieneDispensadorDeHielo) {
		super(marca, modelo, precio, capacidad, tieneDispensadorDeAgua);
		this.tieneDispensadorDeHielo = tieneDispensadorDeHielo;

	}

	public boolean isTieneDispensadorDeHielo() {
		return tieneDispensadorDeHielo;
	}

	public void setTieneDispensadorDeHielo(boolean tieneDispensadorDeHielo) {
		this.tieneDispensadorDeHielo = tieneDispensadorDeHielo;
	}

	@Override
	public String toString() {
		return "RefrigeradorDeDosPuertas [tieneDispensadorDeHielo=" + tieneDispensadorDeHielo + ", toString()="
				+ super.toString() + "]";
	}

}
