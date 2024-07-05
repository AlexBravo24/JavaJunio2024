package condicionales;

import java.util.Scanner;

public class Condicionales8_TMJ {

	public static void main(String[] args) {
		// .Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
		//correspondiente. Si introducimos otro número nos da un error.
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el número del día de la semana (1-7):");

        int numeroDia = scanner.nextInt();

        // Validación del número ingresado
        if (numeroDia < 1 || numeroDia > 7) {
            System.out.println("ERROR: Número incorrecto. Ingresa un número entre 1 y 7.");
        } else {
            // Asignar el nombre del día correspondiente
            String diaCorrespondiente;
            switch (numeroDia) {
                case 1:
                    diaCorrespondiente = "Lunes";
                    break;
                case 2:
                    diaCorrespondiente = "Martes";
                    break;
                case 3:
                    diaCorrespondiente = "Miércoles";
                    break;
                case 4:
                    diaCorrespondiente = "Jueves";
                    break;
                case 5:
                    diaCorrespondiente = "Viernes";
                    break;
                case 6:
                    diaCorrespondiente = "Sábado";
                    break;
                case 7:
                    diaCorrespondiente = "Domingo";
                    break;
                default:
                    diaCorrespondiente = ""; // Este caso nunca debería ejecutarse debido a la validación previa
                    break;
            }

            // Mostrar el resultado
            System.out.println("El día correspondiente es: " + diaCorrespondiente);
        }

        scanner.close();
	}

}
