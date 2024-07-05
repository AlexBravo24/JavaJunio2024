package com;

public class MetodosString {

	public static void main(String[] args) {
		
	// Metodos o funcionalidades de la clase String
		
		// Declaramos una cadena de texto para utilizar determinados metodos
		
		String fecha = "Hoy es martes 25 de junio de 2024";
		
		//.length() devolver en valor entero el tamaño de nuestra cadena de texto
		System.out.println("Probando el metodo .length ()");
		System.out.println(fecha.length());
		
		//Si posteriormente yo necesito utilizar ese valor, lo puedo guardar en una varianle de tipo int
		
		int tamañoFecha = fecha.length();
		
		// .charAt () - Nos devuelve el caracter almacenado en determinada posicion
		
		System.out.println("Probando el método .charAt");
		System.out.println(fecha.charAt(fecha.length()-1));
		
		// .subString () - Nos devuelve una subcadena a partir de una posicion especificada
		
		System.out.println("Probando el metodo .subString()");
		System.out.println(fecha.substring(14,25));
		
		// .toLowerCase / .toUpperCase - Convierte a minusculas o a mayusculas la cadena de texto
		
		System.out.println(fecha.toLowerCase());
		System.out.println(fecha.toUpperCase());
		
		/* .equals() - Compara el valor de un objeto contra otro en este caso de una cadena de texto contra otra,
			y devuelve un valor booleano true si son iguales o false si no lo son
*/
		
		System.out.println("Probando el metodo .equals()");
		System.out.println(fecha.equals("Hoy es martes 25 de junio de 2024")); // Es sensible a mayusculas y minusculas
		
		// .equalsIgnoreCase() - compara el valor de cadenas de texto, no importando el uso de mayusculas y minusculas
		
		System.out.println("Probando el metodo .equalsIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase("Hoy es Martes 25 de Junio de 2024")); 
		
		//. replace - Reemplazar las apariciones de un texto o caracter por otro
		
		System.out.println("Probando el metodo .replace()");
		System.out.println(fecha.replace("o","$")); 
		System.out.println(fecha.replace("2024","2030")); 
		
	}

}
