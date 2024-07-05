package com;

import java.util.Scanner;

//La herencia es otro pilar de la POO y se realiza con la palabra reservada extends

// Esto nos va a permitir "reciclar codigo" y solo declarar aqui los atributos que sean propios de un empleado.

public class Empleado extends Persona{

	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado () {}

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
		return "Empleado [rfc = " + rfc + ", salario = " + salario + ", turno = " + turno + ", toString() = " + super.toString()
				+ "]";
	}

	@Override
	public void sumar(int a, int b) {
		// Las clases hijas que heredan de una clase abstracta deben definir C�MO se realizar� esta acci�n
		System.out.println("La suma es: "+(a+b));
	}

	@Override
	public void sumar() {
		// Ahora la l�gica que antes utilizabamos en la programaci�n estructurada la puedo guardar pero aqu� en m�todos
		// para solicitar los n�meros a sumar pero por teclado.
		
		int a, b;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce un primer n�mero: ");
		a = entrada.nextInt();
		System.out.print("Introduce un segundo n�mero: ");
		b = entrada.nextInt();
		System.out.println("\nLa suma es: "+(a+b));		
}
		
	
	
	
} // class
