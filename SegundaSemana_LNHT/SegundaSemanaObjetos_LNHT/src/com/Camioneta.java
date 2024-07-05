package com;

public class Camioneta {

	private String nomCamioneta;
	private Double cargaToneladas;
	private String marca;
	private String modelo;
	private int noLlantas;
	
	public Camioneta() {
		super();
	}

	public Camioneta(String nomCamioneta, Double cargaToneladas, String marca, String modelo, int noLlantas) {
		super();
		this.nomCamioneta = nomCamioneta;
		this.cargaToneladas = cargaToneladas;
		this.marca = marca;
		this.modelo = modelo;
		this.noLlantas = noLlantas;
	}

	public String getNomCamioneta() {
		return nomCamioneta;
	}

	public void setNomCamioneta(String nomCamioneta) {
		this.nomCamioneta = nomCamioneta;
	}

	public Double getCargaToneladas() {
		return cargaToneladas;
	}

	public void setCargaToneladas(Double cargaToneladas) {
		this.cargaToneladas = cargaToneladas;
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

	public int getNoLlantas() {
		return noLlantas;
	}

	public void setNoLlantas(int noLlantas) {
		this.noLlantas = noLlantas;
	}

	@Override
	public String toString() {
		return "Camioneta [nomCamioneta=" + nomCamioneta + ", cargaToneladas=" + cargaToneladas + ", marca=" + marca
				+ ", modelo=" + modelo + ", noLlantas=" + noLlantas + "]";
	}
	
	
	
}
