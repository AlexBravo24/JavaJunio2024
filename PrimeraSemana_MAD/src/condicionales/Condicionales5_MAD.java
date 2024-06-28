package condicionales;

import java.util.Scanner;

public class Condicionales5_MAD {

	public static void main(String[] args) {
		/*
		 * 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: 
		 * edad, nota y sexo. 
		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		 * Otros casos -> NO ACEPTADA

		 */
		Scanner entrada = new Scanner (System.in);
		int nota, edad;
		char sexo;
		
		System.out.print("Ingrese la edad del o la solicitante: ");
		edad = entrada.nextInt();
		System.out.print("Ingrese el sexo del o la solicitante (M o F): ");
		sexo = entrada.next().charAt(0);
				System.out.print("Ingrese la nota del o la solicitante: ");
		nota = entrada.nextInt();
		
		if (nota>=5 && edad>=18 && sexo == 'M') {
			System.out.println("\n POSIBLE");
		}
		else if (nota>=5 && edad>=18 && sexo == 'F') {
			System.out.println("\n ACEPTADA");
		}
		else {
			System.out.println("\n NO ACEPTADA");
		}
		
	}

}
