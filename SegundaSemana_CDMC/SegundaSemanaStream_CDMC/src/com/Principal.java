package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// Es una funcionalidad a partir de java 8 
		// que nos permite funcionar gestionar de una forma mas 
		//repetida  e imperativa la info que tengamos 
		//es nuestra coleeciones de datos
		
		
		//Ejemplo de el uso de Stream
		
		Stream<String> nombres= Stream.of("Carlos","frida","Daniel","Alberto")
				.filter(items -> items.contains("i"));

		List<String> names = nombres.collect(Collectors.toList());
		
		//System.out.println(names);
		
		//Declara una lista para llamar nuestros objetos personas
		
		List<Persona>original = new ArrayList<Persona>();
		
		//Creamos una lista para recolectar la informacion filtrada 
		
		List<Persona>filtrada = new ArrayList<Persona>();
		
		//Añadir elementos a mi lista original 
		original.add(new Persona("Cesar", "MASCULINO", 56));
		original.add(new Persona("Diego", "MASCULINO", 26));
		original.add(new Persona("Luis", "MASCULINO", 46));
		original.add(new Persona("Lupe", "Mujer", 56));
		original.add(new Persona("Arath", "MASCULINO", 44));
		original.add(new Persona("Eduardo", "MASCULINO", 14));
		original.add(new Persona("Xavier", "MASCULINO", 67));
		original.add(new Persona("Andres", "MASCULINO", 34));
		original.add(new Persona("Antonio", "MASCULINO", 20));
		original.add(new Persona("Daniel", "MASCULINO", 18));
		
		//System.out.println(original);
		
		//for (int i = 0; i < original.size(); i++) {
			//System.out.println(original.get(i));
		//}
		/*
		for (Persona i : original) {
			
			System.out.println(i);
		}
		*/
		//original.forEach(a ->System.out.println(a));
		
		
		//Si filtraramos los elementos del genereo masculino con un ciclo convecional 
		
//		for (Persona i: original) {
//			if (i.getGenero().equals("MASCULINO")) {
//				filtrada.add(i);
//				
//				System.out.println(i);
//				
//			}
//			
//		}
		
		
		//Filtrar con API Stream las personas del genero femenino 
		
//		filtrada= original.stream().filter(item -> item.getGenero().equals("Mujer"))
//		.collect(Collectors.toList());
//		//filtrada.forEach(a ->System.out.println(a));
//		
//		filtrada.forEach(System.out::println );
		
		
		//Ordenar a las personas por orden asendente 
//		filtrada=original.stream().sorted(Comparator.comparing(Persona::getEdad))
//				.collect(Collectors.toList());
//		
//		filtrada.forEach(System.out::println );
//	
//		long conteo = original.stream().count();
//		
//		System.out.println(conteo);
		//System.out.println( original.stream().count());
		
//		boolean alguno = original.stream().anyMatch(a ->a.getEdad()<30);
//		System.out.println(alguno);
		
		//Retonar un valor de clase optional
		//Valores nulos
		
		Optional <Persona> menorEdad= original.stream()
				.min(Comparator.comparing(Persona::getEdad));	
System.out.println(menorEdad);		

}
}
