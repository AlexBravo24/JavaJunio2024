package condicionales;

import java.util.Scanner;

public class Condicionales5_TJAA {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a
		//los siguientes parámetros: edad, nota y sexo.
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		//* Otros casos -> NO ACEPTADA

		Scanner entrada = new Scanner (System.in);
		int edad, nota;
		String sexo; 
		
		System.out.println("Escribe tu edad");
		edad = entrada.nextInt();
		
		System.out.println("Introduce tu nota obtenida");
		nota = entrada.nextInt();
		
		System.out.println("Escribe tu sexo 'M' 'F'");
		sexo = entrada.next();
		
		if (nota > 5 && edad >=18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("Solicitud aceptada");
		}else if (nota > 5 && edad >=18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Solicitud posible");
		}else {
			System.out.println("Solicitud denegada");
		}
	
		
		
		
		
				
		
	}

}
