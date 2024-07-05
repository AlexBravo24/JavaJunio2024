package com;

public class Principal {

	public static void main(String[] args) {
		// EN POO SOLO EXISTE UNA CLASE CON EL METODO MAIN 
		
		//una vez ddeclaradso los atributos  de nuestro objeto ,
		//podemos crear uno  aunque no es lo correcto 
		
		
		Persona persona1 = new Persona();

		// hata este momento yo puedo asignar un nombre a mi persona 
		//asi como los demas valores , esto a traves de sus atributos
		
		// se crea una nueva persona utilizando el constructor  con sus argumentos 
	
		Persona persona2= new Persona("Jovany", "M", 26, 62, 1.72);
		//podemos asignar  valores a persona 1 gracias a los getter y
		
		persona1.setNombre("Ana");
		//ejemplo  de una impresion en consola
		
		System.out.println(persona2.getNombre());
		
		// de este modo podemos ver de que esta compuesto nuestro objeto 
		
		
		System.out.println(persona2);
		
		System.out.println(persona1);
	}
	

}
