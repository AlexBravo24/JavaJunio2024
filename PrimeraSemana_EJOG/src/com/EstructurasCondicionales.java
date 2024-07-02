package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras de decusuón if - evaluan valores booleanos

	   /*
	    * si (cumple esta condición){
	    * 		 se ejecuta este bloque de codigo
	    * } si no se cumple {
	    * 		 se ejecuta este otro
	    * }		
	    */
		//Ejemplo
		/*
		int x = 20;
		
		if (x<=20) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		// Condiciones compuestas con operadores lógicos
		// AND , OR , NOT , IGUALDAD, DIFERENTE DE
		
		//AND  - && - Devuelve el valor true cuando se cumple todas las condiciones
		System.out.println("Probando operador AND");
		
		if (x<20 && x>=10) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		
		// OR - || - Devuelve True si se cumple al menos una condición
		System.out.println("Probando operador OR");
		
		if (x<20 || x>=10) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		
		//IGUALDAD -- == Valida que los dos valores son iguales
	System.out.println("Probando operador IGUAL ==");
		
		if (x==30) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		
		//DIFERENTE DE -- != Compara los valores y devuelve true cuando estos son diferentes
		System.out.println("Probando operador DIFERENTE DE - !=");
			
			if (x!=30) {
				System.out.println("Si");
			} else {
				System.out.println("No");
			}
		// NOT - ! - Nos permite negar una condición y asi poder cambiar su valor de true a false y viceversa
			System.out.println("Probando operador NOT - !");
			
			if (!(x ==20)) {
				System.out.println("Si");
			} else {
				System.out.println("No");
			}
			*/
		
		  int dia = 4;
		  
		  if(dia == 1) {
			  System.out.println("Lunes");
			  
		  }else if(dia == 2) {
			  System.out.println("Martes");
		  }else if(dia == 3) {
			  System.out.println("Miercoles");
		  }else if(dia == 4) {
			  System.out.println("Jueves");
		  }else if(dia == 5) {
			  System.out.println("Viernes");
		  
		  }else {
			  System.out.println("Error");
		  }
		
		  //Estructura Switch-case, es util cuando existen varias opciones frente al cambio de una variable
		  
		  char letra ='a';
		  
		  switch (letra) {
				case 'a':
					System.out.println("Lunes");
					break;
					
				case 'b':
					System.out.println("Martes");
					break;
				case 'c':
					System.out.println("Miercoles");
					break;
				case 'd':
					System.out.println("Jueves");
					break;
				case 'e':
					System.out.println("Viernes");
					break;
		
				default:
					System.out.println("Error");
					break;
				}
		  
		 		
	}
	
	

}
