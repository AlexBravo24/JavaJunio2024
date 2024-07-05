package com;

import java.util.Scanner;

//Para heredar los datos o informacion de otra clase se usa la palabra "EXTENDS":

public class Empleado extends Persona {
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado () {}

	public Empleado(String name, String genere, int edad, String rfc, double salario, String turno) {
		super(name, genere, edad);
		this.rfc = rfc;
		this.salario = salario;
		this.turno = turno;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
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

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void sumar(int a, int b) {
		
		//Las clases hijas que heredaran una clase abstracta debe definir CÓMO se realizará esta acción
		
		System.out.println("La suma es: " + (a+b));
	}

	@Override
	public void sumar() {
		
		//Ahora la lógica que utilizabamos en la programación estructurada la puedo guardar pero aquí en métodos para solicitar números a sumar, pero por TECLADO.
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un primer número");
		a=sc.nextInt();
		System.out.println("Introduce un segundo número");
		b=sc.nextInt();
		
		System.out.println("La suma es: " + (a+b));
		
	}
	
	

}
