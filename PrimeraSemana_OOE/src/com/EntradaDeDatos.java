package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		
	//vamos a aprender valores que pueden ser leidos
    //desde el teclado
		
	//Ejemplo, guardar un valor numerico
	//Declaramos primero una variable donde guardar ese valor	
	int edad;
	
	//Creamos una variable de una clase llamada scanner
	Scanner entrada = new Scanner (System.in);
	//Antes de asignar un valor puedo mandar una impresion en consola que me indique
	//que se esta solicitando
	System.out.println("Introduce tu edad");
	System.out.println("El proximo año tendras");
	edad = entrada.nextInt();

	//Podemos seguir utilizando el mismo Scanner y guardar un nombre
	String nombre = entrada.next();
	
	//Si queremos ahorrar memoria y que el Scanner no quede abierto si ya no lo vamos
	//a utilizar mas
	entrada.close();
	
	
	
	//Una vez guardado el valor podemos hacer uso de el para alguna operacion
  //  System.out.println("El proximo año" + nombre + " tendras: " + (edad+1) + "años");
    
	
	//Operador modulo %
	//Nos ayuda a devolver el valor del residuo de una division
	
	int x = 10;
			
	int resultado = 10/2;
	
	System.out.println(resultado);
	
	
	
	}

}
