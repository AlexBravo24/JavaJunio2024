package condicionales;

import java.util.Scanner;

public class Condicionales6_DISA {

	public static void main(String[] args) {
		/*El director de una escuela est� organizando un viaje de estudios y requiere determinar 
		 * cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. 
		 * La forma de cobrar es la siguiente: 
		 * * Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros. 
		 * * De 50 a 99 alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 euros. 
		 * * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de alumnos. 
		 * Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y 
		 * lo que debe pagar cada alumno por el viaje.
		 */
		Scanner sc = new Scanner (System.in);
		double costoAlumno, numeroAlumnos, pagoServicio;
		System.out.println("Ingresa el n�mero de alumnos:");
		numeroAlumnos=sc.nextDouble();
		costoAlumno=0;pagoServicio=0;
		if(numeroAlumnos>=0) 
		{
			costoAlumno=65;
			pagoServicio=costoAlumno*numeroAlumnos;
		}
		if (numeroAlumnos>=50 && numeroAlumnos<100) 
		{
			costoAlumno=70;
			pagoServicio=costoAlumno*numeroAlumnos;
		}
		if (numeroAlumnos>=30 && numeroAlumnos<50) {
			costoAlumno=95;
			pagoServicio=costoAlumno*numeroAlumnos;
		}
		if(numeroAlumnos>=30 && numeroAlumnos<50) 
		{
			costoAlumno=4000;
			pagoServicio=costoAlumno/numeroAlumnos;
		}
		System.out.println("Valor de costo por alumno: " + costoAlumno);
		System.out.println("Valor de pago por el servicio: " + pagoServicio);
	}
		
}
