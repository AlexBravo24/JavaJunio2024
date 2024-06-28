package com.first;

public class EstructurasControl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		for( int hora = 0; hora <= 23; hora++) {
			for(int minutos = 0; minutos < 60; minutos++) {
				for(int segundos=0; segundos < 60; segundos++) {
						System.out.printf("%02d:%02d:%02d\n", hora, minutos, segundos);
						Thread.sleep(1000);
				}
			}
		}
		
	}

}
