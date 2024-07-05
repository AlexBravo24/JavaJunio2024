package com;

public class MetodoString {

	public static void main(String[] args) {
		// Metodo o funcionalidades de la clase string
		// Declaramos unca cadena de tezto para utilizar determinado metodos
		
		String fecha ="Martes 25 de junio de 2024";
		//.length()
		System.out.println("Probando el metodo .length");
		System.out.println(fecha.length());
		// si yo posteriormente necesito utilizar ese valor lo puedo guardar en una variable de tipo int
		int tamañoFecha = fecha.length();
		
		//nos devuelve el caracter almacenado en determinada posicion
		System.out.println("Probando el metodo .charAt()");
		System.out.println(fecha.charAt(fecha.length()-1));
		
		//.subString -> nos devuelve una sub cadena a partir de una posicion
		System.out.println("probando el metodo .subString");
		System.out.println(fecha.substring(15));
		
		//.toLowerCase / .toUpperCase = Conviertea minuscula o mayuscula
		System.out.println("Probando el metodo .toLowerCase ");
		System.out.println(fecha.toLowerCase());
		
		System.out.println("Probando el metodo .toUpperCase ");
		System.out.println(fecha.toUpperCase());
		
		//.equals () comprara el valor de un objeto contra otro en este caso de una cedna de texto contra otra 
		// y devuelve un valor boolean true su son iguaes 
		
		System.out.println("Probando el metodo .equals");
		System.out.println(fecha.equals("Martes 25 De Junio De 2024"));
		
		System.out.println("Probando el metodo .equalsIgnoreCase");
		System.out.println(fecha.equalsIgnoreCase("Martes 25 De Junio De 2024"));
		
		//. replace - Reemplazar las apariciones de un texto con otro
		System.out.println("Probando el metodo . replace");
		System.out.println(fecha.replace("o", "$"));
		
		System.out.println(fecha.replace("2024", "2030"));
		System.out.println(fecha.replace(" ", "_"));
	
	}    

}
