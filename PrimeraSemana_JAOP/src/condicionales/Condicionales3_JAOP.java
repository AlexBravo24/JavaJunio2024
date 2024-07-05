package condicionales;

import java.util.Scanner;

public class Condicionales3_JAOP {

	public static void main(String[] args) {
		//3.Crea un programa que pida al usuario dos números y muestre el resultado 
	    //de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
	    
	   int numero1,numero2;
	   
	   Scanner entrada = new Scanner (System.in);
	   
	   System.out.println("Ingrese el primer numero:");
	    numero1 = entrada.nextInt();
	       
	    
	   
	   System.out.println("Introduzca el segundo numero:");
	   numero2 = entrada.nextInt(); 
	   
	if (numero2==0)
		
		System.out.println("Error");
	
	else
		
		   System.out.println("El resultado de la division es:"+ (numero1/numero2));
		   
	
	
	
	
	}
	
		   
		   
			   
			   
			   
	   

	}


