package com;

import java.util.Scanner;

public class Cientifica extends Calculadora {

	String pantalla;
	double tama�o;
	
	
	
	public Cientifica() {
		
	}



	public Cientifica(String pantalla, double tama�o) {
		super();
		this.pantalla = pantalla;
		this.tama�o = tama�o;
	}



	public String getPantalla() {
		return pantalla;
	}



	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}



	public double getTama�o() {
		return tama�o;
	}



	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}



	@Override
	public String toString() {
		return "Cientifica [pantalla=" + pantalla + ", tama�o=" + tama�o + ", toString()=" + super.toString() + "]";
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
