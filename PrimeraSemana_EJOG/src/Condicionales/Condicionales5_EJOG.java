package Condicionales;

import java.util.Scanner;

public class Condicionales5_EJOG {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptación de una solicitud en base a 
		//los siguientes parámetros: edad, nota y sexo.
		/** Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		* Otros casos -> NO ACEPTADA*/
		
		//Asigna variables
		double nota;
		int edad;
		String sexo;
		//Activo Scanner
		Scanner Entrada = new Scanner (System.in);
		//Introduce los datos
		System.out.println("Introduce tu nota :");
		nota=Entrada.nextDouble();
		System.out.println("Introduce tu edad :");
		edad=Entrada.nextInt();
		System.out.println("Introduce tu sexo : (si eres hombre con una 'M' o mujer con  'F' )");
		sexo=Entrada.next();
		//Cierro Scanner
		Entrada.close();
		
	    System.out.println(sexo+" " + nota+" " + edad);
		
		if(nota>=5 && edad>=18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Solcitidu posiblemente aceptada");
		}else if(nota>=5 && edad>=18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("Solicitud aceptada");
		}else {
			System.out.println("Solicitud no aceptada");
		}
		

	}

}
