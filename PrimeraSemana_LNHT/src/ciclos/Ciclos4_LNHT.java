package ciclos;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ciclos4_LNHT {
	public static void main(String[] args) {
		//Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		//minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
		//horas
		int horas=0;
		while (horas != 24) {
			for (horas=0; horas <= 24; horas++) {
				for (int min = 0; min < 60; min++) {
					for (int seg = 0; seg < 60; seg++) {
						//Thread.sleep(1000);
						if(seg < 10) {
							System.out.println(horas + ":"+ min + ":0" + seg);
						}else {
						System.out.println(horas + ":"+ min + ":" + seg);
						}
					}//for seg
					
					
				}//for min
			
			}//for horas
		horas =24;
		}//while
			
	}

}
