package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clase con el metodo main
		
		
		// una vez tenemos declarados atrubutos de nuestro objeto por defaul podemos crear uno
		// Aunque no es lo correcto
		
		//clase  objeto
		//  |		|
		//  v       v
		Persona persona1 = new Persona();

			// hasta este momento yo puedo asignar un nombre a mi persona y ademas valores
		//atravez de sus atributos ,llamandolos aqui
		//persona1.nombre = "Jose";
		
		// Probar a crear una  nueva persona pero con el contructor con todos los argumento
		Persona persona2 = new Persona("Nahum", "Masculino", 27, 93, 1.83);
	
		// Podemos asignarle un nombre o demas valores a personal, gracias alos metodos setters
		persona1.setNombre("Ana");
		
		// Ejemplo de una imprecion en consola del nombre de la persona 2 ,
		//recuperando ese valor con su metodo get
		System.out.println(persona2.getNombre());
		
		//Que ocurre si quiero mandar a imprimir un objeto en consola 
		System.out.println(persona2);
		
		//inicializamos el objeto Camioneta
		Camioneta camioneta1= new Camioneta();
		Camioneta camioneta2= new Camioneta("Explorer", 1.5, "Ford", "Revealed", 4);
		//seter
		camioneta1.setMarca("RAM");
		
		System.out.println(camioneta1);
		System.out.println(camioneta2);
		
	}

}
