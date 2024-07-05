package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Ciclos o bucles
		//Son estructuras que nos van a permitir
		//ejecutar n veces un bloque de codigo
		//de acuerdo a una condicion o condiciones
		
		//Casi siempre nos apoyamos en el cambio de una variable por lo general numerica, puede ser booleana, etc
	
		//While (mientras se cumpla una condicion se estara ejecutando)
		
		/*
		 * mientras (esto se cumpla){
		 * ejecutamos este bloque de codigo
		 * }
		 */
		
		int x= 1;
		while (x<5) {
		System.out.println("hola mundo");
		//Como podemos ver si no hay algo que detenga el incremento x el ciclo tiende al infinito para poder 
			//controlarlo indicamos un incremento
			//x=x+1;
			//otra forma de expresar un incremento de uno en uno
			x++;
			//o un decremento x--; si es otro tipo de variable
			
			//do-while similar al ciclo while pero con este ciclo primerohacemos
			
			//es util  cuando estamos en una situacion en la que puede que no se cumpla la condicion
			//nos aseguramos que el programa ejecute por lo menos una vez
			/*
			 * haz{
			 * ejecuta este bloque de codigo
			 * }mientras (esto se cumpla)
			 */
			do {
				System.out.println("Hola mundo");//este ciclo primero hace y despues pregunta si debe seguir ejecutandose
			} while (x>10);
			
			//El ciclo while se puede considerar un ciclo o bucle indeterminado
			
			
			
			//El ciclo for un ciclo determinado porque desde un inicio se establece
			//las condiciones sobre las cuales funcionaraeste. Este se utiliza cuando tenemos 
			//de cuantas veces ejecutar una tarea
			
			/*
			 * 
			 * para (estas condiciones ){
			 *  se ejecuta este bloque de codigo
			 *  }
			 *  para (una variable de control; una condicion; un incremento){
			 *          se ejecuta este bloque de codigo
			 *          }
			 *  
			 *  
			 */
				
			for (int i=1; i<=5;i++){
				System.out.println(i+"Hola mundo");
			}
			
			
		}
		
		
		
	}

}
