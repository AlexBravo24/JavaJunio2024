package com;

public class TiposDeDatos {
	
	public static void main(String[] args) {
		//Esto es un comentario
		
		/*
		 * Comentarios
		 * de
		 * multiples lineas
		 */
		
		//Ctrl + S para guardar
		
		//Declaración de los tipos de datos
		
		//TIPOS DE DATO PRIMITIVOS - NUMÉRICO ENTEROS
		
		//Ejemplo de declarar un tipo de dato entero, sin valor asignado inicialmente
		
		byte numeroUno;
		
		numeroUno= 12; // Hasta aqui se le asigna un valor a guardar
		
		//Ejmplo de declarar nuestras variables con su tipo de dato y valores asignados desde un inicio
		byte numero1=-128;// Van del -128 al 127 utiliza 1 byte de memoria
		short numero2=32767; // -32768 a 62767 y utilizan 2 bytes de memoria
		int numero3=2147483647; //Van del -2147483648 al 2147483647. Utilizan 4 bytes memoria
		long numero4=2147483648L;// Ocupan 8 bytes de memoria y utiliza el sufijo L
		
		//Para fines practicos, el tipo de dato más utilizado es el int
		
		//TIPOS DE DATO PRIMITIVO - COMA FLOTANTE O DECIMALES
		float numero5 = 3.1416F; // Ocupa 4 bytes y necesita el sufijo F
		double numero6 = 2.5465474864;//Utiliza 8 bytes
		//Para fines practicos, el tipo de dato más utilizado es el double
		
		//TIPOS DE DATOS PRIMITIVOS - Booleanos y Caracter
		
		boolean evalua = true; // Solo toma dos valores True o False, sirve para evaluar condiciones o expresiones
		
		char caracter = 'a'; // Puede contener solo un caracter a la vez
		
		//TIPO DE DATOS NO PRIMITIVO
		//TIPO DE DATO ESTRUCTURADOS, TIPOS DE DATO OBJETO
		//TIPO DE DATO REFERENCIALES, ETC
		
		//Cadena de Texto
		//Ejemplo de declarar un String sin valor asignado
		String nombre;
		
		nombre = "Ernesto Joel Ortega Gutierrez";
		
		//Ejemplo de declarar un String con un valor asignado
		String fecha= "Hoy es martes 25 de Junio de 2024";
		
		//Estos tipos de datos se identifican tambien por ser capaces de utilizar métodos
		//Podemos encontrar también los tipos de datos Wrapper o envoltorio, son clases o tipos de dato
		//objeto que envuelven a los primitivos y pueden utilizar ciertos métodos
		
		//Ejemplo de tipos de dato Wrapper
		Byte numero11 = 127;
		
		numero11.floatValue(); // Si tuvieramos que convertir el valor entero o decimal se utiliza este metodo.
		
		//Darle Salida a nuestros datos en consola
		System.out.println("Hola mundo");
		
		System.out.println(fecha);
		
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		System.out.println();
		//Ejecutar suma
		System.out.println(numero11+numero4);
		//Ejemplo de mostrar un mensaje y una operación
		// Cuando mostramos texto y otro valor , si no lo contenemos entre parantesis se concatena
		System.out.println("La suma es : "+ (numeroUno+numero2));
		
		
		
		
	}//Cierre del main
	
}//Cierre de la clase
