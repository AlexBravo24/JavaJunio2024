package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clase con el método main
		
		//Una vez tenemos declarados atributos de nuestro objeto, por dafault
		//podemos ya crear uno, aunque no es lo correcto
		//Ejemplo:
		/*
		Persona persona1 = new Persona();
		
		//Hasta este momento yo puedo asignar un nombre a mi persona y demás valores
		//a través de sus atributos, llamandolos aqui
		//persona1.nombre ="Jose";
		
		//Probar creando una nueva persona con el constructor con todos los ar

		Persona persona2 = new Persona("Ernesto", "Masculino", 41, 80, 1.80);
		//Podemos asignarle un nombre o demás valores a persona1, gracias a los métodos setter
		persona1.setNombre("Ana");
		//Ejemplo de una impresíon en consola del nombre de la persona2 , recuperando ese valor con get
		System.out.println(persona2.getNombre());		

		//Que ocurre si quiero mandar a imprimir directamente un objeto en consola
		System.out.println(persona2);
		//Mandar a imprimir persona 1 
		System.out.println(persona1);
				
		//ACTIVIDAD  - Crear una clase para generar algun objeto el que ustedes gusten
		//EL OBJETo o CLASE debera llevar por lo menos 3 atributos
		// usar Constructores - vacio y con todos los argumentos
		//Gener
		*/
		Alumnos alumno1 = new Alumnos();
		
		Alumnos alumno2 = new Alumnos("Matias Ortega", "Ingenieria del SW", 9.8);
		
		alumno1.setAlumno("Joel Gutierrez");
		alumno1.setCarrera("Ing Sistemas");
		
		System.out.println(alumno1.getAlumno()+ " "+alumno1.getCarrera());		
		
		System.out.println(alumno1);
		//Mandar a imprimir persona 1 
		System.out.println(alumno2);
		
		
	}

}
