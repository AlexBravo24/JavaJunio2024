package com;

public class Jugador extends Entrenador{
	
	private int numero;
	private String posición;
	
	public Jugador () {}

	public Jugador(String nombre, String apellido, double sueldo, int numero, String posición) {
		super(nombre, apellido, sueldo);
		this.numero = numero;
		this.posición = posición;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPosición() {
		return posición;
	}

	public void setPosición(String posición) {
		this.posición = posición;
	}

	@Override
	public String toString() {
		return "Jugador [numero=" + numero + ", posición=" + posición + ", toString()=" + super.toString() + "]";
	}
	
	

}
