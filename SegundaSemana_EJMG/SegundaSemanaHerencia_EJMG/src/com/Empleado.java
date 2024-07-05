package com;

import java.util.Scanner;

//la herencia es otro pilar de la poo y se realiza con la palabra reservada extends 
 
 public class Empleado extends Persona {
	
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

	public double getSalarfio() {
		return salario;
	}

	public void setSalarfio(double salarfio) {
		this.salario = salarfio;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void sumar(int a, int b) {
		//Las clases hijas que heredan de una clase abstracta , deben definir como se realizara esta accion 
		
		System.out.println("la suma es: " + (a+b));
		
	}

	@Override
	public void sumar() {
		//ahora la logica que aNTES UTILIZABAMOS EN L ASPROGRAMACION ESTRUCTURTADA
		//ahora puedo guardar pero aqui en metodos para solicitar los numeros a sumar 
		//pero por teclado
		
		int a;
		int b;
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Introduce un primero numero ");
		 a = entrada.nextInt();
		 System.out.println("Introduce un segundo numero");
		 b = entrada.nextInt();
		
		 System.out.println("La suma es : " + (a+b));
	}
		
	
	
	}


