package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS o tambien llamados bucles
		//so estructuras que nos van a permitir ejecutar "n" veces una accion o bloque de codigo 
		//de acuerdo a a una condicion o condiciones
		
		//casi siempre nos apoyamos en el cambio de una variable
		//por lo general numerica , puede ser boolena etc.
		
		//while (mientras..... se cumpla una condicion)se estara ejecutando
		
		/*mientras (esto se cumpla){
		 *    ejecutamos este bloque de codigo
		 * 
		 */
		int x = 8;
		
	/*	while(x<5) {
			System.out.println("Hola mundo");
			//para poder ver, si no hay halgo que detenga o incremente x, el ciclo
			//tiende al infinito
			//para poder controlarlo, indicamos un incremento
			x=x+1;
			
		 //otra forma de expresar u n incremento de 1 en 1
			
		x--;
		}
		
		
		*/
		
		//do while   es similar al ciclo while, pero con este ciclo primero hacemos 
		//y despues preguntamos si el bloque o accion debe seguir ejecutandose 
		// es utili cunado estamos en alguna situaciuon en la que puede que no se cuempla 
		//la condicion y nos aseguremos  que por el programa se ejecute por lo menos 1 vez
		
		 //haz{
		//ejecuta este bloque de codigo
	   //} mientras(esto se cumpla);
		
		
		/*do {
			System.out.println("Hola mundo");
			
		
		   }while(x>10);
		*/
		
		
		//while se puede considerar un ciclo o bucle indeterminado
		
		
		//Ciclo for --es un ciclo determinado, por que desde u n inicio se establecen
		//las condiciones sobre las cuales fuuncionara esta. se utiliza cuando tenemos 
		//una de cuantas veces ejecutar una tarea
		
		/*para esdtas condiciones{
		    se ejecuta este bloque de codigo	
		}
		
		para(una variablede control;
		una condicion; un incremento){
		//   se ejecuta este bloque de codigo
		 * }
		*/
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ".Hola mundo");
			
		}
		
	}

}
