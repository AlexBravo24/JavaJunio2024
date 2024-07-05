package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		// =========API STREAM========
		//Funcionalidad de Java 8 que nos va a permitir gestionar de una forma m�s r�pida e emperativa la informacion que tengamos
		//en nuestras colecciones de datos.
		//Las colecciones se vuelven un flujo de datos a partir del cual podemos solicitar la informaci�n que necesitemos.
		
		//Ejemplo del uso de Stream
		Stream<String> nombres= Stream.of("Dylan", "Israel", "Michelle", "Leonardo")
				.filter(a-> a.contains("i")); //AQUI se esta filtrando la info.
		
		//Una vez filtrada la informaci�n la llevo a una lista
		List<String> names= nombres.collect(Collectors.toList());
		
		//Mostrar los resultados en consola:
	//	System.out.println(names);
		
		//PASOS CON CLASE PERSONA:
		//Declarar una lista para guardar a nuestros objetos Persona
		List<Persona>original = new ArrayList<Persona>();
		
		//Creamos una lista para recolectar la informaci�n filtrada:
		List<Persona>filtrada = new ArrayList<Persona>();
		
		//A�adir elementos a mi lista original
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Lourdes", "FEMENINO", 23));
		original.add(new Persona("Hector", "MASCULINO", 31));
		original.add(new Persona("Karen", "FEMENINO", 25));
		original.add(new Persona("Pepe", "MASCULINO", 35));
		original.add(new Persona("Tony", "MASCULINO", 40));
		original.add(new Persona("Pamela", "FEMENINO", 70));
		original.add(new Persona("Gabriela", "FEMENINO", 42));
		original.add(new Persona("Esther", "FEMENINO", 22));
		original.add(new Persona("Diego", "MASCULINO", 19));
		
		//Imprimir la lista original en consola
		//System.out.println(original);
		
		//Recorrer nuestra lista para ver cada elemento con un ciclo for
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//			
//		}
		//Recuperar todos los elementos con el ciclo ForEach
		
//		for (Persona i:original) {
//			System.out.println(i);
//		}
		//For Each pero ahora a trav�s de nuestra lista
		//original.forEach(a->System.out.println(a)); //Hasta aqu� los tres metodos utilizados para imprimir en consola son practicamente para la mismo.
		
		//Si filtraramos a los elementos del genero masculino con un ciclo convencional:
//		for (Persona i:original) {
//			if (i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				System.out.println(i);
//			}
//		}
		//Filtrar con el API STREAM a las personas del g�nero femenino
		filtrada=original.stream()
				.filter(item-> item.getGenero().equals("FEMENINO"))
				.collect(Collectors.toList());

	}

}
