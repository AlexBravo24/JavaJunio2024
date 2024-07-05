package com;

public class Principal {

	public static void main(String[] args) {
		
		//para traer los datos se tiene que crear un objeto  y esta seria la forma
		
		Cientifica casio = new Cientifica ();
		//Cientifica casio = new Cientifica("casio", "negro", 345, "Mate", "Ivan");
		
		casio.sumar();
		casio.restar();
		casio.multiplicar();
		casio.dividir();
		
		casio.tomarTemperatura();
		
		// de donde toman comportamienot nuestros objetos
		// de metodos propios de la clase
		//de la herencia de otras clases , incluyendo clases abtractas
		//de interfaces

	}

}
