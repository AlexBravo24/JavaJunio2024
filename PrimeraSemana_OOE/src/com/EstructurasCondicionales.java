package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		//Estructuras de decision if - evaluan valores booleanos
		
		/*
		 * si (se cumple esta condicion)(
		 *     se ejecuta este bloque de codigo
		 * )si no se cumple (
		 *     se ejecuta esto otro
		 * )
		 */
 
		
		//Ejemplo tenemos una variable con un determinado valor
		
		/*int x = 20;
		
		if(x <= 20) {
			System.out.println("si");
			
		}else {
			System.out.println("no");
		}
	
		//Condiciones compuestas con operadores logicos
		//AND, OR, NOT, IGUALDAD, DIFERENTE DE
		
		//AND && - Devuelve el valor true cuando se cumplen TODAS las condiciones		
		System.out.println("Probando operador AND - &&");
		if(x < 20 && x>10) {
			System.out.println("si");
			
		}else {
			System.out.println("no");
		}
		
		//OR - || - Devuelve true cuando se cumple al menos una condicion
		
		System.out.println("Probando operador OR - ||");
		if(x < 20 || x>10) {
			System.out.println("si");
			
		}else {
			System.out.println("no");
		}
		
		//IGUALDAD - == - Revisa o compara un valor contra otro y devuelve true
		// cuando los valores son iguales
		//Cuando empleamos un solo simbolo de igualdad (=), estamos ante una asignacion
		
		System.out.println("Probando operador IGUALDAD - ==");
		if(x == 30) {
			System.out.println("si");
			
		}else {
			System.out.println("no");
		}
		
		//DIFERENTE DE - != - Compara los valores y devuelve true cuando estos son diferentes
		
		System.out.println("Probando operador DIFERENTE DE - !=");
		if(x != 30) {
			System.out.println("si");
			
		}else {
			System.out.println("no");
		}
		
		//NOT - ! - Nos permite negar una condicion y asi poder cambiar su valor de
		//true a false y viceversa
		
		
		System.out.println("Probando operador NOT - !");
		if((x == 20)) {
			System.out.println("si");
			
		}else {
			System.out.println("no");
		}
		*/
		
		//ESTRUCTURAS if - else anidado o if-esle concatenado
		//Nos permite seguir evaluando mas condiciones segun sea necesario
		//Este tipo de estructuras es util cuando tenemos que evaluar
		//varias condiciones y varios operadores
		
		
		int dia = 3;
		
		if (dia==1) {
		    System.out.println("lunes");
		}else if (dia == 2 ) {
		    System.out.println("martes");
		}else if (dia == 3) {
			System.out.println("miercoles");
		}else if(dia == 4) {
		    System.out.println("jueves");
	    }else if (dia == 5) {
	        System.out.println("viernes");
	    }else {
	 		System.out.println("Error");
	    }	
	 		
		
		//Estructura Switch-Case
		//Esta estructura es util cuaando existen varias opciones frente al cambio
		//de una variable
		
		
		char letra = 'a';
		
		switch (letra) { // En caso de que esta variable cambie, que hacemos
		case 'a':
			System.out.println("lunes");
			break; //aqui se rompe la evalucacion de los demas casos
		case 'b':
			System.out.println("martes");
		    break;
		case'c':
			System.out.println("miercoles");
		    break;	
		case'd':
			System.out.println("jueves");
			break;
		case'e':
			System.out.println("viernes");
			break;
		default:
			System.out.println("Error");
			break;
			
			
			
		}
		
	
	    
	    
	    
			
		
		
		
		
		
		
		
	}

	   
	
	
	
	
	
	
	
}
