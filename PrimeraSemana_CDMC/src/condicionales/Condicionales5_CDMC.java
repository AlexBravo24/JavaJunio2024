package condicionales;
import java.util.Scanner;
public class Condicionales5_CDMC {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	/*
	 * Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
	 *Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
	 *Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
	 *Otros casos -> NO ACEPTADA 
	*/
	
	
	
    // Pedir datos al usuario
    System.out.print("Ingresa tu edad: ");
    int edad = scanner.nextInt();

    System.out.print("Ingresa tu nota: ");
    double nota = scanner.nextDouble();
    System.out.print("Ingresa tu sexo (M/F): ");
    char sexo = scanner.next().charAt(0);
    boolean aceptado = false;

    if (edad >= 18 && edad <= 30) {
        if (nota >= 5) {
            if (sexo == 'F' || sexo == 'f') {
                aceptado = true;
            } else {
                System.out.println("Mujer Acpetada.");
                if (sexo == 'M' || sexo == 'm') {
                    aceptado = true;
                } else {
                    System.out.println("Hombre Aceptado.");
                }
            }
        } else {
            System.out.println("La nota debe ser igual o mayor a 5.");
        }
    } else {
        System.out.println("Error, la edad debe estar entre 18 y 30 años.");
    }

    if (aceptado) {
        System.out.println("Aceptad@ :).");
    } else {
        System.out.println("Rechasad@ :(.");
    }

    scanner.close();
    System.out.println("=======Fin del Programa=======");
}
}
