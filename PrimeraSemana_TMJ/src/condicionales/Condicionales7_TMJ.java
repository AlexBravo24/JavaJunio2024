package condicionales;

import java.util.Scanner;

public class Condicionales7_TMJ {

	public static void main(String[] args) {
//		7. Realiza un programa que pida por teclado el resultado (dato entero)
//		obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en
//		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
//		caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
//		Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se
//		mostrar� el mensaje: �ERROR: n�mero incorrecto�.
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Introduce el resultado obtenido al lanzar un dado:");

	        int numeroDado = scanner.nextInt();

	        // Validaci�n del n�mero ingresado
	        if (numeroDado < 1 || numeroDado > 6) {
	            System.out.println("ERROR: n�mero incorrecto");
	        } else {
	            // se determina el n�mero en letras de la cara opuesta
	            switch (numeroDado) {
	                case 1:
	                    System.out.println("La cara opuesta es 6");
	                    break;
	                case 2:
	                    System.out.println("La cara opuesta es 5");
	                    break;
	                case 3:
	                    System.out.println("La cara opuesta es 4");
	                    break;
	                case 4:
	                    System.out.println("La cara opuesta es 3");
	                    break;
	                case 5:
	                    System.out.println("La cara opuesta es 2");
	                    break;
	                case 6:
	                    System.out.println("La cara opuesta es 1");
	                    break;
	            }
	        }

	        scanner.close();
	    }
	}


