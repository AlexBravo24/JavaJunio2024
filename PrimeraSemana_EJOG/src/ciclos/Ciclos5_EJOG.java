package ciclos;

public class Ciclos5_EJOG {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		//tendrá al cabo de un año si todo el dinero lo reinvierte
		double inv,reinv,interes;
		
		inv=1000;
		interes=.02;
		
		for (int i = 1; i < 12; i++) {
			
			inv=inv+(inv*.02);
			
			
		}
		System.out.println("La cantidad que al final tendra la persona es de "+inv+" en un año");
		
	}

}
