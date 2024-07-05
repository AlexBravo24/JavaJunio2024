package com;

public class motor {

	
	private int potencia;
	private int cilindros;
	private String marca;
	public motor(double potencia, int cilindros, String marca) {
		super();
		this.potencia = (int) potencia;
		this.cilindros = cilindros;
		this.marca = marca;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = (int) potencia;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "motor [potencia=" + potencia + ", cilindros=" + cilindros + ", marca=" + marca + "]";
	}
	
	
}
