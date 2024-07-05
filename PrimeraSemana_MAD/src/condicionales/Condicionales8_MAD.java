package condicionales;

import java.util.Scanner;

public class Condicionales8_MAD {
	
	/*
	 * 8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. 
	 * Si introducimos otro número nos da un error.
	 */

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int semana;
			
			System.out.println("Digite el numero de dia la semana (1 al 7): "
					+ "\n 1. Lunes"
					+ "\n 2. Martes"
					+ "\n 3. Miercoles"
					+ "\n 4. Jueves"
					+ "\n 5. Viernes"
					+ "\n 6. Sabado"
					+ "\n 7. Domingo");
			
			semana = entrada.nextInt();
			
			if (semana<1 || semana>7) {
				System.out.println("ERROR");
			}
			else {
				System.out.print("Día: ");
				switch (semana) {
				case 1:
					System.out.print("Lunes");
					break;
				case 2:
					System.out.print("Martes");
					break;
				case 3:
					System.out.print("Miercoles");
					break;
				case 4:
					System.out.print("Jueves");
					break;
				case 5:
					System.out.print("Viernes");
					break;
				case 6:
					System.out.print("Sabado");
					break;
				case 7:
					System.out.print("Domingo");
					break;
					default:
						break;
				}
			}

	}

}
