package com;

import java.util.Scanner;

public class Cientifica extends Calculadora {

	String pantalla;
	double tamaño;
	
	
	
	public Cientifica() {
		
	}



	public Cientifica(String pantalla, double tamaño) {
		super();
		this.pantalla = pantalla;
		this.tamaño = tamaño;
	}



	public String getPantalla() {
		return pantalla;
	}



	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}



	public double getTamaño() {
		return tamaño;
	}



	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}



	@Override
	public String toString() {
		return "Cientifica [pantalla=" + pantalla + ", tamaño=" + tamaño + ", toString()=" + super.toString() + "]";
	}
	
	public  void sumar() {

		int a ;
		int b;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		a= entrada.nextInt();
		System.out.println("Introduce el segundo valor");
		b= entrada.nextInt();
		System.out.println("la suma es " + (a+b));

		
	
	}
	
	public void restar() {

		int a ;
		int b;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		a= entrada.nextInt();
		System.out.println("Introduce el segundo valor");
		b= entrada.nextInt();
		System.out.println("la resta es " + (a-b));
		

		

	}
	public void dividir() {

		int a ;
		int b;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		a= entrada.nextInt();
		System.out.println("Introduce el segundo valor");
		b= entrada.nextInt();
		System.out.println("la division es " + (a/b));

		

	}
	public void multiplicar () {

		int a ;
		int b;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		a= entrada.nextInt();
		System.out.println("Introduce el segundo valor");
		b= entrada.nextInt();
		System.out.println("la multiplicacion es " + (a*b));
		

	}	
	
	
}
