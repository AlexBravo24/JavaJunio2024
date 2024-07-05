package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS o BUCLES
		//Son estructuras que nos van a permitir ejecutar "n" veces una acción o bloque de código
		//de acuerdo a una condición o condiciones
		
		//casi siempre nos apoyamos en el cambio de una variables, por lo general, númerica, puede ser booleana, etc.
		
		//while (Mientras.... se cumpla una condición) se estará ejecutando
		
		/*
		 * mientras (esto se cumpla) {
		 *      ejecutamos este bloque de código
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
		//el bloque o acción debe seguir ejecutandose.
		//Es útil cuando estamos en alguna situación en la que puede que no se cumpla la condición
		//y nos aseguramos que el programa se ejecute por lo menos 1 vez
		
		/*
		 * haz { 
		 *    ejecuta este bloque de código
		 * } mientras (esto se cumpla);
		 */
		/*
		do {
			System.out.println("Hola mundo");
		}while(x>10); 
		*/
		
		//El ciclo while se puede considerar un ciclo o bucle indeterminado
		
		//Ciclo for - es un ciclo determinado, porque desde un inicio se estabalecen las condiciones sobre las cuales
		//funcionará esto. Se utiliza cuando tenemos una de cuantas veces ejecutar una tarea
		
		/* 
		 * 
		 * para (estas condiciones){
		 *          se ejecuta este bloque de código
		 * }
		 * 
		 * para (una variable de control; una condición; un incremento){
		 *          se ejecuta este bloque de código
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
