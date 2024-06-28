package ciclos;

public class Ciclos5_TJAA {

	public static void main(String[] args) {
		//5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		//tendrá al cabo de un año si todo el dinero lo reinvierte?

		int inversion=1000;
		double interes= 0.02; 
		int meses= 12;
		
		for (int mes = 1; mes <=meses ; mes++) {
			double montoDeInteres= inversion * interes;
			System.out.println("El monto que recibe en " + mes  + " meses es de " + (inversion += montoDeInteres));
			
			
		}
		
		
	}

} 

