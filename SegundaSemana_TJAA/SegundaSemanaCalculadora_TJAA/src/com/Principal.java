package com;

public class Principal {
	public static void main(String[] args) {
		
		Cientifica calculadora1 = new Cientifica("Blanca", "Casio", "Led");
		
		calculadora1.sumar();
		calculadora1.restar();
		calculadora1.multiplicar();
		calculadora1.dividir();
		
		calculadora1.tomarTemperatura();
		//¿De dónde toman comportamientos nuestros objetos / clases?
		//1. De métodos propios de la clase
		//2. De la herencia de otras clases, incluyendo clases abstractas
		//3. De interfaces 
			
	}

}
