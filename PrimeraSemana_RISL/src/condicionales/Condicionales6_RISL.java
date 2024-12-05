package condicionales;
import java.util.Scanner;

public class Condicionales6_RISL {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		double alumnos, costoAlumno, pagoServicio;
		System.out.println("Introduce el número de alumnos");
		alumnos = entrada.nextDouble(); 
		costoAlumno=0;
		pagoServicio=0;
		
		
		if (alumnos >=100) {
			costoAlumno=65;
			pagoServicio= costoAlumno*alumnos;
		}if (alumnos >=50 && alumnos<100) {
			costoAlumno= 70;
			pagoServicio= alumnos*costoAlumno;
		}if (alumnos >=30 && alumnos<50) {
			costoAlumno= 95;
			pagoServicio= alumnos*costoAlumno;			
		}if (alumnos <30) {
			pagoServicio= 4000;
			costoAlumno= pagoServicio/alumnos; 
		}
		
		
		System.out.println("Costo por alumno "+ costoAlumno);
		System.out.println("Pago por servicio " + pagoServicio);

	}
}

