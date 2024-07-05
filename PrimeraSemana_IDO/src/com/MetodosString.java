package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase String
		
		//Declaramos una cadena de texto para utilizar determinados metodos
		
		String fecha = "Hoy es Martes 25 de Junio del 2024";
		
		//.length () va devolver  en valor entero el tamaño de nuestra cadena
		
		System.out.println("Probando el metodo .length()");
		System.out.println(fecha.length());
		//si posteriormente yo requiero utilizar ese valor , lo puedo guardar
		//en una variable de tipo int
		int tamañoFecha= fecha.length();
		
		//.chartAt ( - Nos devuelve el caracter almacenado en determinada posicion
	
		System.out.println("Probando el metodo .charAt()");
		System.out.println(fecha.charAt(fecha.length()-1));
		
		// .subString()- nos devuelve una subcadena 
		//apartir de una posicion especificada
		
		System.out.println("Probando el metodo .subString()");
		System.out.println(fecha.substring(4));
		System.out.println(fecha.substring(14,25));
		
		//.toLowerCase/.toUpperCase Convierte a minusculas o a mayusculas la cadena
		System.out.println("Probando el metodo .toLowerCase");
		System.out.println(fecha.toLowerCase());
//
		System.out.println("Probando el metodo .toUpperCase");
		System.out.println(fecha.toUpperCase());
		//Metodo .equals()- compara un valor de un objeto con tra otro
		// en este caso de una cadena de texto contra otra y devuelve
		//un valos booleano true si son iguales o false si no lo son 
		
		System.out.println("Probando el Metodo .equals()");
		System.out.println(fecha.equals("Hoy es Martes 25 de Junio del 2024"));
		//Metodo .equalsIgnoreCase - compara el valor de cadena de texto
		// no importa le uso de mayusculas o minusculas
		
		System.out.println("Probando metodo .equalsIgnoreCase ()" );
		System.out.println(fecha.equalsIgnoreCase("hoy es martes 25 de junio del 2024"));
		
		//.remplace remplazar las apariciones de un texto o caracter por otro
		
		System.out.println("Probando el metodo remplace()");
		System.out.println(fecha.replace("o", "$"));
		System.out.println(fecha.replace("2024", "2030"));
		
	}

}
