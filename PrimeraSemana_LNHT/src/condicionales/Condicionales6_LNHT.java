package condicionales;

import java.util.Scanner;

public class Condicionales6_LNHT {

	public static void main(String[] args) {
		/* El director de una escuela est� organizando un viaje de estudios y requiere 
		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la 
		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 
		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 
		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
		determinar el pago a la compa��a de autobuses y lo que debe pagar cada 
		alumno por el viaje.*/
int alumnos;
Scanner scan = new Scanner(System.in);
	System.out.println("Ingresa el numero de alumnos que viajaran");
	alumnos = scan.nextInt();
		if(alumnos >= 100) {
			System.out.println("el costo por cada alumno es de 65 euros");
		}else if (alumnos < 100 && alumnos >=50 ) {
			System.out.println("el costo por alumno es de 70 euros");
		}else if (alumnos <= 49  && alumnos >=30 ) {
			System.out.println("el costo por alumno es de 95 euros");
		}else {
			System.out.println("el costo de la renta de autobus es de 4000 euros");
		}
	}

}
