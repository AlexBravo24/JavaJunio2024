package condicionales;
import java.util.Scanner;
public class Condicionales1_CDMC {

	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);


    System.out.print("Ingresa el primer número: ");
    int numero1 = scanner.nextInt();

    System.out.print("Ingresa el segundo número: ");
    int numero2 = scanner.nextInt();

 
    if (numero1 > numero2) {
        System.out.println(numero1 + " es mayor que " + numero2);
    } else if (numero2 > numero1) {
        System.out.println(numero2 + " es mayor que " + numero1);
    } else {
        System.out.println(numero1 + " y " + numero2 + " son iguales");
    }

    scanner.close();
	
		
	
		
}
}
