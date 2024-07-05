package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejemplo de instanciar una nueva persona.
			
		//Una vez que nuestra clase Persona es abstracta, no podemos crear instancias de esa clase
		// Podria yo eliminar a juan, dado que ya no puedo crear objetos de la clase persona. Pero si puedo seguir
		// creando empleados, por lo cual, puedo crear a juan como un nuevo empleado. Por lo que estariamos en un
		// Polimorfismo de asignaci�n
		
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
		
		// Investigar como declarar metodos propios, �qu� son los m�todos void y los m�todos con retorno?, �qu� es el
			//el polimorfismo?
		
		// Si llamamos a nestra persona juan podemos utilizar el m�todo dormir()
		
		juan.dormir(); // Este m�todo va a mandar una impresion en consola
		
		
		jorge.dormir(); // Jorge es empleado, pero tambi�n esta heredando los metodos provenientes de la clase Persona
		
		String nombreJorge = jorge.getNombre(); /* Esto ser�a lo mismo que si estuviera escribiendo "Jorge" en la 
		consola con un sout*/
		
		//Probar el m�todo comer 
		jorge.comer(); /* devuelve el valor del m�todo, o sea "Estoy comiendo..." No imprime nada en consola, pero se puede
		guardar en otro String  o mandarlo a imprimir.*/
		
		System.out.println(jorge.comer()); // imprime el valor generado por el m�todo.
		
		//Probando el m�todo polimorfico dormir
		jorge.dormir(10); //Lanza una impresi�n en consola de acuerdo al codigo del m�todo.
		
		//Probando una tercera forma del m�todo dormir
		
		juan.dormir(5, "el Hotel Holiday Inn");
	
		/*El polimorfismo es otro pilar de la POO, m�s aplicado en m�todos y es la facultad de que un m�todo posea el mismo nombre y se ejecute
		 * de diversas formas.
		 */
		
		//Probando el m�todo abstracto, que mi clase Empleado ya defini�.
		juan.sumar(10, 5);
		
		//Las clases absractas no pueden ser instanciadas, pero si las clases que heredan de ellas.
		/*Una clase abstracta puede tener m�todos propios y bien definidos, pero por lo menos uno debe ser abstracto.
		 * Esto nos permitir� tener una clase base o "resumen" para poder heredarla a otras y especializarlas*/
		
		//Probando el m�todo sumar que inicia un Scanner
		jorge.sumar();
	} // main

} // class
