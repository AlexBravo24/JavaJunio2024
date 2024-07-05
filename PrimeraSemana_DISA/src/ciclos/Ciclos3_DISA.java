package ciclos;

import java.util.Scanner;

public class Ciclos3_DISA {
	
	/*public static boolean esPalindromo(String palabra) {
		palabra = palabra.toLowerCase();
		palabra = palabra.replace(" ", "");
		palabra = palabra.replace("á", "a");
		palabra = palabra.replace("é", "e");
		palabra = palabra.replace("í", "i");
		palabra = palabra.replace("ó", "o");
		palabra = palabra.replace("ú", "u");
		
		int a=0;
		int b=palabra.length() - 1;
		
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(0)) == palabra.charAt(b){
				a++;
				b--;
				else (palabra.charAt(0)) != palabra.charAt(b)
					return false
			}
			
		}
		return true;
*/	
	
	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo.
		
		//Una opcion puede ser la siguiente:
		//Se haran 2 string, uno para receibir el original y otro para armar el original en reversa 
		//y asi comparar y determinar si es palindromo
		//Ademas se usara el scanner para ingresar las palabras por teclada y compararlas
		
		 Scanner sc = new Scanner(System.in);
		 
		 String original;
		 String reversa = "";
		 
		 //Se solicita al usuario escribir una frase o palabra y la guardamos en la variable original
		
		 System.out.println("===============================================");
		 System.out.println("===============PALINDROMO======================");
		 System.out.println("===============================================");
		 System.out.println("Escribe una palabra:");
		 original=sc.nextLine();
		 
		 //Necesitamos un ciclo que nos ayude a iterar al reves para armar la reversa
		 
		 for (int i = original.length()-1; i >=0; i--) {
			reversa = reversa + original.charAt(i);
		}
		 //Hacemos una comprobacion de como queda armada la reversa
		 System.out.println("Reversa: "+ reversa);
		 
		 //Hacemos una validacion para comprobar el contenido original contra el armado en reversa para determinar si son 
		 //iguakes y es palindromo podemis valernos de reemplazar los espacios
		 
		 if(original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			 System.out.println("Es palindromo");
		 }else {
			 System.out.println("No es palindromo");
		 }
	}

}
