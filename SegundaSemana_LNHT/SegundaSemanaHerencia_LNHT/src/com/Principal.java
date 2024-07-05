package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo de instanciar una nueva persona 
		
		//una vez nuestra clase persona es abstracta no podemos crearinstancias de esa clase
		//Podriamos yo eliminar a juan, dado que ya no puedo crear objetos de la clase persona.
		//Pero si puedo seguir creando empleados, por lo cual puedo crear a juan como nuevo empleado
		
		//Por lo que estariamos en un polimorfismo de asignacion
		Persona juan = new Empleado("JUan", "Masculino", 28,"SASDE213124H",800,"MATUTINO");
		
		//Ejemplo de instancias un nuevo empleado;
		Empleado empleado1 = new Empleado("Pedro", "Masculino", 33, "PDRF234352", 8000, "Vespertino ");

		System.out.println(juan);
		System.out.println(empleado1);
		//Crer una clase padre que nos permita heredar  estas propiedades a una clase hija 
		// Ejemplo Persona que hereda a estudiantes 
		//ej abaco que hereda una calculadora 
		//Persona lalo = new Empleado("Eduardo", "Masculino", 18,null, 0, null);
		Studen estudiante1= new Studen("Luis", "Masculino", 25, "8:00 am", 25, "15:00 pm");
		Maestro Maestro1= new Maestro("Nahum", "Masculino", 27, "7:00 am", 29, "18:00 pm", 11290,
				"ING. Mecatronico", 29);
		Master doctorado = new Master("Dulce", "Femenino", 27, "5:00 am", 29, "20:00 pm", 11290,
				"ING. Mecatronico", 29,"MicroTecnologia",2023);
		//System.out.println(lalo);
		System.out.println(estudiante1);
		System.out.println(Maestro1);
		System.out.println(doctorado);
		
		
		juan.dormir();
		
		//Probar el metodo comer
		//juan.comer();
		//vemosque el metodo .comer() no imprime nada en consola, pero si rerotna el mnjs"Estoy comiendo 
		// por lo caul aqui podemos guardarlo en un string o mandarlo a implirmir 
		System.out.println(juan.comer());
		
		//Probando el metodo dormir polimorfismo
		juan.dormir(8);
		
		//Probando una tercera forma del metodo dormir 
		juan.dormir(9,"cama");
		//PRobando el metodo abstracto que mi clase ya definio
		juan.sumar(5, 2);
		//las clases abstractas no pueden se instanciadas pero si las heredadas de ellas
		
		//LA clase abstracta puede tener metodos propios y bien definido pero minimo debe de se uno abstracta
		//Esto nos permite tener una clase base o resumen para poder heredara otras y especializarlas 
		
		//Probando el metodo sumar que iniciamos Scanner
		juan.sumar();
	}

	
	
	

	
	
}
