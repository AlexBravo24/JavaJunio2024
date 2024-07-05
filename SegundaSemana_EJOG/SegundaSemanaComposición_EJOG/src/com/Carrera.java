package com;

public class Carrera {
	
	private String nombre;
	private String edificio;
	private int capacidad;
	//Estos son objetos
	private Alumnos estudiante;
	private Materia asignatura;
	private Maestro asignado;
	
	public Carrera() {
		
	}

	public Carrera(String nombre, String edificio, int capacidad, Alumnos estudiante, Materia asignatura,
			Maestro asignado) {
		super();
		this.nombre = nombre;
		this.edificio = edificio;
		this.capacidad = capacidad;
		this.estudiante = estudiante;
		this.asignatura = asignatura;
		this.asignado = asignado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Alumnos getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Alumnos estudiante) {
		this.estudiante = estudiante;
	}

	public Materia getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Materia asignatura) {
		this.asignatura = asignatura;
	}

	public Maestro getAsignado() {
		return asignado;
	}

	public void setAsignado(Maestro asignado) {
		this.asignado = asignado;
	}

	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", edificio=" + edificio + ", capacidad=" + capacidad + ", estudiante="
				+ estudiante + ", asignatura=" + asignatura + ", asignado=" + asignado + "]";
	}

		
}
