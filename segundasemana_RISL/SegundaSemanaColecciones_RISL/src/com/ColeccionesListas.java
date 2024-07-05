package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas son una coleccion de datos o elementos definida como una sucecion
		//de los mismos, se implementa a traves de la interface list, y por medio de un array redimensionable
		//de la clase list.
		//las listas si admiten valores duplicados
		
		//no se pueden almacenar datos primitivos
		//pero si datos de tipo objeto como String, wrapper, etc
		
		List<String> Lista=new ArrayList <String>();
		//agregar elementos a nuestra lista
		
		Lista.add ("Adriana");
		Lista.add("Rosa");
		Lista.add("Rosa");
		Lista.add("Raul");
		Lista.add("Pedro");
		
		System.out.println(Lista);

		//imprimir o recuperar el dato en una posicion
		System.out.println(Lista.get(3));
		
		//devuelva un valor booleano
		System.out.println(Lista.contains("Gabriela"));
		
		
		
		
		
		
	}

}
