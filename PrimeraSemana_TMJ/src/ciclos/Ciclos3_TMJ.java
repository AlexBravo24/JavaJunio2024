package ciclos;

import java.util.Scanner;

public class Ciclos3_TMJ {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es pal�ndromo
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un string");
		String input = entrada.nextLine();
		
		boolean esPalindromo = esPalindromo(input);
        if (esPalindromo) {
            System.out.println("El String es un pal�ndromo.");
        } else {
            System.out.println("El String no es un pal�ndromo.");
        }
    }

    private static boolean esPalindromo(String str) {
        // Limpiar el String: convertir a min�sculas y eliminar espacios
        String cleanedStr = str.toLowerCase().replaceAll("\\s", "");
        
        int inicio = 0;
        int fin = cleanedStr.length() - 1;
        
        while (inicio < fin) {
            if (cleanedStr.charAt(inicio)!= cleanedStr.charAt(fin)) {
                return false; // No es pal�ndromo si no coinciden desde ambos extremos
            }
            inicio++;
            fin--;
        }
        
        return true; // Es pal�ndromo si se llega hasta aqu� sin encontrar diferencias
    }
		
	}


