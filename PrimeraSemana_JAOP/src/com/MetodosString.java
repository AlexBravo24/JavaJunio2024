package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase string
		//Declaramos una cadena de texto para utilizar determinados metodos
		
		String fecha = "Hoy es martes 25 de Junio del 2024";
		
		//.length()-devolver en tamaño entero el tamaño de nuestra cadena
		
		System.out.println("probando el metodo .length()");
		System.out.println(fecha.length());
		
		//si posteriormente yo necesito utilizar ese valor lo puedo guardar
		//en una variable de tipo int
		
		int tamañoFecha = fecha.length();
		
		//.chartAt() - nos devuelve el caracter almacenado en determinada posicion
		
		System.out.println("Probando el metodo .charAt()");
		System.out.println(fecha.charAt(fecha.length()-1));// aqui da 4 porque es uno antes del ultimo y ese es el numero 4
		
		//subString()- nos devuelve una subcadena a partir de una posicion especificada
		
		System.out.println("Probando el metodo .subString()");
		System.out.println(fecha.substring(15));
		System.out.println(fecha.substring(14, 25));
		
		//.tolowerCase / .toUpperCase - convierte a minusculas o mayusculas la cadena de texto
		
		System.out.println("Probando el metodo .toLowerCase()");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el metodo .toUpperCase");
		System.out.println(fecha.toUpperCase());
		
		//.equals()- compara el valor de un objeto contra otro
		// en este caso de una cadena de texto contra otra
		// y devuelve un valor booleano true si son iguales o false si no lo son
		
		System.out.println("Probando el metodo .equals()");
		System.out.println(fecha.equals("Hoy es lunes"));
		System.out.println(fecha.equals(fecha));
		
		//.equalsIgnoreCase()- compara el valor de las cadenas ignorando si hay mayusculas o minusculas
		
		System.out.println("Probando el metodo .equalsIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase("Hy es martes 25 DE JUNIO del 2024"));
		
		//.replace()- reemplazar las apariciones de un texto o caracter con otro
		
		System.out.println("Probando el metodo .replace ()");
		System.out.println(fecha.replace("o", "$"));
		System.out.println(fecha.replace("e", "paloma"));
		System.out.println(fecha.replace(" ", ""));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
