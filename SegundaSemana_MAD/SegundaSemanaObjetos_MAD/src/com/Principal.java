package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clase con el método main
		
		//Una vez tenemos declarados atributos de nuestro objeto, por default podemos ya crear uno, aunque no es lo 
		//correcto.
		// Ejemplo:
		
		Persona persona1 = new Persona();
		
		//Persona -> clase
		//persona1 -> objeto (a esto también se lo conoce como instancia de objeto)
		
		// Hasta este momento yo puedo asignar un nombre a mi persona y demas valores, a través de sus atributos,
		// llamándolos aqui
		
		// persona1.nombre = "Jose"; se pueden definir los valores de sus atributos de esta manera, aunque no es correcto.
		// Cuando se asigna un modificador de acceso, el sistema indicará que el acceso al atributo no es visible.
		
		//Probar a crear una nueva persona pero con el constructor con todos los argumentos
		
		Persona persona2 = new Persona("Alex", "Masculino", 88.5, 1.82);
		
		// Podemos asignarle un nombre o demás valores a persona1, gracias a los metodos setter y getters
		
		persona1.setNombre("Ana");
		
		// Ejemplo de una impresión en consola del nombre de la persona2, recuperando ese valor con su metodo get
		
	System.out.println(persona2.getNombre()); //sout ("Alex");
		
		// ¿Qué ocurre si quiero mandar a imprimir directamente un objeto en consola?
		System.out.println(persona2); // com.Persona@15db9742}
		
		// Necesitamoe el método toString en la clase principal para imprimir valores
		
		// Puedo mandar a imprimir a persona1
		System.out.println(persona1);
		
		// Actividad - crear una clase para generar algún objeto el que ustedes gusten
		// El objeto o clase deberá llevar por lo menos 3 atributos
		// Generan constructores - vacio y con todos los argumentos
		// Generan Getters y setters
		// Generan metodo toString ()
		// En esta misma clase principal van a instanciar uno con todos los argumentos y uno vacio y los mandan a imprimir
		//en consola. En el vacio asignan un valor por lo menos con un setter.
		
		// Ejemplo clase Gelatina
		
		
		// EJERCICIO POO
		
		// Objeto - Llanta
		
//		Llanta bridgestone = new Llanta ();
//		
//		Llanta michelin = new Llanta("265/75", "R15", 130, 'V');
//		
//		bridgestone.setMedida("185/60");
//		bridgestone.setDiametro("R15");
//		
//		System.out.println(bridgestone);
//		System.out.println(michelin);
		
		/*
		 * Con modificadores static, creamos atributos o métodos de clase. Aplican para todos los objetos creados de
		 * esa clase.
		 * Con static aun podemos modificar un valor para todos los objetos de la clase, si fuera necesario, ej:
		 * actualizar un precio.
		 * 
		 * Persona1.setEdad (50); -> Llamamos a la clase, y al método, y podemos modifcar el valor del atributo estatico
		 * 
		 * Con static final , creamos valores inmutables y no pueden ser modificados.
		 */
		
		
		
	}

}
