package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// una vez que nuextra clase persona es abstracta no podemos crea instancias de esa clase
		
		Persona juan = new Empleado("Juan", "Masculino", 30, "TFDAD30S", 80000, "matutino");
		
		Empleado empleado1 = new Empleado("Pedro", "Masculino", 30, "TFDAD30S", 80000, "matutino");
	
		System.out.println(juan);
		System.out.println(empleado1);
		
		
		
		
		
		
		Persona jovany = new Estudiante("Jovant", "Masculino", 25, 18360194, "Matutino", "23C");
		Estudiante estudiante1 = new Estudiante("Manuel", "Masculino", 25, 18360194, "Matutino", "23C");
		
		
		System.out.println(jovany);
		System.out.println(estudiante1);
		
		
		// si se instancia un empleado vacio y se quiere agregar valore a sus atributos de puede hacer
		
		Empleado jorge = new Empleado();
		jorge.setNombre("Jorge");
		jorge.setSalario(20000);
		
		System.out.println(jorge);
		
		//llamamos a nuestra persona y utilizamos el metodo dormir 
		jovany.dormir();//este metodod mandara la impresion en consola 
		
		jorge.dormir();
		
		jorge.getNombre();
		
		//prueba del metodo comer
		// el metodo .comer no imprime en consola , pero si retorna el contenido del mensaje
		//para poder imprimirlo se retorna de este modo 
		System.out.println(jorge.comer());
		
		//Probando metodo dormir polimorfico 
		jorge.dormir(8);
		//ejemplo de  la tercera forma
		
		juan.dormir(8, "Mi casa");
		
		//probando metodo abstracto
		// nota :
		// las clases abstractas no pueden ser instanciadas pero si las clases derivadas de ellas
		// esto nos permite tener una clase base para poder heredad otra clase 
		juan.sumar(8, 15);
		
		jorge.sumar();
		
		
	}

}
