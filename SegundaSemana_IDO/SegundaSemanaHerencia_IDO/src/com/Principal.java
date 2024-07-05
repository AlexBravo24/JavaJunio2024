package com;

public class Principal {

	public static void main(String[] args) {
		// Ejemplo de instanciar una nueva persona
		//
		// Una vez nuestraclase personoa es abstracta no podemos crear instancias de esa clase u objetos persona
		// se podrian eliminar los objetos de la clase persona
		//lo que sis se puede seguir es crear empleados
		//se puede crear a Juan o Jorge como Empledos
		//y seria un polimorfismos de asignacion
		
		Persona juan = new Empleado ("Juan", "Masculino", 28, "RFCInventado", 8000, "Matutino");
		Persona jorge = new Empleado ("Jorge", "Masculino", 28, "RFCInventado", 8000, "Vespertino");
		
		//ejemplo de empleado
		
		Empleado empleado1 = new Empleado ("Pedro", "Masculino", 33, "RFCInventado", 8000, "Matutino");
		
		System.out.println(juan);
		System.out.println(empleado1);
		
		
		
		Casa luis = new Casa (5, 6, 8);
		
		//ejemplo de Departamento
		
		Departamento david = new Departamento (3, 4 , 4, 4, 5,50120);
		
		System.out.println(juan);
		System.out.println(david);
		
		
		
		//si llamamos a Juan podemos utilizar el metodo Dormir 
		
		juan.dormir();// este metodo va  amandar una impresion en consola  con el mensaje 
		
		juan.getNombre(); // eto seria lo mismo que si estuviera escribiendo juan en consola
		jorge.comer();
		empleado1.dormir();
		//probar el metodo comer
		//vemos que el metodo comer  no imprime nada en consola pero si retorna
		// el msj "estoy comiendo "  por lo cual aqui ese mensaje lo podemos guardar
		//en otro String o mandarlo a imprimir 
		
		System.out.println(juan.comer());	
		
		
		//probando el metodo dormir polimorfico
		//llamaremos ajorge
		jorge.dormir(9);
		//Probando una tercera forma de dormir
		juan.dormir(8, "Hotel Holiday Inn");
		
		//Probando un metodo abstracto que la clase empledo ya definio que es la case hija
		
		juan.sumar(8, 15);
		
		//probanod metodo sumar con scanner
		jorge.sumar();
		
		
		//clases abstractas no pueden ser instanciadas pero si las clases que
		//heredan de ellas, una clase abtracta puede tener metodos propios
		//y bine definidos pero por lo menos uno debe ser
		//abstracto , esto nos permitira tener una clase base para poder heredar
		//para poder heredarla a otras especializarla
		
		
		
		
	}
	
	// crear una clase padre que permita heredar estas propiedades a una clase
	//persona que hereda a estudiante
	//un abaco que hereda a una calculadora
	//
	
	

}

