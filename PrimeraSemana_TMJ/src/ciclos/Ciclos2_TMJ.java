package ciclos;

import java.util.Scanner;

public class Ciclos2_TMJ {

	public static void main(String[] args) {
//		2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
//		introducido desde teclado, hasta la iteración deseada por el usuario. 
//		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
	 Scanner entrada= new Scanner(System.in);
	 // solicitamos datos de entrada 
	 System.out.println("Ingresa numero base");
	 int base= entrada.nextInt();
	System.out.println("Ingresa numero superior");
	int limite = entrada.nextInt();
	for (int i = 1; i <= limite; i++) {
		 System.out.printf("%d x %d = %d%n", base, i, base * i);
	
		 
	}
	 }

}
