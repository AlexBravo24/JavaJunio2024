package condicionales;

import java.util.Scanner;

public class Condicional2_EJMG {

	public static void main(String[] args) {
			
			int numero1;
		
			Scanner entrada1= new Scanner(System.in);
			System.out.println("introduce un Numero");
			numero1= entrada1.nextInt();
			
			System.out.println(numero1%2);
			
			if(numero1%2 == 0){
				System.out.println("El numero es par");
			}else {
				System.out.println("El numero es impar");
			}
			
			
			
		
	}

}
