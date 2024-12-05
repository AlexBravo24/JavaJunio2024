package ciclos;

class Ciclos5_RISL {

	public static void main(String[] args) {
		int dineroinicial=1000;
		double interes=0.02;
		int meses=12;
		
		for (int mes = 1; mes <= meses; mes++) {
			double montodeinteres = dineroinicial * interes;
			//20 pesos
			 System.out.println("El monto final que recibe al paso de "+  mes  + " meses"+ "es de: "+ ( dineroinicial += montodeinteres) );
		

		}
		
	}}
	//operador +=
	//	a=8
	  //  b=3
	    //a+=b;     a=a+b
	   // por lo tanto a=11
		
		
		

