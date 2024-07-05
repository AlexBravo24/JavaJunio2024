package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas - Son una coleccion de datos o elementos definida como una susesión de los mismos.
		//Esta coleccion se implementa a través de lsa interface List y por medio de un array redimensionable de la clase
		//Arraylist
		//Las listas se admiten valores duplicados, es de las colecciones mas utilizadas y con mejor rendimiento.
		//No podemos guardar tipos de dato primitivo, pero si datos de tipo Objeto (String, Wrapper, etc).
		
		//Declarar una lista de elementos de tipo String
		List<String> lista = new ArrayList<String>();
		
		//Agregar elementos a nuestra lista
		lista.add("Adriana"); 
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//Imprimir una lista en consola
		System.out.println(lista);
		
		//Imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(2));
		
		//Devuelva un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Alberto"));
		
		//Devuelve la posición donde se encuentra al elemento por primera vez
		System.out.println(lista.indexOf("Carlos"));
		
		//Devuelve la última posición donde se encuentra al elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de mi lista
		lista.remove("Alberto"); //Elimina al primer objeto, eliminando objetos
		lista.remove(4); //Elimina el objeto dentro del index solicitado
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una determinada posición
		lista.add(0, "Mauricio"); //Añade un elemento en el indice indicado, 
		// y desplaza a los objetos a una posición posterior
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posición
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista e imprimirlos en una nueva linea
		for (int i = 0; i < lista.size(); i++) { //.size devuelve el tamaño del ArrayList
			System.out.println(lista.get(i));
		}
		// Puedo almacenar varios elementos si parametrizo mi lista con elementos Object o si no la parametrizo
			List<Object> coleccion = new ArrayList<Object>();
			
			//Tambien puedo almacenar objetos sin parametrizarlos
			// List coleccion = new Arraylist ();
			
			coleccion.add("Nombre");
			coleccion.add(23);
			coleccion.add(3.1416);
			coleccion.add(true);
			coleccion.add('$');
			System.out.println(coleccion);
		
		

	} //main

}//class
