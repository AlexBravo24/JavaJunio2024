package ciclos;

public class Ciclos4_CDMC {
public static void main(String[] args) throws InterruptedException {
	//Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos de un día desde las 
		 //00:00:00 horas hasta las 23:59:59 horas
	
	
	
	// Iterar sobre las 24 horas del día
    for (int hora = 0; hora < 24; hora++) {
        // Iterar sobre los 60 minutos de cada hora
        for (int minuto = 0; minuto < 60; minuto++) {
            // Iterar sobre los 60 segundos de cada minuto
            for (int segundo = 0; segundo < 60; segundo++) {
                // Formatear y mostrar la hora en formato HH:mm:ss
                System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
                Thread.sleep(1000);
            }
        }
    }
}
}
