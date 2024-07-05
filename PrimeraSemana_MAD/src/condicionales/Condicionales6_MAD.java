package condicionales;

import java.util.Scanner;

public class Condicionales6_MAD {

	/*
	 *  6. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar 
	 *  a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente: 
	 *  * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. 
	 *  * De 50 a 99 alumnos, el costo es de 70 euros. 
	 *  * De 30 a 49 alumnos, el costo es de 95 euros. 
	 *  * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
	 *  Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno 
	 *  por el viaje
	 */
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		int alumnos;
	
		System.out.println("¿Cuántos alumnos asistiran al viaje de estudios?");
	alumnos = entrada.nextInt();
	
		if (alumnos>=100) {
			System.out.println("El monto a pagar a la compañia de viajes es: "+(alumnos*65)+ " euros");
			System.out.println("El costo por alumno es de: 65 euros ");
		}
		else if (alumnos>=50 && alumnos<=99) {
			System.out.println("El monto a pagar a la compañia de viajes es: "+(alumnos*70)+ " euros");
			System.out.println("El costo por alumno es de: 70 euros ");
		}
		else if (alumnos>=30 && alumnos<=49) {
			System.out.println("El monto a pagar a la compañia de viajes es: "+(alumnos*95)+" euros");
			System.out.println("El costo por alumno es de: 95 euros ");
		}
		else {
			System.out.println("El monto a pagar a la compañia de viajes es de: 4000 euros");
			System.out.println("El costo por alumno es de: " +(4000/alumnos)+ " euros");
		}
	}

}
