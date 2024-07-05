package com;

public class Animal {

	private String nombre;
	private String raza;
	private int edad;
	private double peso;
	private int numeroPatas;
	private Boolean sabeNadar;
	
	public Animal() {
		super();
	}

	public Animal(String nombre, String raza, int edad, double peso, int numeroPatas, Boolean sabeNadar) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.peso = peso;
		this.numeroPatas = numeroPatas;
		this.sabeNadar = sabeNadar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}

	public Boolean getSabeNadar() {
		return sabeNadar;
	}

	public void setSabeNadar(Boolean sabeNadar) {
		this.sabeNadar = sabeNadar;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", peso=" + peso + ", numeroPatas="
				+ numeroPatas + ", sabeNadar=" + sabeNadar + "]";
	}
	
}
