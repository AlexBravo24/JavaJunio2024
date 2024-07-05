package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		
		//Listas - son una coleccion de datos o elementos 
		//definida como una sucesion de los mismos 
		//Esta coleccion se implementa a travez de la inteface List
		//y por medio de un array rwdimensionable de la clase 
		//ArrayList
		
		//Las listas si admiten valores duplicados , es de las colecciones 
		//mas utilizadas y con mejor rwendimienrto 
		//no podemos guardar tipos de datos primitivos 
		//pero si dastos de tipo Objeto(String , wrapper. etc.)
		
		//declara unas lista de elementos de  tipo string 
		//list es una interface 
		List<String> lista=  new ArrayList<String>() ;
		
		//Agregar elementos a nuestra lista 
		lista.add("Adriana");
		lista.add("CArlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("GAbriela");
		lista.add("Alberto");
		
		//IMprimir una lista en consola 
		System.out.println(lista);
		
		//imprimir o recuperar el valor de un  solo elemento de la lista 
		System.out.println(lista.get(2));
		//tambien existe la posibilidad que se devuelva un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("GAbriela"));
		
	//devuelve la posicion donde se encuentra al elemento por primera vez
		
		System.out.println(lista.indexOf("Alberto"));
		
		//devuelve la posicion donde se encuentra al elemento por ultima vez vez
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//para eliminar un elemento de mi lista 
		lista.remove("Alberto");
		
		//para añadir elementos en mi lista indicando una determinada posiscion 
		lista.add(2, "Celso");
		System.out.println(lista);
		
		//remplaza el valor de una determinada posicion 
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//recorrer o recuperar todos los valores de mi lista e imprimirlos en una nueva linea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
			//puedo almacenar varios elementos si parametrizo mi lista con elmentos objet o si no la parametrizo
			//List<Object> coleccion=new ArrayList <Object>();
			List coleccion=new ArrayList ();
			
			coleccion.add("Nombre");
			coleccion.add(23);
			coleccion.add(3.1416);
			coleccion.add(true);
			coleccion.add('$');
			System.out.println(coleccion.get(2));
			
		}
	}

}
