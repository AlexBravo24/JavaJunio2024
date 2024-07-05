package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		
		//en el stream declaramos la lista, la filtramos, la recolectamos y la imprimimos
		
		Stream<String> nombres = Stream.of("Julio", "Carlos", "Monce", "Sandra").filter(element -> element.contains("a"));
		
		List<String> names = nombres.collect(Collectors.toList());
		
//		System.out.println(names);
		
	
		
		List<Persona> original = new ArrayList<Persona>();
		List<Persona> filtrada = new ArrayList<Persona>();
		
		
			original.add(new Persona("Julio", "H", 35));
			original.add(new Persona("Alberto", "H", 31));
			original.add(new Persona("Sandra", "M", 39));
			original.add(new Persona("Perla", "M", 25));
			original.add(new Persona("Sandy", "M", 16));
			original.add(new Persona("Alejandro", "H", 45));
		
		
//		original.forEach(element -> System.out.println(element));
//		Stream<List<Persona>> stremPersona = Stream.of(original)
//			.filter(element -> element.contains("a"))
//			.collect(Collectors.toLst());
			
//			for (Persona persona : original) {
//				if(persona.getGenero().equals("H")) {
//					filtrada.add(persona);
//					System.out.println(persona);
//				}
//			}
			
//			filtrada =  original.stream()
//					.filter(element -> element.getGenero().equals("M"))
//					.collect(Collectors.toList());
//			
//			System.out.println(filtrada);
//			filtrada.forEach(element -> System.out.println(element));
//			filtrada.forEach(System.out::println);
			
//			filtrada = original.stream()
//					   .sorted(Comparator.comparing(Persona::getEdad))
//					   .collect(Collectors.toList());
//			
//			filtrada.forEach(element -> System.out.println(element));
			
//			long result = original.stream().count();
//			System.out.println(result);
//			
//			boolean menorEdad = original.parallelStream().allMatch(element -> element.getEdad() > 18);
//			
//			System.out.println(menorEdad);
			
			// clase optional, maneja valores nulos en caso de ser necesario
			
			Optional<Persona> menorEdad = original.stream().min(Comparator.comparing(Persona::getEdad));
			
			System.out.println(menorEdad);
			
	}

}
