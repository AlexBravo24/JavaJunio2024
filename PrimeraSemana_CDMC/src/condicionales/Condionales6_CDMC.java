package condicionales;
import java.util.Scanner;
public class Condionales6_CDMC {
public static void main(String[] args) {
	/*
	El director de una escuela está organizando un 
	viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y 
	cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar 
	es la siguiente: * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. 
	* De 50 a 99 alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 euros.
	* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar }
    *el número de alumnos. 
    *Realiza un algoritmo que permita determinar el pago a la compañía de 
      autobuses y lo que debe pagar cada alumno por el viaje.
	*/
	
	
	
	
        Scanner in = new Scanner(System.in);
        double costo_por_alumno, numero_de_alumnos, pago_por_el_servicio;
        System.out.print("Ingresa el valor de numero de alumnos: ");
        numero_de_alumnos = in.nextDouble();
        in.nextLine();
        costo_por_alumno=0;
        pago_por_el_servicio=0;
        if(numero_de_alumnos>=100)
        {
            costo_por_alumno=65;
            pago_por_el_servicio=costo_por_alumno*numero_de_alumnos;
        }
        if(numero_de_alumnos>=50&&numero_de_alumnos<100)
        {
            costo_por_alumno=70;
            pago_por_el_servicio=costo_por_alumno*numero_de_alumnos;
        }
        if(numero_de_alumnos>=30&&numero_de_alumnos<50)
        {
            costo_por_alumno=95;
            pago_por_el_servicio=costo_por_alumno*numero_de_alumnos;
        }
        if(numero_de_alumnos>=30&&numero_de_alumnos<50)
        {
            pago_por_el_servicio=4000;
            costo_por_alumno=pago_por_el_servicio/numero_de_alumnos;
        }
        System.out.println("Valor de costo por alumno: " + costo_por_alumno);
        System.out.println("Valor de pago por el servicio: " + pago_por_el_servicio);
}
}
