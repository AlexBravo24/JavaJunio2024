package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionMap {

	public static void main(String[] args) {
		// La interfaz Map asocia o almacena los datos en pares (clave - valor a almacenar)
		//las claves no pueden duplicarse 
		
		//Es decire , la clave actua como un identificador unico para cada elemento a almacenar (ID)
		
		//Declaracion de un Map y la clase HashMap para almacenar claves de tipo interger y 
		//elementos de tipo String
		
		Map<Integer, String>usuarios = new HashMap<Integer, String>();		
		//agregamos elementos a nuestro HasMap 
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		//imprimir mi HasMap en consola
		System.out.println(usuarios);
		
		//Imprimir en pantalla un solo valor almacenado en ua determinada clave
		System.out.println(usuarios.get(2)); 
		
		//eliminar u elemento de nuestro HashMap 
		usuarios.remove(3);
		
		System.out.println(usuarios);
		
		//imprimir en consola las llaves de mi HashMAp
		System.out.println(usuarios.keySet());
		
		//imprimir en consola los valores contenidos en mi HashMap
		System.out.println(usuarios.values());
		
		//mandar a imprimir cada uno de las llaves con un ciclo for each 
		
		for(Integer i: usuarios.keySet()) {
		System.out.println(i);
		
		}

		//mandar a imprimir cada uno de los valores con un ciclo for each 
		for (String i : usuarios.values()) {
		System.out.println(i);
		
		
		}
		//imprimir llaves y valores 
		for(Integer i: usuarios.keySet()) {
		System.out.println("Llave: " + i +" " + " Valor: " + usuarios.get(i));

		}
	}

}
