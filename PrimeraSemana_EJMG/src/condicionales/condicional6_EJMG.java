package condicionales;

import java.util.Scanner;

public class condicional6_EJMG {

	public static void main(String[] args) {
		int numeroAlumnos;
		
		Scanner entradaAlumnos= new Scanner(System.in);
		System.out.println("introduce Numero de Alumnos");
		numeroAlumnos= entradaAlumnos.nextInt();
		
		if(numeroAlumnos>=100 ) {
			System.out.println("COSTO POR ALUMNO ES DE 65 POR ALUMNO");
			System.out.println("COSTO DEL AUTOBUS  " + numeroAlumnos*65);
			
		}else if(numeroAlumnos>=50 && numeroAlumnos<=99 ){
			System.out.println("COSTO POR ALUMNO ES DE 70 POR ALUMNO");
			System.out.println("COSTO DEL AUTOBUS  " + numeroAlumnos*70);
			
		}else if(numeroAlumnos>=30 && numeroAlumnos<=49 ){
			System.out.println("COSTO POR ALUMNO ES DE 95 POR ALUMNO");
			System.out.println("COSTO DEL AUTOBUS  " + numeroAlumnos*95);
			
		}else if(numeroAlumnos<30 ){
			
			System.out.println("COSTO DEL AUTOBUS ES DE 4000");
			System.out.println("EL COSTO POR ALUMNO ES DE " + 4000/numeroAlumnos);
		}

	}

}
