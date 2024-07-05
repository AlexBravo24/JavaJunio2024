package com;

import java.util.HashMap;
import java.util.Map;

public class ColecionesMap {

	public static void main(String[] args) {
		// La interfaz mao alacena los datos en pares (clave y valor a almacenar )
		// las claves no pueden duplicarse
		
		//Es decir la clave actua como un identificador unico para cada elemento a almacenar (ID)
		
		//Ejemplo de una declaracion de un map y la clase hashMap para almacenar claves de tipo
		//integer y elementos de tipo String
		Map<Integer,String> usuarios = new HashMap<Integer,String>();

		//agregamos elementos a nustro HashMap
		usuarios.put(1, "Angel");
		usuarios.put(3,"Karla");
		usuarios.put(2, "Pedro");
		
		//Imprimir 
		System.out.println(usuarios);
		
		//Impirmir en pantalla un solo valor almacenado en una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento HashMap
		usuarios.remove(2);
		System.out.println(usuarios);

		//Imprimir en consola las lllaves de mi hashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola los valores contenidos en mi ashMap
		System.out.println(usuarios.values());
		
		
	}

}
