package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements Itermometro,IVentilador {
	
		public Cientifica () {}
			
			
	@Override
		public String toString() {
			return "Cientifica [entrada=" + entrada + "]";
		}


	Scanner entrada = new Scanner (System.in);
	
	@Override
	public void sumar(double a, double b) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingresa el primer numero:");
		a = entrada.nextDouble();
		System.out.println("Ingresa el segundo numero:");
		b = entrada.nextDouble();
		System.out.println("La suma es :"+(a+b));
		
		
	}
	
	@Override
	public void restar(double a, double b) {
		System.out.println("Ingresa el primer numero:");
		a = entrada.nextDouble();
		System.out.println("Ingresa el segundo numero:");
		b = entrada.nextDouble();
		System.out.println("La resta es:"+(a-b));
		
	}
	
	
	//Scanner entrada = new Scanner (System.in);

	@Override
	public void multiplicar(double a, double b) {
		System.out.println("Ingresa el primer numero:");
		a = entrada.nextDouble();
		System.out.println("Ingresa el segundo numero:");
		b = entrada.nextDouble();
		System.out.println("La resta es:"+(a*b));
		
	}
	
	//Scanner entrada = new Scanner (System.in);

	@Override
	public void dividir(double a, double b) {
		System.out.println("Ingresa el primer numero:");
		a = entrada.nextDouble();
		System.out.println("Ingresa el segundo numero:");
		b = entrada.nextDouble();
		System.out.println("La resta es:"+(a/b));
		
	}


	@Override
	public void tomarTemperatura() {
		
		System.out.println("temperatura normal");
		
		
	}


	@Override
	public void ventilar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void raizCuadrada(double a) {
		// TODO Auto-generated method stub
		
	}

	
}

