package condicionales;
import java.util.Scanner;

public class Condicionales5_RISL {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int edad, nota;
		String sexo; 
		
		System.out.println("Escribe tu edad");
		edad = entrada.nextInt();
		
		System.out.println("Introduce tu nota obtenidad");
		nota = entrada.nextInt();
		
		System.out.println("Escribe tu sexo 'M' 'F'");
		sexo = entrada.next();
		
		if (nota > 5 && edad >=18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("Solicitud aceptada");
		}else if (nota > 5 && edad >=18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Solicitud posible");
		}else {
			System.out.println("Solicitud denegada");
		}

		
		
	}

}
