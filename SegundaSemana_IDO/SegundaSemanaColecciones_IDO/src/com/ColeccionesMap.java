package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// La interfaz Map asocia o almacena los datos en pares
		//(Clave y un valor a almacenar en dicha llave)
		//las claves no pueden duplicarse las llaves si pero no las claves
		//Esto permite que se almacenen en pares
		
		//la clave actua como un identificador unico
		//para cada elemento a almacenar
		
		
		//Declaracion de un MAp y la clase hashMap
		//para almacenar clave de tipo integer y elementos de tipo String
		
		//<>
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//Como agregar elemento (.put) a nuestro HashMap
		
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		
		// si mando a imprimir mi HashMap en consola
		
		System.out.println(usuarios);
		
		//como imprimir en consola un solo valor almacenado en 
		//Una determinada clave
		
		System.out.println(usuarios.get(2));
		
		//Metodo de como eliminar un elemento de nuestro HashMap
		
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//Metodo para imprimir las llaves de HashMap .keyset
		
		System.out.println(usuarios.keySet());
		
		//Metodo para poder imprimir los valores contenidos en HM .values
		
		System.out.println(usuarios.values());
		
		// Mandar imprimir cada una de las llaves con un ciclo 
		//for each
		
		for (Integer i: usuarios.keySet()){		
			System.out.println(i);
		}
		//imprimir cada uno de los valores  con un ciclo con un for ech
		for (String i: usuarios.values()){		
			System.out.println(i);
		}
		
		//imprimir llaves y valores
		
		for (Integer i: usuarios.keySet()) {
			System.out.println("Llave:" + i + " " +"Valor = " + usuarios.get(i));
			
		}
	}

}
