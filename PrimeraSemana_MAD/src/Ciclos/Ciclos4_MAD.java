package Ciclos;

import java.util.Scanner;

public class Ciclos4_MAD {

	public static void main(String[] args) throws InterruptedException {
		// 4. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día desde 
		// las 00:00:00 horas hasta las 23:59:59 horas
		int hr=0, min=0, seg=0;
		
		
		System.out.println("===========================");
		System.out.println("=====EJERCICIO CILOS 5=====");
		System.out.println("===========================");	
		System.out.println("");
		
		for (int i=0; i<=23; i++) {
			hr=i;
			min=0;
			for (int y=0; y<=59; y++) {
				min=y;
				seg=0;
				for (int z=0; z<=59; z++) {
					seg=z;
					System.out.printf("%02d:%02d:%02d\n",hr,min,seg);
					Thread.sleep(10);
				}
			}
		}
		
		System.out.println("");
		System.out.println("===========================");
		System.out.println("=====FIN DEL EJERCICIO=====");
		System.out.println("===========================");



	}

}
