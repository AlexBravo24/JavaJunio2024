package condicionales;

import java.util.Scanner;

public class Condicionales4_EJMG {

	

	public static void main(String[] args) {
		
		 String cadenaOriginal;
		 String cadenaConvertida;
		 
		 
		/* System.out.println("============================");
		 System.out.println("Ejercicios 4 condicionales");
		 System.out.println("============================");
		 
		 */
		 
			Scanner entrada1 = new Scanner(System.in);
			System.out.println("INTRODUCE UNA PALABRA");
			cadenaOriginal = entrada1.next();
			
			System.out.println(cadenaOriginal);
			
			cadenaConvertida = cadenaOriginal.toLowerCase();
			
			if(cadenaOriginal.equals(cadenaConvertida)) {
				System.out.println("La cadena son letras minusculas");
				
			}else {
				System.out.println("Contiene letras Mayusculas");
			}
		 
		 
		
	}

}
