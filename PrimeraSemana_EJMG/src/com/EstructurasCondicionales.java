package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		//Estructuras de desicion if que evaluan valores Booleanos
		
		/* si (se cumple esta condicion ){
		 * se ejecuta este bloque de codigo} si no se cumple { se ejecuta esto otro
		 * 
		 */

		//ejemplo. tenemos una variable con un determinado valor 
		/*    **************************************************
		int x=20;
		
		if (x<=20) {
			System.out.println("Si");
			
		}else {
			System.out.println("No");
		}
		
		//condiciones compuestas con aoperador logico 
		//AND,OR.NOT IGUALDAD. DIFERENTE DE 
		
		
		//AND --&&-- devuelve el valor cuando se cumple todas las condiciones 
		
		System.out.println("Probando aperador AND- &&");
        
		
		
		if (x<20 && x>10) {
			System.out.println("Si");
			
		}else {
			System.out.println("No");
		}
		
		// OR --|| -- Devuelve True cuando se cumple almemos una condicion
		
		
		System.out.println("Probando aperador AND- ||");
		if (x<20 || x>10) {
			System.out.println("Si");
			
		}else {
			System.out.println("No");
		}
		
		// IGUALDAD ---== revisa y compara un valor contra otro y devuekve true cuando los valors son iguales
		// cuando empleamos un solo simbolo de(=), esdtamos frente a una sdola asignacion de valor
		
		System.out.println("Probando aperador AND-  ==");
		if (x == 20) {
			System.out.println("Si");
			
		}else {
			System.out.println("No");
		}
		
		// DIFERENTE DE -- ! =   COMPARA LOS VALORES Y DEVUELKVE TRUE CUANDO ESTOS SON DIFERENTES
		
		System.out.println("Probando aperador DIFERENTE DE -  !=");
		if (x != 30) {
			System.out.println("Si");
			
		}else {
			System.out.println("No");
		}
		
		// Operador  (!) NOT Nos permite negar una condicion y asi poder cambiar su valor 
		// de true a false y viceversa
		
		System.out.println("Probando aperador NOT -  !");
		if (!(x == 20)) {
			System.out.println("Si");
			
		}else {
			System.out.println("No");
		}
		 *********************************************************
		*/   
		
		// eSTRUCTURA IF-ELSE anidado o if-else concatenado
		//nos permite seguir evaluando mas condiciones segun sean necesario
		//este tipo de estructuras es util cunado tenemos qe evaluar
		//varias condiciones y con varios operadores
		
		int dia=3;
		
		if (dia==1) {
			
			System.out.println("Lunes");
		}else if( dia== 2) {
			System.out.println("Martes");
			
		}else if(dia ==3) {
			
			System.out.println("Miercoles");
		}else if(dia ==4) {
			
		    System.out.println("Jueves");
		} else if(dia ==4) {
			
			System.out.println("viernes");
		} else if(dia ==4) {
			
		    System.out.println("Error");
		}
		
		
		//ESTRUCTURA Swich-case
		//
		char letra='a';
		
		switch (letra) {
		
		case'b':
			System.out.println("Martes");
			break;
			
		case'c':
			System.out.println("Miercoles");
			break;
			
		case'd':
			System.out.println("Jueves");
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
