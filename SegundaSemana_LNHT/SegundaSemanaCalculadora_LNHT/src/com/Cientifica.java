package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro{
	
	private String tecnologia;
	
	@Override
	public void sumar() {
		int numero1, numero2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		numero1= teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2 = teclado.nextInt();
		teclado.close();
		System.out.println("La suma de "+ numero1 + " + "+ numero2 +" = "+(numero1+numero2));
		
	}

	@Override
	public void restar() {
		int a,b;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		a= teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		teclado.close();
		System.out.println("La resta de "+ a + " - "+ b +" = "+(a-b));
		
	}

	@Override
	public void multiplicar() {
		int a,b;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		a= teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		teclado.close();
		System.out.println("La multiplicacion de "+ a + " x "+ b +" = "+(a*b));
		
	}

	@Override
	public void dividir() {
		double a,b;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		a= teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();
		teclado.close();
		if(b != 0) {
		System.out.println("La Division de "+ a + "  ÷  "+ b +" = "+(a/b));
		}else {
		System.out.println("no se puede dividir entre cero");
		}
	}

	public Cientifica(String marca, String color, String modelo, String tecnologia) {
		super(marca, color, modelo);
		this.tecnologia = tecnologia;
	}

	public Cientifica() {
		super();
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	@Override
	public String toString() {
		return "Cientifica [tecnologia=" + tecnologia + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void tomarTemperatura() {
		System.out.println("Temperatura normal ");		
	}
	
	
}
