package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// Estructuras de decision if - evaluan valores booleanos
		
		/* si se cumple esta condicion {
		 * se ejecutra este bloque de codigo
		 * 
		 *
		 * <>
		 * 
		 */
		
		/*int x = 20;
		if (x < 30) {
		    System.out.println("SI");
		} else {
		    System.out.println("NO");
		}

		
		// Condiciones compuestas con operadores logicos
		// And or not igualdad diferencia de
		
		/// And - &&
		//  concidcion or || 
		
		System.out.println("Probando operador Or -");
		if (x < 20 || x > 30) {
		    System.out.println("SI");
		} else {
		    System.out.println("NO");
		}
		
		// Igualdad == Revisa y compara un valor cpontra otro y devuelve true
		//cuando los valores son iguales
		
		System.out.println("Probando operador IGUALDAD ==");
		if (x== 30) {
		    System.out.println("SI");
		} else {
		    System.out.println("NO");
		}
		
		// El operador de !=  compara los valores y devuelve true cuando estos son diferentes
		
		System.out.println("Probando operador diferente de != - ");
		if (x != 30){
		    System.out.println("SI");
		} else {
		    System.out.println("NO");
		}
		
		//NOT  es para negar una condicion no y asi poder cambiar su valor 
		// de true a false y viceversa
		
		System.out.println("Probando operador NOT - !");
		if (!(x == 20)) {
		    System.out.println("SI");
		} else {
		    System.out.println("NO");
		}
		*/
		
		// Estructura if , else anidado o if else  concatenado
		// Nos permite seguir evaluando mas condiciones segun sea necesario
		//Este tipo de estructura es util cuando tenemos q evaluar 
		// Varias condiciones y con varios operadores
		
		
		int dia = 3;
		
		if (dia == 1) {
			System.out.println("Lunes");
		} else if (dia == 2) {
			System.out.println("Martes");
			
		}else if (dia == 3) {
			System.out.println("Miercoles");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Error");
		}
		
		// Estructura switch-case
		// Esta estructura es Util cuando existen varias opciones
		//frente al cambio de una variable  (' '
		
		char letra = 'a'; 
		switch (letra) {// en caso de que esta variable cambie que hacemos
		
		case 'a':
			System.out.println("Lunes");
			
			break;//aqui se rompe la evaluacion
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
