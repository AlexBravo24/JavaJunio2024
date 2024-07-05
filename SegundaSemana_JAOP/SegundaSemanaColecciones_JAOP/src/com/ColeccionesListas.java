package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas- Son una coleccion de datos o elementos definida como una sucesion de los mismos
		//esta coleccion se implementa a traves de la interface list y por medio de un array redimensionable de la 
		//clase Array List
		//Las listas si admiten duplicados es de las colecciones mas utilizadas y con mejor rendimiento
        //No podemos guardar tipos de datos primitivos pero si datos de tipo objeto (String, Wapper, etc.)
		//Declarar una lista de elementos de tipo string
		
		List <String> Lista = new ArrayList<String> ();
		
		//Agregar elementos a nuestra lista
		
		Lista.add("Adriana");
		Lista.add("Carlos");
		Lista.add("Sarai");
		Lista.add("Alberto");
		Lista.add("Gabriela");
		Lista.add("Alberto");
		//Imprimir la listga en consola
		
		System.out.println(Lista);
		
		//Imprimir o recuperar un valor de un solo elemento de la lista
		
		System.out.println(Lista.get(2));
		
		//Devuelva un valor booleano si el elemento existe en la lista
		
		System.out.println(Lista.contains("Gabriela"));
		
		//Devuelve la posicion donde se encuentra akl elemento por primera vez
		
		System.out.println(Lista.indexOf("Alberto"));
		
		//Devuelve la ultima posicion donde se encuentra el elemento
		
		System.out.println(Lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de mi lista
		
		Lista.remove(1);
		System.out.println(Lista);
		
		//Podemos añadir elementos a la lista indicando una determinada posicion
		
		Lista.add(2, "Celso");// Se agrega elemento y desplaza a las posiciones
		System.out.println(Lista);
		
		//Reemplazar el valor de una posicion
		
		Lista.set(1, "sandy");
		
		System.out.println(Lista);
		
		//Recorrer o recuperar todos los valores de mi lista e imprimirlos
		//en una nueva linea
		
		for (int i = 0; i < Lista.size(); i++) {
			
			System.out.println(Lista.get(i));
			
		//Puedo almacenar varios objetos si parametrizo mi lista
		//con elementos Object o si no la parametrizo
			
			
			List coleccion = new ArrayList();
			
			coleccion.add("Nombre");
			coleccion.add(23);
			coleccion.add(3.1416);
			coleccion.add(true);
			coleccion.add('$');
			
			System.out.println(coleccion.get(2));
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
