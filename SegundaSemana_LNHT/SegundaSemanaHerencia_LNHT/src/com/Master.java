package com;

public class Master extends Maestro{
  private String doctorado;
  private int año;
  
  public Master() {}
	
	public Master(String nombre, String genero, int edad, String horaEntrada, int numClases, String horaSalida, int salario,
			String titulo, int numClass, String doctorado, int año) {
		super(nombre, genero, edad, horaEntrada, numClases, horaSalida, salario, titulo, numClass);
		this.doctorado = doctorado;
		this.año = año;
}

	public String getDoctorado() {
		return doctorado;
	}

	public void setDoctorado(String doctorado) {
		this.doctorado = doctorado;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "\n Master [doctorado=" + doctorado + ", año=" + año + ", toString()=" + super.toString() + "]";
	}
	
  
  
}
