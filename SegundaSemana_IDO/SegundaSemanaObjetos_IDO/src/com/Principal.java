package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// en la POO solo debe de existir 
		
		//una clase con el metodo main
		Persona persona1 = new Persona();
		//Hasta este momento yo puedo asignar un nombre a mi persona y demas valores
		//atravez de sus atributos llamadolos aqui
		
		//persona1.nombre
		
		//Probar a crear una nueva persona pero con el constructor y todos los argumentos
		
		
		
		Persona persona2 = new Persona("Ivan", "Masculino",39, 77.5,1.70);
		
		// podemos asignarle un nombre  o demas valores a persona 1 gracias a los metodos setters
		
		persona1.setNombre("Ana");
		
		// ejemplo  de una impresion  en consola del nombre de la persona 2 
		//recuperando ese valor con su metodo
		
		System.out.println (persona2.getNombre());
		
		// que ocurre si quiero llamar imprimir un objeto en consola
		System.out.println (persona2);
		 System.out.println(persona1);
		 
		//ACTIVIDAD - CREAR UNA CLASE PARA GENERAR ALGUN OBJETO EL QUE USTEDES GUSTEN
			//EL OBJETO O CLASE DEBERÁ LLEVAR POR LO MENOS 3 ATRIBUTOS
			//GENERAN CONSTRUCTORES - VACIO Y CON TODOS LOS ARGUMENTOS
			//GENERAN GETTERS Y SETTERS
			//GENERAN MÉTODO TOSTRING()
			//EN ESTA MISMA CLASE PRINCIPAL VAN A INSTANCIAR UNO CON TODOS LOS ARGUMENTOS Y UNO
			//VACIO Y LOS MANDAN A IMPRIMIR EN CONSOLA. EN EL VACIO ASIGNAN UN VALOR POR LO MENOS
			//CON UN SETTER
		 
		 
		 Televisor samsung = new  Televisor("samsung", "plata", 32, 1000);
		
		Televisor sony = new Televisor ();
		sony.setMarca("Sony");
		System.out.println(sony);
		System.out.println(samsung);
	}

}
