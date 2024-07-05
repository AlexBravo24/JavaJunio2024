package condicionales;

import java.util.Scanner;

public class Condicionales6_DISA {

	public static void main(String[] args) {
		/*El director de una escuela está organizando un viaje de estudios y requiere determinar 
		 * cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. 
		 * La forma de cobrar es la siguiente: 
		 * * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. 
		 * * De 50 a 99 alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 euros. 
		 * * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos. 
		 * Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y 
		 * lo que debe pagar cada alumno por el viaje.
		 */
		Scanner sc = new Scanner (System.in);
		double costoAlumno, numeroAlumnos, pagoServicio;
		System.out.println("Ingresa el número de alumnos:");
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
