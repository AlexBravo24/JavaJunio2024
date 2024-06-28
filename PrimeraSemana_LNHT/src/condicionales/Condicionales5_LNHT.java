package condicionales;

import java.util.Scanner;

public class Condicionales5_LNHT {

	public static void main(String[] args) {
		/* Realiza un programa que calcule la aceptación de una solicitud en base a 
		los siguientes parámetros: edad, nota y sexo. 
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		* Otros casos -> NO ACEPTADA */
		
	int nota, edad;
	String sexo;
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingrese su nota obtenida");
	nota = scan.nextInt();
	System.out.println("ingrese su edad");
	edad = scan.nextInt();
	System.out.println("Ingrese su sexo 'M' o 'F'  ");
	sexo = scan.next();
		if (nota>5 && edad >= 18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Solicitud posible");
		
		} else if(nota>5 && edad >= 18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("Solicitud aceptada");
		}else {
			System.out.println("No aceptada");
		}
	
	}//main

}
