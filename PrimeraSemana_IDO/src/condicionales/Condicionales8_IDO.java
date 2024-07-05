package condicionales;

import java.util.Scanner;

public class Condicionales8_IDO {

	public static void main(String[] args) {
		
		//.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
		//correspondiente. Si introducimos otro número nos da un error.
		
		Scanner entrada = new Scanner (System.in);
		
		
		// Pide al usuario que introduzca un número del 1 al 7
        System.out.println("Introduce un número del 1 al 7:");
        int dia = entrada.nextInt();

        // Determina el día de la semana correspondiente
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Error: número no válido. Debe ser un número del 1 al 7.";
                break;
        }

        // Muestra el resultado
        System.out.println(nombreDia);

        entrada.close(); // Cierra el objeto Scanner
    }

		
		
		
	}


