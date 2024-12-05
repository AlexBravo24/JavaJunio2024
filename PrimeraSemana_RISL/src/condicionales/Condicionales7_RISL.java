package condicionales;

import java.util.Scanner;

public class Condicionales7_RISL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		int numero; 
		System.out.println("Escribe tu resultado");
		numero= entrada.nextInt();
		
		if (numero ==1) {
			System.out.println("Número Uno ");		
			System.out.println("Opuesto 6");
		}else if (numero ==2) {
			System.out.println("Número Dos");
			System.out.println("Opuesto 5");
		}else if (numero ==3) {
			System.out.println("Número Tres");
			System.out.println("Opuesto 4 ");
		} else if (numero ==4 ) {
			System.out.println("Número Cuatro");
			System.out.println("Opuesto 3");
		}else if (numero==5) {
			System.out.println("Número Cinco");
			System.out.println("Opuesto 2");
		}else if (numero ==6) {
			System.out.println("Número Seis");
			System.out.println("Opuesto 1 ");
		}if (numero >6 || numero <1) {
			System.out.println("Error: número incorrecto");
		}}}