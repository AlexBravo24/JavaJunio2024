package com;

public abstract class Persona {

	private String nombre;
	private String genero;
	private int edad;

	public Persona() {
		super();
	}

	public Persona(String nombre, String genero, int edad) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	
	// Métodos o accions
	
	public void Dormir() {
		System.out.println("...ZZZZZzzzzzzzzz.......ZZZZZzzzzzzzzz.......ZZZZZzzzzzzzzz....");
	}
	

	public int FechaNacimiento(int año) {
		return año - this.edad;
	}
	
	public void FechaNacimiento() {
		System.out.println("fecha de nacimiento = " + (2024 - this.edad));
	}
	
	
	public String FechaNacimiento(String fecha) {
		return "Tu fecha de nacimiento es " + fecha;
	}
	
	
	
	public abstract void Sumar(int a, int b);
	public abstract void Sumar();
	
}
