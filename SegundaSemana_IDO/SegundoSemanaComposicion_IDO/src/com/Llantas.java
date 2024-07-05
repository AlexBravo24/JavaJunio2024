package com;

public class Llantas {


	//Atributos
	
	private int rodada;
	private String marca;
	
	//contructor
	
	public Llantas(int rodada, String marca) {
		super();
		this.rodada = rodada;
		this.marca = marca;
	}

	//seters y getters
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

	// toString
	@Override
	public String toString() {
		return "Llantas [rodada=" + rodada + ", marca=" + marca + "]";
	}
	
	
	
	

	

}
