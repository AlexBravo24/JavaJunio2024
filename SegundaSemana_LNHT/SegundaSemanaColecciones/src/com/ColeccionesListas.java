package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas - Son una coleccion de datos o elementos definida como una sucesion de los mismos
		// Esta coleccion se implementa atravez de la interfaz list y por medio de un array 
		// redimencionable de la clase array list
		//Las listas si admiten valores duplicados, es de las colecciones mas utilizadas y con mejor rendimiento 
		//No podemos guardar tipo de datos primitivo pero 
		//Pero si datos de tipo objeto (String, wrapper etc)
		
		//Declarar una lista de elementos de tipo string
		
		List<String> lista = new ArrayList<String>();
		
		//agregar elementos a nuestra lista
		
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//como puedo imprimir una lista consola
		System.out.println(lista);

		//imPRIMIR O recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(2));
		
		//DEcuelve un valor boleano si el elemento existe en la lista }
		System.out.println(lista.contains("Gabriela"));
		//Devuelve la posicion donde se encuentra al elemento por primera vez 
		System.out.println(lista.indexOf("Alberto"));
		
		//Devuelve la ultima posicion donde encuentra al elemento 
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de mi lista 
		lista.remove(5); // elimina por indice u objeto
		System.out.println(lista);
		
		//ñadir elementos a la lista indicando una determinad posicion
		lista.add(2, "Celso");// Se agrega el elemento y desplaza las posiciones no lo reemplaza
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//REcorrer o recuperar todos los valores de mi lista e imprimir en iuna nueva lista
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista con elementos object o si no la parametrizo
		List<Object> coleccion = new ArrayList<Object>();
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('s');
		
		System.out.println(coleccion.get(2));
	}
}