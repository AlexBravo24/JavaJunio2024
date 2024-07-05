package com;

public class Alumnos {
	
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String direccion;
	private int edad;
	
	public Alumnos() {
		
	}

	public Alumnos(String nombre, String apellidoPaterno, String apellidoMaterno, String direccion, int edad) {
		super();
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.direccion = direccion;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Alumnos [nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", direccion=" + direccion + ", edad=" + edad + "]";
	}
	
	

}
