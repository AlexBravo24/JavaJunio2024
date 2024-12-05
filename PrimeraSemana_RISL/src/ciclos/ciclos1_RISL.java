package ciclos;

public class ciclos1_RISL {

	public static void main(String[] args) {
		//tabla de multiplicar del 12
		
		int numero=12;// numero de la tabla 
		int maximo=10; //hasta 10 se multiplica la tabla 
		
		System.out.println("Tabla de multiplicar del " + numero + ":");

		for (int i=1; i<=10; i++) {
			 System.out.println(numero+ " x " + i + " = " + (numero * i));
		}
	}
	
}