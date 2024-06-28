package ciclos;

public class Ciclos4_TMJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Simular el comportamiento de un reloj digital, imprimiendo la hora, 
//		minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
//		horas
		for (int h = 0; h < 23; h++)
			for (int m = 0; m < 60; m++) 
				for (int s = 0; s < 60; s++)
					System.out.println(h + "h " + m + "m " +s +"s");
		
	}

}
