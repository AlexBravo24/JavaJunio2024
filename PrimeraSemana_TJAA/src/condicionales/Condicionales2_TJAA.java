package condicionales;

import java.util.Scanner;

public class Condicionales2_TJAA {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un n�mero por teclado y nos indique si es par
		//o impar.
		
		Scanner entrada = new Scanner (System.in);
		int numero; 
		System.out.println("Escribe un n�mero");
	    numero = entrada.nextInt();
		
	    entrada.close();
	    
	    if (numero % 2 == 0) {
	    	System.out.println("N�mero par");
	    }else {
	    	System.out.println("N�mero impar");
	    }
	   
	    
	}

}
