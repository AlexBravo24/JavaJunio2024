package com;

public class Lavadora extends Electrodomestico {
	private double capacidadDeCarga;
	private int velocidadDeCentrifugado;

	public Lavadora() {

	}

	public Lavadora(String marca, String modelo, double precio, double capacidadDeCarga, int velocidadDeCentrifugado) {
		super(marca, modelo, precio);
		this.capacidadDeCarga = capacidadDeCarga;
		this.velocidadDeCentrifugado = velocidadDeCentrifugado;
	}

	public double getCapacidadDeCarga() {
		return capacidadDeCarga;
	}

	public void setCapacidadDeCarga(double capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}

	public int getVelocidadDeCentrifugado() {
		return velocidadDeCentrifugado;
	}

	public void setVelocidadDeCentrifugado(int velocidadDeCentrifugado) {
		this.velocidadDeCentrifugado = velocidadDeCentrifugado;
	}

	@Override
	public String toString() {
		return "Lavadora [capacidadDeCarga=" + capacidadDeCarga + ", velocidadDeCentrifugado=" + velocidadDeCentrifugado
				+ ", toString()=" + super.toString() + "]";
	}

}
