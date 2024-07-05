package ciclos;
import java.util.Scanner;
public class Ciclos3_CDMC {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

	 //Realiza un programa para determinar si un String es palíndromo.
	 
	
	 
     // Pedir al usuario que ingrese una cadena
     System.out.print("Ingresa una cadena para verificar si es un palíndromo: ");
     String cadena = scanner.nextLine();

     // Eliminar espacios en blanco y convertir a minúsculas
     String cadenaSinEspacios = cadena.replaceAll("\\s+", "").toLowerCase();

     // Verificar si la cadena es un palíndromo
     boolean esPalindromo = esPalindromo(cadenaSinEspacios);

     // Mostrar el resultado
     if (esPalindromo) {
         System.out.println("La cadena \"" + cadena + "\" es un palíndromo.");
     } else {
         System.out.println("La cadena \"" + cadena + "\" NO es un palíndromo.");
     }
     System.out.println("====Fin del Ptograma===");
     scanner.close();
 }

 // Método para verificar si una cadena es un palíndromo
 public static boolean esPalindromo(String cadena) {
     int izquierda = 0;
     int derecha = cadena.length() - 1;

     // Comparar caracteres desde los extremos hacia el centro
     while (izquierda < derecha) {
         if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
             return false; // No es un palíndromo
         }
         izquierda++;
         derecha--;
       
     }
  
     return true; // Es un palíndromo
  
}
}
