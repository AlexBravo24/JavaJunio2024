package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS o BUCLES
		//Son estructuras que nos van a permitir ejecutar "n" veces una acci�n o bloque de c�digo
		//de acuerdo a una condici�n o condiciones
		
		//casi siempre nos apoyamos en el cambio de una variables, por lo general, n�merica, puede ser booleana, etc.
		
		//while (Mientras.... se cumpla una condici�n) se estar� ejecutando
		
		/*
		 * mientras (esto se cumpla) {
		 *      ejecutamos este bloque de c�digo
		 * }
		 */
		
		int x = 1;
		/*
		while(x<5) {
			System.out.println("Hola mundo");
			//Si no hay nada que lo detenga o incremente x, el bucle es infinito
			//Para poder controlarlo, indicamos un incremento:
			//x = x +1;
			//Otra forma de expresar un incremento de 1 en 1 :
			x++; 
		}
		*/
		
		//do-while - Similar al ciclo while, pero con este ciclo primero hacemos y despues preguntamos si
		//el bloque o acci�n debe seguir ejecutandose.
		//Es �til cuando estamos en alguna situaci�n en la que puede que no se cumpla la condici�n
		//y nos aseguramos que el programa se ejecute por lo menos 1 vez
		
		/*
		 * haz { 
		 *    ejecuta este bloque de c�digo
		 * } mientras (esto se cumpla);
		 */
		/*
		do {
			System.out.println("Hola mundo");
		}while(x>10); 
		*/
		
		//El ciclo while se puede considerar un ciclo o bucle indeterminado
		
		//Ciclo for - es un ciclo determinado, porque desde un inicio se estabalecen las condiciones sobre las cuales
		//funcionar� esto. Se utiliza cuando tenemos una de cuantas veces ejecutar una tarea
		
		/* 
		 * 
		 * para (estas condiciones){
		 *          se ejecuta este bloque de c�digo
		 * }
		 * 
		 * para (una variable de control; una condici�n; un incremento){
		 *          se ejecuta este bloque de c�digo
		 * }
		 */
		//Usar comando for + ctrl + espacio
		/*
		for (int i = 1; i < 5; i++) {
			System.out.println(i + " . Hola mundo");
		}
		*/
		for (int i = 1; i < 12; i++) {
			System.out.println(i + " . Hola mundo");
		}
			
		
	}

}
