package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO s�lo debe existir una clase con el m�todo
		//main 
		
		//Una vez tenemos declarados atributos de nuestro objeto, por default
		//podemos ya crear uno, aunque no es lo correcto
		//Ejemplo
		
		//Clase   Objeto(tambi�n conocido instancia de clase)
		Persona persona1 = new Persona ();
		
		//Hasta este momento yo puedo asignar un nombre a mi persona y dem�s
		//valores a trav�s de sus atributos, llamandolos aqui 
		//persona1.nombre = "Jazmin";
		
		//Probar a crear una nueva persona, pero con el constructor con todos los argumentos
		Persona persona2 = new Persona("Jazmin", "Femenino", 22, 58.5, 1.55);
		
		//Podemos asignarle un nombre o dem�s valores a personal, gracias a los m�todos setters
		
		persona1.setNombre("Jaz");
		
		//Ejemplo de una impresi�n en consola del nombre de la persona2, recuperando
		//ese valor con su m�todo get
		
		System.out.println(persona2.getNombre()); //Syso("Jazmin");
		
		//Que ocurre si quiero mandar a imprimir directamente un objeto en consola
		System.out.println(persona2);

		//Puedo mandar a imprimir a persona1
		System.out.println(persona1);
		
		//ACTIVIDAD - CREAR UNA CLASE PARA GENERAR ALGUN OBJETO EL QUE USTEDES GUSTEN
				//EL OBJETO O CLASE DEBER� LLEVAR POR LO MENOS 3 ATRIBUTOS
				//GENERAN CONSTRUCTORES - VACIO Y CON TODOS LOS ARGUMENTOS
				//GENERAN GETTERS Y SETTERS
				//GENERAN M�TODO TOSTRING()
				//EN ESTA MISMA CLASE PRINCIPAL VAN A INSTANCIAR UNO CON TODOS LOS ARGUMENTOS Y UNO
				//VACIO Y LOS MANDAN A IMPRIMIR EN CONSOLA. EN EL VACIO ASIGNAN UN VALOR POR LO MENOS
				//CON UN SETTER
		
		Tenis tenis1 = new Tenis ();
		
		Tenis tenis2 = new Tenis("Nike", 1500, "Negros", 25.5);
		
		tenis1.setMarca("Adidas");
		
		System.out.println(tenis2);
		System.out.println(tenis1);
		

	}

}
