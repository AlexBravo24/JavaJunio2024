package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas Son una coleccion de datos o elementos definida como 
		//una sucesion de los mismos esta coleccion se implementa
		//atravez de la intrface list  
		//y por medio de un array redimensionable de la clase
		//arrayList
		//Las listas si admiten valores duplicados, es de las colecciones
		//mas utilizadas y con mejor rendimiento
		//no podemos guardar tipos de dato primitivo
		//pero si datos de tipo objeto (String, Wraper, etc)
		
		//declarar una lista de elementos de tipo String
		
		//<>
	//List es una interface 		ArrayList es una clase publica
		List <String> lista = new ArrayList <String>();
		
		//Agregar elementos a nuestra Lista
		
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Joaquin");
		lista.add("Alberto");
		lista.add("Alberto");
		lista.add("Gabriela");
		
		//Como Imprimir eta lista en consiola
		System.out.println(lista);
		
		//imprimir el valor de un solo elemento de la lista
		
		System.out.println(lista.get(2));
		
		//devolver valor booleano si el elemento existe en la lista
		
		System.out.println(lista.contains("Gabriela"));
		
		//otro metodo para devolver la posicion donde se encuentra el elemento  por primera vez
		
		System.out.println(lista.indexOf("Alberto"));
		
		// metodo donde devuelve la ultima posicion donde encuentra al elemento
		
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//metodo para eliminar un elemento de mi lista
		
		lista.remove(5);
		System.out.println(lista);
		
		//Añadir elementos a la Lista indicando una determinada posicion
		
		lista.add(2, "Celso");
		//este metodo solo desplaza posiciones mas no remplaza
		System.out.println(lista);
		//metodo para replazar el valor de una determinada posicion
		lista.set(3, "Joaquina");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista
		//e imprimirlos en una nueva linea ciclo for
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		//Puedo almacenar Varios elementos  si parametrizo milits
		//con elementos objet o si no se parametriza
		
		
		List<Object> coleccion = new ArrayList <Object> ();
		
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add("$");
		
		System.out.println(coleccion.get(2));
		
		// como podria en la lista ya sea hacer una operacion
		//o poder agregarle un dato al elemento objeto
		
		
		
		
		

	}

}
