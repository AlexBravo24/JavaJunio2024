package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		//API Stream-- es una funcionalidad a partir de java 8 
		//que nos va a permitir gestiomnar de una foerma mas rapida e imperativa
		//la informacion que tengamos en nuestra coleccion de datos 
		//las colecciones se vuelven un flujo de dato a partir del cual podemos solicitar 
		//la informacion que necesitemos 
 
		//ejemplo del usos de STream
		
		Stream<String> nombres =Stream.of("CArlos" , "Frida", "Alberto").filter(item -> item.contains("i"));
		
		//una vez filtramos la informacion la llevo a una lista 
		
		List<String> names = nombres.collect(Collectors.toList());
		
		//mostrar los resultadfos en consola 
		
		//System.out.println(names);
		
		//declaramos una lista p´ra guardar a nuestros objetos persona 
		
		List<Persona> original = new ArrayList<Persona>();
		
		//creamos una lista para recollectar la informacion filtrada
		
		List<Persona> filtrada = new ArrayList<Persona>();
		
		//añadir elementos a mi lista original 
		
		original.add(new Persona("Jorge", "MASCULINO", 37));
		original.add(new Persona("Alicia", "FEMENINO", 25));
		original.add(new Persona("Cesar", "MASCULINO", 27));
		original.add(new Persona("Mauricio", "MASCULINO", 30));
		original.add(new Persona("Guadalupe", "FEMENINO", 25));
		original.add(new Persona("lucina", "FEMENINO", 26));
		original.add(new Persona("Raul", "MASCULINO", 27));
		original.add(new Persona("Sergio", "MASCULINO", 38));
		original.add(new Persona("Gabriela", "FEMENINO", 22));
		original.add(new Persona("Rafael", "MASCULINO", 24));
		
		//iMPRIMIR LA LISTA ORIGINAL EN CONSOLA 
		
		//System.out.println(original);	
		
		//recorrer nuesta lista para ver cada elemento con un ciclo for 
		
//		for (int i = 0; i < original.size(); i++) {
//			System.out.println(original.get(i));
//		}
			
			//Recuperar todos los elementos con el ciclo forEach
			
//			for (Persona i: original) {
//			System.out.println(i);
//	    }
		
		//forEach pero ahora a traz de nuestra lista 
		//original.forEach(a -> System.out.println(a));
		
		
		//si filtraramos a los elemntos del genero masculino 
		//con un ciclo convencional 
		
//		for(Persona i : original) {
//			if (i.getGenero().equals("MASCULINO")) {
//			filtrada.add(i);	
//			System.out.println(i);	
//				
//		}
//}
		
//		//flitrar con el API Stream a las personas del genero Femenino
//		filtrada= original.stream()
//				.filter(item -> item.getGenero().equals("FEMENINO"))
//				.collect(Collectors.toList());		
//		
//		//filtrada.forEach(a -> System.out.println(a)); 
//		//se puede mandar a imprimir asi como arriba o asi como abajo
//		
//		filtrada.forEach(System.out::println); 
		
		
		//Ordenar a las mpersonas por edad ascendente 
		//filtrada = original.stream().sorted().
		
		}
			
		
	

}
