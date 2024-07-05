package condicionales;

import java.util.Scanner;

public class Condicionales7_IDO {

	public static void main(String[] args) {
			// 
		
		
	         Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

		        // Pide al usuario que introduzca el resultado del dado
		        System.out.println("Introduce el resultado del dado (1-6):");
		        int resultado = entrada.nextInt();

		        String caraOpuesta; // Declara la variable para almacenar la cara opuesta en letras

		        // Determina la cara opuesta utilizando una declaración switch
		        switch (resultado) {
		            case 1:
		                caraOpuesta = "seis";
		                break;
		            case 2:
		                caraOpuesta = "cinco";
		                break;
		            case 3:
		                caraOpuesta = "cuatro";
		                break;
		            case 4:
		                caraOpuesta = "tres";
		                break;
		            case 5:
		                caraOpuesta = "dos";
		                break;
		            case 6:
		                caraOpuesta = "uno";
		                break;
		            default:
		                caraOpuesta = "ERROR: número incorrecto."; // Si el número no está en el rango del 1 al 6, muestra un mensaje de error
		                break;
		        }

		        // Muestra el resultado
		        System.out.println(caraOpuesta); // Imprime la cara opuesta en letras o el mensaje de error

		        entrada.close(); // Cierra el objeto Scanner
		    }
		


	}


