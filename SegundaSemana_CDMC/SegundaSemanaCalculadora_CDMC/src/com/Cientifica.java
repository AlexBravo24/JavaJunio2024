package com;

import java.util.Scanner;

public class Cientifica extends Calculadora{

	
	private String tipo;
	private String color;
	private int precio;
	
	public Cientifica() {
		
		
	}
	public Cientifica(String tipo, String color, int precio) {
		super();
		this.tipo = tipo;
		this.color = color;
		this.precio = precio;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Cientifica [tipo=" + tipo + ", color=" + color + ", precio=" + precio + ", toString()="
				+ super.toString() + "]";
	}
	public void sumar() {
		
		int a;
		int b;
		System.out.println("----------Suma---------");
		
		Scanner suma = new Scanner(System.in);
		System.out.println("introduce un primer numero");
		a=suma.nextInt();
		System.out.println("introduce un segundo numero");
		b=suma.nextInt();
		
		System.out.println("La suma es:"+(a+b));
		
	}
	public void resta() {
		
		int a;
		int b;
		System.out.println("----------Resta---------");
		
		Scanner resta = new Scanner(System.in);
		System.out.println("introduce un primer numero");
		a=resta.nextInt();
		System.out.println("introduce un segundo numero");
		b=resta.nextInt();
		
		System.out.println("La resta es:"+(a-b));
		
	}
public void multiplicacion() {
		
		int a;
		int b;
		System.out.println("----------Multiplicacion---------");
		
		Scanner multi = new Scanner(System.in);
		System.out.println("introduce un primer numero");
		a=multi.nextInt();
		System.out.println("introduce un segundo numero");
		b=multi.nextInt();
		
		System.out.println("La multiplicacion es:"+(a*b));
}
public void division() {
	
	int a;
	int b;
	System.out.println("----------Division---------");
	
	Scanner divi = new Scanner(System.in);
	System.out.println("Introduce un primer numero");
	a=divi.nextInt();
	System.out.println("Introduce un segundo numero");
	b=divi.nextInt();
	
	System.out.println("La division es:"+(a/b));

	
}
public void tomarTemperatura() {
	
}

	
}
