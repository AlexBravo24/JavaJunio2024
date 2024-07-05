package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		//CICLOS o también llamados BUCLES
		//Son estructuras que nos van a permitir
		//ejecutar "n" veces un acción o bloque de codigo
		//de acuerdo a una condición o condiciones
		
		//Casi siempre nos apoyamos en el cambio de una variable
		//por lo general numérica, puede ser booleana, etc.
		
		
		//while (Mientras.... se cumpla una condición) se estará ejecutando
		
		/*
		 * mientras (esto se cumpla){
		 * 		ejecutamos este bloque de codigo
		 * }
		 */
		
		int x = 8;
		
		/*
		while (x>5) {
			System.out.println(x + " .Hola mundo");
			//Como podemos ver, si no hay algo que detenga o incremente x, el ciclo
			//tiende al infinito
			//Para poder controlarlo, indicamos un incremento
			//x = x + 1;
			//Otra forma de expresar un incremento de 1 en 1
			x--;
		}
		*/
		
		//do-while - Similar al ciclo while, pero con este ciclo primero hacemos
		//y después preguntamos si el bloque o acción debe seguir ejecutandose
		//Es util cuando estamos en alguna situación en la que puede que no se cumpla
		//la condición y nos aseguramos que el programa se ejecute por lo menos 1 vez
		
		/*
		 * haz {
		 *    ejecuta este bloque de codigo
		 * } mientras (esto se cumpla);
		 */
		/*
		do {
			System.out.println("Hola mundo");
		}while(x>10);
		*/
		
		//El ciclo while se puede considerar un ciclo o bucle indeterminado
		
		
		//Ciclo for - es un ciclo determinado, porque desde un inicio se establecen
		//las condiciones sobre las cuales funcionará este. Se utiliza cuando tenemos una idea
		//de cuantas veces ejecutar una tarea
		
		/*
		 * 
		 * para (estas condiciones){
		 * 			se ejecuta este bloque de codigo
		 * }
		 * 
		 * para (una variable de control; una condicion; un incremento){
		 * 			se ejecuta este bloque de codigo
		 * }
		 */
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " . Hola Mundo");
		}
		
		
		
		
		
		
		
		
		
	}

}
