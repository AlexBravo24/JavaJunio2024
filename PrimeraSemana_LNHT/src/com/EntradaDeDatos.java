package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		//vamos a aprender a intruducir valores que pueden ser leidos desde teclado
		
		//primero declaramos un valor numerico 
		//Declaramos primero una variable donde guardamos ses valor
		int edad;
		
		//creamos una variable de una clase llamada Scanner
		Scanner entrada = new Scanner(System.in);
		//antes de ingresar un valor puedo mandar una impresion en consola que me indique que esta solicitando
		System.out.println("Ingrese una edad");
		edad = entrada.nextInt();
		System.out.println("Introduce tu nombre ");
		String nombre = entrada.next();
		//si quieren ahorrar memoria y el scanner no quede abierto si ya no lo vamos usar
		entrada.close();
		
		System.out.println("El proximo año tendras : "+ nombre + (edad+1)+" años de edad" );
		//una vez guardado el valor podemos hacer uso de el para asignar una operacion
		
		int x= 10;
		int resultado= x/2;
		System.out.println(resultado);
	}

}
