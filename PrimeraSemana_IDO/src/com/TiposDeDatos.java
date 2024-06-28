package com; // esto e el nombre del pakete

public class TiposDeDatos {//nombre de la clase
	public static void main(String[] args) {
		//Esto es un comentario 
		//Declaracion de los tipos de datos
		//Tipos de datos primitivos. numero enteros
		//ejemplo de declaracion un tipo de dato entero, sin valor asugnado
		byte numeroUno;
		numeroUno =127;// colocar el rango 
		byte numero1=-128;
		short numero2 = 32767;
		int numero3 = 21474;
		long numer4 = 232145L;
		
		//Tipos de datos primitivo  coma flotante o decimales
		
		float numero5 =3.1416F;//Ocupa 4 bytes y requiere el sufijo F
		double nemero6 = 2.54;//Ocupa 8 bytes
		//Fines practicos ocupar tipo Double
		//Tipos de datos primitivos  booleanos y caracter
		
		boolean evalua =true;//Solo adminten valores true  or false 
		// y estos tipos de datos son utilies para evaluar condiciones o expresiones 
		
		char caracter = 'a';//pueden contener solo caracter a la vez
		
		//tipos de dato no primitivo
		//tipo de dato estructurado tipos de dato objeto
		// tipo de dato referenciale , etc
		
		
		//tipos de datos cadena de texto
		
		//ejemplo de declarar un string sin valor asignado
		
		String nombre;
		
		nombre = "Ivan Diaz Olvera";
		// ejemplo de declarar un string con un valor asignado desde el inicio 
		
		String fecha = "Hoy es Martes 25 de Junio 2024";
		// estos tipos de dato objeto o estructurados se identifican tambien por ser capaces de contener metodos
		// podemos encontrar a los tipos de datos wraper o envoltori
		//son clases o tipos de datos objeto que envuelven a los primitivos
		//y pueden utilizarse cierto metodos
		//Ejemplo de tipo de datos wraper
		Byte numero11 = 127;
		numero11.floatValue(); //si se tendria que cambiar le valor de numeoro a decimal 
		// darlke salida a nuestros datos en consola
		
		System.out.println("Hola Mundo");
		 //atajos
		//syso + crt + espacio
		//sout + crt + espacio
		System.out.println(fecha);
		
		//ejemplo de mostrar un mensaje y una operacion
		
		System.out.println("La suma es: " + (numeroUno + numero2));
		
		
	 
		
		
		
	}//Cierre del Main
}
