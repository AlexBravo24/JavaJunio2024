package com;

public class TiposDeDatos {
	
public static void main(String[] args) {
	
	/*
	 * Comentarios
	 * de
	 * multiples
	 * lineas
	 */
	
	//Declaracion tipos de datos
	
	// Tipos de datos primitivos - numericos enteros
	
	// Ejemplo de declarar un tipo de dato entero, sin valor asignado inicial al momento
	
	byte numeroUno;
	
	numeroUno = 127; // Hasta aqui se asigna un valor a almacenar
	
	//Ejemplo de declarar nuestras variables con su tipo de dato y valores asignados desde un inicio
	
	byte numero1 = -128; // Tipos de dato byte van del -128 a 127 y ocupan 1 byte de memoria
	short numeroDos = 32767; // Tipos de datos short van del -32768 al 32767 y utilizan 2 bytes de memoria
	int numero3 = 2147483647; // Tipos de datos int van del -2147483648 al 2147483647 y utilizan 4 bytes de memoria
	long numero4 = 2147483649L; // Ocupan 8 bytes de memoria y necesitan del sufijo l para poder almacenar sus valores
	
	// Para fines practicos el tipo de dato mas utilizado es el tipo int
	
	//Tipos de datos primitivos - Coma flotante o decimales
	
	float numero5 = 3.1416f; // Ocupa 4 bytes y necesita el sufijo f
	double numero6 = 2.54; // Ocupa 8 bytes 
	
	// Para fines practicos el tipo de dato mas utilizado es el tipo double
	
	// Tipos de datos primitivos - Booleanos y Caracter
	
	boolean evalua = true; // Solo admite valores true or false
	//Estos tipos de dato son utiles para evaluar condiciones o expresiones
	
	char caracter ='a'; // solo puede contener un caracter a la vez
	
	// Tipos de dato no primitivo 
	// Tipos de dato estructurado, tipos de dato objeto
	// Tipos de dsto referenciales, etc
	
	//Cadena de texto
	
	//Ejemplo de declarar un String sin valor asignado
	
	String nombre;
	nombre = "Mauricio Aguilar";
	
	// Ejemplo de declarar un String con un valor asignado desde el inicio
	
	String fecha = "Hoy es martes 25 de junio de 2024";
	
	// Estos tipos de dato objeto o estructurados se identifican tambien por ser capaces de utilizar metodos
	// Podemos encontrar también a los tipos de dato wrapper o envoltorio, son clases o tipos de dato objeto que envuelven
	// a los primitivos y pueden utilizar ciertos metodos
	
	// Ejemplo de tipos de dato Wrapper
	Byte numero11 = 127; 
	
	numero11.floatValue(); // Si tuvieramos que convertir el valor entero a decimal, ocupamos este metodo como ejemplo
	
	// Darle salida a nuestros datos en consola
	System.out.println ("Hola mundo"); 
	
	System.out.println(fecha);
	
	// syso + ctrl + espacio 
	// sout + ctrl + espacio
	System.out.println();
	
	// Ejemplo de visualizar una suma de dos numeros o dos variables
	System.out.println(15+10);
	System.out.println(numeroUno+numeroDos);
	
	// Ejemplo de mostrar un mensaje y una operacion
	// Cuando mostramos texto y otro valor, si no lo contenemos entre parentesis, si es que no es una operacion. emtramos
	// en un modo de concatenacion
	
	System.out.println("La suma es: "+numeroUno+numeroDos); // Concatenacion
	System.out.println("La suma es: "+(numeroUno+numeroDos)); // Operacion
	 
	
} // Cierre del main

} // Cierre de la clase
