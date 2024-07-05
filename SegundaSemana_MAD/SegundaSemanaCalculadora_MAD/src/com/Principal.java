package com;

public class Principal {

	public static void main(String[] args) {
		Cientifica casio = new Cientifica("Casio", "Negra", "Cientifica", 1500.50, 15, "financiera");
		
//		casio.sumar();
//		casio.sumar(10, 20, 30);
//		casio.restar();
//		casio.multiplicar();
//		casio.dividir();
		
		casio.tomarTemperatura();
		
		/* ¿De dónde toman comportamientos nuestros objetos?
		    1. De métodos propios de la clase.
		    2. De la herencia de otras clases, incluyendo clases abstractas.
		    3. De interfaces.
		    */
		
		



	}

}
