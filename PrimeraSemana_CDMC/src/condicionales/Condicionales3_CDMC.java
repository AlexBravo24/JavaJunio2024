package condicionales;
import java.util.Scanner;
public class Condicionales3_CDMC {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Ingresa el primer n�mero: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Ingresa el segundo n�mero: ");
	        int numero2 = scanner.nextInt();

	        // Verificamos si el segundo n�mero es cero para evitar divisi�n por cero
	        if (numero2 == 0) {
	            System.out.println("Error: No se puede dividir por cero.");
	        } else {
	            // Realizamos la divisi�n y mostramos el resultado
	            double resultado = numero1 / numero2;
	            System.out.println("El resultado de la divisi�n es: " + resultado);
	        }

	        scanner.close();
}
}
