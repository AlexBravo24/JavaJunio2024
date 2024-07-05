package com;

public class Jugador extends Persona {
	private String posicion;
	private String categoria;
	private int tiempoEntrenando;
	
	public Jugador() {}

	public Jugador(String nombre, String genero, int edad, String posicion, String categoria, int tiempoEntrenando) {
		super(nombre, genero, edad);
		this.posicion = posicion;
		this.categoria = categoria;
		this.tiempoEntrenando = tiempoEntrenando;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getTiempoEntrenando() {
		return tiempoEntrenando;
	}

	public void setTiempoEntrenando(int tiempoEntrenando) {
		this.tiempoEntrenando = tiempoEntrenando;
	}

	@Override
	public String toString() {
		return "Jugador [posicion=" + posicion + ", categoria=" + categoria + ", tiempoEntrenando=" + tiempoEntrenando
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void sumar(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sumar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
