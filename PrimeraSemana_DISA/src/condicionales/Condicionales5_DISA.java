package condicionales;

import java.util.Scanner;

public class Condicionales5_DISA {

	public static void main(String[] args) {
		/*Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros:
		 * Edad, nota, sexo.
		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * Otros casos -> NO ACEPTADA
		 */
		Scanner entrada = new Scanner (System.in);
		String sexo;
		String femenino="femenino";
		String masculino="masculino";
		System.out.println("Escribe tu sexo");
		sexo=entrada.nextLine();
		System.out.println("Introduce tu edad: ");	 
		int edad= entrada.nextInt();
		System.out.println("Introduce el valor de tu nota: ");
		int nota = entrada.nextInt();
		if (edad>17 && nota>4 && sexo==femenino) {
			System.out.println("ACEPTADA");
		}else if (edad>17 && nota>4 && sexo==masculino) {
			System.out.println("POSIBLE");
		}else {
			System.out.println("NO ACEPTADA");
		}
		
	}	
}
