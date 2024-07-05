package com;

import java.util.Scanner;

public  class Empleado extends Persona {

	private String rfc;
	private String puesto;
	private int numeroEmpleado;
	private double salario;
	private String turno;

	public Empleado() {
		super();
	}

	public Empleado(String nombre, String genero, int edad, String rfc, String puesto, int numeroEmpleado,
			double salario, String turno) {
		super(nombre, genero, edad);
		this.rfc = rfc;
		this.puesto = puesto;
		this.numeroEmpleado = numeroEmpleado;
		this.salario = salario;
		this.turno = turno;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [rfc = " + rfc + ", puesto = " + puesto + ", numeroEmpleado = " + numeroEmpleado + ", salario = "
				+ salario + ", turno = " + turno + ", " + super.toString() + "]";
	}

	@Override
	public void Sumar(int a, int b) {
		System.out.println("la suma es de " + a + " + " + b + " = " +(a+b)  );
		
	}

	@Override
	public void Sumar() {
		int a;
		int b;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		a = entrada.nextInt();
		
		System.out.println("Introduce el segundo numero");
		b = entrada.nextInt();
		System.out.println("la suma es de " + a + " + " + b + " = " +(a+b)  );
		
	}
	
}
