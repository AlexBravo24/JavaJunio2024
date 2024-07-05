package com;

import java.util.Scanner;

//herencia es otro pilar de la POO y se realiza con la palabra reservada
public class Empleado extends Persona{
//Esto nos permite reciclar codigo
	
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado() {
		
	}

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
	public void sumar(int a, int b) {
		// Las clases hijas que heredan de una clase abstracta deben definir como 
		//se realiza esta accion 
		System.out.println("La suma es:"+(a+b));
		
		
	}

	@Override
	public void sumar() {
		// TODO Auto-generated method stub
					//ahora la logica que antes utlizabas en la programacion estructurada
					//la puedo guardar para aqui en metedos para solicitarlos numeros a sumar
					//pero por teclado
		int a;
		int b;
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce un primer numero");
		a=entrada.nextInt();
		System.out.println("introduce un segundo numero");
		b=entrada.nextInt();
		
		System.out.println("La suma es:"+(a+b));
		
	}
	
}
