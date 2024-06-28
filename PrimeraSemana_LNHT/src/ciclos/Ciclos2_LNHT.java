package ciclos;

import java.util.Scanner;

public class Ciclos2_LNHT {

	public static void main(String[] args) {
		//  Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		int multi, iteracion;
		Scanner scan= new Scanner(System.in);
		System.out.println("----Tabla De Multiplicar-------");
		System.out.println("ingrese el numero que desea multiplicar");
		multi = scan.nextInt();
		System.out.println("Ingrese el numero de interaciones que desea multiplicar");
		iteracion = scan.nextInt();
		System.out.println("...--..---..--..--..--..--..--..--..--..--..--..--..--..--..");
		
		for (int i = 1; i <= iteracion; i++) {
			System.out.println(multi + " x " + i + " = " + (multi * i));
		}
		
	}

}
