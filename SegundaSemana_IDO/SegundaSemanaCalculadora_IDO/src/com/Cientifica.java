package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {
	
	private String materia ;
	private String due�o ;
	

public Cientifica(String marca, String color, double precio, String materia, String due�o) {
		super(marca, color, precio);
		this.materia = materia;
		this.due�o = due�o;
	}


@Override
public String toString() {
	return "Cientifica [materia=" + materia + ", due�o=" + due�o + ", toString()=" + super.toString() + "]";
}


public String getMateria() {
	return materia;
}


public void setMateria(String materia) {
	this.materia = materia;
}


public String getDue�o() {
	return due�o;
}


public void setDue�o(String due�o) {
	this.due�o = due�o;
}


public Cientifica () {
		
	}


	@Override
	public void sumar() {
		// 

		int a;
		int b;

		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer numero");
		a = entrada.nextInt();
		System.out.println("introduce el segundo numero");
		b= entrada.nextInt();
		System.out.println("La Suma es: " + (a+b));
		
	}

	@Override
	public void restar() {
		// TODO Auto-generated method stub
		int a;
		int b;

		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer numero");
		a = entrada.nextInt();
		System.out.println("introduce el segundo numero");
		b= entrada.nextInt();
		System.out.println("La RESTA es: " + (a-b));
		
	}

	@Override
	public void multiplicar() {
		// TODO Auto-generated method stub
		int a;
		int b;

		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer numero");
		a = entrada.nextInt();
		System.out.println("introduce el segundo numero");
		b= entrada.nextInt();
		System.out.println("La Multiplicacion  es: " + (a*b));
		
	}

	@Override
	public void dividir() {
		// TODO Auto-generated method stub
		int a;
		int b;

		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer numero");
		a = entrada.nextInt();
		System.out.println("introduce el segundo numero");
		b= entrada.nextInt();
		System.out.println("La Division es: " + (a/b));
		
	}


	@Override
	public void tomarTemperatura() {
		//
		System.out.println("Temperatura Normal");
		
		
	}

}
