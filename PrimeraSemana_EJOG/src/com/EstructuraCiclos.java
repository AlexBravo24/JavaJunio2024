package com;

public class EstructuraCiclos {

	public static void main(String[] args) {
		/* CICLOS o tambien llamados BUCLES
		 * Son estructuras que nos van a permitir ejecutar "n" veces una acción o bloque de codigo
		 * de acuerdo a una condición o condiciones
		 * 
		 * Casi siempre nos apoyamos en el cambio de una variable por lo general numerica, puede ser booleana,etc.
		 * 
		 */
      
		
		
		int x=8;
		 /*//while ( Mientras ... se cumpla una condición) se estara ejecutando
		while(x<5) {
			System.out.println("Hola mundo "+x);
			x=x+1;
		}
		*/
		
		//do-while - Similar al ciclo while, en este ciclo primero se ejecuta y luego pregunta si se debe seguir ejecutando
		//Es util cuando estamos en una situación en la que puede que no se cumpla la condición, nos aseguramos que el programa 
		//se ejecute por lo menos una vez
		/*
		do {
			System.out.println(x+".Hola Mundo");
			x++;
		}while(x>10);
		*/
		
		//Ciclo For - es un ciclo determinado, porque desde un inicio se establecen las condiciones
		//sobre las cuales funcionara este. Se utiliza cuand tenemos una de cuantas veces ejecutar una tarea
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i+".Hola Mundo");
		}
		
	}

}
