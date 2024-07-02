package ciclos;

import java.util.Scanner;

public class Ciclos3_EJOG {

	public static void main(String[] args) {
		/*
		 *  Realiza un programa para determinar si un String es palíndromo.
		 */
	//Variables	
	String cadena,cadena2="";
	int largo,i=0;
	//Inicializamos el Scanner
	Scanner Entrada = new Scanner (System.in);
	
	System.out.println("===============================================================================");
	System.out.println("====	Realiza un programa para determinar si un String es palíndromo     ====");
	System.out.println("===============================================================================");
	
	System.out.println("Introduce la palabra o frase para validar si es palindromo:");
	//Asignamos el dato capturado
	cadena=Entrada.nextLine();
	//Obtenemos el tamaño de la cadena
	largo=cadena.length()-1;
	//Cerramos Scanner
	Entrada.close();
	
	//Iniciamos Ciclo While
	while (i<=largo) {
		//Recorremos la cadena original de la ultima posición a la primera
		cadena2=cadena2+cadena.charAt(largo);
		largo--;
		
	}
	//System.out.println(cadena+" "+cadena2);
	
	//Imprime si es o no un Palindromo
	if(cadena2.replace(" ", "").equalsIgnoreCase(cadena.replace(" ", ""))) {
		System.out.println("La palabra o frase '"+cadena+"' es un palindromo.");
	}else {
		System.out.println("La palabra o frase '"+cadena+"' no es un palindromo.");
	}
	
	}

}
