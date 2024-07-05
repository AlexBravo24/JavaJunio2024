package condicionales;

import java.util.Scanner;

public class Condicionales8_IDO {

	public static void main(String[] args) {
		
		//.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a 
		//correspondiente. Si introducimos otro n�mero nos da un error.
		
		Scanner entrada = new Scanner (System.in);
		
		
		// Pide al usuario que introduzca un n�mero del 1 al 7
        System.out.println("Introduce un n�mero del 1 al 7:");
        int dia = entrada.nextInt();

        // Determina el d�a de la semana correspondiente
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Mi�rcoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "S�bado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Error: n�mero no v�lido. Debe ser un n�mero del 1 al 7.";
                break;
        }

        // Muestra el resultado
        System.out.println(nombreDia);

        entrada.close(); // Cierra el objeto Scanner
    }

		
		
		
	}


