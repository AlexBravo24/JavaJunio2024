package com;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// Funcionalidad aparti de java 8 -API Stream
		//que nos va a permitir gestionar de una forma mas rapida e imperativa la informacionque 
		//que tengamos en nuestra colleccion de datos
		//Las colecciones se vuelven un flujo e datos a partir del cual podemos 
		//solicitar la informacion que necesitamos 

		
		//Ejemplo de el uso de Stream
		Stream<String> nombres = Stream.of("Carlos", "Friida", "Alex", "albarto")
				.filter(item -> item.contains("i"));
		//Una vez filtramos la informacion llevamos hacia una lista
		List<String> names = nombres.collect(Collectors.toList());
		//Mostrar los resultados en consola 
		System.out.println(names);
	}

	
}
