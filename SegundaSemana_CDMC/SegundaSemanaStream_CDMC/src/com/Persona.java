package com;

public class Persona {
	
	private String nombre;
	private String genero;
	private double edad;
	
	public Persona() {
		
	}

	public Persona(String nombre, String genero, double edad) {
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

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	
	

}
