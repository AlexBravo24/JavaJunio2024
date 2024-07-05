package condicionales;
import java.util.Scanner;
public class Condicionales3_CDMC {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Ingresa el primer número: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Ingresa el segundo número: ");
	        int numero2 = scanner.nextInt();

	        // Verificamos si el segundo número es cero para evitar división por cero
	        if (numero2 == 0) {
	            System.out.println("Error: No se puede dividir por cero.");
	        } else {
	            // Realizamos la división y mostramos el resultado
	            double resultado = numero1 / numero2;
	            System.out.println("El resultado de la división es: " + resultado);
	        }

	        scanner.close();
}
}
