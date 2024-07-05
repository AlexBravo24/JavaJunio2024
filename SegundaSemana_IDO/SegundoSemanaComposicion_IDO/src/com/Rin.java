package com;

public class Rin {
	

	private int rodada;
	private String marca;
	
	public Rin(int rodada, String marca) {
		super();
		this.rodada = rodada;
		this.marca = marca;
	}
	public int getRodada() {
		return rodada;
	}
	public void setRodada(int rodada) {
		this.rodada = rodada;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Rin [rodada=" + rodada + ", marca=" + marca + "]";
	}
	
	

}
