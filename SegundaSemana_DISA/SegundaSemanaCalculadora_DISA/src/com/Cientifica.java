package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements Inter_Termometro {
	private String funciones;
	
	public Cientifica () {}
	
	

	public Cientifica(String marca, String color, String modelo, int precio, String funciones) {
		super(marca, color, modelo, precio);
		this.funciones = funciones;
	}



	public String getFunciones() {
		return funciones;
	}



	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}



	@Override
	public String toString() {
		return "Cientifica [funciones=" + funciones + ", toString()=" + super.toString() + "]";
	}



	@Override
	public void sumar() {
		// Estableciendo el m�todo para sumar
		
		int a;
		int b;
		int c; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("============SUMA===============");
		System.out.println("Introduce un primer n�mero");
		a=sc.nextInt();
		System.out.println("Introduce un segundo n�mero");
		b=sc.nextInt();
		System.out.println("Introduce un tercer n�mero");
		c=sc.nextInt();
		
		System.out.println("La suma es: " + (a+b+c));
		
	}

	@Override
	public void restar (int a, int b) {
		// Estableciendo m�todo para restar
		System.out.println("============RESTA===============");
		System.out.println("El resultado de la resta es "+ (a-b));
		
		
	}

	@Override
	public void multiplicar() {
		// Estableciendo el m�todo para multiplicar
		int a;
		int b;
		int c; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("============MULTIPLICACI�N===============");
		System.out.println("Introduce un primer n�mero");
		a=sc.nextInt();
		System.out.println("Introduce un segundo n�mero");
		b=sc.nextInt();
		System.out.println("Introduce un tercer n�mero");
		c=sc.nextInt();
		
		System.out.println("La multiplicaci�n es: " + (a*b*c));
		
	}

	@Override
	public void dividir() {
		// Estableciendo el m�todo para dividir
		int a;
		int b; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("============DIVISI�N===============");
		System.out.println("Introduce un primer n�mero");
		a=sc.nextInt();
		System.out.println("Introduce un segundo n�mero");
		b=sc.nextInt();
		
		System.out.println("La divisi�n entre " +a+ " y " + b + "es: " + (a/b));
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	
	

}
