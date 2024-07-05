package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras de decisión if - evaluan valores booleanos
		
		/*
		 * si (se cumple esta condicion){
		 * 		se ejecuta este bloque de codigo
		 * }si no se cumple {
		 * 		se ejecuta esto otro
		 * }
		 */
		
		//Ejemplo, tenemos una variable con un determinado valor
		/*
		int x = 20;
		
		if(x <= 20) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		
		//Condiciones compuestas con operadores lógicos
		//AND, OR, NOT, IGUALDAD, DIFERENTE DE
		
		//AND - && - Devuelve el valor true cuando se cumplen TODAS las condiciones
		System.out.println("Probando operador AND - &&");
		
		if(x < 20 && x>10) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		
		//OR - || - Devuelve true cuando se cumple al menos UNA condicion
		System.out.println("Probando operador OR - ||");
		
		if(x < 20 || x>10) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		
		//IGUALDAD - == - Revisa o compara un valor contra otro y devuelve true
		//cuando los valores son iguales
		//Cuando empleamos un solo simbolo de igual (=), estamos frente a una asignacion
		//de valor
		System.out.println("Probando operador IGUALDAD - ==");
		
		if(x == 30) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		
		//DIFERENTE DE - != - Compara los valores y devuelve true cuando estos son diferentes
		System.out.println("Probando operador DIFERENTE DE - !=");
		
		if(x != 30) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		
		//NOT - ! - Nos permite negar una condición y así poder cambiar su valor de
		// true a false y viceversa
		System.out.println("Probando operador NOT - !");
		
		if(!(x == 20)) {
			System.out.println("Sí");
		}else {
			System.out.println("No");
		}
		*/
		
	
		//Estructura if-else anidado o if-else concatenado
		//Nos permite seguir evaluando más condiciones según sea necesario
		//Este tipo de estructura es util cuando tenemos que evaluar 
		//varias condiciones y con varios operadores
		
		int dia = 3;
		
		if (dia == 1) {
			System.out.println("Lunes");
		}else if (dia == 2) {
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
		
		//Estructura Switch-Case
		//Esta estructura es util cuando existen varias opciones frente al cambio
		//de una variable
		
		char letra = 'a';
		
		
		switch (letra) { //en caso de que esta variable cambie, que hacemos
		case 'a':
			System.out.println("Lunes");
			break; //aqui se rompme la evaluacion de los demás casos.
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
