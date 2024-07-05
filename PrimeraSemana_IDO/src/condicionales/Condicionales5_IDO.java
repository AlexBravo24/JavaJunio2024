package condicionales;

import java.util.Scanner;

public class Condicionales5_IDO {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a 
		//los siguientes parámetros: edad, nota y sexo. 
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		//* Otros casos -> NO ACEPTADA
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce tu nota"); // mensaje solicitando 
		
		int nota = entrada.nextInt(); // Dato acumulado
		
		System.out.println("Introduce tu edad"); // mensaje solicitando 
		
		int edad = entrada.nextInt(); // Dato acumulado
		
		System.out.println("Introduce Sexo M o H"); // mensaje solicitando 
		char sexo = entrada.next().charAt(0);
		
        // Comprueba las condiciones y muestra el resultado
        if (nota >= 5 && edad >= 18 && sexo == 'M') {
            System.out.println("POSIBLE");
        } else if (nota >= 5 && edad >= 18 && sexo == 'F') {
            System.out.println("ACEPTADA");
        } else {
            System.out.println("NO ACEPTADA");
        }	

        entrada.close(); // Cierra el objeto Scanner

		
		
		
		
		

	}

}
