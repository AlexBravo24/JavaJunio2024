package ciclos;

public class Ciclos4_EJOG {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, 
				//minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
				//horas
				   // Bucle para las horas
		        for (int hora = 0; hora < 24; hora++) {
		           //Bucle para Minutos
		           for (int min = 0; min < 60; min++) {
		        	//Bucle para segundos   
		        	   for (int seg = 0; seg < 60; seg++) {
		        		   System.out.println(hora+":"+min+":"+seg);
					}
		           }
		        }

	}

}
