package com;

import java.util.Scanner;

public class Estudiante extends Persona {
	
	private double ndecontrol;
	private String turno;
	private String aula;
	
	public Estudiante() {
		
	}

	public Estudiante(String nombre, String genero, int edad, double ndecontrol, String turno, String aula) {
		super(nombre, genero, edad);
		this.ndecontrol = ndecontrol;
		this.turno = turno;
		this.aula = aula;
	}

	public double getNdecontrol() {
		return ndecontrol;
	}

	public void setNdecontrol(double ndecontrol) {
		this.ndecontrol = ndecontrol;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	@Override
	public String toString() {
		return "Estudiante [ndecontrol=" + ndecontrol + ", turno=" + turno + ", aula=" + aula + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public void sumar(int a ,int b ) {
		// TODO Auto-generated method stub
		
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
