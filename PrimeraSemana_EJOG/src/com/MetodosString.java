package com;

public class MetodosString {

	public static void main(String[] args) {
		// M�todos o funcionalidades de la clase String

		//Declaramos una cadena de texto para utilizar determinados m�todos
		String fecha = "Hoy es Martes 25 de Junio de 2024";
		
		//.length() - devuelve en valor entero el tama�o de nuestra cadena de texto
		System.out.println(fecha.length());
		
		//Si posteriormente necesito utilizar ese valor, se puede guardar en una variable tipo int
		int tama�oFecha = fecha.length();
		
		System.out.println(tama�oFecha);

		//.chartAt - Nos devuelve el caracter almacenado en deterninada posici�n
		System.out.println("Probando el metodo .charAt()");
		System.out.println(fecha.charAt(fecha.length()-1));
		
		//.substring() - nos devuelte una subcadena a partir de una posici�n especifica
		System.out.println("Probando el metodo .substring()");
		System.out.println(fecha.substring(4,25));
		
		//.toLowerCase /.toUpperCase - convierte a minusculas o a mayusculas
		System.out.println("Probando el metodo .toLowerCase()");
		System.out.println(fecha.toLowerCase());
		System.out.println("Probando el metodo .toUpperCase()");
		System.out.println(fecha.toUpperCase());
		
		//.equals() - compara el valor de un objeto contra otro, en este caso de una cadena de texto contra otra,
		//y devuelve un valor boolenado true si son iguales o flase si no lo son
		System.out.println("Probando el m�todo .equals()");
		System.out.println(fecha.toLowerCase().equals("hoy es martes 25 de junio de 2024"));
		
		//.equalsIgnoreCase()- compara valores sin importar mayusculas o minusculas
		System.out.println("Probando m�todo equalsIgnoreCase:");
		System.out.println(fecha.equalsIgnoreCase("hoy es Martes 25 de jUnio de 2024"));
		
		//.replace - remplaza las apariciones en texto por otro
		
		System.out.println("Probando m�todo replace");
		System.out.println(fecha.replace("o", "$"));
		System.out.println(fecha.replace("2024", "2030"));
		System.out.println(fecha.replace(" ", ""));
	}

}
