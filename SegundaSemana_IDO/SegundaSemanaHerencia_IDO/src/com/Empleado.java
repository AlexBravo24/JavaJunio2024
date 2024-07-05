package com;

import java.util.Scanner;

//La herencia es otro pilar de la poo y se realiza con palabra reservada
//extends
public class Empleado extends Persona {

	// esto permite reciclar codigo y solo declararar aqui los atributos
	//que sean propios de un empkeado
	
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado () {
		
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

	//toString con cambio ahora tienes que heredar
	
	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public void sumar (int a, int b) {
		// Las Clases Hijas que heredan de una clase abtracta deben definir como 
		//se realizara esta accion 
		// en este caso la clase hija es empleados la clase madre es persona
		//y en la clase persona se creo el metodo abstracto public abstract void sumar ();
		System.out.println("La suma es: " + (a+b));
		
	}

	@Override
	public void sumar() {
		// cambiara la logica de la programacion estructurada
		// lapuedo guardar aqui en metodos  para solicitar los numeros a sumar pero en teclado
		
		int a;
		int b;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer numero");
		a = entrada.nextInt();
		System.out.println("introduce el segundo numero");
		b= entrada.nextInt();
		System.out.println("La Suma es: " + (a+b));
		
		
		
	}
	
	
	
	
	
	
	
}
