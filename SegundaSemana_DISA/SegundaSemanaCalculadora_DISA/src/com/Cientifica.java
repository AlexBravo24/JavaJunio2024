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
		// Estableciendo el método para sumar
		
		int a;
		int b;
		int c; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("============SUMA===============");
		System.out.println("Introduce un primer número");
		a=sc.nextInt();
		System.out.println("Introduce un segundo número");
		b=sc.nextInt();
		System.out.println("Introduce un tercer número");
		c=sc.nextInt();
		
		System.out.println("La suma es: " + (a+b+c));
		
	}

	@Override
	public void restar (int a, int b) {
		// Estableciendo método para restar
		System.out.println("============RESTA===============");
		System.out.println("El resultado de la resta es "+ (a-b));
		
		
	}

	@Override
	public void multiplicar() {
		// Estableciendo el método para multiplicar
		int a;
		int b;
		int c; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("============MULTIPLICACIÓN===============");
		System.out.println("Introduce un primer número");
		a=sc.nextInt();
		System.out.println("Introduce un segundo número");
		b=sc.nextInt();
		System.out.println("Introduce un tercer número");
		c=sc.nextInt();
		
		System.out.println("La multiplicación es: " + (a*b*c));
		
	}

	@Override
	public void dividir() {
		// Estableciendo el método para dividir
		int a;
		int b; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("============DIVISIÓN===============");
		System.out.println("Introduce un primer número");
		a=sc.nextInt();
		System.out.println("Introduce un segundo número");
		b=sc.nextInt();
		
		System.out.println("La división entre " +a+ " y " + b + "es: " + (a/b));
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	
	

}
