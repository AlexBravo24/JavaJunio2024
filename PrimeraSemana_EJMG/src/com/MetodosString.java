package com;

public class MetodosString {
	
	
	
	

	public static void main(String[] args) {
		// Metodos o funcionalidades de la calse String 
		
		// declaramos ua cadena de texto para utilizar determinados metodos
		String fecha="Hoy es Martes 25 de Junio de 2024";
		
		//.length()-- devolver en valor entero el valor de la cadena de texto
		
		System.out.println("Probando el metodo .length()");
		System.out.println(fecha.length());

		//si posteriormente yo necesito utilizar ese valor , lo puedo guardar 
		//en una variable de tipo int
		
		int tamañoFecha=fecha.length();
		
		
		//metodo   .chartAt ---nos devuelve el caracter en determinada posicion
		
		System.out.println("Probando el metodo chartAr()");
		
		//System.out.println(fecha.charAt(0));
		
		System.out.println(fecha.charAt(32));
		
		//System.out.println(fecha.length()-1));
		
		System.out.println("Probando el metodo .subString()");
		System.out.println(fecha.substring(15));
		System.out.println(fecha.substring(14,25));
		
		//.toLowerCase/ToUpperCase - convierte de mayusculas a minusculasde la cadena de texto
		
		System.out.println("Probando el metodo .toLowerCase");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el metodo .toUppercase");
		System.out.println(fecha.toUpperCase());
		
		
		System.out.println("Probando el metodo equals()");
		System.out.println(fecha.equals("Hoy es Martes 25 de Junio de 2024"));
		
		System.out.println("Probando el metodo .equalsIgnoreCase()");
		
		
		//.replace ---remplazar las apariciones de un texto o caracter con otro
		System.out.println("Probando el metodo replace()");
		System.out.println(fecha.replace("0", "$"));
		
		System.out.println(fecha.replace("2024", "2030"));
		
		System.out.println(fecha.replace(" ", ""));
		
		
		
	}

}
