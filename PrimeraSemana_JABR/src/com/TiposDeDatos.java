package com; //Este es el nombre de mi paquete

public class TiposDeDatos { //Este el nombre de mi clase
	
	public static void main(String[] args) {
		
		// Esto es un comentario
		
		/* Comentarios
		 * de
		 * multiples
		 * lineas
		 * 
		 */ 
		
		// Ctrl + S para guardar cambios en nuestra clase / código
		
		//Declaración de los tipos de datos
		
		//TIPOS DE DATO PRIMITIVOS - NUMÉRICOS ENTEROS
		
		//Ejemplo de declarar un tipo de dato entero, sin valor asignado inicialmente
		byte numeroUno;
		
		numeroUno=127; //Hasta aqui le estamos asignando un valor a guardar
		
		//Ejemplo de declarar nuestras variables con su tipo de dato y valores
		//asignados desde un inicio
		byte numero1 = -128; //Van del -128 a 127 y ocupan 1 byte de memoria
		short numero2 = 32767;// Van del -32768 a 32767 y utilizan 2 bytes de memoria
		int numero3 = 2147483647; //Van del -2147483648 al 2147483647. 4 bytes de memoria
		long numero4 = 2147483649L; //Ocupan 8 bytes de memoria y necesitan del sufijo L
		//para poder almacenar sus valores
		
		//Para fines practicos, el tipo de dato más utilizado es el int
		
		//TIPOS DE DATO PRIMITIVO - COMA FLOTANTE O DECIMALES
		
		float numero5 = 3.14161212121F; //Ocupa 4 bytes y necesita el sufijo F
		double numero6 = 2.5412199; //Ocupa 8 bytes de memoria
		
		//Para fines practicos, el tipo de dato más utilizado para decimales es el double
		
		//TIPOS DE DATOS PRIMITIVOS - Booleanos y Caracter
		
		boolean evalua = true; //Solo admiten valores true or false
		//y estos tipos de dato son utiles para evaluar condiciones
		//o expresiones
		
		char caracter = 'a'; //Puede contener solo un caracter a la vez
		
		
		//TIPOS DE DATO NO PRIMITIVO
		//TIPOS DE DATO ESTRUCTURADO, TIPOS DE DATO OBJETO
		//TIPO DE DATO REFERENCIALES, ETC
		
		//Cadena de Texto
		
		//Ejemplo de declarar un String sin valor asignado
		String nombre;
		
		nombre="Jorge Alejandro";
		
		//Ejemplo de declarar un String con un valor asignado desde el inicio
		String fecha = "Hoy es martes 25 de Junio de 2024";
		
		//Estos tipos de dato objeto o estructurados se identifican también
		//por ser capaces de utilizar métodos
		//Podemos encontrar también a los tipos de dato Wrapper o envoltorio
		//Son clases o tipos de dato objeto que envuelven a los primitivos
		//y pueden utilizar ciertos métodos
		
		//Ejemplo de tipos de dato Wrapper
		Byte numero11 = 127;
		
		numero11.toString(); //Si tuvieramos que convertir el valor
		//entero a decimal, ocupamos este metodo como ejemplo
		
		// Darle salida a nuestros datos en consola
		System.out.println("Hola mundo");
		
		System.out.println(fecha);
		
		//syso + ctrl + espacio
		//sout + ctrl + espacio
		System.out.println();
		
		//Ejemplo de visualizar una suma de 2 numeros o 2 variables
		System.out.println(15+18);
		
		System.out.println(numeroUno+numero2);
		
		//Ejemplo de mostrar un mensaje y una operacion
		//Cuando mostramos texto y otro valor, si no lo contenemos entre parentesis
		//si es que es una operacion, entramos en un modo de concatenacion
		System.out.println("La suma es: " + (numeroUno + numero2));
		
		
		
		
		
		
		
		
		
		
		
		
	} //Cierre del main

} //Cierre de la clase
