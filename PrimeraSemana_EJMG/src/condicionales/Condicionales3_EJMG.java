package condicionales;

import java.util.Scanner;

public class Condicionales3_EJMG {

	public static void main(String[] args) {
		
		int numero1;
		
		Scanner entrada1= new Scanner(System.in);
		System.out.println("introduce Primer Numero");
		numero1= entrada1.nextInt();
		
		
        int numero2;
		
		Scanner entrada2= new Scanner(System.in);
		System.out.println("introduce Segundo Numero");
		numero2= entrada2.nextInt();
		
	
		

		
		if(numero2  == 0){
			System.out.println("ERROR");
		
		}else {
			System.out.println("El resultado es: "+ numero1/numero2 );
		}
	}

}
