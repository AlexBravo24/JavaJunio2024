package com;

public class Principal {

	public static void main(String[] args) {
		
		//Ejemplo de instanciar una nueva Persona 
		
		//Una vez nuestra clase Persona es abstracta, no podemos crear
		//instancias de esta clase
		//Podria eliminar a luis, dado que ya no puedo crear objetos
		//de la clase persona
		//Pero si puedo seguir creando empleados, por lo cual puedo
		//crear a juan como un nuevo empleado
		//por lo que estariamos en un Polimorfismo de asignación
		
		Persona luis = new Empleado ("Luis", "Masculino", 25, "LRHO2312", 4000, "Vespertino");
		
		//Ejemplo de instanciar un nuevo Empleado
		
		Empleado empleado1 = new Empleado("Emilio", "Masculino", 32, "ETD87364", 8500, "Matutino");
		
		System.out.println(luis);
		
		System.out.println(empleado1);
		
		
		//Actividad
		//Crear una clase padre que nos permita heredar estas propiedades 
		//a una clase hija 
		
		Entrenador entrenador1 = new Entrenador("Cesar", "Herrera", 15300);
		
		Jugador jugador1 = new Jugador("Diego", "López", 21000, 6, "Delantero");
		
		System.out.println(entrenador1);
		System.out.println(jugador1);
		
		
		Transporte transporte1 = new Transporte("Auto", "Verde", 4);
		
		Motocicleta moto1= new Motocicleta("Motocicleta", "Azul", 2, "Automatica", "120 km/h", "18 Hp");
		
		System.out.println(transporte1);
		System.out.println(moto1);
		
		
		
		//Si instanciamos un empleado vacio
		//y posteriormente queremos agregarles valores a sus atributos lo podemos hacer
		Empleado jorge = new Empleado ();
		
		jorge.setNombre("Jorge");
		
		
		//Investigar como declarar métodos propios, ¿que son los métodos void y los
		//métodos con retorno?
		//¿Qué es el polimorfismo?
		
		//Si llamamos a nuestra persona luis podemos utilizar el método dormir()
		luis.dormir(); //este método va a mandar una impresión en consonla
		
		//Jorge es un empleado, pero también esta heredando los métodos
		//provenientes de la clase persona
		jorge.dormir();
		
		String nombreJorge = jorge.getNombre (); //Esto sería lo mismo que si estuviera escribiendo 
		//"Jorge" 
		
		//Probar el método comer 
		//Vemos que con el método .comer() no imprime nada en consola, pero si retorna
		//el msj "Estoy comiendo...", por lo cual aqui ese msj lo podemos guardar en otro 
		//String o mandarlo a imprimir 
		System.out.println(jorge.comer());
		
		//Probando el método dormir polimorfico
		jorge.dormir(9);
		
		jorge.dormir(6, "mi cuarto");
		
		//Probando el método abstracto, que mi clase empleado ya definio 
		luis.sumar(10, 7);
		
		//Recuerden las clases abstractas no pueden ser instanciadas, pero si las clases
		//que heredan de ellas.
		//Una clase abstracta pueden tener métodos propios y bien definidos, pero por lo menos
		//uno debe ser abstracto. Esto nos permitira tener una clase base o "resumen"
		//para poder heredarla a otras y especializarlas 
		
		//Probando el método sumar que inicie un scanner
		jorge.sumar();
	
		
		
		
	}

}
