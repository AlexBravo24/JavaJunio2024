package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas - Son una coleccion de datos o elementos definida como una sucesión de los mismos
		//Esta colección se implementa a través de la interface List y por medio de un array redimensionable
		//de la clase ArrayList
		
		//Las listas si admiten valores duplicados, es de las colecciones más utilizadas y con mejor rendimiento
		//No podemos guardar tipos de dato primitivo
		//Pero si datos de tipo Objeto (String, Wrapper,etc)
		
		List<String> lista = new ArrayList<String>();

		lista.add("Matias");
		lista.add("Ernesto");
		lista.add("Joel");
		lista.add("Carlos");
		lista.add("Raquel");
		lista.add("Joel");
		
		//Imprimir una lista en consola
		System.out.println(lista);
		
		//Imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(0));
		
		//Devuelva un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Matias"));
		
		//Devuelve la posición donde se encuentra al elemento por primera vez
		System.out.println(lista.indexOf("Joel"));
		
		//Devuelve la posición donde se encuentra el elemento
		System.out.println(lista.lastIndexOf("Joel"));
		
		//Eliminar un elemento de mi lista
		lista.remove(5);
		System.out.println(lista);
		
		//Añadir elementos a la lista, indicando una determinada posicion
		lista.add(2,"Celso");
		System.out.println(lista);
		
		//Remplazar el valor de una determinada posición
		lista.set(3,"Samy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista e imprmirlos en una nueva lista
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista con elementos Object o si no la parametrizo
		
		List<Object> coleccion = new ArrayList<Object>();
		
		coleccion.add("Ernesto");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
		
		
	}

}
