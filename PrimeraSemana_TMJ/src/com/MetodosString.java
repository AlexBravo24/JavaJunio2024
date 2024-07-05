package com;

public class MetodosString {

	public static void main(String[] args) {
		// METODOS O FUNCIONALIDADES DE LA CLASE STRING
		//declaramos una cadena de texto
		String fecha= "Hoy es martes 25 de junio del 2024";
		//metodo .Length();- devuelve el valor entero del tamaño de la cadena de texto
		System.out.println("Prueba del metodo .length()");
		System.out.println(fecha.length());//regresa la cantidad de caracteres en la linea contando los espacions
		
		//si se decea ocupar el lesultado de fecha para despues
		//guardamos el resultado en una variable de tipo int
		int tamañoFecha= fecha.length();

		/*metodo charAt()
		 * devuelve el caracter almacenado en determinada posicion */
		System.out.println("Probando el metodo charAt()");
		System.out.println(fecha.charAt(32));
		//.subString
		//devuelve una subcadena a partir de una posicion especificada
		System.out.println("Probando el metodo subString");
		System.out.println(fecha.substring(15));
		System.out.println(fecha.subSequence(14, 25));
		//.toLowerCase/to.UpperCase
		//convierte a minusculas // convierte a mayusculas
		System.out.println("Probando el metodo .toLowerCase");
		System.out.println(fecha.toLowerCase());
		System.out.println("Probando el metodo .toUpperCase");
		System.out.println(fecha.toUpperCase());
		
		//,etodo equals()
		//compara el valor de un objeto contra otro 
		//devuelve un valor booleano true o false
		
		System.out.println("Probando metodo .equals()");
		System.out.println(fecha.contentEquals("Hoy es martes 25 de junio de2024"));
		//equals es sencible al uso de mayusculas y minisculas
		System.out.println("probando el metodo .equalsIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase("Hoy Es Martes 25 De Junio DEL 2024"));
		
		//metodo .replace - remplaza las apariciones de texto o caracter con otro 
		System.out.println("Probando el metodo .replace()");
		System.out.println(fecha.replace("o", "$"));//sustituye o's por $
		System.out.println(fecha.replace("2024", "2030 "));//cambia 2024
		System.out.println(fecha.replace(" ", ""));//elimina espacion
	}

}
