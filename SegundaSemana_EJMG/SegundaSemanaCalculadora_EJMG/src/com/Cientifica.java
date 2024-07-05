package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro, IVentilador{

	@Override
	public void sumar(double a, double b) {
		System.out.println("La suma es :" + (a+b));
		
	}

	@Override
	public void restar(double a, double b) {
		System.out.println("La suma es :" + (a-b));
		
	}

	@Override
	public void multiplicar(double a, double b) {
		System.out.println("La suma es :" + (a*b));
		
	}

	@Override
	public void dividir(double a, double b) {
		System.out.println("La suma es :" + (a/b));
		
	}

	@Override
	public void tomarTemperatura() {
	System.out.println("Temperatura normal");
		
	}

	@Override
	public void raizcuadrada(double a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ventilar() {
		// TODO Auto-generated method stub
		
	}
	
	


	
	
	
	
	
	

}
