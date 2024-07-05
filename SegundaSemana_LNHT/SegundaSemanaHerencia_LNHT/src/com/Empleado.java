package com;

import java.util.Scanner;

//La herencia otro pilar de la programacion orientada a objetos y se realiza con la palabra reservada "extends"
public class Empleado extends Persona {

	//ESTOS NOS VA PERMITI "Reciclar codigo" y solo declarar aqui los atributos que sean propios de un empleado
	
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
	public void sumar(int a,int b) {
		//LAs clases hijas que heredan de una clase abstracta deben definir como se realizara esta accion,
		System.out.println("La suma es : "+ (a+b));
		
	}

	@Override
	public void sumar() {
		// ahora la logica que antes utilizamos en la programacion estructurada la uedo guardar pero aqui en metodos
		//para solicitar los numeros a sumar pero por teclado
		int a;
		int b;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un primer numero ");
		a = teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		b = teclado.nextInt();
		teclado.close();
		
		System.out.println("La suma es : "+ (a+b));
		
	}


	
}
