package com;

public class TiposDeDatos {

	public static void main (String[] args) {
		
		// Esto es un comentario
		
		/*Comentarios
		 *de
		 *multiples
		 *lineas
		 *
		 */
		
		// Ctrl + S para guardar cambios en nuestra clase / código
		
		// Declaración de los tipos de datos
		
		//TIPOS DE DATOS PRIMITIVOS - NÚMERICOS ENTEROS
		
		//Ejemlo de declarar un tipo de dato entero, sin valor asignado inicialmente
		byte numeroUno;
		
		numeroUno=127; //Hasta aquí le estamos asignando un valor a guardar
		
		//Ejemplo de declarar nuestras variables con su tipo de dato y valores
		//asignados desde un inicio
		byte numero1 = -128; //Van del -128 a 127 y ocupan 1 bute de memoria
		short numero2 = 32767; //Van del -32768 a 32767 y utilizan 2 bytes de memoria
		int numero3 = 2147483647; //Van del -2147483648 a 2147483647: 4 bytes de memoria
		long numero4 = 2147483649L; //Ocupan 8 bytes de memoria y necesitan del sufijo L para poder almacenar sus valores
		
		//Para fines practico, el tipo de dato mas utilizado es el "int"
		
		//TIPOS DE DATO PRIMITIVO - COMA FLOTANTE O DECIMALES
		
		float numero5 = 3.1416F; //Ocupa 4 bytes y necesita el sufijo F
		double numero6 = 2.54; //Ocupa 8 bytes de memoria, acepta mas valores enteros y decimales
		
		//Para fines prácticos, el tipo de dato más utilizado para decimales es el double
		
		//TIIPO DE DATOS PRIMITIVOS - BOOLEANOS Y CARACTER
		
		boolean evalua = true; //Solo admiten valores true or false y estos tipos de datos son útiles para evaluar condicioones o expresiones
		
		char caracter = 'a'; //Puede contener solo un caracter a la vez
		
		//TIPOS DE DATO NO PRIMITIVOS
		//TIPOS DE DATO ESTRUCTURDO, TIPOS DE DATO OBJETO
		//TIPOS DE DATO REFERENCIALES, ETC
		
		//Cadena de Texto
		
		//Ejemplo de declarar un String sin valor asignado
		String nombre; 
		
		nombre="Dylan Israel";
		
		//Ejemplo de declarar un String con un valor asignado desde el inicio
		String fecha = "Hoy es martes 25 de Junio de 2024";
		
		//Estos tipos de dato objeto o estructurados se identifican tambien por ser capaces de utilizar métodos
		//si se usa el comando "nombre." permite desplgar una barra de método
		//Podemos encontrar también a los tipos de dato Wrapper o envoltorio
		//Son clases o tipos de dato objeto qu envuelven a los primitivos 
		//y pueden utilizar ciertos métodos
		
		//Ejemplo de tipos de dato Wrapper
		Byte numero11 = 127;
		
		numero11.floatValue(); //Si tuvieramos que convertir el valor entero a decimal, ocupamos este método como ejemplo
		
		//Darle salida a nuestros datos en consola o ejecutar el método main 
		System.out.println("Hola mundo");
		
		System.out.println(fecha);
		
		//syso + ctrl + espacio como atajo para no escribir todo el comando
		//sout + trl + espacio
		System.out.println();
		
		//Ejemplo de visualizar una suma de 2 números o 2 variables
		System.out.println(15+18);
		
		System.out.println(numeroUno+numero2);
		
		//Ejemplo de mostrar un mensaje y una operacion
		//Cuando mostramos texto y valor, si no contemplamos entre parentesis
		//si es que es una operacion, entramos en un modo de concatenación:
		System.out.println("La suma es:" + numeroUno + numero2);
		
		//la forma correcta contemplando los parentesis es:
		System.out.println("La suma es:" + (numeroUno+numero2));
		
	} //Cierre del main

} //Cierre de la clase