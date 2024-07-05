package condicionales;
import java.util.Scanner;
public class Condicionales4_CDMC {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	//Realiza un programa que lea una cadena por teclado y compruebe si contiene letras mayúsculas.
	
    
    System.out.print("Ingresa una cadena: ");
    String cadena = scanner.nextLine();

    boolean contieneMayusculas = false;
    for (int i = 0; i < cadena.length(); i++) {
        char caracter = cadena.charAt(i);
        
        if (Character.isUpperCase(caracter)) {
            contieneMayusculas = true;
            break;  // 
        }
    }

    if (contieneMayusculas) {
        System.out.println("La cadena contiene letras mayúsculas.");
    } else {
        System.out.println("La cadena NO contiene letras mayúsculas.");
    }

    scanner.close();
}
}
