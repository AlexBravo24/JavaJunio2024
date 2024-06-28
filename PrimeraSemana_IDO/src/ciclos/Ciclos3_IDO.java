package ciclos;

import java.util.Scanner;

public class Ciclos3_IDO {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		 String original;
		 String reversa;
		 
		 Scanner entrada =new Scanner (System.in);
		 
		 
		 System.out.println("Introduce una palabra o texto");
		 original = entrada.nextLine();
		 
		 //se requiere un ciclo que ayude a iteractuar al reve para armar la reversa
		 
		 for (int i = original.length()-1; i >=0; i--) {
			 reversa =reversa + original.charAt(1);
			 
		 }
		// hacemos una comparacion de como queda armado
		 
		 System.out.println("reversa: " + reversa);
		 
		 
		}
		 
		 
		
	}

}
