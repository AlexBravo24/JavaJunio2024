package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements iTermometro {

	private int digitos;
	private String clase;
	
	public Cientifica () {}

	public Cientifica(String marca, String color, String tipo, double precio, int digitos, String clase) {
		super(marca, color, tipo, precio);
		this.digitos = digitos;
		this.clase = clase;
	}

	public int getDigitos() {
		return digitos;
	}

	public void setDigitos(int digitos) {
		this.digitos = digitos;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public String toString() {
		return "Cientifica [digitos = " + digitos + ", clase = " + clase + ", generales calculadora = " + super.toString() + "]";
	}

	@Override
	public void sumar() {
		Scanner entrada = new Scanner (System.in);
		int oper; 
		double num, res=0.0;
		System.out.println("----Suma---");
		System.out.println("-----------");
		System.out.print("¿Cuántos números a sumar? ");
		oper = entrada.nextInt();
		
	for (int i=1; i<=oper;i++) {
		System.out.print("Ingresa el número "+i+": ");
		num = entrada.nextDouble();
		res+=num;
	}
		System.out.println("El resultado de la suma es: "+res);
	}

	@Override
	public void restar() {
		int a,b,c;
		Scanner entrada = new Scanner (System.in);
		System.out.println("----Resta---");
		System.out.println("-----------");
		System.out.print("Ingrese el primer número: ");
		a = entrada.nextInt();
		System.out.print("Ingrese el segundo número: ");
		b = entrada.nextInt();
		System.out.print("Ingrese el tercer número: ");
		c = entrada.nextInt();
		
		System.out.println("El resultado de la resta es: "+(a-b-c));
	}
	

	@Override
	public void multiplicar() {
		Scanner entrada = new Scanner (System.in);
		int a,b;
		System.out.println("----Multiplicacion---");
		System.out.println("---------------------");
		System.out.print("Ingrese el primer número: ");
		a = entrada.nextInt();
		System.out.print("Ingrese el segundo número: ");
		b = entrada.nextInt();
		
		System.out.println("El resultado de la multiplicación es: "+(a*b));; 
		
	}

	@Override
	public void dividir() {
		Scanner entrada = new Scanner (System.in);
		double a,b;
		System.out.println("----División---");
		System.out.println("---------------");
		System.out.print("Ingrese el dividendo: ");
		a = entrada.nextInt();
		System.out.print("Ingrese el divisor: ");
		b = entrada.nextInt();
		
		System.out.print("El resultado de la división es: "+(a/b));; 
		
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal");
		
	}
	
	
	
}
