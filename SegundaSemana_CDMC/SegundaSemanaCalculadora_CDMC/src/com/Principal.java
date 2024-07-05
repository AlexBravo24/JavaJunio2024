package com;

public class Principal {

	public static void main(String[] args) {
		Calculadora cal = new Cientifica("Cacio","gris",56);	
		
		System.out.println(cal);
		
		System.out.println("----------Calculadora---------");
		
		cal.sumar();
		cal.resta();
		cal.multiplicacion();
		cal.division();

	}

}
