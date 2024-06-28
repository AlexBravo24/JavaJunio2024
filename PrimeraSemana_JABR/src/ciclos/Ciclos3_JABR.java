package ciclos;

import java.util.Scanner;

public class Ciclos3_JABR {

	public static void main(String[] args) {
		
		// Realiza un programa para determinar si un String es palíndromo.
		
		//Voy a necesitar 2 String, uno para recibir el original
		//y otro para armar el original en reversa y así compararlos
		//y determinar si es palindromo
		
		String original;
		String reversa = "";
		
		Scanner entrada = new Scanner(System.in);
		
		//Solicitamos al usuario ingrese una frase y la guardamos en la variable
		//original
		System.out.println("=============================================");
		System.out.println("=============PALINDROMO======================");
		System.out.println("=============================================");
		System.out.println("Introduce una palabra o frase");
		original = entrada.nextLine();
		
		//Necesitamos un ciclo que nos ayude a iterar al revés para armar la reversa
		for (int i = original.length()-1; i >=0; i--) {
			reversa = reversa + original.charAt(i);
			
		}
		//Hacemos una comprobación de como queda armada la reversa
		System.out.println("Reversa: " + reversa.replace(" ", ""));
		
		//Hacemos una validación para comprobar el contenido original
		//contra el armado en reversa para determinar si son iguales y es palindromo
		//podemos valernos de reemplazar los espacios
		
		if(original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
		
		
		
		

	}

}
