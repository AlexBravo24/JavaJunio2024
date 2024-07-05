package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//CICLOS o tambien llamadas BUCLES
		//Son estructuras que nos van a permitir
		//ejecutar "n" veces una accion o bloque de codigo
		//de acuerdo a una condicion o condiciones
		
		//Casi siempre nos apoyamos en el cambio de una variable
		//por lo general numerica, puede ser booleana, etc
		
		
		//while (mientras)..... se cumpla una condicion) se estara ejecutando
		/*
		 * mientras (esto se cumpla) {
		 *    ejecutamos este bloque de codigo
		 *    }
		 * 
		 * 
		 */
		
		int x = 8;
		
		/*
	
		
		while (x>5) {
			System.out.println(x + " .Hola mundo");
			//Como podemos ver si no hay algo que detenga o incremente x, el ciclo
			//tiende al infinito
			//para poder controlarlo, indicamos un incremento
			//x = x + 1;
			//Otro forma de expresar un incremento de 1 en 1
			x--;
			*/
			
		
		
		
		//do-while - Similar al ciclo while, pero con este ciclo primero hacemos
		//y despues preguntamos si el bloque o accion debe seguir ejecutandose
		//Es util cuando estamos en alguna situacion en la que no se cumpla
		//la condicion y aseguramos que el programa se ejecute por lo menos una vez
		
		/*
		 * Haz
		 *  ejecuta este bloque de codigo
		 *  } mientras esto se cumpla);
		 */
		
		/*
		do {
			System.out.println("Hola mundo");
		}while(x>10);
		*/
		
		//El ciclo while se puede considerar un ciclo o bucle indeterminado
		
		//El ciclo for- es un ciclo determinado, porque desde un inicio se establecen
		//las condiciones sobre las cuales funcionara este- Se utiliza cuando tenemos una
		//de cuantas veces ejecutar una tarea
		
		/*
		 * 
		 * para (estas condiciones) {
		 *       se ejecuta este bloque de codigo
		 * }      
		 * 
		 * para (una variable de control; una condicion; un incremento){
		 *         se ejecuta este bloque de codigo
		 * }         
		 */
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ".Hola mundo");
			
		}
		
		
	}
	

}
