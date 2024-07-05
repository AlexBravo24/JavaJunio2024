package com;

import java.util.Scanner;

//La HERENCIA es otro pilar de la POO y se realiza con la palabra reservada extends
public class Empleado extends Persona{
	
	//Esto nos va a permitir "reciclar codigo" y solo declarar aqui los atributos que sean propios de un empleado
	
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado() {}

	public Empleado(String nombre, String genero, int edad, String rfc, double salario, String turno) {
		super(nombre, genero, edad);
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
	//Este método viene de una clase abstracta
	public void sumar(int a, int b) {
		// Las clases hijas que heredann de una clase abstracta, deben definir cómo se realizara esta acción.
		System.out.println("La suma es : "+(a+b));
		
	}

	@Override
	public void sumar() {
		// Ahora la lógica que antes se utilizaba en la programación estructura la puedo guardas para solicitar los numero a sumar
		//pero por taclado
		
		int a;
		int b;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un primer numero :");
		a=entrada.nextInt();
		System.out.println("Introduce un segundo numero :");
		b=entrada.nextInt();
		
		System.out.println("La suma es : "+(a+b));
		
		
			
		
	}
	
	
	

}
