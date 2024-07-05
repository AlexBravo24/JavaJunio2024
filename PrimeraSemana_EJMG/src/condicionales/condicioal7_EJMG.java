package condicionales;

import java.util.Scanner;

public class condicioal7_EJMG {
	
	public static void main(String[] args) {
		
		int numeroDelDado;

		Scanner entradaDado= new Scanner(System.in);
		System.out.println("INTRODUCE EL NUMERO DE LA CARA DEL DADO");
		numeroDelDado = entradaDado.nextInt();
		
		
		if(numeroDelDado==1) {
			System.out.println("TU CARA OPUESTA ES : SEIS");
		}else if (numeroDelDado==6) {
			System.out.println("TU CARA OPUESTA ES : UNO");
			
		}else if (numeroDelDado==2) {
			System.out.println("TU CARA OPUESTA ES : CINCO");
			
		}else if (numeroDelDado==5) {
			System.out.println("TU CARA OPUESTA ES : DOS");
			
		}else if (numeroDelDado==3) {
			System.out.println("TU CARA OPUESTA ES : CUATRO");
			
		}else if (numeroDelDado==4) {
			System.out.println("TU CARA OPUESTA ES : TRES");
			
		}else if (numeroDelDado<1 || numeroDelDado>6) {
			System.out.println("ERROR : numero incorrecto");
			
		}
		
	}

}
