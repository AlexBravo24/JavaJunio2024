package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {

	
	
	public Cientifica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cientifica(String marca, String color, int precio) {
		super(marca, color, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int Sumar() {
		int resultado =0;
		int a = 0;
		int b = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("--------Suma-------");
		System.out.println("Ingresa primer valor");
		a = entrada.nextInt();
		System.out.println("Ingresa segundo valor");
		b = entrada.nextInt();
		System.out.println("El resultado de la suma de " + a + " + " + b + " = " + (a+b));
		System.out.println();
		
		return resultado;
	}

	@Override
	public int Restar() {
		int resultado =0;
		int a = 0;
		int b = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("--------Resta-------");
		System.out.println("Ingresa primer valor");
		a = entrada.nextInt();
		System.out.println("Ingresa segundo valor");
		b = entrada.nextInt();
		System.out.println("El resultado de la resta de " + a + " - " + b + " = " + (a-b));
		System.out.println();
		
		return resultado;
	}

	@Override
	public double Multiplicar() {
		double resultado =0;
		double a = 0;
		double b = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("--------Multiplicacion-------");
		System.out.println("Ingresa primer valor");
		a = entrada.nextDouble();
		System.out.println("Ingresa segundo valor");
		b = entrada.nextDouble();
		System.out.println("El resultado de la multiplicacion de " + a + " * " + b + " = " + (a * b));
		System.out.println();
	
		return resultado;
	}

	@Override
	public double Dividir() {
		double resultado =0;
		double a = 0;
		double b = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("--------Division-------");
		System.out.println("Ingresa primer valor");
		a = entrada.nextDouble();
		System.out.println("Ingresa segundo valor");
		b = entrada.nextDouble();
		System.out.println("El resultado de la division de " + a + " / " + b + " = " + (a / b));
		System.out.println();
		
		return resultado;
	}

	@Override
	public void TomarTemperatura() {
		// TODO Auto-generated method stub
		System.out.println("Tomando temperatura.... ");
		try {
			Thread.sleep(2000);
			System.out.println("Temperatura normal");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
