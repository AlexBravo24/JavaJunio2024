package Condicionales;

import java.util.Scanner;

public class Condicionales6_EJOG {

	public static void main(String[] args) {
		/*El director de una escuela est� organizando un viaje de estudios y requiere 
			determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la 
			compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
			100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 
			alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
			euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 
			euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
			determinar el pago a la compa��a de autobuses y lo que debe pagar cada 
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
		
			System.out.println("El director debe solicitar a cada alumno "+cobro+" euros y pagar a la compa�ia de viajes "+resultado);
		
		

	}

}
