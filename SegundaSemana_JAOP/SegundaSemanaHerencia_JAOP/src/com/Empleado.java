package com;

import java.util.Scanner;

public class Empleado extends Persona {
	
	
	//La herencia es otro pilar de la POO y se realiza con la palabra 
	//extends
	
	//Esto nos va a permitir  recoclar codigo y solo declarar aqui
	
	private String Rfc;
	private double salario;
	private String turno;
	
	public Empleado () {}

	public Empleado(String nombre, String genero, int edad, String rfc, double salario, String turno) {
		super(nombre, genero, edad);
		Rfc = rfc;
		this.salario = salario;
		this.turno = turno;
	}

	public String getRfc() {
		return Rfc;
	}

	public void setRfc(String rfc) {
		Rfc = rfc;
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
		return "Empleado [Rfc=" + Rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void sumar(int a, int b) {
		// Las clases hijas que heredan de una clase abstracta deben definir como 
		//se realizara esta accion
		System.out.println("La suma es:"+(a+b));
		
		
	}

	@Override
	public void sumar() {
		//Ahora la logica que antes utilizabamos en la programacion estructurada
		//la puedo guardar pero aqui en metodos para solicitar los numeros a sumar
		//pero por teclado
		int a;
		int b;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");
		a = entrada.nextInt();
		
		System.out.println("Introduce el segundo numero:");
		b = entrada.nextInt();
		
		System.out.println("La suma de los numeros es:"+(a+b));
		
		
						
	}
	
	//El polimorfismo es mas aplicado en metodos 
	
		
		
	}
	

