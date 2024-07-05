package com; //Este es el nombre del paquete

public class TiposDeDatos {

	public static void main(String[] args) {
		
		 // Esto es un comentario
		
	/*Comentarios 
	 * de 
	 * multiples 
	 * lines
	 * 
	 */
		
	//Ctrl + s para guardar cambios en nuestra clase / codigo
		
		//Declaracion de los tipos de datos
		
		//TIPOS DE DATOS PRIMITIVOS - NUMERICOS ENTEROS
		
		//Ejemplo de declarar un tipo de dato entero, sin valor asignado inicialmente
		byte numeroUno;
		
		numeroUno=127; //Hasta aqui le estamos asignando un valor a guardar
		
		//Ejemplo de declarar nuestras variables con su tipo de dato y valores
		//asignado desde un inicio
		byte numero1 = -128; //Van del -128 a 127 y ocupan y byte de memoria
		short numero2 =32767;//Van del -32768 a 32767 y utilizan 2 bytes de memoria
		int numero3 = 2147483547; //Van del -2147483648 al 2147483647. 4 bytes de memoria
		long numero4 = 2147483649L; //Ocupan 8 bytes de memoria y ocupan del sufijo L
		//Para poder almacenar sus valores
		
		//Para fines practicos, el tipo de dato mas utilizado es el int
		
		//TIPOS DE DATO PRIMITIVO - COMA FLOTANTE O DECIMALES
		
		float numero5 = 3.1416F; //Ocupa 4 bytes y necesita el sufijo F
		double numero6 = 2.54; //Ocupa 8 bytes de memoria
		
		//Para fines practicos, el tipo de dato mas utilizado para decimales es double
		
		boolean evalua = true; //Solo damite valores treu or false
		//y estos tipos de dato son utiles para evaluar condiciones
		//o expresiones
		
	char caracter = 'a'; //Puede contener solo un caracter a la vez
	
	
	//TIPOS DE DATO NO PRIMITIVO
	//TIPOS DE DATO REFERENCIADO, TIPOS DE DATO OBJETO
	//TIPO DE DATO REFERENCIALES, ETC
	
	//Cadena de Texto
	
	//Ejemplo de declarar un String sin valor asignado
	String nombre;
	
	nombre="Osvaldo Ortiz"; 
	
	//Ejemplo de declarar un String con un valor asignado desde el inicio
	String fecha = "Hoy es martes 25 de junio de 2024";
	
	//Estos tipo de dato objeto o estructurados se identifican tambien
	//por ser capaces de utilizar metodos
	//Podemos encontrar tambien a los tipos de dato Wrapper o envoltorio
	//Son clases o tipos de dato objeto que envuelven a los primitivos
	//y pueden utilizar ciertos metodos
	
	//Ejemplo de tipos de dato Wrapper
	Byte numero11 = 127;
	
	numero11.toString(); // Si tuvieramos que convertir el valor 
	//entero a decimal, ocupamos este metodo como ejemplo
	
	//Darle salida a nuestros datos en consola
	System.out.println("Hola mundo");
	
	System.out.println(fecha);
	
	//syso + ctrl + espacio
	//sout + crtl + espacio
	System.out.println();
	
	//Ejemplo de visualizar una suma de 2 numeros o 2 variables
	System.out.println(15+18);
	
	System.out.println(numeroUno+numero2);
	
	//Ejemplo de mostrar un mensaje y una operacion
	//Cuando mostramos texto y otro valor, si no lo contenemos entre parentesis
	//si es que es una operacion, entramos en un modo concatenacion
	System.out.println("La suma es:" + (numeroUno + numero2));
	
     
		
		
		
	} //Cierre del main
	
} //Cierre de la clase
