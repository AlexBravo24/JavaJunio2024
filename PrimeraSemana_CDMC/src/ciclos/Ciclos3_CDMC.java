package ciclos;
import java.util.Scanner;
public class Ciclos3_CDMC {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

	 //Realiza un programa para determinar si un String es pal�ndromo.
	 
	
	 
     // Pedir al usuario que ingrese una cadena
     System.out.print("Ingresa una cadena para verificar si es un pal�ndromo: ");
     String cadena = scanner.nextLine();

     // Eliminar espacios en blanco y convertir a min�sculas
     String cadenaSinEspacios = cadena.replaceAll("\\s+", "").toLowerCase();

     // Verificar si la cadena es un pal�ndromo
     boolean esPalindromo = esPalindromo(cadenaSinEspacios);

     // Mostrar el resultado
     if (esPalindromo) {
         System.out.println("La cadena \"" + cadena + "\" es un pal�ndromo.");
     } else {
         System.out.println("La cadena \"" + cadena + "\" NO es un pal�ndromo.");
     }
     System.out.println("====Fin del Ptograma===");
     scanner.close();
 }

 // M�todo para verificar si una cadena es un pal�ndromo
 public static boolean esPalindromo(String cadena) {
     int izquierda = 0;
     int derecha = cadena.length() - 1;

     // Comparar caracteres desde los extremos hacia el centro
     while (izquierda < derecha) {
         if (cadena.charAt(izquierda) != cadena.charAt(derecha)) {
             return false; // No es un pal�ndromo
         }
         izquierda++;
         derecha--;
       
     }
  
     return true; // Es un pal�ndromo
  
}
}
