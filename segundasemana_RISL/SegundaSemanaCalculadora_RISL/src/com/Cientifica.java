package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {

	
	@Override
	public void sumar() {
		int a;
		int b;
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("inserta un numero");
		a=entrada.nextInt();
	
		
		System.out.println("inserta otro numero");
		b=entrada.nextInt();
		System.out.println("EL resultado de la suma es: "+(a+b));
		
	}

	@Override
	public void restar() {
		int a;
		int b;
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("inserta un numero");
		a=entrada.nextInt();
	
		
		System.out.println("inserta otro numero");
		b=entrada.nextInt();
		System.out.println("EL resultado de la resta es: "+(a-b));
	}

	@Override
	public void multiplicar() {
		int a;
		int b;
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("inserta un numero");
		a=entrada.nextInt();
	
		
		System.out.println("inserta otro numero");
		b=entrada.nextInt();
		System.out.println("EL resultado de la multiplicación es: "+(a*b));
	}

	@Override
	public void dividir() {
		int a;
		int b;
		Scanner entrada= new Scanner (System.in);
		
		System.out.println("inserta un numero");
		a=entrada.nextInt();
	
		System.out.println("inserta otro numero");
		b=entrada.nextInt();
		System.out.println("EL resultado de la division es: "+(a/b));
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
	
