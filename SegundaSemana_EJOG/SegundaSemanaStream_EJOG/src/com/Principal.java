package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API Stream - Funcionalidad a partir de Java 8, que nos va a permitir gestionar de una forma
		//más rápida e imperativa la información que tengamos en nuestras colecciones de datos.
		//Las colecciones se vuelven un flujo de datos a partir del cual podemos solicitar la información que necesitamos.
		
		
		//Ejemplo de el uso de Stream
		Stream<String> nombres = Stream.of("Carlos","Frida","Alberto","Primitiva")
				.filter(item -> item.contains("i"));
		//Una vez filtramos la información la llevo hacia una lista
		List<String> names =nombres.collect(Collectors.toList());
		
		//Mostrar los resultados en consola
		System.out.println(names);
		
		
		//Declaramos una lista para guardar a nuestros objetos persona
		List<Persona> original = new ArrayList<Persona>();
		
		//Creamos una lista para recolectar la informacion filtrada
		List<Persona> filtrada = new ArrayList<Persona>();
	
		//Añadir elementos a mi lista original
		original.add(new Persona("Jorge", "Masculino", 37));
		original.add(new Persona("Alicia", "Femenino",25 ));
		original.add(new Persona("Cesar", "Masculino",27 ));
		original.add(new Persona("Guadalupe", "Femenino", 23));
		original.add(new Persona("Francisco", "Masculino", 40));
		original.add(new Persona("Pepe", "Masculino",31 ));
		original.add(new Persona("Sergio", "Masculino",28 ));
		original.add(new Persona("Gabriela", "Femenino",21 ));
		
//		//Imprimir lista Original en consola
//		System.out.println(original);
//		//Recorrer nuestra lista en cicl
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//		}
//		//Recuperar los datos en un foreach
//		for (Persona i : original) {
//			
//			System.out.println(i);
//		}
//		
//		//forEach pero ahora a través de nuestra lista
//		original.forEach(a -> System.out.println(a));
		
		//Si filtramos a los elementos del genero masculino con un ciclo convencional
//		for (Persona i : original) {
//			if(i.getGenero().equals("Masculino")){
//				filtrada.add(i);
//				System.out.println(i);
//			}
//				
//				
//		}
		
		//Filtrar con el API Stream a las personas
		filtrada = original.stream()
				.filter(item -> item.getGenero().equals("Femenino"))
				.collect(Collectors.toList());
		
		filtrada.forEach(System.out::println);
		
	}

}
