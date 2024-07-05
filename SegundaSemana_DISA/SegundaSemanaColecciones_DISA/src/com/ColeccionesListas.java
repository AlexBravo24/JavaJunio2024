package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		// ===========LISTAS=============
		//Son una coleccion de datos o elementos deinida como una susesión de los mismos
		//Esta colección se implementa a través de la interfase Lista y por medio de un array redimensionables de la clase
		//ArrayList
		//Las Listas si admiten valores DUBPLICADOS, es de las colecciones más utilizadas y con mejor rendimiento
		//No podemos guardar tipos de dato PRIMITIVO
		//Pero SI datos de tipo OBJETO (String, Wrapper, etc.)
		
		//Declarar una lista de elementos de tipo String
		
		List<String> lista = new ArrayList <String> (); //List es la interface y ArrayList es la clase
		
		//Agregar elementos a nuestra Lista
		lista.add("Adriana");
		lista.add("Jimena");
		lista.add("Oscar");
		lista.add("Alex");
		lista.add("Patricia");
		lista.add("Oscar");
		
		//Imprimir una lista en consola
		System.out.println(lista);
		
		//Imprimir y recuperar un solo elemento de la lista:
		System.out.println(lista.get(2)); //Funciona como un array
		
		//Devolver un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Alex")); //Aprece TRUE or False si se encuentra el elemento
		
		//Devolver la posición donde se encuentra al elemento por primera vez
		System.out.println(lista.indexOf("Oscar"));
		
		//Devuelve la última posición donde encuentra el elemento
		System.out.println(lista.lastIndexOf("Oscar"));		
		
		//Eliminar un elemento de mi lista:
		lista.remove("Oscar"); //Indice Polimorfico: elimina por string o valor de posición
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una determinada posición
		lista.add(3, "Leonardo"); //desplaza las posiciones de los elementos ya añadidos.No elimina
		System.out.println(lista);
		
		//Reemplazar el valor de una determinada posición
		lista.set(4, "Renata");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de milsita e impprimirlos en una nueva lista:
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista con elementos Object o si no la parametrizo (Esto se haría quitando los dos <Object>) 
		List<Object>coleccion = new ArrayList <Object>();
		
		coleccion.add("Nombre");
		coleccion.add(24);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion);

	}

}
