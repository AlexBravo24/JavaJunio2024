package com;

public class Materia {
	
	private String nombre;
	private int maestro;
	private int semestre;
	
	public Materia(){
		
	}

	public Materia(String nombre, int maestro, int semestre) {
		super();
		this.nombre = nombre;
		this.maestro = maestro;
		this.semestre = semestre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMaestro() {
		return maestro;
	}

	public void setMaestro(int maestro) {
		this.maestro = maestro;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", maestro=" + maestro + ", semestre=" + semestre + "]";
	}
	
	

}
