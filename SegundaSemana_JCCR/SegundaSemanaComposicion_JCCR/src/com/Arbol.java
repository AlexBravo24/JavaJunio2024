package com;

public class Arbol {
	private String especie;
	private double altura;
	private int edad;

	public Arbol() {
		super();
	}

	public Arbol(String especie, double altura, int edad) {
		super();
		this.especie = especie;
		this.altura = altura;
		this.edad = edad;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Arbol [especie=" + especie + ", altura=" + altura + ", edad=" + edad + "]";
	}

}
