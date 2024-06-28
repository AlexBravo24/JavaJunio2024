package condicionales;

import java.util.Scanner;

public class condicional5_EJMG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int edad;
		int nota;
		String sexo;
		
		Scanner entradaEdad= new Scanner(System.in);
		System.out.println("introduce la Edad");
		edad= entradaEdad.nextInt();

		Scanner entradaNota= new Scanner(System.in);
		System.out.println("introduce una Nota");
		nota= entradaNota.nextInt();
		
		Scanner entradaSexo= new Scanner(System.in);
		System.out.println("introduce el Sexo");
		sexo= entradaSexo.next();
		
		if(nota==5 && edad==18 && sexo.equals("M")) {
			System.out.println("POSIBLE");
			
		}else {
			if(nota==5 && edad==18 && sexo.equals("F")){
				System.out.println("ACEPTADA");
				}else {
					System.out.println("NO ACEPTADA");
				}
			
		}
	}

}
