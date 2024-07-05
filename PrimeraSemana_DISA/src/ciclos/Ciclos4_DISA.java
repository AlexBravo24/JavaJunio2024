package ciclos;

public class Ciclos4_DISA {
	public static void main(String[] args) throws InterruptedException {
		//Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día 
		//desde las 00:00:00 horas hasta las 23:59:59 horas
		
		/*int hora=0;
		int minutos=0;
		int segundos=0;
		
		while (true) {
			if(hora<10) {
				System.out.println("0");
			}
			System.out.println(hora + ":");
		if (minutos <10) {
			System.out.println("0");
		}
		
		System.out.println(minutos + ":");
		
		if (segundos < 10) {
		}
		 //salto de linea
		System.out.println(segundos);
		//aumento el tiempo
		segundos++;
		
		//comprovar tiempo
		if (segundos == 60) {
			//reinician segundos
		segundos = 0;
		minutos++;
		   if (minutos == 60) {
			//reinicio de minutos
			minutos = 0;
			
			//aumento las horas
			hora++;
			   if (hora == 24) {
				  hora = 0;
			   }
				
			}
		}
		try {
			Thread.sleep(1000);
		}
		catch (InterruptedException e) {
		e.printStackTrace();
		}
*/	
	//Se usara un bucle de for anidado
		//Bucle de horas:
		for (int hora = 0; hora < 24; hora++) {
			//bucle de minutos:
			for (int min = 0; min < 60; min++) {
				//bucle de segundos:
				for (int seg = 0; seg < 60; seg++) {
					System.out.println(hora+":"+min+":"+seg);
					Thread.sleep(1000);
					
				}
				
			}
		}
	 
	}
}
