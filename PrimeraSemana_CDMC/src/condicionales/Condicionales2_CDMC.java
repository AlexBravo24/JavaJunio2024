package condicionales;
import java.util.Scanner;
public class Condicionales2_CDMC {

	public static void main(String[] args) {
		//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
				
				 Scanner scanner = new Scanner(System.in);

		
			        System.out.print("Ingresa un número entero: ");
			        int numero = scanner.nextInt();

			     
			        if (numero % 2 == 0) {
			            System.out.println(numero + " es un número par");
			        } else {
			            System.out.println(numero + " es un número impar");
			        }

			        scanner.close();
	}
}
