package com;

public class Principal {

	public static void main(String[] args) {
		// En la progrmacion orientada a objetos solo debe existir un aclase con el metodo main

		//una vez tenemos declarados atributos de nuestro objeto, por default
		//podemos ya crear uno , aun que no es lo correcto
		//ejemplo;
		
		
		Persona persona1=new Persona();
		
		//Hata este momento yo puedo asignar un nombre a mi persona y demas valores 
		//atravez de sus atributos, llamados aqui:
		
		//persona1.nombre="Jose";
		
		
		
		
		// probar crear una nueva persona pero con el contructor con todos los argumentos
		
		Persona persona2=new Persona("Alex", "Masculino", 38, 88.5, 1.82);
		
		
		//podemos asignarler un nombre o demas valores a personal, gracia a los metodos setters
		  persona1.setNombre("ana");
		
		//ejemplo de una impresion en consola del nombre de la persona2, recuperando 
		  //ese valor con su metodo get
		  
		  System.out.println(persona2.getNombre());
		  
		  //que ocurre si quiero mandar a imprimir directamente un objeto en consola 
		  System.out.println(persona2);
				
				
		//puedo mandar a imprimir a persona1
		  System.out.println(persona1);
				
			
		  
		  Libro libro1 = new Libro("HarryPotter", "JKRowling", "Salamandra", 725, 1);
		  
		  Libro libro2 = new Libro();
		  libro2.setNombredeLibro("LaBatallaDeLosDesiertos");
		  
		  System.out.println(libro1);
		  System.out.println(libro2);
	}
	


}
