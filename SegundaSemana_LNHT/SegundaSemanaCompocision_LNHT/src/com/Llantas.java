package com;

public class Llantas {
	private String marca;
	private String tipo;
	private int tama�oPulg;
	
	public Llantas() {}

	public Llantas(String marca, String tipo, int tama�oPulg) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.tama�oPulg = tama�oPulg;
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

	public int getTama�oPulg() {
		return tama�oPulg;
	}

	public void setTama�oPulg(int tama�oPulg) {
		this.tama�oPulg = tama�oPulg;
	}

	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", tipo=" + tipo + ", tama�oPulg=" + tama�oPulg + "]";
	}
	
}
