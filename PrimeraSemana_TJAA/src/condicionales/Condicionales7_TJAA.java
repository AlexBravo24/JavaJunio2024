package condicionales;

import java.util.Scanner;

public class Condicionales7_TJAA {

	public static void main(String[] args) {
		//7. Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en
		//letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		//caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
		//Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se
		//mostrar� el mensaje: �ERROR: n�mero incorrecto�.
		
		Scanner entrada = new Scanner (System.in);
		int numero; 
		System.out.println("Escribe tu resultado");
		numero= entrada.nextInt();
		
		if (numero ==1) {
			System.out.println("N�mero Uno ");		
			System.out.println("Opuesto 6");
		}else if (numero ==2) {
			System.out.println("N�mero Dos");
			System.out.println("Opuesto 5");
		}else if (numero ==3) {
			System.out.println("N�mero Tres");
			System.out.println("Opuesto 4 ");
		} else if (numero ==4 ) {
			System.out.println("N�mero Cuatro");
			System.out.println("Opuesto 3");
		}else if (numero==5) {
			System.out.println("N�mero Cinco");
			System.out.println("Opuesto 2");
		}else if (numero ==6) {
			System.out.println("N�mero Seis");
			System.out.println("Opuesto 1 ");
		}if (numero >6 || numero <1) {
			System.out.println("Error: n�mero incorrecto");
			
			
		}


	}

}
