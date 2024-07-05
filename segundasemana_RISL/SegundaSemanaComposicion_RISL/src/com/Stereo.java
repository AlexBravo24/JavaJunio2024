package com;

public class Stereo {

	private String marca;
	private String modelo;
	private String conectividad;
	private int potenciaSalida;
	public Stereo(String marca, String modelo, String conectividad, int potenciaSalida) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.conectividad = conectividad;
		this.potenciaSalida = potenciaSalida;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getConectividad() {
		return conectividad;
	}
	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}
	public int getPotencia() {
		return potenciaSalida;
	}
	public void setPotencia(int potencia) {
		this.potenciaSalida = potencia;
	}
	@Override
	public String toString() {
		return "Stereo [marca=" + marca + ", modelo=" + modelo + ", conectividad=" + conectividad + ", potenciaSalida="
				+ potenciaSalida + "]";
	};
	
	
}
