package com;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Una vez nuestra clase persona es abstracta, no podemos crear
		//instancias de esa clase
		//Podria yo eliminr a juan, dado que ya no puedo crear objetos
		//de la clase persona
		//pero si puedo swguir creando empleados, por lo cual 
		//puedo crear a juan como un nuevo empleado
		//por lo que estariamos en un polimorfismo de asignacion.
		
		
Persona juan= new Empleado("Juan", "Masculino", 25, null, 0, null);
		
		//insertar un nuevo empleado 
		 
		Empleado Pedro=new Empleado("Pedro", "masculino", 33, "PDTR12345", 6000, "vespertino");
		
		System.out.println(juan);
		System.out.println(Pedro);
		
		
		
		//Crear una clase padre que nos permita heredar estas propiedades
		// a una clase hija.
		
		Animal animal1=new Animal("perro", "macho","omnivoro",10,"blanco con negro");
		
	Zoologico Zoologicovida=new Zoologico("jaguar","macho","omniviro",5,"blanco",10, "selva","mamifero");
		
		//insertar un animal del zoologico
		 
		System.out.println(Zoologicovida);
		
		System.out.println(animal1);
		
		juan.dormir();
		
		//pedro es un empleado pero tambien esta heredando los metodos de la clase persona
		Pedro.dormir();
		String NombrePedro=Pedro.getNombre();
		
		
		
			//probar el metodo comer
		//vemos que el metodo .comer no arroja ningun mensaje, pero si retorna
		//guardar el mensaje y guardarlo en string 
			
			
			
			
		//probando el metodo abstracto que mi clase empleado ya defini�
		
		juan.sumar(10,5);
		
		
		
		
	}

}
