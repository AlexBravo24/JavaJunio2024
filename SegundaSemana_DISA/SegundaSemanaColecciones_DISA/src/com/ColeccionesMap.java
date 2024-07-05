package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		
		// ============MAP============
		//Asocia o almacena los datos en pares (clave - valor a almacenar)
		//Las claves no pueden duplicarse
		
		//Es decir, la clave actua como un identificador único para cada elemento a almacenar (ID).
		
		//PASOS:
		//Declarar un MAP y la clase HashMap para almacenar claves de tipo "Integer" y elementos de tipo String.
		
		Map<Integer, String> usuarios = new HashMap<Integer,String>();
		
		//Agregar elementos a nuestro HashMap:
		usuarios.put(1, "Dylan");
		usuarios.put(2, "Michelle");
		usuarios.put(3, "Lourdes");
		
		//Imprimir el HashMao en consola:
		System.out.println(usuarios);
		
		//Imprimir en pantalla un solo valor almacenado en una determinada clave.
		System.out.println(usuarios.get(2));
		
		//Eliminación de un elemento de nuestro HashMap:
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//Imprimir en consola las llaves del HashMap:
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola los valores contenidos en el HashMap
		System.out.println(usuarios.values());
		
		//Mandar a imprimir cada llave con un ciclo "for each":
		for(Integer i: usuarios.keySet()) {
			System.out.println(i);
		}
		//Mandar a imprimir cada valor con un ciclo "for each":
		for(String i: usuarios.values()) {
		System.out.println(i);
		}
		
		//Imprimir llaves y valores en una sola línea con "for":
		for(Integer i: usuarios.keySet()){
			System.out.println("Llave: "+ i + " Valor: "+ usuarios.get(i));
		
		}
	}

}
