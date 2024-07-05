package com;

public class Llantas {
	private String marca;
	private String tipo;
	private int tamañoPulg;
	
	public Llantas() {}

	public Llantas(String marca, String tipo, int tamañoPulg) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tamañoPulg = tamañoPulg;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTamañoPulg() {
		return tamañoPulg;
	}

	public void setTamañoPulg(int tamañoPulg) {
		this.tamañoPulg = tamañoPulg;
	}

	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", tipo=" + tipo + ", tamañoPulg=" + tamañoPulg + "]";
	}
	
}
