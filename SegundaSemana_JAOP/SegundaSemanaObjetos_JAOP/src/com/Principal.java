package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clase cokn el metodo main
		
		//Una vez tenemos declarados los atributos de nuestro objeto, por default
       //podemos ya crear uno, aunque no es lo correcto
		//ejemplo:
					
		
		Persona personal = new Persona();
		
		//Hasta este momento podemos asignar un nombre a mi persona y demas valores a traves de sus atributos
		//llamandolos aqui
		
		//persona1 nombre = "jose";
		
		//Vamos a crear una nueva persona pero con el contructor con todos los argumentos
	
		Persona persona2 = new Persona("Alex", "Masculino", 38, 88.5, 1.82);
				
		
		//Ahora podemos asignarle un nombre y demas valores a persona 1 gracias a los metodos geters y seters
		
		personal.setNombre("Ana");
		
		//ejemplo de una impresion en persona nombre de la persona 2 recuperando ese valor con un metodo get
		
		System.out.println(persona2.getNombre());//=Syso ("alex");
		
		// Que ocurre si quiero mandar a imprimir  directamente a objeto a consola
		
		System.out.println(persona2);
	//Puedo mandar a imprimir a persona 1
		
		System.out.println(personal);
		
		
		//ACTIVIDAD - CREAR UNA CLASE PARA GENERAR ALGUN OBJETO EL QUE USTEDES GUSTEN
				//EL OBJETO O CLASE DEBERÁ LLEVAR POR LO MENOS 3 ATRIBUTOS
				//GENERAN CONSTRUCTORES - VACIO Y CON TODOS LOS ARGUMENTOS
				//GENERAN GETTERS Y SETTERS
				//GENERAN MÉTODO TOSTRING()
				//EN ESTA MISMA CLASE PRINCIPAL VAN A INSTANCIAR UNO CON TODOS LOS ARGUMENTOS Y UNO
				//VACIO Y LOS MANDAN A IMPRIMIR EN CONSOLA. EN EL VACIO ASIGNAN UN VALOR POR LO MENOS
				//CON UN SETTER
	
	
	//EJEMPLO Refresco:
		
		Refresco naranja = new Refresco("Naranja", 350, 20);
		
		Refresco manzana = new Refresco();
		manzana.setSabor("manzana");
		
		System.out.println(naranja);
		System.out.println(manzana);
		
		
	
	
	
	
	
	
	}
	

}
