package condicionales;

import java.util.Scanner;

public class Condicionales1_LNHT {

	public static void main(String[] args) {
		// .Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales
		int numero1=0 , numero2=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("ingresa el primer numero");
		numero1 = scan.nextInt();
		System.out.println("ingresa el segundo numero");
		numero2 = scan.nextInt();
		
		if (numero1 > numero2) {
			System.out.println(numero1 +" Es mayor que "+ numero2);
		}else {
			System.out.println(numero2 +" Es mayor que "+ numero1);
		}
	}

}
