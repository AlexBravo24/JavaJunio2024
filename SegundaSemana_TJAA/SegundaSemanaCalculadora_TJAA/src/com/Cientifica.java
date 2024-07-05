package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {

	
	public Cientifica() {}

	public Cientifica(String color, String marca, String pantalla) {
		super(color, marca, pantalla);
		
	}

	@Override
	public String toString() {
		return "Cientifica [toString()=" + super.toString() + "]";
	}

	@Override
	public void sumar() {
		Scanner entrada = new Scanner (System.in);
		double a;
		double b;
		
		System.out.println("-----SUMA-----");
		System.out.println("Introduce un número");
		a= entrada.nextDouble();
		System.out.println("Introduce otro número");
		b= entrada.nextDouble();
		
		
		
		System.out.println("El resultado es: " + (a+b));	
	}

	@Override
	public void restar() {
		Scanner entrada = new Scanner (System.in);
		double a;
		double b;
		
		System.out.println("-----RESTA-----");
		System.out.println("Introduce un número");
		a= entrada.nextDouble();
		System.out.println("Introduce otro número");
		b= entrada.nextDouble();
		
		
		System.out.println("El resultado es: " + (a-b));
		
	}

	@Override
	public void multiplicar() {
		Scanner entrada = new Scanner (System.in);
		double a;
		double b;
		
		System.out.println("-----MULTIPLICACIÓN-----");
		System.out.println("Introduce un número");
		a= entrada.nextDouble();
		System.out.println("Introduce otro número");
		b= entrada.nextDouble();
		
		
		System.out.println("El resultado es: " + (a*b));
		
		
	}

	@Override
	public void dividir() {
		Scanner entrada = new Scanner (System.in);
		double a;
		double b;
		
		System.out.println("-----DIVISIÓN-----");
		System.out.println("Introduce un número");
		a= entrada.nextDouble();
		System.out.println("Introduce otro número");
		b= entrada.nextDouble();
		
	
		System.out.println("El resultado es: " + (a/b));
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}

	@Override
	public void raizCuadrada(double a) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
}
