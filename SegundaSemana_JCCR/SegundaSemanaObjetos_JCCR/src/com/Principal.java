package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Jorge", "hombre", 20, 1.85, 55.0);
		persona1.setNombre("Juan");
		System.out.println(persona2);
		
		Animal gato = new Animal("Bola de nieve", "Siames", 5, 6, 4, false);
		
		System.out.println(gato);
		
		Animal tiburon = new Animal();
		tiburon.setNombre("Jawls");
		tiburon.setRaza("Blanco");
		tiburon.setNumeroPatas(0);
		tiburon.setEdad(1);
		
		System.out.println(tiburon);
	}

}
