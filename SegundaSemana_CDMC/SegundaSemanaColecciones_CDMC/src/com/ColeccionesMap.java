package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		
		//La interfaz map asocia o almacena los datos en pares
		//en claves- valor a almacenar 
		//Las claves no pueden duplicarse
		
		//Es decir la clave actua como identificador unico 
		//para cada elemento a almacenar (ID)
		
		//Declarar de un map y la clase Hasmap
		
		Map<Integer,String> usuarios = new HashMap <Integer,String>();
		
		//Como agregamos elemntos a nuestro hasmap 
		//mediante usarios 
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Fer");
		
		//imprimir en consola
		System.out.println(usuarios);
		
		//imprimir en pantalla un solo valor almacenado 
		System.out.println(usuarios.get(2));
		
		//Elimanr un elemnto del hasmap
		usuarios.remove(3);
		System.out.println(usuarios);
		//Manda a imprimir en consola las llaves de mis hasmap 
		System.out.println(usuarios.keySet());
		
		//valores contenidos en mi hasmap
		System.out.println(usuarios.values());
		
		//imprimir cada una de las llaves de un ciclo for each
		for (Integer i : usuarios.keySet()) {
			System.out.println(i);
			
			
		}	
		
		//Imprimir llaves y valores 
		for(Integer i : usuarios.keySet()) {
			System.out.println("Llave:"+ i + " "+ "valor:"+ usuarios.get(i));
			
		}
		
		

	}

}
