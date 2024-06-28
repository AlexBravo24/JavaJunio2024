package Ciclos;

import java.util.Scanner;

public class Ciclos5_MAD {
public static void main(String[] args) {
	// 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. 
	// ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?
	int contador =1;
	double retornoInv = 1000;
		
	
	System.out.println("===========================");
	System.out.println("=====EJERCICIO CILOS 5=====");
	System.out.println("===========================");	
	System.out.println("");
	
	while (contador<=12) {
		retornoInv += (retornoInv*0.02);
		contador++;
	}
	
	System.out.println("El dinero obtenido despues de 1 año de inversion es: "+retornoInv);
	
	System.out.println("");
	System.out.println("===========================");
	System.out.println("=====FIN DEL EJERCICIO=====");
	System.out.println("===========================");
}
}
