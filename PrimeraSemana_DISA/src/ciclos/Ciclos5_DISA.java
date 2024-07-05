package ciclos;

public class Ciclos5_DISA {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés mensual. 
		//¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si todo el dinero lo reinvierte?
		//NOTA PROPIA: cada mes que pasa el monto incial se acumula con el interes del primer mes y asi sucesivamente hasta llegar al mes 12
		//PREGUNTAR SOBRE: USO DE DOS TIPOS DE VALORES EN UN SCRIPT EJEMPO: INT Y DOBLE 
		int capitalInicial;
		capitalInicial=1000;
		double interes;
		interes= 0.2;
		int capitalFinal;
		
		for (int mes=1;mes<=12;mes++) {
			capitalFinal = (int) (capitalInicial*Math.pow(1 + interes, mes));
			System.out.println("En el mes "+mes+"la tasa de interes acumulado será "+ capitalFinal);
		}
		
		

	}

}
