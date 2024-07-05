package com;

public class Principal {

	public static void main(String[] args) {
		//Ejemplo de instanciar una nueva persona 
		
		Persona Daniel = new Empleado("Daniel","Masculino",28,"KJAHÑKSJH",2000,"MATUTINO");	
		Empleado empleado1 = new Empleado("Pedro","Masculino",23,"ASKSDHW34",6888,"Vespertino");
		
		System.out.println(Daniel);
		System.out.println(empleado1);
		
		//Ejercicio
		Vehiculos carro = new Vehiculos("7B65T","Spark",2024);
		
		Uber conductor = new Uber("7R456R","JETTA",2026,"Cesar",82623671,"Hombre");
		
		System.out.println(carro);
		System.out.println(conductor);
		
		
		
		Empleado cesar= new Empleado();
		
		cesar.setNombre("Cesar");
		cesar.setSalario(2000);
		
		System.out.println(cesar);
		
		cesar.dormir();//este metodo va a manadar una impresion en consola ("Zzzzz")
		
		
		//cesar tambien es un empleado pero tambien esta heredando los metodos
		//provenientes de la clase persona
		cesar.dormir();
		
		cesar.getNombre(); //Esto seria lo mismo que si estuviera escribieendo "cesar"
		String nombrecesar = cesar.getNombre();
		
		//Probar el metodo comer
		
		//vemos el metodoo comer . comer() no imprime nada en consola pero si retorna
		//el mej "Estroy comiendo..."por lo cual aqui msj
		System.out.println(cesar.comer());
		
		
		//probando el metodo dormir polimorfico
		cesar.dormir(9);
		
		//probando una 3 forma de dormir
		
		cesar.dormir(8, "Hotel las Torres");
		
		//probando el metodo abstracto 
		cesar.sumar(1, 15);
		
		//Recuerden las clases abstractas no pueden ser instaciadas, pero si las clases 
		//que hereden de ellas
		//Una clase abstracta puede tener metodos propios y bien definido pero por lo menos
		//unos debe ser abstracto. esto nor permite tener una clase base o "resumen"
		//para poder heredarla a otras y especializarlas
		
		cesar.sumar();
	}

}
