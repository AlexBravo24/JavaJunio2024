package com;

public class Master extends Maestro{
  private String doctorado;
  private int a�o;
  
  public Master() {}
	
	public Master(String nombre, String genero, int edad, String horaEntrada, int numClases, String horaSalida, int salario,
			String titulo, int numClass, String doctorado, int a�o) {
		super(nombre, genero, edad, horaEntrada, numClases, horaSalida, salario, titulo, numClass);
		this.doctorado = doctorado;
		this.a�o = a�o;
}

	public String getDoctorado() {
		return doctorado;
	}

	public void setDoctorado(String doctorado) {
		this.doctorado = doctorado;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "\n Master [doctorado=" + doctorado + ", a�o=" + a�o + ", toString()=" + super.toString() + "]";
	}
	
  
  
}
