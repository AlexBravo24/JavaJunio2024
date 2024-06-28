package com;

public class TiposDeDatos {

	public static void main(String[] args) {
		// declaracion de los tipos de datos 
		// tipos de datos primitivos-numericos enteros
		
		//ejemplo de declarar un tipo de datro entero , sin valir asignado inicialmente 
		
		byte numeroUno;// declaracion de variable 
		
		numeroUno=127; // asignando valor a la variable 
		
		byte numero1=-128; //declarar variables con valor desde el principio
		
		//byte van desde -128 hasta 127 ocupando un bye en la memoria 
		short numero2=32767;     //van de -32768 a 32767 ocupan 2 byte en la memoria
		int numero3=2147483647;  //21474836648 al 2147483647 ocupa 4 bytes en la memoria   
		long numero4=2147483649L; // ocupan 8 byte en la memoria y necesitan un sufijo L para poder almacenar sus valores
		
		
		
		//TIPOS DE DATOS PRIMITIVOS COMA FLOTANTE O DECIMALES
		float numero5=3.1416f; //ocupa 4 byte y necesita el sufijo F
		double numero=2.54; // ocupa bytes 
		
		// para fines practicos, el tipo de dato mas utilizado para decimales es el Double
		
		// tipos de datos primitivos- Boleanos y Caracter
		
		boolean evalua= true ; //  solo admiten valores true or false 
		//y estos tipos de datos son utiles para evaluar condiciones y/o expresiones 
		
		char caracter = 'a'; // puede contener un solo caracter a la vez 
				
		//tipos de dato no primitivos 
				//tipos de datos estructurado, tipos de dato objeto
				//tipos de datos referenciales, etc
				
				// cadena de texto 
				
				// ejemplo de declarar un String sin valor asignado 
				
		
		String nombre;
		nombre="jorge alejandro";
		String fecha ="hoy es martes 25 de junio de 2024";
		//estos tipos de dato objeto o estructurado se identifican tambien 
		//por ser capaces de utilizar metodos 
		//podemos encontrar tambien a los tipos de  dato wrapper o envoltorio
		//son clases o tipos de dato objeto que envuelven a los primitivos 
		//y pueden utilizar ciertos metodos
		
		//ejemplos de tipo de dato wrapper
		Byte numero11=127;
		
		numero11.floatValue();// si tuvieramos que convertir el valor entero a decimal, ocupamos este metodo como ejemplo 
		//7para darle salida a nuestros datos en consola 
		System.out.println("Hola mundo");
		
		System.out.println("fecha");
		
		System.out.println();
		
		
		//ejemplo de visualizar una suma de 2 numeros o 2 variables 
		System.out.println(15+8);

		System.out.println(numeroUno+numero2);
		
		//ejemplo de mostrar un mensaje y una operacion 
		//cuando mostramos texto y otro valor . si no contenemos entre parentesis
		//si es aque es una aoperacion . entramos en modo de concatenacion
		System.out.println("La suma es: " +( numeroUno+numero2));
		
		
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		
		
		
		
		
	}// cierre del main
	
	
}// cierre de la clase 
