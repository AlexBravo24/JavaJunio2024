package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// Ciclos o tambien llamados bucles
		// Son estructuras que nos van a permitir ejecutar "n" veces una accion o bloque de codigo, de acuerdo a una
		// condicion o condiciones
		
		// Casi siempre nos apoyamos en el cambio de una variable por lo general numerica, puede ser booleana, etc.

		
		// Ciclo while - mientras se cumpla una condicion se estara ejecutando
		
		/*
		 * Mientras (esto se cumpla) {
		 * 				ejecutamos este bloque de codigo
		 * 		}
		 */
		
		int x = 8;
//		
//		while (x<5) {
//			System.out.println("Hola Mundo");
//			// Si no hay algo que detenga o incremente x, el ciclo tiende al infinito
//			// Para poder controlarlo, indicamos un incremento
//			x++;
//		} 
		
		// Ciclo Do While - Similar al ciclo While, en este ciclo primero hacemos, y despues preguntamos si el bloque o
		// accion debe seguir ejecutandose.
		// Es util cuando estamos en alguna situacion en la que puede que no se cumpla la condicion, y nos aseguramos que
		// el programa se ejecute por lo menos una vez.
		
		/*
		 * Has {
		 * 		ejecuta este bloque de codigo
		 * }
		 * mientras (esto se cumpla);
		 */
		
//		do {
//			System.out.println("Hola Mundo"); // Este ciclo primero, hace y despues pregunta si debe seguir ejecutandose
//		}
//		while (x>10);
		
		// El ciclo while se puede considerar un ciclo o bucle indeterminado
		
		// Ciclo for - es un ciclo determinado porque desde un inicio se establecen las conidiciones sobre las cuales
		// funcionara este. Se utiliza cuando tenemos una idea de cuantas veces se ejecutara una tarea.
		
		/*
		 * Para (estas condiciones){
		 * 		ejecuta este bloque de codigo
		 * }
		 * 
		 * Para (una variable de control; una condicion; un incremento){
		 * 		se ejecuta este bloque de codigo
		 * }
		 * 
		 */
		
		for (int i=0; i<5; i++) {
			System.out.println((i+1)+". Hola Mundo");
		}
		
		
	} // MAIN

} // CLASS
