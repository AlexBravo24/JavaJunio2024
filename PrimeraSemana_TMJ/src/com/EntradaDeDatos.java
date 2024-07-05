package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// introduccion de datos a traves del teclado 
		
		//ejemplos con valores numericos
		int edad;
		//creamos una variable de entrada Scanner
		Scanner entrada = new Scanner (System.in);
		//antes de asignar un valor solicitamos los datos a traves de un mensaje
		System.out.println("Ingrese su edad: ");
		edad  = entrada.nextInt();
		//para confirmar que se guardo correctamente  solicitamos que muestre la edad que guardamos
		System.out.println("La edad ingresada fue:"+ edad);
		//aqui concatenamos la edad  al mensaje de mostrar la edad
		System.out.println("el proximo año tendras: "+(edad+1)+ " años");
		// se puede usar el Scanner para guardar nombre 
		
		System.out.println("Introduce tu nombre: ");
		String nombre= entrada.next();
		System.out.println("El proximo año "+ nombre + " tendras "+ (edad+1)+ " años");
		
		entrada.close();
//		
////		el atajo para comentarios es crtl +7
//		uso de operadores % modulo nos devuelve el residuo de una division
		int x=10;
		int resultado =10%2;
		System.out.println(resultado);
	}

}
