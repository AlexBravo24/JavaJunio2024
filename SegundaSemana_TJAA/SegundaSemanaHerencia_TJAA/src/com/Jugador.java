package com;

public class Jugador extends Entrenador{
	
	private int numero;
	private String posici�n;
	
	public Jugador () {}

	public Jugador(String nombre, String apellido, double sueldo, int numero, String posici�n) {
		super(nombre, apellido, sueldo);
		this.numero = numero;
		this.posici�n = posici�n;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosici�n() {
		return posici�n;
	}

	public void setPosici�n(String posici�n) {
		this.posici�n = posici�n;
	}

	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", posici�n=" + posici�n + ", toString()=" + super.toString() + "]";
	}
	
	

}
