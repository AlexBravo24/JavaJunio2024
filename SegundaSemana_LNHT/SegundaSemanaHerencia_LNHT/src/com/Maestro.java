package com;

public class Maestro extends Studen {

	private int salario;
	private String titulo;
	private int numClass;
	
	public Maestro() {}

	public Maestro(String nombre, String genero, int edad, String horaEntrada, int numClases, String horaSalida,
			int salario, String titulo, int numClass) {
		super(nombre, genero, edad, horaEntrada, numClases, horaSalida);
		this.salario = salario;
		this.titulo = titulo;
		this.numClass = numClass;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumClass() {
		return numClass;
	}

	public void setNumClass(int numClass) {
		this.numClass = numClass;
	}

	@Override
	public String toString() {
		return "Maestro [salario= $" + salario + ", titulo=" + titulo + ", numClass=" + numClass + "\n , toString()="
				+ super.toString() + "]";
	}
	
	
	
}
