package condicionales;
import java.util.Scanner;
public class Condicionales8_CDMC {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

   
    System.out.print("Ingresa el número del día de la semana (1-7): ");
    int numeroDia = scanner.nextInt();

    if (numeroDia < 1 || numeroDia > 7) {
        System.out.println("Número de día inválido. Debe estar entre 1 y 7.");
    } else {
      
        String[] diasSemana = {
             "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        };

      
        String diaCorrespondiente = diasSemana[numeroDia - 1];
        System.out.println("El día correspondiente al número " + numeroDia + " es: " + diaCorrespondiente);
    }

    scanner.close();
}
}
