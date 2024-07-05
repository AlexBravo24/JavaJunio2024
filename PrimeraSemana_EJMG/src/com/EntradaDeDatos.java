package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// vamo a aprender a introiducir valores que puedan ser leidos desde el teclado
		//ejemplo guardar un  valor numerico
		
		//declaramos primero una variable dende guardar ese valor
		int edad;
		
		//crea una variable de una clase llamada Scanner
		
		Scanner entrada= new Scanner(System.in);
		
		
		// antes de asignar un valor puedo mandar una impresion en 
		//consola que me indique que se esta solicitando
		
		System.out.println("introduce una edad");
		edad= entrada.nextInt();
		
		//podemos seguir haciendo el mismo Scanner y guardar un nombre
		
		System.out.println("Introduce tu nombre");
		String nombre= entrada.next();
		
		//si quieres ahorrar memoria y que el Scanner no quede abierto si ya no lo vamos 
		//a utilizar mas
		
		entrada.close();
		
		
		//una vez guardado el valor podemos hacer usos de el para alguna operacion 
		
		System.out.println("El proximo año "+ nombre+ " 20tendras : " + (edad+1) + " años");
	
		
		
		
		
		
		
		

	}

}
