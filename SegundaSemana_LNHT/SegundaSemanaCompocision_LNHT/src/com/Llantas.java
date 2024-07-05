package com;

public class Llantas {
	private String marca;
	private String tipo;
	private int tamaņoPulg;
	
	public Llantas() {}

	public Llantas(String marca, String tipo, int tamaņoPulg) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tamaņoPulg = tamaņoPulg;
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

	public int getTamaņoPulg() {
		return tamaņoPulg;
	}

	public void setTamaņoPulg(int tamaņoPulg) {
		this.tamaņoPulg = tamaņoPulg;
	}

	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", tipo=" + tipo + ", tamaņoPulg=" + tamaņoPulg + "]";
	}
	
}
