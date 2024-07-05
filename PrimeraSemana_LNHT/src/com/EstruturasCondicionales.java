package com;

public class EstruturasCondicionales {

	public static void main(String[] args) {
		// Estructuras de decision if else evaluan valorres booleanos
		 
		//ejemplo tenemos una variable con determinado valor
	/*	int x = 20;
		if(x <= 20 && x>=10) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		//Condiciones  compuestas con operadores logicos 
		//AND, OR, NOT, IGUALDAD, DIFERENTE DE 
		
		//AND-&& DEVULEVE un valor cunado todas las condiciones se cumplen
		
		if (x == 30 ) {
		System.out.println("SI");
		}else {
			System.out.println("no");
		}
		// diferente de !
		if(x != 30) {
			System.out.println("Si");
		}else {
			System.out.println("No");
		}
		
		// nos permite negar una condicion y asi poder cambiar su valor
		//treu a falso o viceversa
		System.out.println("probando el operador not");
		if(!(x == 30)) {
			System.out.println("SI");
			}else {
				System.out.println("no");
			}
			// diferente de !
		//operador or ||
		*/
		
		int dia = 3;
		if(dia == 1) {
			System.out.println("Lunes");
		}else if(dia == 2) {
			System.out.println("Martes");
		}else if(dia == 3) {
			System.out.println("Miercoles");
		}else if(dia == 4) {
			System.out.println("Jueves");
		}else if(dia == 5){
			System.out.println("viernes");
		}else {
			System.out.println("Error");
		}
		
		//estructura Swich-case
		char letra = 'a';
		 
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
