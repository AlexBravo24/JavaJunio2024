package condicionales;

import java.util.Scanner;

public class Condicionales6_TMJ {

	public static void main(String[] args) {
//		6. El director de una escuela está organizando un viaje de estudios y requiere
//		determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
//		compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
//		100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
//		euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000
//		euros, sin importar el número de alumnos. Realiza un algoritmo que permita
//		determinar el pago a la compañía de autobuses y lo que debe pagar cada
//		alumno por el viaje.

		Scanner scanner = new Scanner(System.in);
//solicitamos el numero de alumnos 
        System.out.println("Ingrese el número de alumnos:");
        int numAlumnos = scanner.nextInt();

        double costoTotalAutobus;
        double costoPorAlumno;

        if (numAlumnos >= 100) {
            costoPorAlumno = 65;
            costoTotalAutobus = numAlumnos * 65 + 4000; // Añadimos el costo base del autobús
        } else if (numAlumnos >= 50) {
            costoPorAlumno = 70;
            costoTotalAutobus = numAlumnos * 70 + 4000;
        } else if (numAlumnos >= 30) {
            costoPorAlumno = 95;
            costoTotalAutobus = numAlumnos * 95 + 4000;
        } else {
            costoPorAlumno = 95;
            costoTotalAutobus = 4000;
        }

        double pagoTotalCompania = costoTotalAutobus;
        double pagoAlumno = costoPorAlumno * numAlumnos;

        System.out.printf("El costo total del autobús es: %.2f euros%n", costoTotalAutobus);
        System.out.printf("Cada alumno debe pagar: %.2f euros%n", costoPorAlumno);
        System.out.printf("El pago total a la compañía de autobuses es: %.2f euros%n", pagoTotalCompania);
        System.out.printf("El total a pagar por todos los alumnos es: %.2f euros%n", pagoAlumno);

        scanner.close();
		
	}

}
