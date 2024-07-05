package ciclos;

import java.util.Scanner;

public class Ciclos3_TMJ {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un string");
		String input = entrada.nextLine();
		
		boolean esPalindromo = esPalindromo(input);
        if (esPalindromo) {
            System.out.println("El String es un palíndromo.");
        } else {
            System.out.println("El String no es un palíndromo.");
        }
    }

    private static boolean esPalindromo(String str) {
        // Limpiar el String: convertir a minúsculas y eliminar espacios
        String cleanedStr = str.toLowerCase().replaceAll("\\s", "");
        
        int inicio = 0;
        int fin = cleanedStr.length() - 1;
        
        while (inicio < fin) {
            if (cleanedStr.charAt(inicio)!= cleanedStr.charAt(fin)) {
                return false; // No es palíndromo si no coinciden desde ambos extremos
            }
            inicio++;
            fin--;
        }
        
        return true; // Es palíndromo si se llega hasta aquí sin encontrar diferencias
    }
		
	}


