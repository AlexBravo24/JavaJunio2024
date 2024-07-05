package com;

public class Studen extends Persona {
	private String horaEntrada;
	private int numClases;
	private String horaSalida;
	
	public Studen() {}

	public Studen(String nombre, String genero, int edad, String horaEntrada, int numClases, String horaSalida) {
		super(nombre, genero, edad);
		this.horaEntrada = horaEntrada;
		this.numClases = numClases;
		this.horaSalida = horaSalida;
	}

	
	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getNumClases() {
		return numClases;
	}

	public void setNumClases(int numClases) {
		this.numClases = numClases;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	@Override
	public String toString() {
		return "Studen [horaEntrada=" + horaEntrada + ", numClases=" + numClases + ", horaSalida=" + horaSalida
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public void sumar(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sumar() {
		
		
	}
	
	
}
