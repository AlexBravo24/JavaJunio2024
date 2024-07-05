package ciclos;

import java.util.Scanner;

public class ciclos2_EJMG {
	
	/*2.- Programa un algoritmo que realice la tabla de multiplicar de un numero 
	introducido desde teclado, hasta la iteración deseada por el usuario. 
	Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
    */
	
	
	public static void main(String[] args) {
		int numeroEntrada;
		int numeroIteraciones;
		
		Scanner entradaNumero= new Scanner(System.in);
		System.out.println("INTRODUCE EL NUMERO DE ENTRADA");
		numeroEntrada = entradaNumero.nextInt();
		
		Scanner entradaNumero2= new Scanner(System.in);
		System.out.println("INTRODUCE EL NUMERO DE ITERACION");
		numeroIteraciones = entradaNumero.nextInt();
		
		 for(int i = 0; i<=numeroIteraciones ; i++) {
				System.out.println(i + " * " + numeroEntrada + " = " +  i*numeroEntrada);
			}

		
	}

}
