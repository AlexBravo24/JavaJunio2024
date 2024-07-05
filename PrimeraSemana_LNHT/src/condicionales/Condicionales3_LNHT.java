package condicionales;

import java.util.Scanner;

public class Condicionales3_LNHT {

	public static void main(String[] args) {
		// .Crea un programa que pida al usuario dos números y muestre el resultado 
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error

		int a,b, res;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese el primer numero");
		a = scan.nextInt();
		System.out.println("Ingrese el segundo numero");
		b = scan.nextInt();
		if(b == 0) {
			System.out.println("Eroor no se puede dividir entre 0 ");
		}else {
			res = a/b;
			System.out.println("El resultado de : "+ a +" entre " + b +" es = "+ res);
		
		}
		
	}// llave main

}
