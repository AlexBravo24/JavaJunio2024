package com;

public class Principal {

	public static void main(String[] args) {
	/*	// OJO: En la POO solo debe existir una clase con el método main.
		
		//Una vez tenemos declarados atributos de nuestro objeto, por default podemos ya crear
		// un objeto, aunque no es lo correcto.
		//EJEMPLO:
		
		Persona persona1= new Persona();
		
		//Hasta este momento yo puedo asignar un nombre a mi persona y demás valores 
		//a través de sus atributos, llamandoles aquí.
		// persona1.nombre="Dylan";
		
		//Hasta aquí NO es correcto este método, pues faltan más pasos como el ENCAPSULAMIENTO.
		
		//+Probar a crear una nueva persona pero con el construcotr con todos los argumentos
		Persona persona2=new Persona("Dylan", "masculino", 24, 79, 1.78);
		
		//Podemos asignarle un npmbre o demás valores a persona1, gracias a los métodos setters:
		persona1.setNombre("Israel");
		
		//EJEMPLO: impresion en consola del nombre de la persona 2, recuperando ese valor con su método get
		System.out.println(persona2.getNombre()); //syso("Dylan");
		
		//	¿Qué pasa si se quiere mandar a imprimir directamente un objeto en consola
		System.out.println(persona2);
		//si se ejecuta se verá que arroja un mensaje extraño, pues toma a persona2 comom un array con diversos atributos
		//Despues de utilizar el método toString en la clase "persona.java" ahora si podemos imprimir y obtener los datos contenidos en persona2
		
		//Se puede mandar a imprimir a persona1 (se verá que no tendrán sus valores de los atributos porque no se le han asignado , mas que el nombre):
		System.out.println(persona1);
		
		//ACTIVIDAD - Crear una clase para generar algún objeto cualquiera
		//El objeto o clase deberá llevar por lo menos 3 atributos
		//GENERAN CONSTRUCTORES - VACIO Y CON TODOS LOS ARGUMENTOS
		//GENERAN GETTERS Y SETTERS
		//GENERAN MÉTODO TOSTRING()
		//EN ESTA MISMA CLASE PRINCIPAL VAN A INSTANCIAR UNO CON TODOS LOS ARGUMENTOS Y UNO
		//VACIO Y LOS MANDAN A IMPRIMIR EN CONSOLA. EN EL VACIO ASIGNAN UN VALOR POR LO MENOS
		//CON UN SETTER
*/
		Videojuego crashBandicoot=new Videojuego();
		crashBandicoot.setTematica("Desafíos");
		System.out.println(crashBandicoot);
		
		Videojuego COD=new Videojuego(2, "Guerra", "PlayStation", 20);
		
		System.out.println(COD);
		
		
	}

}
