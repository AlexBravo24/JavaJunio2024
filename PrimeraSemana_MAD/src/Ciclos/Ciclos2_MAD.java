package Ciclos;

import java.util.Scanner;

public class Ciclos2_MAD {
	// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido desde teclado, 
	// hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
	
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	int x, iteracion, multiplicador=1;
	
	System.out.println("===========================");
	System.out.println("=====EJERCICIO CILOS 2=====");
	System.out.println("===========================");	
	
	System.out.print("\n Por favor digite el numero deseado: ");
	x = entrada.nextInt();
	System.out.print("Por favor indique hasta que numero desea multiplicarse: ");
	iteracion = entrada.nextInt();
	System.out.println("Tabla de multiplicar del numero "+x);
	
	for (int i=0; i<iteracion; i++) {
		System.out.println(x+" * "+multiplicador+" = "+(x*multiplicador));
		multiplicador++;
	}
	
	System.out.println("");
	System.out.println("===========================");
	System.out.println("=====FIN DEL EJERCICIO=====");
	System.out.println("===========================");	
}
}
