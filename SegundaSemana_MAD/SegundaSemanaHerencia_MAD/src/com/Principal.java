package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejemplo de instanciar una nueva persona.
			
		//Una vez que nuestra clase Persona es abstracta, no podemos crear instancias de esa clase
		// Podria yo eliminar a juan, dado que ya no puedo crear objetos de la clase persona. Pero si puedo seguir
		// creando empleados, por lo cual, puedo crear a juan como un nuevo empleado. Por lo que estariamos en un
		// Polimorfismo de asignación
		
		Persona juan = new Empleado("Juan", "Masculino", 28, "JAGH1097931H2", 2000, "Matutino");
		
		// Ejemplo de instanciar un nuevo empleado
		
	Empleado empleado1 = new Empleado("Pedro", "Masculino", 33, "EATS9302162D1", 8000, "Vespertino");
			System.out.println(juan);		
			System.out.println(empleado1);
		
		//Actividad
		//Crear una clase padre que permita heredar estas propiedades a una clase hija
		// Ej: Persona que hereda a estudiante
		// Ej: Abaco que hereda a una calculadora
		// Ej: Televisor que hereda a un proyector
		
//		EquipoAudio bocina = new EquipoAudio(400, 60, "HDMI");
//		BocinaPortable jbl = new BocinaPortable(40, 60, "Bluetooth", "JBL", "10 m", "4 hrs", 20);
//		System.out.println(bocina);
//		System.out.println(jbl);
	
		Empleado jorge = new Empleado();
		
		jorge.setNombre ("Jorge");
		
		// Investigar como declarar metodos propios, ¿qué son los métodos void y los métodos con retorno?, ¿qué es el
			//el polimorfismo?
		
		// Si llamamos a nestra persona juan podemos utilizar el método dormir()
		
		juan.dormir(); // Este método va a mandar una impresion en consola
		
		
		jorge.dormir(); // Jorge es empleado, pero también esta heredando los metodos provenientes de la clase Persona
		
		String nombreJorge = jorge.getNombre(); /* Esto sería lo mismo que si estuviera escribiendo "Jorge" en la 
		consola con un sout*/
		
		//Probar el método comer 
		jorge.comer(); /* devuelve el valor del método, o sea "Estoy comiendo..." No imprime nada en consola, pero se puede
		guardar en otro String  o mandarlo a imprimir.*/
		
		System.out.println(jorge.comer()); // imprime el valor generado por el método.
		
		//Probando el método polimorfico dormir
		jorge.dormir(10); //Lanza una impresión en consola de acuerdo al codigo del método.
		
		//Probando una tercera forma del método dormir
		
		juan.dormir(5, "el Hotel Holiday Inn");
	
		/*El polimorfismo es otro pilar de la POO, más aplicado en métodos y es la facultad de que un método posea el mismo nombre y se ejecute
		 * de diversas formas.
		 */
		
		//Probando el método abstracto, que mi clase Empleado ya definió.
		juan.sumar(10, 5);
		
		//Las clases absractas no pueden ser instanciadas, pero si las clases que heredan de ellas.
		/*Una clase abstracta puede tener métodos propios y bien definidos, pero por lo menos uno debe ser abstracto.
		 * Esto nos permitirá tener una clase base o "resumen" para poder heredarla a otras y especializarlas*/
		
		//Probando el método sumar que inicia un Scanner
		jorge.sumar();
	} // main

} // class
