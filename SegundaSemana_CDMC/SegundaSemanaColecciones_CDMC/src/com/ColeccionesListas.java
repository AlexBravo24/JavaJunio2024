package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		//Son una coleccion de datos o elemntos
		//definida como sucecion de lo mismos 
		//Esta colecccion se impleta en la interface list y por medio de un array 
		//redimensionable de la clase 
		//arraylist 
		//las listas si admiten valores duplicados,es de las colecciones 
		//mas usadas y con mejor rendimiento 
		//Pero si los objetos son tipo(String Wrapper

		//Declara una lista
		List<String> lista=new ArrayList<String>();
		
		//agregar valores o elemntos a nuestra lista
	lista.add("Yessica");
	lista.add("Cesar");
	lista.add("Diego");
	lista.add("Arath");
	lista.add("Luis");
	
	//Imprimir una lsita en consola 
	System.out.println(lista);
	
	//Imprimir el elemento a recuperar el valor de un solo elemento de la lista
	
	System.out.println(lista.get(2));
	
	//Devuelve un valor booleano si el elemnto existe en una lista 
	System.out.println(lista.contains("Luis"));
	
	//Devuelve 	la posicion donde se encuentra la primera ves
	
	System.out.println(lista.indexOf("Cesar"));
	
	//Devuelve la ultima pocision donde se encuentra el elemento
	System.out.println(lista.lastIndexOf("Cesar"));
	
	//eliminar un elemnto de mi lista
	lista.remove(2);
	System.out.println(lista);
	
	//Añadir elemntos ala lista , indicando una determinacion posicion 
	lista.add(2,"Moni");
	System.out.println(lista);
	
	//Reeplazar el valor de una determinada posicion 
	lista.set(3,"Sandy");
	System.out.println(lista);
	
	//Recorrer o recuperar todos los elemntos de una lista 
	//imprimir  en una nueva lista
	
	for (int i = 0; i < lista.size(); i++) {
		System.out.println(lista.get(i));
		
		
	}
	
	//Puedo almacenar varios elementos si parametros mi lista
	//con elementos Object o si no la parametrizo
	
	List coleccion = new ArrayList();
	
	coleccion.add("Nombre");
	coleccion.add(23);
	coleccion.add(3.1316);
	coleccion.add(true);
	coleccion.add('$');
	
	System.out.println(coleccion.get(2));
	
	}

}
