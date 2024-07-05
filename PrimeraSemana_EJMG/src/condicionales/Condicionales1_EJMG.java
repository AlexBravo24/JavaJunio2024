package condicionales;

import java.util.Scanner;

public class Condicionales1_EJMG {
	
	public static void main(String[] args) {
		
		
		
		
		int numero1;
		Scanner entrada1= new Scanner(System.in);
		
		System.out.println("introduce un Numero");
		numero1= entrada1.nextInt();
		
		int numero2;
		Scanner entrada2= new Scanner(System.in);
		System.out.println("introduce otro Numero");
		numero2= entrada2.nextInt();
		
		if (numero1 == numero2) {
			System.out.println("Los numeros son iguales");
			
		}else {
			if (numero1 > numero2) {
				System.out.println("El numero  mayor es "+ numero1);
				
			}else {
				System.out.println("El numero  mayor es "+ numero2);
				
				
			}
		}
		
	}

	
	
	
}
