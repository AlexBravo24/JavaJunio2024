package com;

public class Entrenador {

	private String nombre;
	private String apellido;
	private double sueldo;
	
	public Entrenador () {}

	public Entrenador(String nombre, String apellido, double sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + "]";
	}
	
	
}