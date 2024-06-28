package condicionales;

import java.util.Scanner;

public class condicional8_EJMG {

	public static void main(String[] args) {
		int numeroDeLaSemana;
		
		Scanner entradaNumero= new Scanner(System.in);
		System.out.println("INTRODUCE EL NUMERO DEL DIA DE LA SEMANA (1-7)");
		numeroDeLaSemana = entradaNumero.nextInt();
		
		if(numeroDeLaSemana==1) {
			System.out.println("LUNES");
			
		}else if (numeroDeLaSemana==2) {
			System.out.println("MARTES");
			
		}else if (numeroDeLaSemana==3) {
			System.out.println("MIERCOLES");
			
		}else if (numeroDeLaSemana==4) {
			System.out.println("JUEVES");
			
		}else if (numeroDeLaSemana==5) {
			System.out.println("VIERNES");
			
		}else if (numeroDeLaSemana==6) {
			System.out.println("SABADO");
			
		}else if (numeroDeLaSemana==7) {
			System.out.println("DOMINGO");
			
		}else if (numeroDeLaSemana<=1 || numeroDeLaSemana>=8) {
			System.out.println("ERROR");
			
		}
		
		
	}

}
