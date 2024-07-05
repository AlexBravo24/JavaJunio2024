package com; //Este es el nombre de mi paquete

public class TiposDeDatos { //Llave de la clase
	
	public static void main(String[] args) {
		
	//Esto es un comentario	
		/*Comentarios del 
		 * multiples
		 * lineas
		 * 
		 */
		
		// Control+ s =para guardar cambios
		
		//Declaracion de tipo de datos
		
		//Tipo de dato primitivo NUMERICOS ENTEROS
		
		//Ejemplo de declarar un tipo de dato entero, sin valor asignado inicialmente
		
		byte numeroUno;
		
		numeroUno=12; //Hasta aqui le estamos asignando un valor a guardar
		
		//Ejemplo de declarar nuestras variables con un tipo de dato y valores
		//Asignados desde un inicio
		
		byte numero1= -128; //Van del -128 a 127 y ocupan un byte de memoria
		short numero2= 32767; // Van del -32768 a 32767 y utilizan 2 bytes de memoria
		int numero3= 2147483647; //Van del -2147483648 al 2147483647, 4 bytes de memoria
		long numero4 = 21474836491L; //Ocupan 8 bytes de memoria y necesitan del sufijo  L
		//Para poder almacenar sus valores
		//Para fines practicos el tipo de dato mas utilizado es el int
		
		//Tipos de datos primitivos COMA FLOTANTE O DECIMALES
		
		float numero5 = 3.1416F; //Ocupa 4 bytes y necesita el sufijo F
		double numero6 = 2.5412199; //Ocupa 8 bytes de memoria
		
		//Para fines practicos el tipo de dato mas utilizado es double
		
		//TIPOS DE DATOS PRIMITIVOS Booleanos y Caracter
		
		boolean evalua = true; // Solo admite valores true o falso
		//Estos tipos de datos son utilizados para evaluar condiciones o expresiones
		
		char caracter= 'a'; //Puede contener solo un caracter a la vez y va entre comillas sencillas
		
		//TIPOS DE DATOS NO PRIMITIVOS O TIPOS DE DATOS ESTRUCTURADOS, TIPO DE DATO OBJETO, REFERENCIALES
		
		//Cadena de texto 
		
		//Ejemplo de declarar un String sin valor asignado
		
		String nombre;
		
		nombre= "Jorge Alejandro";
		
		//Ejemplo de declarar un string con valor asignado desde el inicio
		String fecha = "Hoy es martes 25 de junio del 2024";
		
		//Este tipo de dato objeto o estructurados se identifican tambien por ser capaces
		//de utilizar metodos
		//Podemos encontrar tambien los tipos de datos Wrapper o envoltorio
		//Son clases o tipos de dato objeto que envuelven a los primitivos y pueden utilizar ciertos metodos
		
		
		//Ejemplo tipo de dato Wrapper
		
		Byte numero11= 127;
		
		numero11.toString(); // Si tuvieramos que convertir el valor entero a decimal, ocupamos este metodo como ejemplo
		
		//Darle salida a nuestros datos en consola
		
		System.out.println("Hola mundo");
		
		System.out.println(fecha);// Para quitar la advertencia con subrayado
		
		System.out.println(15+18);
		
		System.out.println(numeroUno+numero2);
		
		//Ejemplo de un mensaje y una operacion
		//cuando mostramos texto y un valor
		//la operacion se tiene que poner entre parentesis 
		
		System.out.println("La suma es:" +(numeroUno+numero2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	//Cierre del main

} //Cierre de la clase
