package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// La interfaz Map asocia o almacena los datos en pares (clave, un valor a almacenar).
		/* Las claves no pueden duplicarse 
		 * Es decir, la clave actua como un identificador unico para cada elemento a almacenar.*/
		
		//Ejemplo de un Map y la clase HashMap para almacenar claves de tipo Integer y elementos tipo String
		
		Map<Integer,String> usuarios = new HashMap <Integer, String>();
		
		//Agregamos elementos a nuestro HashMap
		usuarios.put(1, "�ngel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		//Imprimir mi HashMap en consola
		System.out.println(usuarios);
		
		//Imprimir en pantalla un solo valor almacenado en una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//Imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola los valores contenidos en mi HashMap
		System.out.println(usuarios.values());
		
		//Mandar a imprimir cada una de las llaves con un ciclo for each
		for (Integer i: usuarios.keySet()) { //Envia valor de las claves
			System.out.println(i);
		}
		
		for (String i: usuarios.values()) { // Envia los valores almacenados
			System.out.println(i);
		}
		
		//Imprimir llaves y valores
		 for(Integer i:usuarios.keySet()) {
			 System.out.println("Llave: "+i+" Valor: "+usuarios.get(i));
		 }
	
	
	}//main

}//class