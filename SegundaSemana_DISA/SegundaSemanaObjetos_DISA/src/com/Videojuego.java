package com;

public class Videojuego {
	//Determinaci�n de argumento:
	private int jugadores;
	private String tematica;
	private String consola;
	private int niveles;
	
	//M�todo constructor vac�o:
	public Videojuego () {
		
	}
	//M�todo constructor de todos los argumentos:

	public Videojuego(int jugadores, String tematica, String consola, int niveles) {
		super();
		this.jugadores = jugadores;
		this.tematica = tematica;
		this.consola = consola;
		this.niveles = niveles;
	}
	//M�todos Getter y Setter

	public int getJugadores() {
		return jugadores;
	}

	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getConsola() {
		return consola;
	}

	public void setConsola(String consola) {
		this.consola = consola;
	}

	public int getNiveles() {
		return niveles;
	}

	public void setNiveles(int niveles) {
		this.niveles = niveles;
	}
	//M�todo toString

	@Override
	public String toString() {
		return "Videojuego [jugadores=" + jugadores + ", tematica=" + tematica + ", consola=" + consola + ", niveles="
				+ niveles + "]";
	}
	
	
	
	

}
