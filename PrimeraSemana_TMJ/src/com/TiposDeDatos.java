package com;//Paquete

public class TiposDeDatos { //clase
	
	public static void main(String[] args) {
		/* DECLARACION DE LOS TIPOS DE DATOS PRIMITIVOS*/
		// datos primitivos enteros
		byte numeroUno;//creamos la variable
		numeroUno=127;//asignamos valor a la variable
		/*EJEMPLO DE VARIABLE CON TIPO DE DATO Y VALOR INICIAL*/
		byte numero1=-128;
		short numero2 = 32767;
		int numero3 = 2147483647;
		long numero4= 2147483649L;// al igual que float ocupa un sufifo "L" en este caso
		
		/*TIPOS DE DATOS PRIMITIVOS FLOTANTES*/
		float num5 = 3.1416f;//este tipo de dato ocupa el sufijo F, y ocupa 4 bytes
		double numero6 = 2.54;
		//para fines practicos  para decimales  utilizar double
		
		
		/*TIPOS DE DATOS BOOLEANOS Y DE TIPO CARACTER*/
		boolean  evalua =true;// solo admite valores de tipo true o false
		//utilizado para evaluar condiciones o expreciones
		char caracter ='a'; //puede contener solo un caracter a la vez 
		
		/*TIPOS DE DATO ESTRUCTURADO, TIPOS DE DATO OBJETO , TIPOS DE DATOS REFERENCIALES*/
		
		//CADENA DE TEXTO
		String nombre;
		nombre ="Jovany Timoteo";
		String fecha= "Hoy es martes 25 de junio del 2024";
		//estos dattipos de dato objeto o estructurados se identifican por ser capaces de utilizar metodos
		numero1= 120;
		/*TIPÓS DE DATO WRAPPER O ENVOLTORIO
		 * son clases o tipos de datos que envuelven a los primitivos
		 * pueden utilizar  ciertos metodos */
		//ejemplo
		 Byte numero11=127;
		 numero11.floatValue(); //ejemplo  de metodo para convertir valor a decimal
		 System.out.println("Hola mundo");
		 System.out.println(fecha);
		 System.out.println(15+18);
		 System.out.println(numero1+numero2);
		//EJEMPLO DE MENSAJE Y OPERACION
		 System.out.println("la suma es : "+ numeroUno+numero2);
		 /*Si no se colocan parentesis  el resultado sera  una concatenacion de cadenas
		  * es decir que mostrara los valores de amvas bariables sin sumarlas*/
		 System.out.println("la suma es :"+(numeroUno + numero2));
		//si se agregan parentesis entonces se realiza la suma 
		
		
		
	}//final de main
		
	}//final de clase
