package com;

public class TiposDeDatos {//Este el metodo de mi nombre
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Tipos de datos primitivos - NUMEROS ENTEROS
		byte numeroUno;
		numeroUno=127; // hasta aqui le estamos asignando un vaor a guardar
		
		//Ejemplo de declarar nuestras variables con su tipo de dato 
		byte numero1 = -128;// van del -128 a 127 1 byte
		short numero2= 32767; //van del -32767 a 32767 2 byte
		int numero3  =  2147483647; //van del -2147483648 y 2147483647 4 byte
		long numero4 = 2147483648L;//ocupan 8 byte y nesecitan el subfijo L

		//para fines practicos el tipo de dato mas utilizado es el tipo int 
		//Tipos de datos primitivos  con coma flotante 
		float  numero5 = 3.1416f;//ocupa 4 byte y necesita el subfijo f
		double numero6 = 2.54;//ocuoa 8 byte de memoria
		
		// tipos de datos booleanos 
		boolean flag = true; // o valor true o false 
		// y estos tipos de datos son utiles para evaluar condiciones o expresiones 
		
		char carater = 'a' ;// puede contener solo un caracter a la vez 
				
		// tipos de datos no primitivos 
				//tipos de datos estructurados o tipos de dato objeto
				// tipos de dato referenciales , etc.

		// Cadena de datos
		
		//ejemplo de declarar un string sin valor asignado
		String nombre;
		nombre = "luis nahum hernandez";
		
//ejemplo de declarar un string con un calorasignado desde el inicio 
		String fecha = "hoy es martes 25 de julio de 2024";
		
		//estos tipos de datos objetos  o estructurales se identifican tambien x ser capaces de utilizar metodo
		nombre.length();
	
		// podemos encontrar tambien a los tipos de datos wrapper o envotorios son clases o tipo de dato objeto 
		// que envuelve a los primitivos
		
		//ejemplo de tipos de datos wrapper
		Byte numero11= 127;
		numero11.floatValue();
		numero11.toString();
		
		System.out.println("hola mundo AJAJA " + fecha);
		System.out.println(15+18);
		System.out.println(numeroUno+numero2);
		System.out.println("la suma es = "+ (numeroUno + numero2));
	
		
		
		// Ctrl + S para guardar cambios en nuestra clas e
	}// cierre del main
} // cierre de la clase
