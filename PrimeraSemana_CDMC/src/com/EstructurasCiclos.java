package com;

public class EstructurasCiclos {

	public static void main(String[] args) {

		//Ciclos o tambien llamados bucles
		//Son estructuras que nos van a permitir

		//ejecutar "n" veces un acción o bloque de codigo

		//de acuerdo a una condición o condiciones

		//Casi siempre nos apoyamos en el cambio de una variable

		//por lo general numérica, puede ser booleana, etc.

		//while (Mientras.... se cumpla una condición) se estará ejecutando

	
	//while (Mientras.. se cumpla una condición) se estará ejecutando

	/*
	* mientras (esto se cumpla) {
	ejecutamos este bloque de codigo
*/
		int x = 8;
		/*
		while ( x<5 ) {
			System.out.println("Hola mundo");
			//Como podemos ver, si no hay algo que detenga o incremente x, wl ciclo
			//tiende a infinito
			//Para poder controlarlo, indicamos un incremento
			//x -x +1
			//Otra forma de expresar un incremneto de 1 en 1
			
			x--;
			*/
		
		
		//do-while-Similar al ciclo while , pero con este ciclo primero hacemos 
		//y depues preguntamos, si el bloque o accion debe requerir ejecutandose
		//Es util cuando estamos en alguno situacion en la que puede que no se cumpla 
		//la condicion y nos aseguramos que el programa se ejecute por lo menos 1 vez 
		
		
		/*
		 * haz{
		 * ejecuta este bloque de codigo
		 * mientras (esto se cumpla);
		 */
		 
		/*
		do {
			System.out.println("Hola mundo");
		}while(x>10);
		*/
		
		//El ciclo while se puede considerar un ciclo o buble indeterminado
		
		//Ciclo for - es un ciclo determinado por que desde un inicio establecen las condiciones sobres lac cuales 
		//funcionara este  Se utlizara cuanod tenemos 
		//de cuantas veces ejecutamos una tarea 
		 /*
		  * para (estas condiciones){
		  *  se jecuta este bloque de codigo
		  *  }
		  *  para ( una variable de control; una condicion; un incremento){
		  *  	se ejecuta este bloque de codigo
		  *  }
		  */
		
		for (int i = 1; i < - 5; i++) {
			System.out.println(i+". Hola mundo");
		}
		}
		}
	
	


