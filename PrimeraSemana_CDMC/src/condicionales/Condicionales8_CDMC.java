package condicionales;
import java.util.Scanner;
public class Condicionales8_CDMC {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

   
    System.out.print("Ingresa el n�mero del d�a de la semana (1-7): ");
    int numeroDia = scanner.nextInt();

    if (numeroDia < 1 || numeroDia > 7) {
        System.out.println("N�mero de d�a inv�lido. Debe estar entre 1 y 7.");
    } else {
      
        String[] diasSemana = {
             "Lunes", "Martes", "Mi�rcoles", "Jueves", "Viernes", "S�bado", "Domingo"
        };

      
        String diaCorrespondiente = diasSemana[numeroDia - 1];
        System.out.println("El d�a correspondiente al n�mero " + numeroDia + " es: " + diaCorrespondiente);
    }

    scanner.close();
}
}
