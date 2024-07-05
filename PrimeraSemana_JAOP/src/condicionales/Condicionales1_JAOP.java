package condicionales;

import java.util.Scanner;

public class Condicionales1_JAOP {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es 
		//mayor o si son iguales
		
		int numero1,numero2;
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("Introduzca primer numero:");
		
		numero1 = entrada.nextInt();
		
		System.out.println("Introduzca el segundo numero:");
		
		numero2 =entrada.nextInt();
		
		if (numero1>numero2) {
			
			System.out.println("El primer numero es mayor que el segundo:");}
			
			else if (numero1<numero2) {
				
				System.out.println("El segundo numero es mayor que el primero:");}
			
			else { 
                  
				System.out.println("El primer numero es igual al segundo numero:");
			}


		

 
    
    
    
}
}



			
		
		




