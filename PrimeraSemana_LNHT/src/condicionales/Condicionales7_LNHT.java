package condicionales;

import java.util.Scanner;

public class Condicionales7_LNHT {

	public static void main(String[] args) {
		/* Realiza un programa que pida por teclado el resultado (dato entero) 
		obtenido al lanzar un dado de seis caras y muestre por pantalla el número en 
		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
		caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se 
		mostrará el mensaje: “ERROR: número incorrecto”*/
	Scanner scan=new Scanner(System.in);
	int dadoEntero;
	System.out.println("Ingrese el resultado del dado");
	dadoEntero = scan.nextInt();
	if(dadoEntero >= 1 && dadoEntero <= 6) {
		switch (dadoEntero) {
		case 1:
		System.out.println("Uno y cara opuesta seis");	
		break;
		case 2:
		System.out.println("Dos y cara opuesta cinco");	
		break;
		case 3:
		System.out.println("Tres y cara opuesta cuatro");	
		break;
		case 4:
		System.out.println("Cuatro y cara opuesta Tres");	
		break;
		case 5:
		System.out.println("Cinco y cara opuesta Dos");	
		break;
		case 6:
		System.out.println("Seis y cara opuesta Uno");	
		break;
		default:
			break;
		}//Switch
	}else {
		System.out.println("ERROR");
	}

	}//main

}
