package condicionales;

import java.util.Scanner;

public class Condicionales6_IDO {

	public static void main(String[] args) {
		// . El director de una escuela está organizando un viaje de estudios y requiere 
		//determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
		//compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
		//100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 
		//alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
		//euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 
//		euros, sin importar el número de alumnos. Realiza un algoritmo que permita 
//		determinar el pago a la compañía de autobuses y lo que debe pagar cada 
//		alumno por el viaje.
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Numero de Alumnos"); // mensaje solicitando 
		
		int numeroAlumnos = entrada.nextInt(); // Dato acumulado
		
		double costoTotal = 0; // Inicializa la variable para el costo total
        double costoPorAlumno = 0; // Inicializa la variable para el costo por alumno

        // Determina el costo total y el costo por alumno basado en el número de alumnos
        if (numeroAlumnos >= 100) {
            costoPorAlumno = 65;
            costoTotal = numeroAlumnos * costoPorAlumno;
        } else if (numeroAlumnos >= 50 && numeroAlumnos <= 99) {
            costoPorAlumno = 70;
            costoTotal = numeroAlumnos * costoPorAlumno;
        } else if (numeroAlumnos >= 30 && numeroAlumnos <= 49) {
            costoPorAlumno = 95;
            costoTotal = numeroAlumnos * costoPorAlumno;
        } else {
            costoTotal = 4000;
            costoPorAlumno = costoTotal / numeroAlumnos; // Calcula el costo por alumno
        }

        // Muestra el resultado
        System.out.println("El costo total a pagar a la compañía de autobuses es: " + costoTotal + " euros.");
        System.out.println("El costo por alumno es: " + costoPorAlumno + " euros.");

        entrada.close(); // Cierra el objeto Scanner



	}

}
