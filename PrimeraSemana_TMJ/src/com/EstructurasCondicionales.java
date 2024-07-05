package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Estructuras de desiscion
		 *  si se cumple  una condicion se ejecuta 
		 *   si no se ejecuta algo mas
		 *   
		 *   EJEMPLO
		 *   Tenemos una variable con determinado valor*
		 */
//		int x= 20;
//		if (x<=20) {
//			System.out.println("si");
//		} else {
//			System.out.println("No");
//		}
//		
//		//Condiciones compuestas con operadores logicos
//		// AND, OR , NOT , IGUALDAD , DIFERENTE DE 
//		
//		//AND -&&- devuelve un valor de true cuando  se cumplen las condiciones
//		//prueba de operador and
//		System.out.println("Prueba de operador &&");
//		
//		
//		if (x<=20 && x>=10) {// con este operador se deben cumplir ambas condiciones 
//			
//			System.out.println("si");
//		} else {
//			System.out.println("No");
//		}
//		
//		//uso del operador OR || este operador devuelve el true cuando se sumple al menos una condicion 
//		
//		System.out.println("Prueba de operador ||");
//			if (x<=20 || x>=10) {
//			System.out.println("si");
//			} else {
//				System.out.println("No");
//				
//					}
//			//operador logico de iugualdad
//			// == revisa o compara el valor de un dato con otro y regresa un TRUE 
//			System.out.println("Prueba de operador logico ==");
//			if (x ==30) {
//				System.out.println("SI");
//			}else {
//				System.out.println("NO");
//			}
//	
//			//OPERADOR != COMPARA LOS VALORES Y REGRESA UN TRUE CUANDO LOS VALORES SON DIFERENTES
//			System.out.println("Prueba de operador logico !=");
//			if (x !=30) {
//				System.out.println("SI");
//			}else {
//				System.out.println("NO");
//			}
//		
//		//OPERADOR NOT - ! - permite negar una condicion y asi poder cambiar su valor 
//		// true a false y viseversa
//			
//			System.out.println("Prueba de operador logico !");
//			if (!(x ==20)) {
//				System.out.println("SI");
//			}else {
//				System.out.println("NO");
//			}

			
			//Estructura if -else anidado o if-else concatenado
			// Nos permite segir evaluando mas condiciones segun sea necesario
			//este tipo de estructura es utilizado cuando se evaluanvarias condiciones u operadores
		int dia = 5;
			if (dia==1) {
				System.out.println("LUNES");
			}else if(dia ==2){
				System.out.println("MARTES");
			}else if(dia==3) {
				System.out.println("miercoles");
			}else if (dia==4) {
				System.out.println("JUEVES");	
			}else if (dia==5) {
				System.out.println("VIERNES");
			}else {
				System.out.println("ERROR");
			}
			
	//Estructura switch -Case
			// esta estructura es util cuando existen varias opciones frente al cambio de una variable
			
			char letra = 'a';
			switch(letra) {
			case 'a':
				System.out.println("Lunes");
				break;
			case 'b':
				System.out.println("MARTES");
				break;
			case 'c':
				System.out.println("MIERCOLES");
				break;
			case 'd':
				System.out.println("JUEVES");
				break;
			case 'e':
				System.out.println("Viernes");
				break;
				default:
					System.out.println("ERROR");
				break;
				
				
			}
			
			
	}

}
