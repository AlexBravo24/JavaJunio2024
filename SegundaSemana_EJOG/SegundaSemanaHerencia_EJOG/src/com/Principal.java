package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo instanciar una nueva Persona
		
		//Una vez nuestra clase Persona es abstracta no podemos crear instancias de esa clase.
		//Podria eliminar a Juan dado que ya no puedo crerar objetos de la clase persona, pero si puedo seguir creando empleados.Entonces creo
		//a Juan como Empleado por lo que estariamos en un Polimorfismo de asignación.
		
		
		Persona juan = new Empleado("Juan", "Masculino", 28,"FDDSS",12321,"Matutino");
		
		Empleado empleado1 = new Empleado("Pedro", "Masculino", 33, "PDRT861933", 8000, "Vespertino");

		//Jugador
		/*
		Persona persona1 = 		  new Persona		("Lorenzo"  , "Masculino",  5);
		
		Jugador persona2 = 		  new Jugador		("Francisco", "Masculino", 11, "Defensa", "Categoria 2013", 7);
		
		EscuelaDeporte escuela1 = new EscuelaDeporte("Matias"	, "Masculino", 10, "Defensa", "Categoria 2014", 5, "Futbol Delfines", "Xalapa", "Veracruz");
		
		System.out.prisntln(persona1);
		System.out.println(persona2);
		System.out.println(escuela1);
		*/
		
		
		Empleado jorge = new Empleado();
		
		jorge.setNombre("Jorge");
		jorge.setSalario(8000);
		
		System.out.println(jorge);
		
		//Si llamamos a nuestra persona juan podemos utilizar el método dormir
		juan.dormir();//Este método va a mandar una impresion en consola con unas ZzZzZ
		
		jorge.dormir();
		
		String PersonaHace= jorge.comer();
		
		System.out.println(PersonaHace);
		
		//Probamos el metodo comer
		//Vemos el metodo . comer() no imprim nada en cosonla, pero si retorna el msj, por lo cual lo podra guardarlo en otro String
		
		System.out.println(juan.comer());
		
		//Metodo Polimorfico
		//Probando el método dormir polimorfico
		jorge.dormir(8);
		
		jorge.dormir(8, "mi casa");
		
		//Probando el método abstracto , que mi clase empleado ya definio
		
		juan.sumar(8, 35);
		
		//Recuerden las clases abstracta no pueden ser instanciadas, pero si las clases que heredan.
		//Una clase abstracta puede tener métodos propios y bien definidos, pero por lo menos uno debe de ser abstracto.
		//Esto nos permitira tener una clase base o "resumen" para poder heredarla a otras y especializarlas
		
		juan.sumar();
	}
	
	

}
