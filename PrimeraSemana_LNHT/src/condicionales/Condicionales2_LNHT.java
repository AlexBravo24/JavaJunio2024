package condicionales;

import java.util.Scanner;

public class Condicionales2_LNHT {

	public static void main(String[] args) {
		//programa que indique si el numero es par o impar
		int numero, compara;
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		numero = scan.nextInt();
		compara = numero%2;
		if (compara != 1) {
			System.out.println("el numero : " + numero+ " es par");
		}else {
			System.out.println("el numero : " + numero+ " es impar");
		}

	}

}
