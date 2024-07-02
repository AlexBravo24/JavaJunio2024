package Condicionales;

import java.util.Scanner;

public class Condicionales6_EJOG {

	public static void main(String[] args) {
		/*El director de una escuela está organizando un viaje de estudios y requiere 
			determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
			compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
			100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 
			alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
			euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 
			euros, sin importar el número de alumnos. Realiza un algoritmo que permita 
			determinar el pago a la compañía de autobuses y lo que debe pagar cada 
			alumno por el viaje.
			*/
		
		int alumnos;
		double resultado,costo,cobro;
		
		costo=4000.00;
		
		Scanner Entrada= new Scanner (System.in);
		
		System.out.println("Introduce cuantos alumnos tomaran el viaje de estudios");
		alumnos = Entrada.nextInt();
		
		Entrada.close();
		
		if(alumnos>=100) {
			cobro = 65;
			
		}else if(alumnos>=50 && alumnos <=99) {
			cobro = 70;
			
		}else if(alumnos>=30 && alumnos <=49) {
			cobro = 95;
			
		}else  {
			cobro = costo/alumnos;
			
		}
		
		resultado = alumnos * cobro;
		
			System.out.println("El director debe solicitar a cada alumno "+cobro+" euros y pagar a la compañia de viajes "+resultado);
		
		

	}

}
