package com;

public class Alumnos {

	private String alumno;
	private String carrera;
	private double promedio;
	
	public Alumnos () {
		
	}

	public Alumnos(String alumno, String carrera, double promedio) {
		super();
		this.alumno = alumno;
		this.carrera = carrera;
		this.promedio = promedio;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Alumnos [alumno=" + alumno + ", carrera=" + carrera + ", promedio=" + promedio + "]";
	}
	
}
