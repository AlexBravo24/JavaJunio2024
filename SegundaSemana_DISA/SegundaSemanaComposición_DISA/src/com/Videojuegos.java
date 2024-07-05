package com;

public class Videojuegos {
	private int jugadores;
	private String genere;
	private int niveles;
	
	//Método constructor vacío:
	public Videojuegos () {}

	public Videojuegos(int jugadores, String genere, int niveles) {
		super();
		this.jugadores = jugadores;
		this.genere = genere;
		this.niveles = niveles;
	}

	public int getJugadores() {
		return jugadores;
	}

	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getNiveles() {
		return niveles;
	}

	public void setNiveles(int niveles) {
		this.niveles = niveles;
	}

	@Override
	public String toString() {
		return "Videojuegos [jugadores=" + jugadores + ", genere=" + genere + ", niveles=" + niveles + "]";
	}
	
	

}
