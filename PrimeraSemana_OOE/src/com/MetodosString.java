package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Metodos o funcionalidades de la clase String
		
		//Declaramos una cadena de texto para utilizar determinados metodos
		String fecha = "Hoy es Martes 25 de Junio de 2024";
		
		//.length() - Devolver en valor entero el tamano de nuestra cadena
		//de texto
		System.out.println("Probando el metodo .length ()");
		System.out.println(fecha.length());
		
		//Si posteriormente yo necesito utilizar ese valor, lo puedo guardar
		// en una variable de tipo int
		int tamañoFecha = fecha.length();
		
		//.chartAt - Nos devuelve el caracter almacenado en determinada 
		//posicion
		System.out.println("Probando el metodo .chartAt()");
		System.out.println(fecha.charAt(fecha.length()-1));
		
		//.subString() - nos devuelve una subcadena a partir de una posicion
		//especificada
		System.out.println("Probando el metodo .subString");
		System.out.println(fecha.substring(15));
		System.out.println(fecha.substring(14,25));
		
		//.toLowerCase/ .toUpercase - convierte a minusculas o a mayusculas
		System.out.println("Probando el metodo .toLowerCase");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el metodo .toUpperCase");
		System.out.println(fecha.toUpperCase());
		
		//.equals() - compara el valor de un objeto contra otro
		//en este caso una cadena de texto contra otra, y devuelven
		//un valor booleano true si son iguales o false si no lo son
		System.out.println("Probando el metodo .equals()");
		System.out.println(fecha.equals("Hoy es Lunes"));
		System.out.println(fecha.equals("Hoy es Martes 25 de Junio de 2024"));
				
        //.equalsIgnoreCase() - compara el valor de cadena de texto
		//no importando el uso de mayusculas y minusculas
		
		System.out.println("Probando el metodo .equalsIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase("Hoy Es Martes 25 de JuNio De 2024"));
		
	
		//.replace - reemplazar las apariciones de un texto o caracter con otro
		System.out.println("Probando el metodo .replace");
		System.out.println(fecha.replace("o","$"));
		
        System.out.println(fecha.replace("2024", "2030"));
        System.out.println(fecha.replace(" ", ""));
		
		
	}

}
