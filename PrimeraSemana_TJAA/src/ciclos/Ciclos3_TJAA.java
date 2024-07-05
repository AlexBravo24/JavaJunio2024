package ciclos;

import java.util.Scanner;

public class Ciclos3_TJAA {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar 
		//si un String es palíndromo.
		
		//Voy a necesitar 2 String, uno para recibir el original
		//y otro para armar el original en reversa y así compararlos
		//y determinar si es palindromo 
		
		String original;
		String reversa = "";
		
		Scanner entrada= new Scanner (System.in);
		
		//Solicitamos al usuario ingrese una frase y la guardamos en la 
		//variable original 
		System.out.println("Introduce una palabra o frase");
		original= entrada.nextLine();
		
		//Necesitamos un ciclo que nos ayude a iterar al revés para armar la reversa
		for (int i = original.length()-1; i >=0; i--) {
			reversa= reversa + original.charAt(i);
		}
			System.out.println("Reversa: " + reversa);
			
		if (original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("Es palindormo");
		} else {
			System.out.println("No es palindromo");
		}
		
		
	}

}
