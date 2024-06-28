package ciclos;

import java.util.Scanner;

public class Ciclos3_LNHT {

	public static void main(String[] args) {
		//Realiza un programa para determinar si un String es palíndromo.
	String palabra;
	String palDer;
	String compara;
	int res=0;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Ingresa una palabra palindroma");
	palabra = scan.next();
	scan.close();
	int j = (palabra.length());
	for (int i = 0; i < palabra.length(); i++) {
		palDer = palabra.substring(i,i+1);
		
		compara = palabra.substring(j-1,j);
		
			if(  palDer.equals(compara)) {
				res++;
			}
		j--;
		//System.out.println(palDer + " = "+ compara +" el valor i "+ i + j );		
		}// for
	if(res == palabra.length()) {
	System.out.println("si es una palabra palindroma ");
	}else {
    System.out.println("No es una palabra palindroma");
	} 
	
	
	}//main

}
