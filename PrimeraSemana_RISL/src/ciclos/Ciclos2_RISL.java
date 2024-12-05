package ciclos;

import java.util.Scanner;

public class Ciclos2_RISL {

	public static void main(String[] args) {
		//tabla de multiplicar del 12
		
		Scanner entrada= new Scanner(System.in);
		int tabla;
		System.out.println("introduce el numero de la tabla que deseas");
		tabla=entrada.nextInt();
		int limite;
		System.out.println("introduce el numero el limite de la tabla");
		limite=entrada.nextInt();
				
				System.out.println("Tabla de multiplicar del " + tabla + ":");

				for (int i=1; i<=limite; i++) {
					 System.out.println(tabla+ " x " + i + " = " + (tabla * i));

	}
	}
}
