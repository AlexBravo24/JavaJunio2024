package com;

public class Principal {

	public static void main(String[] args) {
		
		//En la POO debe existir una clase con ell metodo main
		// una vez declarado atributos de nuestro objeto, por default
		//podemos ya crear uno, aun que no este correcto 
		
		//Ejemplo:
	/*	
		Persona persona1 = new Persona();
		
		//persona1.nombre="Jose";
		
		//Probar crear una persona nueva persona pero con el constructor con todo los argumentos 
		
		Persona persona2 = new Persona("Cesar", "Hombre", 23, 68.5, 1.80);
		
		//podemos asignarle un nombre o demas valores a perosnal, gracias a los metodos setters
		persona1.setNombre("Ana");
		
		//Ejemplo de una impresion en consola del nombre de la persona2, recuperando ese valor
		//con su metodo get
		
		System.out.println(persona2.getNombre());
		
		System.out.println(persona2);
		
		//puedo mandar a imprimir a persona1
		System.out.println(persona1);
		
		*/
		//ACTIVIDAD - CREAR UNA CLASE PARA GENERAR ALGUN OBJETO EL QUE USTEDES GUSTEN
				//EL OBJETO O CLASE DEBERÁ LLEVAR POR LO MENOS 3 ATRIBUTOS
				//GENERAN CONSTRUCTORES - VACIO Y CON TODOS LOS ARGUMENTOS
				//GENERAN GETTERS Y SETTERS
				//GENERAN MÉTODO TOSTRING()
				//EN ESTA MISMA CLASE PRINCIPAL VAN A INSTANCIAR UNO CON TODOS LOS ARGUMENTOS Y UNO
				//VACIO Y LOS MANDAN A IMPRIMIR EN CONSOLA. EN EL VACIO ASIGNAN UN VALOR POR LO MENOS
				//CON UN SETTER
		Motos_CDMC motos1 = new Motos_CDMC();
		
		Motos_CDMC MotosBajaj = new Motos_CDMC("Bajaj","N250", 65.000,"Negro");
		System.out.println(MotosBajaj);
		
		
		//Instancia vacia con valor asigando por un setter 
		Motos_CDMC MotosBajaj2 = new Motos_CDMC("","Tornado", 46.000,"Naranja");
		System.out.println(MotosBajaj2);
		MotosBajaj2.setMarca("Vento");
		
		System.out.println(MotosBajaj2.getMarca());
		
		System.out.println(MotosBajaj2);
		
		
	}
		
		
	}


