package Condicionales;

import java.util.Scanner;

public class Condicionales7_EJOG {

	public static void main(String[] args) {
		/* Realiza un programa que pida por teclado el resultado (dato entero) 
			obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en 
			letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
			caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4. 
			Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se 
			mostrar� el mensaje: �ERROR: n�mero incorrecto*/
		
		

		int numero;
		String numeroL ;
		
		
		Scanner Entrada= new Scanner (System.in);
		
		System.out.println("Introduce el resultado que te dio al tirar el dado:");
		numero = Entrada.nextInt();
		
		Entrada.close();
		
		
		switch(numero) {
		     case 1:
		    	 numeroL="Seis";
		    	 break;
		    	 
		     case 2:
		    	 numeroL="Cinco";
		    	 break;
		     case 3:
		    	 numeroL="Cuatro";
		    	 break;
		     case 4:
		    	 numeroL="Tres";
		    	 break;
		     case 5:
		    	 numeroL="Dos";
		    	 break;
		     case 6:
		    	 numeroL="Uno";
		    	 break;
		     default:
		    	 numeroL="N�mero incorrecto";
		    	 break;
		  	    
		}
		
		if(numero<1 || numero>6) {
			System.out.println(numeroL);
		}else {
		System.out.println("El numero opuesto es "+numeroL);
		
		}	
			
				

	}

	
	
}
