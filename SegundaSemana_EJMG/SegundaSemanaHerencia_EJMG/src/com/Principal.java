package com;

public class Principal {

	public static void main(String[] args) {
		// ejemplo de instanciar buna nueva persona
		
		//una vez nuestra clase persona es abstracta , ya no podemos crear
		//unstancias de esa clase
		//podria eliminar a juaan dado que ya no puedo crear objetos de la clase persona
		//pero si puedo seguir creando empleados , por lo cual puedo crear a juan como un nuevo empleado 
		//por lom que estariamos en un pololimorfismo de asignacion
		
		Persona juan = new Empleado("juan","Masculino", 28, "jafg1787" , 2000 , "Matutino");
		
		//ejemplo de istanciar un nuevo empleado
		
		Empleado empleado1 = new Empleado("Pedro", "Masculino", 33, "PDRCGHHJHJ", 8000, "Vespertino");
		System.out.println(juan);
		System.out.println(empleado1);
		
		
		Electrodomestico microondas = new Electrodomestico("microondas", "Gris", 2500);
		Estufa estufa1= new Estufa("Estufa Profesional", "Negro", 5600, "parrilla", "acros", 4);
		
		System.out.println(microondas);
		System.out.println(estufa1);
		
		//si llamamos a nuerstra persona juan podemos utilizaer el metodo dormoir ()
		juan.dormir();// este emtodo va a mandar una im presi0on en consola 
		
		//jorge es un empleado ,  pero tambien esta heredando los metodos 
		//povenietees de la clase Persona
		
		//jorge.getNombre();  // esto es lo mismo que si estuviuwera escribiendo "jorge"
		
		//voy a probar el metodo comer
		//vemos que el metodo .comer()no imprime nada en consola , pero si retorna 
		//el mensaje "Estoy comiendo...." por lo cual aqui en este mensaje lo podemos guardar en otro String
		//o lo manda a imprimir 
		System.out.println(juan.comer());
		
		//pobrando el metyodo dormir pilimorfico
		juan.dormir(9);
		
		//Probqando una tercera formna del metodo dormir 
		juan.dormir(8, " hotel holiday inn");
		
		//probando el metodo abstracto wque mi clase empleado ya definio
		
		juan.sumar(8, 15);
		
		// las clases abstractas no pueden seer instranciadas , pero si las clases que heredan de ellas
		//una clase abstracta puede tener metodos propios ybien definidos, pero por lo menos
		//uno debe ser abstracto. esto nos permitira tener una clase base o "resumen " 
		//para poder heredara a otras especiaslizarlas
		
		//probando el metodo sumar que inicie un scanner
		juan .sumar();
		
		
	}
	
	

}
