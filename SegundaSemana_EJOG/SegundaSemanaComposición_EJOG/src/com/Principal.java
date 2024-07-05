package com;

public class Principal {

	public static void main(String[] args) {
		// En el concepto de composici�n, tenemos objetos m�s peque�os que forman parte de uno m�s grande
		
		//Entonces primero deben existir o crearse los objetos peque�o para finalmente crear el m�s grande,
		//que se compone de estos otros.
		
		//Ejemplo Laptop
		/*
		Procesador amd = new Procesador("AMD", "Ryzen 5", 4.5);
		
		Almacenamiento adata = new Almacenamiento("Adata", "A5", 480);
		
		Ram kingston = new Ram("Kingston", "DDR4", 8);
		
		Laptop lenovo = new Laptop("Lenovo", "L15", "Negra", amd, adata, kingston);
		
		System.out.println(lenovo);
		*/
		
		//Ejemplo Alumnos
		
		Alumnos alumno1 = new Alumnos("Fernando", "Pineda", "Alvarez", "Veracruz", 18);
		
		Materia asignatura= new Materia("Fundamentos de Programaci�n", 1, 1);
		
		Maestro asignado=new Maestro(1,"Pedro", "Morales", "Martinez", "Cdmx", 10, 55);
		
		Carrera ingSistemas = new Carrera("Ingenieria en Sistemas", "Principal", 40, alumno1, asignatura, asignado);
		
		System.out.println(ingSistemas);

	}

}
