package condicionales;
import java.util.Scanner;
public class Concionales7_CDMC {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    // Ingresa el valor del dado
    System.out.print("Ingresa el n�mero obtenido al lanzar el dado (1-6): ");
    int resultadoDado = scanner.nextInt();

    
    if (resultadoDado < 1 || resultadoDado > 6) {
        System.out.println("Error: El n�mero debe estar entre 1 y 6.");
    } else {
       
        String caraOpuesta = determinarCaraOpuesta(resultadoDado);
        
        
        System.out.println("La cara opuesta al n�mero " + resultadoDado + " es: " + caraOpuesta);
    }

    scanner.close();
}


public static String determinarCaraOpuesta(int resultado) {
   
    switch (resultado) {
        case 1:
            return "6";
        case 2:
            return "5";
        case 3:
            return "4";
        case 4:
            return "3";
        case 5:
            return "2";
        case 6:
            return "1";
        default:
            return "";
    }
}
}
