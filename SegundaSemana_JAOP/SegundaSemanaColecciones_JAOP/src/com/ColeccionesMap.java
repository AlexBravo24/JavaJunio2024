package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// La interfaz map asocia o almacena los dato en pares
		//(clave- valor a almacenar)		
		//Las claves no pueden duplicarse
		//Es decir la clave actua como un identificador unico pra cada elemento a almacenar
		//Declaracion de un map y la clase HashMap
		//Para almacenar claves de tipo integer y elementos de tipo String
		
		Map<Integer,String> usuarios = new HashMap <Integer,String>();
		
		
		
		//Agregamos el elemento a nuestro HashMap y esto es mediante
		
		usuarios.put(1,"Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		//Imprimir mi HasMap en consola
		
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
		
		//Mandar a imprimir cada una de las llaves con un for each
		
		for (Integer i : usuarios.keySet()) {
			
			System.out.println(i);
		}	
		//Mandar a imprimir cada una de los valores con un for each
			
			for (String i : usuarios.values()) {
				
				System.out.println(i);
		}
		//Imprimir llaves y valores
			
			for( Integer i: usuarios.keySet()) {
				
				System.out.println("Llave:"+i+" "+"Valor:"+ usuarios.get(i));
				
			}
		
		

	}

}
