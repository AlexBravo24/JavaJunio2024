package condicionales;

import java.util.Scanner;

public class Condicionales4_TMJ {

	public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        // solicitamos los datos de entrada 
        
        System.out.println("Por favor, ingresa una cadena de texto:");
        String texto = scanner.nextLine();

        boolean tieneMayusculas = false;
        for (char c : texto.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayusculas = true;
                break; // Salir del bucle ya que encontramos al menos una letra mayúscula
            }
        }

        if (tieneMayusculas) {
            System.out.println("La cadena contiene al menos una letra mayúscula.");
        } else {
            System.out.println("La cadena no contiene letras mayúsculas.");
        }

        scanner.close(); // Es recomendable cerrar el objeto Scanner cuando ya no sea necesario
    }
}
