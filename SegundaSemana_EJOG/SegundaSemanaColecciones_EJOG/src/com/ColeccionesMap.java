package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// La interfaz Map asocia o almacena los datos en pares(Clave - Valor a almacenar en dicha llave)
		//Las Claves no pueden duplicarse pero los valores dentro si
		//Es decir la clave actua como un identificador unico para cada elemento a almacenar(ID)

		//Declaración de un Map y la clase HashMap para almacenar claves de tipo Integer y elementos de tipo
		//String
		
		// Map es la Interface y HashMap es la clase
		Map<Integer,String> usuarios = new HashMap<Integer,String>();
		
		//Agregamos elementos a nuestro HashMap
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		System.out.println(usuarios);
		
		//Imprimir en pantalla una valor almacenado en una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de nuestro hashmap
		usuarios.remove(3);
		System.out.println(usuarios);
		//Imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola los valores contenido en mi HashMap
		System.out.println(usuarios.values());
		
		
		//Mandar a Imprimir cada una las llaves con un cicl for each
		for (Integer i : usuarios.keySet()) {
			System.out.println(i);
		}
		//Mandar a Imprimir cada una los valores con un cicl for each
				for (String i : usuarios.values()) {
					System.out.println(i);
				}
		
		//Imprimir llaves y valores
				
		for (Integer i : usuarios.keySet()) {
			System.out.println("Llave "+i+ " Valor:"+usuarios.get(i));
		}
	}

}
