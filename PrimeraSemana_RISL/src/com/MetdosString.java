package com;

public class MetdosString {

	public static void main(String[] args) {
		// metodos o funcionalidades de la clase string 
		//declaramos cadena de texto para utilizar determiandos metodos 
		String fecha="Hoy es martes 25 de Junio de 2024";
		
		//length()- devolver en valor entero el tamaño de nuestro texto
		
		System.out.println("probando el metodo .length");
		System.out.println(fecha.length());
		
		//si posteriormente necesito utilizar ese valor lo ouedo guardar
		//en una variable de tipo int 
		int tamañoFecha= fecha.length();//se inicia en 0
		
		System.out.println("El tamaño de la fecha es:" + tamañoFecha);
	   //.charArt sirve para que me muestre la letra almacenada en la posicion que yo pida 
		System.out.println(fecha.charAt(fecha.length()-1));
		
		
		//metodo .subString ()- nos devuelve una subcadena a partir de una posicion 
		//especificada
		
		System.out.println("probando el metodo .subString()");
		System.out.println(fecha.substring(15));
		System.out.println(fecha.substring(14,25));
		
		//.toLowerCase/.toUpperCase - convierte a minusculas o mayusculas 
		System.out.println("probando el metodo .toLowerCase");
		System.out.println(fecha.toLowerCase());
		System.out.println(fecha.toUpperCase());
		
		//.equals()- compara el valor de un objeto contra otro 
		//en este caso de una cadena de texto contra otra, y devuelve 
		//un valor booleano true si son iguales o false si no lo son
		
		//.equalsIgnoreCase()- compara el valor de la cadena de texto
		//no importando el uso de mayusculas y minusculas 
		System.out.println("probando el metodo .equalsIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase("HOY ES MARTES 25 DE JUNIO DE 2024"));
		//para remplazar algún caracter por alguno otro nuevo 
	
		System.out.println(fecha.replace("o","$"));
		System.out.println(fecha.replace("2024", "2030"));
		
		System.out.println(fecha.replace(" ", ""));
		
		
		
	}

}
