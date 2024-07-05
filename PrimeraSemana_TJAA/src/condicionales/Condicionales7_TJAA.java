package condicionales;

import java.util.Scanner;

public class Condicionales7_TJAA {

	public static void main(String[] args) {
		//7. Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		//letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		//caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
		//mostrará el mensaje: “ERROR: número incorrecto”.
		
		Scanner entrada = new Scanner (System.in);
		int numero; 
		System.out.println("Escribe tu resultado");
		numero= entrada.nextInt();
		
		if (numero ==1) {
			System.out.println("Número Uno ");		
			System.out.println("Opuesto 6");
		}else if (numero ==2) {
			System.out.println("Número Dos");
			System.out.println("Opuesto 5");
		}else if (numero ==3) {
			System.out.println("Número Tres");
			System.out.println("Opuesto 4 ");
		} else if (numero ==4 ) {
			System.out.println("Número Cuatro");
			System.out.println("Opuesto 3");
		}else if (numero==5) {
			System.out.println("Número Cinco");
			System.out.println("Opuesto 2");
		}else if (numero ==6) {
			System.out.println("Número Seis");
			System.out.println("Opuesto 1 ");
		}if (numero >6 || numero <1) {
			System.out.println("Error: número incorrecto");
			
			
		}


	}

}
