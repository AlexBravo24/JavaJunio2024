package com;

public class MetodosString {

	public static void main(String[] args) {
		
		// M�todos o funcionalidades de la clase String
		
		//Declaramos una cadena de texto para utilizar determinados m�todos
		String fecha = "Hoy es Martes 25 de Junio de 2024";
		
		//.length()-devolver en valor entero el tama�o de nuestra cadena de texto
		System.out.println("Probando el m�todo .length()");
		System.out.println(fecha.length());
		
		//Si posteriormente necesito utilizar ese valor, lo puedo guardar en una variable de tipo int:
		int tama�oFecha = fecha.length(); //es 33
		
		//.charAt() - Nos devuelve el caracter almacenado en determinada posici�n
		System.out.println("Probando el m�todo .chartAt()");
		System.out.println(fecha.charAt(fecha.length()-1));
		
		//.subString() - nos devuelve una subcadena a partir de una posicion especificada
		System.out.println("Probando el m�todo .subString()");
		System.out.println(fecha.substring(15));
		System.out.println(fecha.substring(14,25));
		
		//.toLowerCase/.toUpperCase - convierte a min�sculas o a mayusculas la cadena de texto
		System.out.println("Probando el m�todo .toLowerCase");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el m�todo .toUpperCase");
		System.out.println(fecha.toUpperCase());
		
		//.equals() - compara el valor de un objeto contra otro en caso de una cadenade texto contra otra
		//, y devuelve un valor booleano true si son iguales o false si no lo son
		System.out.println("Probando el m�todo .equals()");
		System.out.println(fecha.equals("Hoy es Martes 25 de Junio de 2024"));
		
		//.equalsIsIgnoreCase() - compara el valor de cadenas de texto 
		//no importa el uso de mayusculas o minusculas
		System.out.println("Probando el m�todo .equalsIsIgnoreCase()");
		System.out.println(fecha.equalsIgnoreCase("HOy Es MarTes 25 de JuNio de 2024"));
		
		//.replace - reemplaza las apariciones de un texto o caracter con otro
		System.out.println("Probando el m�todo .replace()");
		System.out.println(fecha.replace("o", "$"));
		
		System.out.println(fecha.replace("2024", "2030"));
		
		System.out.println(fecha.replace(" ", ""));
		
		

	}

}
