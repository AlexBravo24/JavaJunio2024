package com;

import java.util.Scanner;

///La herencia es otro pilar de la programacio orientada a objetos  y se realixa 
//con la palabra reservada extends
public class Empleado extends Persona {
	
	/*Esta palabra reservada permite reciclar codigo*/

	private String rfc;
	private double  salario;
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
		// TODO Auto-generated method stub
		// las clases hojas que heredan de una clase abstracta deben definir como se realizara esta accion 
		System.out.println("La suma es " + (a+b));
		
	}
	
	
	public void sumar() {
		int a ;
		int b;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		a= entrada.nextInt();
		System.out.println("Introduce el segundo valor");
		b= entrada.nextInt();
		System.out.println("la suma es " + (a+b));
	
	}
	
	
	
}
