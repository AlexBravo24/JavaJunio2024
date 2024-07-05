package ciclos;

import java.util.Scanner;

//3. Realiza un programa para determinar si un String es palíndromo

public class ciclos3_EJMG {
	
	//voy a necesitar 2 String, uno para recibir el original 
   //otro para armar el original en reversa
	
	
	
	public static void main(String[] args) {
	 String original;
     String reversa ="";
     
     
		Scanner entradaPalindromo= new Scanner(System.in);
		System.out.println("INTRODUCE LA PALABRA");
		original= entradaPalindromo.nextLine();
		
		//Necesitamos un ciclo que nos ayude a iterar al reves para armar el reversa
	
		
		for (int i = original.length()-1; i >=0 ; i--) {
			reversa=reversa + original.charAt(i);
			
			//hacemos una comprobacion de comno queda armada la reversa
			System.out.println("Reversa :" + reversa.replace(" ", ""));
			
			//hacemos u na validacion paraa comprobar el contenido original
			// contra el armado en reversa para determinar si son iguales
			//podemos valernos de remplazar los espacios
			
			
			if (original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))){
				System.out.println("Es palindromo");
			}else {
				System.out.println("No es palindromo");
			}
			
			
			
			
			
		
		}
		
		
	}

}
