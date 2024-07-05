package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

	public static void main(String[] args) {
		// API stream es una funcionalidad a partir de java 8
		//que nos permite gestionar de forma mas rapida
		//e imperativa la informacion que tengamos 
		//en nuestras colecciones de datos
		//filtrar nuestra informacion
		
//Ejemplo del uso de Stream
		
		Stream<String> nombres= Stream.of("Carlos, Frida, Alex, Rosa,Alberto,")
	           .filter(item-> item.contains("i"));
	 
	 //una vez filtramos la informacion la llevo hacia una lista
	 List<String>names =nombres.collect(Collectors.toList());

	 //mostrar los resultados en consola
	 System.out.println(names);
	 
		//Declaramos una lista para guardar a los objetos persona
	 List<Persona> original =new ArrayList<Persona>();
	 
	 //creamos una lista para recolectar la informacion filtrada 
	 
	 List<Persona>filtrada=new ArrayList<Persona>();
	 
	 //a�adir elementos a la lista original
	 original.add(new Persona("Rosa", "femenino", 23));
	 original.add(new Persona("alicia", "femenino", 25));
	 original.add(new Persona("gerardo", "masculino", 28));
	 original.add(new Persona("jazmin", "femenino", 20));
	 original.add(new Persona("cesar", "masculino", 31));
	 original.add(new Persona("Raul", "masculino", 19));
	 original.add(new Persona("dayana", "femenino", 18));
	 original.add(new Persona("pedro", "masculino", 31));
	 original.add(new Persona("teresa", "femenino", 38));
	 original.add(new Persona("Yessica", "femenino", 30));
	 
		//imprimir la lista original en consola
//	 System.out.println(original);
	 
	 //recorrer nuestra lista para ver cada elemento con 
	 //un ciclo for
//for (int i = 0; i<original.size(); i++);{
//int i = 0;
//System.out.println(original.get(i));
		 
	 
	 //recuperar todos los elementos con el ciclo forEach
//	 for(Persona i:original) {
//		 System.out.println(i);
	 
	 //ForEach pero ahora a traves de nuestra lista 
	 //original.forEach(a -> System.out.println(a));
	 
	 
	 //si filtraramos a los elementos del genero masculino
	 //con un ciclo convenvcional
	 
	 for(Persona i: original) {
		 if(i.getGenero().equals("masculino")) {
			 filtrada.add(i);
			 System.out.println(i);
		 }
	 }
	 
	 
	}}
