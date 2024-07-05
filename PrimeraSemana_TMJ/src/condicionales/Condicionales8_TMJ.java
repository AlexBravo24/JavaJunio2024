package condicionales;

import java.util.Scanner;

public class Condicionales8_TMJ {

	public static void main(String[] args) {
		// .Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a
		//correspondiente. Si introducimos otro n�mero nos da un error.
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el n�mero del d�a de la semana (1-7):");

        int numeroDia = scanner.nextInt();

        // Validaci�n del n�mero ingresado
        if (numeroDia < 1 || numeroDia > 7) {
            System.out.println("ERROR: N�mero incorrecto. Ingresa un n�mero entre 1 y 7.");
        } else {
            // Asignar el nombre del d�a correspondiente
            String diaCorrespondiente;
            switch (numeroDia) {
                case 1:
                    diaCorrespondiente = "Lunes";
                    break;
                case 2:
                    diaCorrespondiente = "Martes";
                    break;
                case 3:
                    diaCorrespondiente = "Mi�rcoles";
                    break;
                case 4:
                    diaCorrespondiente = "Jueves";
                    break;
                case 5:
                    diaCorrespondiente = "Viernes";
                    break;
                case 6:
                    diaCorrespondiente = "S�bado";
                    break;
                case 7:
                    diaCorrespondiente = "Domingo";
                    break;
                default:
                    diaCorrespondiente = ""; // Este caso nunca deber�a ejecutarse debido a la validaci�n previa
                    break;
            }

            // Mostrar el resultado
            System.out.println("El d�a correspondiente es: " + diaCorrespondiente);
        }

        scanner.close();
	}

}
