package condicionales;

import java.util.Scanner;

public class Condicionales5_JAOP {

	public static void main(String[] args) {
		/* 5. Realiza un programa que calcule la aceptación de una solicitud en base a 
		los siguientes parámetros: edad, nota y sexo. 
		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		* Otros casos -> NO ACEPTADA */
		
    int edad;
    double nota;
    String sexo;
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Ingresa tu edad:");
    edad = entrada.nextInt();
    
    System.out.println("Ingresa tu nota:");
    nota = entrada.nextDouble();
    
    System.out.println("Ingresa tu sexo:");
    sexo = entrada.next();
    
     if (edad >= 18 && nota > 5 ) {
    	 
    	 System.out.println("Felicidades, has sido aceptado");
    	 
	} else {
    	 
    	 System.out.println("Lo sentimos, no has sido aceptado");
    	 
     }
     
	}}
     
    
	
    

	
	


